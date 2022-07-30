package Lec25;

public class Word_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "SEE";
		boolean ans = false;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (word.charAt(0) == board[i][j]) {
					ans = wordsearch(board, i, j, word,0);
					if (ans == true) {
						System.out.println(ans);
						return;
					}

				}

			}

		}
		System.out.println(false);

	}

	public static boolean wordsearch(char[][] board, int i, int j, String word, int idx) {
		// TODO Auto-generated method stub
		if(idx==word.length()) {
			return true;
		}

		if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(idx) != board[i][j]) {
			return false;
		}
		board[i][j] = '*';

		int r[] = { -1, 1, 0, 0 };
		int c[] = { 0, 0, -1, 1 };

		for (int k = 0; k < c.length; k++) {
			boolean ans = wordsearch(board, i + r[k], j + c[k], word, idx + 1);
			if (ans == true) {
				return true;
			}

		}
		board[i][j] = word.charAt(idx);
		return false;
	}

}
