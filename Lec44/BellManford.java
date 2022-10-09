package Lec44;

import java.util.*;

public class BellManford {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public BellManford(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);// v1 se v2 ko connect kiya hai
	}

	public class EdgePair {
		int e1;
		int e2;
		int cost;

		public EdgePair(int e1, int e2, int cost) {
			// TODO Auto-generated constructor stub
			this.e1 = e1;
			this.e2 = e2;
			this.cost = cost;

		}

	}

	public ArrayList<EdgePair> GetAllEdge() {
		ArrayList<EdgePair> list = new ArrayList<>();
		for (int vtx : map.keySet()) {
			for (int nbrs : map.get(vtx).keySet()) {
				int cost = map.get(vtx).get(nbrs);
				EdgePair ep = new EdgePair(vtx, nbrs, cost);
				list.add(ep);
			}
		}
		return list;

	}

	public void BellmanfordAlgo() {
		ArrayList<EdgePair> list = GetAllEdge();
		int v = map.size();
		int[] dis = new int[v + 1];

		for (int i = 2; i < dis.length; i++) {
			dis[i] = 10000000;
		}
		for (int i = 1; i <= v; i++) {

			for (EdgePair e : list) {
				if (i == v && dis[e.e2] > dis[e.e1] + e.cost) {
					System.out.println("-ve ka Cycle h");
					return;
				}
				if (dis[e.e2] > dis[e.e1] + e.cost) {
					dis[e.e2] = dis[e.e1] + e.cost;
				}

			}
		}
		for (int i = 1; i < dis.length; i++) {
			System.out.println(1 + " --> " + i + " " + dis[i] + " ");
		}
	}

	public static void main(String[] args) {
		BellManford bfd = new BellManford(5);
		bfd.AddEdge(1, 2, 8);
		// bfd.addEdge(2, 5, -2);
		bfd.AddEdge(2, 5, -2);
		bfd.AddEdge(5, 2, 1);
		bfd.AddEdge(4, 5, 4);
		bfd.AddEdge(3, 4, -3);
		bfd.AddEdge(1, 3, 4);
		bfd.AddEdge(1, 4, 5);
		bfd.BellmanfordAlgo();
	}

}
