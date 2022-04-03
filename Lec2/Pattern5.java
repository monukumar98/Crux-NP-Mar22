package Lec2;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int spce = 0;
		int star = n;
		while (row <= n) {

			// space
			int i = 1;
			while (i <= spce) {
				System.out.print("  ");
				i++;
			}

			// star
			int j = 1;
			while (j <= star) {
				System.out.print("*" + " ");
				j++;
			}

			// next Row
			row++;
			star--;
			spce++;
			System.out.println();

		}
	}

}
