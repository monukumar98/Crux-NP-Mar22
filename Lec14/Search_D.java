package Lec14;

public class Search_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		System.out.println(Search2(arr, 26));

	}

	public static boolean Search(int[][] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == target) {
					return true;
				}

			}
		}
		return false;

	}

	public static boolean Search2(int[][] arr, int target) {

		int row = 0;
		int col = arr[0].length - 1;
		while (row < arr.length && col >= 0) {
			if (arr[row][col] == target) {
				return true;
			} else if (arr[row][col] < target) {
				row++;
			} else {
				col--;
			}
		}
		return false;

	}

}
