package Lec46;

public class LIs_NlogN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(lis(arr));

	}

	public static int lis(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		int len = 1;
		for (int i = 1; i < arr.length; i++) {
			if (dp[len - 1] < arr[i]) {
				dp[len] = arr[i];
				len++;
			} else {
				int idx = BinarySearch(dp, 0, len - 1, arr[i]);
				dp[idx] = arr[i];

			}

		}
//		for (int i = 0; i <len; i++) {
//			System.out.print(dp[i]+" ");
//		}
		System.out.println();
		return len;
	}

	private static int BinarySearch(int[] dp, int lo, int hi, int val) {
		// TODO Auto-generated method stub
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (dp[mid] >= val) {
				ans = mid;
				hi = mid - 1;

			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

}
