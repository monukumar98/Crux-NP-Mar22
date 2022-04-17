package Lec6;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int steps = sc.nextInt();
		for (int i = min; i <= max; i += steps) {
			int c = (int) ((5.0 / 9) * (i - 32));
			System.out.println(i + "\t" + c);
		}

	}

}
