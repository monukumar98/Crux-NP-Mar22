package Lec22;

public class Lexico_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printcount(0, 1000);

	}

	public static void Printcount(int curr, int end) {
		// TODO Auto-generated method stub
		if (curr > end) {
			return;
		}
		System.out.println(curr);

		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			Printcount(curr * 10 + i, end);
		}

	}

}
