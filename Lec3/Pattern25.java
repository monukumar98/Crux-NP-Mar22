package Lec3;

import java.util.Scanner;

public class Pattern25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n - 1;
		int star = 1;
		int val=1;
		while (row <= n) {

			// sapce
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}

			// star
			int j = 1;
			
			while (j <= star) {
				System.out.print(val + "\t");
				j++;
				val++;
			}

			// next row
			space--;
			star += 2;// star = star +2;
			row++;
			System.out.println();

		}
	}
}
