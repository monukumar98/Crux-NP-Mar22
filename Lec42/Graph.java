package Lec42;

import java.util.*;

public class Graph {

	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
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

	public boolean ContainsEdge(int v1, int v2) {

		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
	}

	public boolean Containsvertex(int v1) {
		return map.containsKey(v1);
	}

	public int noofEdge() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum = sum + map.get(key).size();

		}
		return sum / 2;
	}

	public void removeEdge(int v1, int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);

	}

	public void removevertex(int v1) {
		for (int nbsr : map.get(v1).keySet()) {
			map.get(nbsr).remove(v1);
		}
		map.remove(v1);

	}

	public void display() {
		for (int key : map.keySet()) {
			System.out.println(key + " " + map.get(key));

		}
	}

	public boolean haspath(int src, int des, HashSet<Integer> visited) {
		if (src == des) {
			return true;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = haspath(nbrs, des, visited);
				if (ans) {
					return ans;
				}
			}
		}
		return false;
	}

	public void Allpath(int src, int des, HashSet<Integer> visited, String ans) {
		if (src == des) {
			System.out.println(ans + src);
			return;
		}
		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				Allpath(nbrs, des, visited, ans + src);

			}
		}
		visited.remove(src);

	}

	public boolean BFS(int src, int des) {

		Queue<Integer> qq = new LinkedList<>();
		qq.add(src);
		HashSet<Integer> visited = new HashSet<>();

		while (!qq.isEmpty()) {
			// remove
			int rv = qq.poll();

			// ignore
			if (visited.contains(rv)) {
				continue;
			}

			// src == des

			if (rv == des) {
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
		return false;
	}

	public boolean DFS(int src, int des) {

		Stack<Integer> st = new Stack<>();
		st.add(src);
		HashSet<Integer> visited = new HashSet<>();

		while (!st.isEmpty()) {
			// remove
			int rv = st.pop();

			// ignore
			if (visited.contains(rv)) {
				continue;
			}

			// src == des

			if (rv == des) {
				return true;
			}

			// visited
			visited.add(rv);
			// add nbrs
			for (int key : map.get(rv).keySet()) {
				if (!visited.contains(key)) {
					st.push(key);
				}
			}

		}
		return false;
	}
}
