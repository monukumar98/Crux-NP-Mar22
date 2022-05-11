package Doubt_Session_1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Target_Sum_Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Arrays.sort(arr);
		TargetSum(arr, target);
	}

	public static void TargetSum(int[] arr, int target) {
		for (int p = 0; p < arr.length; p++) {

			int i = p + 1;
			int j = arr.length - 1;
			while (i < j) {
				int sum = arr[i] + arr[j] + arr[p];
				if (sum > target) {
					j--;
				} else if (sum < target) {
					i++;
				} else {
					System.out.println(arr[p] + ", " + arr[i] + " and " + arr[j]);
					i++;
					j--;
				}

			}

		}

	}

}
