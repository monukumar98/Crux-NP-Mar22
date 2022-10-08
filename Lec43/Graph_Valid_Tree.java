package Lec43;

import java.util.*;

public class Graph_Valid_Tree {
	class Solution {
		public boolean validTree(int n, int[][] edges) {
			HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

			for (int i = 0; i < n; i++) {
				map.put(i, new HashMap<>());
			}
			for (int i = 0; i < edges.length; i++) {
				int a1 = edges[i][0];
				int b1 = edges[i][1];
				map.get(a1).put(b1, 7);
				map.get(b1).put(a1, 7);

			}
			
			Stack<Integer> st = new Stack<>();
            int c=0;
			HashSet<Integer> visited = new HashSet<>();
			for (int src : map.keySet()) {
				if(visited.contains(src)) {
					continue;
				}
				c++;
				st.add(src);
				while (!st.isEmpty()) {
					// remove
					int rv = st.pop();

					// ignore
					if (visited.contains(rv)) {
						return false;
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
			}
			return c>1;
		}

	}
}
