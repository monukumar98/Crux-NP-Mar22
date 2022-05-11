package Doubt_Session_1;

import java.util.Scanner;

public class Alex_Goes_Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int q = sc.nextInt();
		while(q-- >0) {
			int a = sc.nextInt();
			int k =sc.nextInt();
			if(ispossible(arr, a, k)==true) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
			
		}
		
		
	}
	
	public static boolean ispossible(int []arr,int A,int k) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(A%arr[i]==0) {
				count++;
			}
		}
		
		return count>=k;
		
		
	}

}
