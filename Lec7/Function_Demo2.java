package Lec7;

public class Function_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 8;
		int b = 11;
		char c ='b';
		// addition(a, b);
		addition(5, 9,c);
		System.out.println("bye");
		System.out.println(a);

	}

	public static void addition(int a, int b,char c) {
		a += 2;
		System.out.println(a + b);
		System.out.println(c);
		
	}

	public static void fun() {
		int a = 90;
		System.out.println(a);
	}

}
