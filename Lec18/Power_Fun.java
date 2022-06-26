package Lec18;

public class Power_Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
		int b=4;
		System.out.println(pow(a, b));

	}
	public static int pow(int a, int b) {
		if(b==1) {
			return a;
		}
		
		int ans = pow(a, b-1);
		return ans*a;
	}

}
