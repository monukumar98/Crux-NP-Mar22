package Doubt_Session_1;

import java.util.Scanner;

public class MAximum_Cir_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(MAxSum(arr));
		}

	}

	public static int MAxSum(int[] arr) {
		int lsum = kadaneS_Algorithm(arr);
		int tsum = 0;
		for (int i = 0; i < arr.length; i++) {
			tsum += arr[i];
			arr[i] = -1 * arr[i];
		}

		tsum += kadaneS_Algorithm(arr);// Cir
		return Math.max(lsum, tsum);

	}

	public static int kadaneS_Algorithm(int[] arr) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;// -2^31
		int curr = 0;
		for (int i = 0; i < arr.length; i++) {
			curr = curr + arr[i];
			ans = Math.max(ans, curr);
			if (curr < 0) {
				curr = 0;
			}
		}
		return ans;

	}

}
