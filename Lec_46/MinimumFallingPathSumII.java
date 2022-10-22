package Lec_46;

public class MinimumFallingPathSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int ans = 100000000;
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, minPathSum(grid, 0, i));
		}
		System.out.println(ans);
	}

	public static int minPathSum(int[][] grid, int i, int j) {
		
		if (i == grid.length - 1) {
			return grid[i][j];
		}

		int ans = 1000000;
		for (int col = 0; col < grid[0].length; col++) {
			if (col != j) {
				ans = Math.min(ans, minPathSum(grid, i+1, col));
			}

		}
		return ans + grid[i][j];

	}

}
