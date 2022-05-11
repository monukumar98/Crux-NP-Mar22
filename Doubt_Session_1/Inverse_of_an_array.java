package Doubt_Session_1;

import java.util.Scanner;

public class Inverse_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int [] ans = Inverse_array(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}
	
	public static int [] Inverse_array(int []arr) {
		int [] brr = new int [arr.length];
		for (int i = 0; i <arr.length; i++) {
			brr[arr[i]]=i;
			
		}
		return brr;
	}

}
