package Lec_46;

public class Minimum_Path_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maze = { { 1, 3, 1, }, { 1, 5, 1, }, { 4, 2, 1 } };
		System.out.println(minPathSum(maze, 0, 0));

	}

	public static int minPathSum(int[][] grid, int i, int j) {
		if (i == grid.length - 1 && j == grid[0].length - 1) {
			return grid[i][j];
		}
		if (i == grid.length  || j == grid[0].length) {
			return 10000000;
		}
		int h = minPathSum(grid, i + 1, j);
		int v = minPathSum(grid, i, j + 1);
		return Math.min(h, v) + grid[i][j];

	}

}
