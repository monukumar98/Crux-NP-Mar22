package Lec28;

import java.util.Random;

public class Random_Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int hi=90;
		int lo=11;
		for (int i = 0; i < 10; i++) {
			int idx = rd.nextInt(hi - lo + 1) + lo;
			System.out.print(idx+" ");

		}
		

	}

}
