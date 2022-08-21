package Lec31;

import java.util.Stack;

public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		reverse(st);
		System.out.println(st);

	}

	public static void reverse(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}
		int x = s.pop();
		reverse(s);
		Insert(s, x);

	}

	private static void Insert(Stack<Integer> s, int x) {
		// TODO Auto-generated method stub
		if (s.isEmpty()) {
			s.push(x);
			return;
		}
		int item = s.pop();
		Insert(s, x);
		s.push(item);

	}

}
