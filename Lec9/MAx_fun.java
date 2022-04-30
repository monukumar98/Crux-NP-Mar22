package Lec9;

public class MAx_fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 8, 11, 5, 6 };

		System.out.println(max(arr));

	}

	public static int max(int[] arr) {
		int m = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > m) {
				m = arr[i];
			}

		}
		return m;

	}

	public static int max1(int[] arr) {
		int m = Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {

			m = Math.max(m, arr[i]);

		}
		return m;

	}

}
