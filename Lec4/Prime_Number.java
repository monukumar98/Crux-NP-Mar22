package Lec4;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 45;
		int i = 2;
		int fact = 0;
		while (i < n) {

			if (n % i == 0) {
				fact++;
			}
			i++;
		}

		if (fact >= 1) {
			System.out.println("Not Prime");
		} 
		else {
			System.out.println("Prime");
		}
	}

}
