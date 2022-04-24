package Lec8;

public class Arrays_Swap_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(arr[0] + " " + arr[1]);
		swap2(arr, 0, 1);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void swap2(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;

	}

}
