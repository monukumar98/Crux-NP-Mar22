package Lec_46;

public class Minimum_Falling_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 2, 1, 3 }, { 6, 5, 4 }, { 7, 8, 9 } };
		int ans = 100000000;
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, minPathSum(grid, 0, i));
		}
		System.out.println(ans);
	}

	public static int minPathSum(int[][] grid, int i, int j) {
		if (j < 0 || j == grid[0].length) {
			return 1000000;
		}
		if (i == grid.length - 1) {
			return grid[i][j];
		}

		int h = minPathSum(grid, i + 1, j - 1);
		int v = minPathSum(grid, i + 1, j);
		int d = minPathSum(grid, i + 1, j + 1);
		return Math.min(h, Math.min(v, d)) + grid[i][j];

	}
}
