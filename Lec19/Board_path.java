package Lec19;

public class Board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end = 4;
		printpath(0, end, "");

	}

	public static void printpath(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		if (curr > end) {
			return;
		}

//		printpath(curr + 1, end, ans + 1);
//		printpath(curr + 2, end, ans + 2);
//		printpath(curr + 3, end, ans + 3);
		for (int dice = 1; dice <= 3; dice++) {
			printpath(curr + dice, end, ans + dice);
		}

	}

}
