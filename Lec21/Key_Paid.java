package Lec21;

public class Key_Paid {
	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "189";
		KeyPaid(ques, "");

	}

	public static void KeyPaid(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans+" ");
			return;
		}

		char ch = ques.charAt(0);
		String press = key[ch - '0'];
		for (int i = 0; i < press.length(); i++) {
			KeyPaid(ques.substring(1), ans + press.charAt(i));

		}

	}

}
