package Lec15;

public class SubString_Ispalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String s = str.substring(i, j);
				if (palindrome(s) == true) {
					System.out.println(s);
				}
			}

		}

	}

	public static boolean palindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
