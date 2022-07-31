package Lec26;

public class Check_Prime_Opt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 97;
		System.out.println(CheckPrime(n));
	}

	public static boolean CheckPrime(int n) {

		int i = 2;
		while (i * i <= n) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}

		return true;

	}

}
