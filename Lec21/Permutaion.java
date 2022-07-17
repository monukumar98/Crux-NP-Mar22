package Lec21;

public class Permutaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "aabc";
		Printpermutaion(ques, "");
	}

	public static void Printpermutaion(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans+" ");
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			Printpermutaion(ros, ans + ch);
		}

	}

}
