package Lec13;

public class Wave_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 }, { 2, 4, 6, 8, 10 }, { 3, 5, 7, 9, 11 } };
		print(arr);
	
	}

	public static void print(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
			}

			else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");
				}

			}
		}

	}

}
