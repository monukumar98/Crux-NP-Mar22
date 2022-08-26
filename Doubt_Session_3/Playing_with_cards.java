package Doubt_Session_3;

import java.util.Scanner;
import java.util.Stack;

public class Playing_with_cards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			st.push(sc.nextInt());
		}
		Playing_with_card(st, q);

	}

	public static void Playing_with_card(Stack<Integer> s, int q) {

		for (int i = 1; i <= q; i++) {
			int prime = ithPrime(i);
			Stack<Integer> A = new Stack<>();
			Stack<Integer> B = new Stack<>();
			while (!s.isEmpty()) {
				int item = s.pop();
				if (item % prime == 0) {
					B.push(item);
				} else {
					A.push(item);
				}
			}

			while (!B.isEmpty()) {
				System.out.println(B.pop());
			}
			s = A;

		}
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

	public static int ithPrime(int i) {

		int count = 0;
		int n = 2;

		while (true) {

			if (isPrime(n)) {
				count++;
			}

			if (count == i) {
				return n;
			}

			n++;
		}

	}

	public static boolean isPrime(int n) {

		int div = 2;

		while (div * div <= n) {
			if (n % div == 0) {
				return false;
			}

			div++;
		}

		return true;

	}

}
