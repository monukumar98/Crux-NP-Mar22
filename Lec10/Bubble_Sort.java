package Lec10;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 9, 6, -9, -11 };
		sort(arr);
		//System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void sort(int [] arr) {
		int n = arr.length;
		for (int pass = 1; pass <=n-1; pass++) {
			for (int i = 0; i <n-pass ; i++) {
				if(arr[i]>arr[i+1]) {
					int t = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}
			
		}
		
		
		
	}

}
