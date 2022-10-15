package Lec45;

import java.util.Arrays;

public class House_Robber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 9, 3, 1 };
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);
		System.out.println(MaximumAmountTD(arr, 0, dp));

	}

	public static int MaximumAmountTD(int[] arr, int i, int[] dp) {
		if (i >= arr.length) {
			return 0;
		}
		if (dp[i] != -1) {
			return dp[i];
		}

		int r = MaximumAmountTD(arr, i + 2, dp);
		int rn = MaximumAmountTD(arr, i + 1, dp);

		return dp[i] = Math.max(r + arr[i], rn);

	}

	public static int MaximumAmountBU(int[] arr) {
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		dp[1] = Math.max(dp[0], dp[1]);
		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 1]);

		}
		return Math.max(dp[arr.length - 2], dp[arr.length - 1]);
	}

}
