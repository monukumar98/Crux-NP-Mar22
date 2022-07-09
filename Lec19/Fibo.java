package Lec19;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int fib(int n) {
		
		
		int f1 = fib(n-1);
		int f2 = fib(n-2);
		return f1+f2;
		
	}

}
