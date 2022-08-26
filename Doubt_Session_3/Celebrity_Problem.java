package Doubt_Session_3;

import java.util.Scanner;
import java.util.Stack;

public class Celebrity_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();

			}

		}
		int ans = CelebrityProblem(arr, n);
		if (ans == -1) {
			System.out.println("No Celebrity");
		} else {
			System.out.println(ans);
		}

	}

	public static int CelebrityProblem(int[][] arr, int n) {
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			st.push(i);
		}

		while (st.size() > 1) {
			int a = st.pop();
			int b = st.pop();
			if (arr[a][b] == 1) {// a knows b
				st.push(b);
			} else {
				st.push(a);
			}

		}
		int Celebrity = st.pop();
		for (int i = 0; i < arr.length; i++) {
			if (i == Celebrity) {
				continue;
			}
			if (arr[Celebrity][i] == 1 || arr[i][Celebrity] == 0) {
				return -1;
			}
		}

		return Celebrity;

	}

}
