package Lec6;

public class Octal_Dec {
	public static void main(String[] args) {
		int n = 451;
		int mul = 1;
		int ans = 0;
		while (n != 0) {
			int rem = n % 10;
			ans = ans + rem * mul;
			n /= 10;
			mul *= 8;

		}
		System.out.println(ans);
		
	}
}
