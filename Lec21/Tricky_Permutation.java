package Lec21;

public class Tricky_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "aabc";
		Permutation(ques, "");

	}

	public static void Permutation(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			boolean flag = false;
			for (int j = i + 1; j < ques.length(); j++) {
				if (ques.charAt(j) == ch) {
					flag = true;
					break;
				}

			}
			if (flag == false) {

				String ros = ques.substring(0, i) + ques.substring(i + 1);
				Permutation(ros, ans + ch);
			}
		}

	}

}
