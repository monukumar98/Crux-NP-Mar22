package Lec8;

public class Global_variable_Demo {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		System.out.println(val);
		fun();
		System.out.println("bye");
		System.out.println(val);

	}
	public static void fun() {
		System.out.println("hey fun");
		int val=9;
		val= val+5;
		System.out.println(val);
	}

}
