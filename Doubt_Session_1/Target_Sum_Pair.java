package Doubt_Session_1;

import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum_Pair {

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
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int sum = arr[i] + arr[j];
			if (sum > target) {
				j--;
			} else if (sum < target) {
				i++;
			} else {
				System.out.println(arr[i] + " and " + arr[j]);
				i++;
				j--;
			}

		}
	}

}
