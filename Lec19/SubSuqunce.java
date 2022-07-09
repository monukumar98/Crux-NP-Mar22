package Lec19;

public class SubSuqunce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		printsubsequnce(ques, "");

	}

	public static void printsubsequnce(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = ques.charAt(0);
		printsubsequnce(ques.substring(1), ans);// no
		printsubsequnce(ques.substring(1), ans + ch);// yes

	}

}
