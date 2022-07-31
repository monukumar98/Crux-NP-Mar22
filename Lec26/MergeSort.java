package Lec26;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 1, 6, 7, -3, 5 };
		int[] ans = Merge_Sort(arr, 0, arr.length - 1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}

	public static int[] Merge_Sort(int[] arr, int si, int ei) {
		if (si == ei) {
			int bs[] = new int[1];
			bs[0] = arr[si];
			return bs;
		}

		int mid = (si + ei) / 2;
		int[] fs = Merge_Sort(arr, si, mid);
		int[] ss = Merge_Sort(arr, mid + 1, ei);
		return MergetwoArray(fs, ss);

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
