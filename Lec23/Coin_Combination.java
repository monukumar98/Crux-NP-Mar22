package Lec23;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] board = new boolean[4];
		int tq = 2;
		Printanswer(board, tq, "", 0, 0);

	}

	public static void Printanswer(boolean[] board, int tq, String ans, int qpsf, int idx) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;
				Printanswer(board, tq, ans + "b" + i + "q" + qpsf, qpsf + 1, i + 1);
				board[i] = false;
			}

		}
	}

}
