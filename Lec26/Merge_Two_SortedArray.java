package Lec26;

public class Merge_Two_SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 4, 5 };
		int[] brr = { 1, 3, 5, 7, 8, 9, 11, 12 };
		int[] ans = MergetwoArray(arr, brr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] MergetwoArray(int[] arr, int[] brr) {
		int n = arr.length;
		int m = brr.length;
		int[] ans = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (arr[i] <= brr[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			} else {
				ans[k] = brr[j];
				j++;
				k++;
			}
		}

		while (i < n) {

			ans[k] = arr[i];
			i++;
			k++;
		}
		while (j < m) {

			ans[k] = brr[j];
			j++;
			k++;
		}
		return ans;

	}

}
