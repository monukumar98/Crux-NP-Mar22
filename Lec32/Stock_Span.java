package Lec32;

import java.util.Arrays;
import java.util.Stack;

public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 8, 4, 11, 7, 9, 10, 2 };
		SpanCalCulate(arr);

	}

	public static void SpanCalCulate(int[] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < ans.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				st.pop();
			}
			if (st.isEmpty()) {
				ans[i] = i + 1;
			} else {
				ans[i] = i - st.peek();
			}
			st.push(i);
		}

		System.out.println(Arrays.toString(ans));

	}

}
