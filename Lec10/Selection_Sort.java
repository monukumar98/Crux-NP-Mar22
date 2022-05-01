package Lec10;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 9, 6, -9, -11 };
		sort(arr);
		// System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
         	int min = i;
			// min index
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}

			}
			// swapping
			int t = arr[i];
			arr[i] = arr[min];
			arr[min] = t;

		}

	}

}
