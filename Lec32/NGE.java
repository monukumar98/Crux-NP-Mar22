package Lec32;

import java.util.Arrays;
import java.util.Stack;

public class NGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 8, 4, 11, 7, 9, 10, 2 };
		nextgreater(arr);
	}

	public static void nextgreater(int[] arr) {

		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < ans.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				int ii = st.pop();
				ans[ii] = arr[i];
			}

			st.push(i);
		}
		while (!st.isEmpty()) {
			ans[st.pop()] = -1;
		}

		System.out.println(Arrays.toString(ans));

	}

}
