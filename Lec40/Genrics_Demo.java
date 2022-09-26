package Lec40;

public class Genrics_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] arr = { 11, 1, 23, 78, 678 };
		display(arr);
		
		String[] arr1 = { "11", "1", "23", "78", "678" };
		display(arr1);

	}

	public static <T>  void display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
