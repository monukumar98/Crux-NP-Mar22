package Lec20;

public class Count_SubSequnce {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printsubsequnce("abc", "");
		System.out.println(" " + count);
		System.out.println(Countsubsequnce("abc", ""));

	}

	public static void printsubsequnce(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			count++;
			return;
		}

		char ch = ques.charAt(0);
		printsubsequnce(ques.substring(1), ans);// no
		printsubsequnce(ques.substring(1), ans + ch);// yes

	}

	public static int Countsubsequnce(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);

			return 1;
		}

		char ch = ques.charAt(0);
		int l = Countsubsequnce(ques.substring(1), ans);// no
		int r = Countsubsequnce(ques.substring(1), ans + ch);// yes
		return l + r;

	}

}
