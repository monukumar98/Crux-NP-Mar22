package Lec14;

public class Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 2, 4, 3, 6, 5, 4, 2, 1 };
		Permutation(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Permutation(int[] arr) {
		int n = arr.length;
		int p = 0;
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		int q = 0;

		for (int i = n - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
		if (p == 0 && q == 0) {
			Revrse(arr, 0, n - 1);
			return;
		}
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		Revrse(arr, p + 1, n - 1);

	}

	public static void Revrse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
