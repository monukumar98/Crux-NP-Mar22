package Lec_46;

import java.util.Arrays;

public class Wine_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wine[] = { 2, 3, 5, 1, 4 };
		int[][] dp = new int[wine.length][wine.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}

		System.out.println(maxprofit(wine, 0, wine.length - 1, 1, dp));
		System.out.println(maxprofitBU(wine));
	}

	public static int maxprofit(int[] wine, int i, int j, int year, int[][] dp) {
		if (i > j) {
			return 0;
		}
		if (dp[i][j] != -1) {
			return dp[i][j];
		}
		int first = wine[i] * year + maxprofit(wine, i + 1, j, year + 1, dp);
		int last = wine[j] * year + maxprofit(wine, i, j - 1, year + 1, dp);
		return dp[i][j] = Math.max(first, last);
	}

	public static int maxprofitBU(int[] wine) {
		int[][] dp = new int[wine.length][wine.length];
		int year = wine.length;
		for (int slide = 0; slide < dp.length; slide++) {
			for (int j = slide; j < dp.length; j++) {
				int i = j - slide;
				if (i == j) {
					dp[i][j] = wine[i] * year;
				} else {
					int first = wine[i] * year + dp[i + 1][j];
					int last = wine[j] * year + dp[i][j - 1];
					dp[i][j] = Math.max(first, last);
				}
			}
			year--;

		}
		return dp[0][wine.length - 1];

	}
}
