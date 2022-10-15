package Lec45;

import java.util.Arrays;

public class Coin_Change_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5 };
		int amount = 10;
		int [][] dp = new int [amount+1][coin.length];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Coin_Change(coin, amount, 0,dp));

	}

	public static int Coin_Change(int[] coin, int amount, int idx,int [][]dp) {
		if (amount == 0) {
			return 1;
		}
		if (idx == coin.length) {
			return 0;
		}
		if(dp[amount][idx]!=-1) {
			return dp[amount][idx];
		}
		int yes = 0, no = 0;
		if (amount >= coin[idx]) {
			yes += Coin_Change(coin, amount - coin[idx], idx,dp);
		}
		no += Coin_Change(coin, amount, idx + 1,dp);
		return dp[amount][idx]=yes+no;
	}

}
