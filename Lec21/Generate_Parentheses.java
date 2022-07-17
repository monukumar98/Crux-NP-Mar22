package Lec21;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> list = new ArrayList<>();
		GenerateParentheses(n, "", 0, 0, list);
		System.out.println(list);

	}

	public static void GenerateParentheses(int n, String ans, int open, int close, List<String> list) {
		if (open == n && close == n) {
			// System.out.println(ans);
			list.add(ans);
			return;
		}
		if (open < n) {
			GenerateParentheses(n, ans + "(", open + 1, close, list);
		}
		if (close < open) {
			GenerateParentheses(n, ans + ")", open, close + 1, list);
		}

	}

}
