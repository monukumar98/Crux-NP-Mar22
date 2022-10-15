package Lec45;

public class Min_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int s0 = mincost(arr, 0);
		int s1 = mincost(arr, 1);
		System.out.println(Math.min(s0, s1));

	}

	public static int mincost(int[] arr, int i) {
		if (i >= arr.length) {
         return 0;
		}

		int s2 = mincost(arr, i + 2) + arr[i];
		int s1 = mincost(arr, i + 1) + arr[i];
		return Math.min(s2, s1);

	}

}
