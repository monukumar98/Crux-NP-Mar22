package Lec20;

public class Count_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printpath(0, 4, ""));

	}

	public static int printpath(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return 1;
		}
		if (curr > end) {
			return 0;
		}

//		printpath(curr + 1, end, ans + 1);
//		printpath(curr + 2, end, ans + 2);
//		printpath(curr + 3, end, ans + 3);
		int count = 0;
		for (int dice = 1; dice <= 3; dice++) {
			count = count + printpath(curr + dice, end, ans + dice);
		}
		return count;

	}

}
