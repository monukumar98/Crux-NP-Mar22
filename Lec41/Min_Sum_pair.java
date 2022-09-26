package Lec41;

import java.util.PriorityQueue;

public class Min_Sum_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 1, 5, 7, 6, 5, 11, 2, 8, 9 };
		System.out.println(minimum(arr));
		

	}
	public static int minimum(int []arr) {
		PriorityQueue<Integer>  pq = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		int sum=0;
		while(pq.size()>1) {
		   int a = pq.poll();
		   int b = pq.poll();
		   
		   sum = sum + a+b;
		   pq.add(a+b);
			
		}
		return sum;
				
	}

}
