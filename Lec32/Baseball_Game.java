package Lec32;

import java.util.Stack;

public class Baseball_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		System.out.println(calAnswer(arr));

	}

	public static int calAnswer(String[] arr) {
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			String st = arr[i];
			if (st.equals("+")) {
				int a = s.pop();
				int b = s.pop();
				int c = a + b;
				s.push(b);
				s.push(a);
				s.push(c);
			} else if (st.equals("C")) {
				s.pop();
			} else if (st.equals("D")) {
				int x = s.peek();
				s.push(2 * x);
			} else {
				s.push(Integer.parseInt(st));
			}

		}
		int sum = 0;
		while (!s.isEmpty()) {
			sum += s.pop();
		}
		return sum;

	}

}
