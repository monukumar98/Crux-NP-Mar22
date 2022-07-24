package Lec24;

public class Normal_Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] visited = new int[5][4];
		PrintallPath(visited, 0, 0);

	}

	public static void PrintallPath(int[][] visited, int cc, int cr) {
		if (cc == visited[0].length - 1 && cr == visited.length - 1) {
			visited[cr][cc] = 1;
			for (int i = 0; i < visited.length; i++) {
				for (int j = 0; j < visited[0].length; j++) {
					System.out.print(visited[i][j] + " ");
				}
				System.out.println();

			}
			visited[cr][cc] = 0;
			System.out.println("****************");
			return;
		}

		if (cc < 0 || cr < 0 || cc >= visited[0].length || cr >= visited.length || visited[cr][cc] == 1) {

			return;
		}
		visited[cr][cc] = 1;
		int[] r = { 0, 1, 0, -1 };
		int[] c = { 1, 0, -1, 0 };
//		PrintallPath(visited, cc + 1, cr);
//		PrintallPath(visited, cc, cr + 1);
//		PrintallPath(visited, cc - 1, cr);
//		PrintallPath(visited, cc, cr - 1);
		for (int i = 0; i < c.length; i++) {
			PrintallPath(visited, cc + c[i], cr + r[i]);

		}
		visited[cr][cc] = 0;

	}

}
