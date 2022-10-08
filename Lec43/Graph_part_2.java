package Lec43;

import java.util.*;

public class Graph_part_2 {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph_part_2(int v) {
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

	public void BFT() {

		Queue<Integer> qq = new LinkedList<>();

		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}

			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int rv = qq.poll();

				// ignore
				if (visited.contains(rv)) {
					continue;
				}

				System.out.print(rv + " ");

				// visited
				visited.add(rv);
				// add nbrs
				for (int key : map.get(rv).keySet()) {
					if (!visited.contains(key)) {
						qq.add(key);
					}
				}

			}
		}
		System.out.println();

	}

	public void DFT() {
		Stack<Integer> st = new Stack<>();

		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			st.add(src);
			while (!st.isEmpty()) {
				// remove
				int rv = st.pop();

				// ignore
				if (visited.contains(rv)) {
					continue;
				}

				System.out.print(rv + " ");

				// visited
				visited.add(rv);
				// add nbrs
				for (int key : map.get(rv).keySet()) {
					if (!visited.contains(key)) {
						st.push(key);
					}
				}

			}
		}
		System.out.println();
	}

	public int CountCompofGraph() {
		Queue<Integer> qq = new LinkedList<>();
		int count = 0;
		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}
			count++;

			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int rv = qq.poll();

				// ignore
				if (visited.contains(rv)) {
					continue;
				}

				// visited
				visited.add(rv);
				// add nbrs
				for (int key : map.get(rv).keySet()) {
					if (!visited.contains(key)) {
						qq.add(key);
					}
				}

			}
		}
		return count;
	}

	public boolean hascycle() {
		Queue<Integer> qq = new LinkedList<>();

		HashSet<Integer> visited = new HashSet<>();
		for (int src : map.keySet()) {
			if (visited.contains(src)) {
				continue;
			}

			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int rv = qq.poll();

				// ignore
				if (visited.contains(rv)) {
					return true;
				}

				// visited
				visited.add(rv);
				// add nbrs
				for (int key : map.get(rv).keySet()) {
					if (!visited.contains(key)) {
						qq.add(key);
					}
				}

			}
		}
		return false;

	}
}
