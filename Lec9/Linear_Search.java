package Lec9;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 8, 11, 5, 6 };
		int item = 11;
		System.out.println(search(arr, item));

	}

	public static int search(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}

		return -1;
	}

}
