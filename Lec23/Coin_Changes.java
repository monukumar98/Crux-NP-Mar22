package Lec23;

public class Coin_Changes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 4, 5 };
		int amount = 10;
		printanser(coin, amount, "");

	}

	public static void printanser(int[] coin, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < coin.length; i++) {
			if (amount >= coin[i]) {
				printanser(coin, amount - coin[i], ans + coin[i]);
			}

		}

	}

}
