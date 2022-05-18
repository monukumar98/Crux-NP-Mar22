package Doubt_Session_2;

import java.util.Scanner;

public class Diagonal_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {

				arr[i][j] = sc.nextInt();
			}
		}

	}

	public static void Traversal(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;

		for (int d = 0; d < n + m - 1; d++) {
			
			

		}

	}

}
