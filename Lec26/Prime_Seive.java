package Lec26;

public class Prime_Seive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 150;
		isPrime(n);

	}

	public static void  isPrime(int n) {
		boolean[] prime = new boolean[n + 1];
		prime[0] = true;
		prime[1] = true;
		int i = 2;
		// false prime and true not prime
		while (i * i <= n) {

			if (prime[i] == false)

			{
				for (int mul = 2; mul * i <= n; mul++) {
					prime[mul * i] = true;

				}
			}
			i++;

		}
		for (int j = 2; j < prime.length; j++) {
			if (prime[j] == false) {
				System.out.print(j+" ");
			}

		}
	}

}
