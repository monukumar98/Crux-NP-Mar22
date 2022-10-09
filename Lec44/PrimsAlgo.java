package Lec44;

import java.util.*;

public class PrimsAlgo {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public PrimsAlgo(int v) {
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

	public class PrimsPair {
		int vtx;
		int acq;
		int cost;

		public PrimsPair(int vtx, int acq, int cost) {
			// TODO Auto-generated constructor stub
			this.vtx = vtx;
			this.acq = acq;
			this.cost = cost;
		}

		public String toString() {
			return this.vtx + " " + this.acq + " @ " + this.cost;
		}
	}

	public void Primslgo() {

		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {

			@Override
			public int compare(PrimsPair o1, PrimsPair o2) {
				// TODO Auto-generated method stub
				return o1.cost - o2.cost;

			}
		});
		int sum=0;
		pq.add(new PrimsPair(1, 1, 0));
		HashSet<Integer> visited = new HashSet<>();
		while (!pq.isEmpty()) {
			// remove
			PrimsPair rp = pq.poll();
			// ignore
			if (visited.contains(rp.vtx)) {
				continue;
			}
			//System.out.println(rp);
			sum+=rp.cost;

			visited.add(rp.vtx);
			for (int nbrs : map.get(rp.vtx).keySet()) {
				if (!visited.contains(nbrs)) {
					int vtx = nbrs;
					int acq = rp.vtx;
					int cost = map.get(rp.vtx).get(nbrs);
					PrimsPair np = new PrimsPair(vtx, acq, cost);
					pq.add(np);
				}
			}

		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrimsAlgo pm = new PrimsAlgo(n);
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			pm.AddEdge(v1, v2, cost);
		}
		pm.Primslgo();
	}

}
