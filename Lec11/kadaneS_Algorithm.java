package Lec11;

public class kadaneS_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(MaxiSum(arr));

	}

	public static int MaxiSum(int[] arr) {
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
