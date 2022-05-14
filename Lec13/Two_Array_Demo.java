package Lec13;

public class Two_Array_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[4][3];
		System.out.println(arr);
		System.out.println(arr[0]);
		// row
		System.out.println(arr.length);
		// col
		System.out.println(arr[0].length);

		// set
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = 10 * (i + j + 1);

			}

		}

		// print
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();

		}

	}

}
