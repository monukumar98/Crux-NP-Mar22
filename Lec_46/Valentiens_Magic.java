package Lec_46;

import java.util.Arrays;

public class Valentiens_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int boys[] = { 2, 11, 3 };
		int girls[] = { 5, 3, 7, 2 };
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(mindiff(boys, girls, 0, 0));

	}

	public static int mindiff(int[] boys, int[] girls, int i, int j) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 100000000;
		}
		int s = mindiff(boys, girls, i + 1, j + 1) + Math.abs(boys[i] - girls[j]);
		int r = mindiff(boys, girls, i, j + 1);
		return Math.min(s, r);
	}

}
