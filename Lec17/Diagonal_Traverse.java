package Lec17;

import java.util.ArrayList;
import java.util.Collections;

public class Diagonal_Traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };

		int[] ans = DiagonalTraverse(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

	public static int[] DiagonalTraverse(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;
		int[] ans = new int[m * n];
		int idx = 0;
		for (int d = 0; d < m + n - 1; d++) {
			int r = 0;
			int c = 0;
			if (d < n) {
				r = 0;
				c = d;
			} else {
				r = d - n + 1;
				c = n - 1;
			}
			ArrayList<Integer> list = new ArrayList<>();
			while (r < m && c >= 0) {
				// System.out.print(arr[r][c]+" ");
				list.add(arr[r][c]);
				r++;
				c--;
			}
			if (d % 2 == 0) {
				Collections.reverse(list);
			}
			// System.out.println(list);
			for (int v : list) {
				ans[idx] = v;
				idx++;
			}

		}
		return ans;

	}

}
