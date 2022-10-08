package Lec43;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra_Algo {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijkstra_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);// v1 se v2 ko connect kiya hai
		map.get(v2).put(v1, cost);

	}

	public class DijkstraPair {
		int vtx;
		String acq;
		int cost;

		public DijkstraPair(int vtx, String acq, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acq = acq;
			this.cost = cost;
		}

		public String toString() {
			return this.vtx + " " + this.acq + " @ " + this.cost;
		}
	}

	public void DijkstraAlgo() {

		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {

			@Override
			public int compare(DijkstraPair o1, DijkstraPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;

			}
		});
		pq.add(new DijkstraPair(1, "1", 0));
		HashSet<Integer> visited = new HashSet<>();
		while (!pq.isEmpty()) {
			// remove
			DijkstraPair rp = pq.poll();
			// ignore
			if (visited.contains(rp.vtx)) {
				continue;
			}
			System.out.println(rp);

			visited.add(rp.vtx);
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int vtx = nbrs;
					String acq = rp.acq + nbrs;
					int cost = map.get(rp.vtx).get(nbrs) + rp.cost;
					DijkstraPair np = new DijkstraPair(vtx, acq, cost);
					pq.add(np);
				}
			}

		}

	}

	public static void main(String[] args) {
		Dijkstra_Algo pa = new Dijkstra_Algo(7);
		pa.AddEdge(1, 2, 2);
		pa.AddEdge(2, 3, 3);
		pa.AddEdge(1, 4, 10);
		pa.AddEdge(4, 5, 8);
		pa.AddEdge(3, 4, 1);
		pa.AddEdge(5, 6, 5);
		pa.AddEdge(5, 7, 6);
		pa.AddEdge(6, 7, 4);
		pa.DijkstraAlgo();
	}

}
