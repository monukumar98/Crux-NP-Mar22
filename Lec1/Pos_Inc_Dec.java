package Lec1;

public class Pos_Inc_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 67;
		// x++ ---> x = x+1;
		int y = x++;// post
//		System.out.println(x);
//		System.out.println(y);
		int a = ++x;// pre
		System.out.println(a);
		int b = 56;
		System.out.println(++b);
		int c = a + a++ + b + ++b;
		System.out.println(c);

	}

}
