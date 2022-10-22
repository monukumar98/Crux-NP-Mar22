package Lec46;

import java.util.Scanner;

public class Edit_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s1 = sc.next();
			String s2 = sc.next();

			System.out.println(editdistance(s1, s2, 0, 0));
		}

	}

	private static int editdistance(String s1, String s2, int i, int j) {
		// TODO Auto-generated method stub
		if (i == s1.length()) {
			return s2.length() - j;
		}
		if (j == s2.length()) {
			return s1.length() - i;
		}
		int ans = 0;
		if (s1.charAt(i) == s2.charAt(j)) {
			ans = editdistance(s1, s2, i + 1, j + 1);
		} else {
			int d = editdistance(s1, s2, i + 1, j);
			int r = editdistance(s1, s2, i + 1, j + 1);
			int ii = editdistance(s1, s2, i, j + 1);
			ans = Math.min(d, Math.min(r, ii)) + 1;

		}
		return ans;

	}

}
