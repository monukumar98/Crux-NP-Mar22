package Lec7;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Armstrong_Number(n));

	}

	public static boolean Armstrong_Number(int n) {
		int cod = countdigit(n);
		int sum = 0;
		int x=n;
		while (n != 0) {

			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, cod));
			n = n / 10;

		}
		if (sum == x) {
			return true;
		} 
		else {
			return false;
		}

	}

	public static int countdigit(int n) {
		int count = 0;
		while (n != 0) {

			n = n / 10;
			count++;
		}
		return count;

	}

}
