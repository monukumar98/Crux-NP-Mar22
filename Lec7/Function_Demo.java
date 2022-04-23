package Lec7;

public class Function_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		 addition();
		sub();
		System.out.println("bye");

	}

	public static void addition() {
		int a = 9;
		int b = 7;
		int c = a + b;
		System.out.println(c);
		sub();
	}

	public static void sub() {
		int a = 9;
		int b = 7;
		int c = a - b;
		System.out.println(c);
		addition();
	}

}
