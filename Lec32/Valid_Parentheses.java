package Lec32;

import java.util.Stack;

public class Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(({}[]))";
		System.out.println(isValidParentheses(str));
	}

	public static boolean isValidParentheses(String str) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else {
				if (st.isEmpty()) {
					return false;
				}
				if (ch == ')') {
					if (st.peek() == '(') {
						st.pop();
					} else {
						return false;
					}
				}
				if (ch == '}') {
					if (st.peek() == '{') {
						st.pop();
					} else {
						return false;
					}
				}
				if (ch == ']') {
					if (st.peek() == '[') {
						st.pop();
					} else {
						return false;
					}
				}

			}

		}
		return st.isEmpty();
	}

}
