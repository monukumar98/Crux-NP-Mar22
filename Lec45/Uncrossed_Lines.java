package Lec45;

import java.util.Arrays;

public class Uncrossed_Lines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 5, 1, 2, 5 };
		int[] arr2 = { 2, 5, 1, 2, 5 };
		int[][] dp = new int[arr1.length][arr2.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(MaximumCount(arr1, arr2, 0, 0, dp));

	}

	public static int MaximumCount(int[] arr1, int[] arr2, int i, int j, int dp[][]) {
		if (i == arr1.length || j == arr2.length) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}

		int ans = 0;
		if (arr1[i] == arr2[j]) {
			ans = 1 + MaximumCount(arr1, arr2, i + 1, j + 1, dp);
		} else {
			ans = Math.max(MaximumCount(arr1, arr2, i + 1, j, dp), MaximumCount(arr1, arr2, i, j + 1, dp));
		}
		return dp[i][j] = ans;
	}

}
