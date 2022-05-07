package Lec11;

public class Subarry_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(MaxiSum(arr));

	}

	public static int MaxiSum(int[] arr) {
		int ans = Integer.MIN_VALUE;// -2^31
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				ans = Math.max(ans, sum);

			}
		}
		return ans;
	}

}
