package Lec16;

import java.util.Scanner;

public class CB_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		printSubString(str);

	}

//	Integer.parseInt(s);// string to int
//	Long.parseLong(s);// string to long
	public static void printSubString(String str) {
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int si = 0; si <= str.length() - len; si++) {
				int ei = si + len;
				String s = str.substring(si, ei);
				if (iscbnumber(Long.parseLong(s)) == true && isvisited(visited, si, ei - 1) == true) {
					count++;
					for (int i = si; i <= ei - 1; i++) {
						visited[i] = true;
					}

				}

			}

		}
		System.out.println(count);

	}

	public static boolean isvisited(boolean[] visited, int si, int ei) {
		// TODO Auto-generated method stub

		for (int j = si; j <= ei; j++) {
			if (visited[j] == true) {
				return false;
			}

		}
		return true;

	}

	public static boolean iscbnumber(long n) {
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (n % arr[i] == 0) {
				return false;
			}
		}
		return true;

	}

}
