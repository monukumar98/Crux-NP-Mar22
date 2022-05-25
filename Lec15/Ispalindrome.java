package Lec15;

public class Ispalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "nitin";
		if (palindrome(str) == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
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
