package Lec8;

public class Arrays_Swap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);

	}

	public static void Swap(int a, int b) {
		int t = a;
		a = b;
		b = t;

	}

}
