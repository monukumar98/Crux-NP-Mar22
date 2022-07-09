package Lec19;

public class Array_First_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 3, 1, 3, 4, 7, 2 };
		int item = 1;
		System.out.println(firstocc(arr, item, 0));

	}

	public static int firstocc(int[] arr, int item, int i) {

		if (i == arr.length) {
			return -1;
		}

		if (arr[i] == item) {
			return i;
		}

		return firstocc(arr, item, i + 1);

	}

}
