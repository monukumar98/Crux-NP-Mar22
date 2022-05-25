package Lec15;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello";
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = new String("hello");
		System.out.println(str);
		int a = 9;
		int b = 9;
		System.out.println(a == b);
		System.out.println(str == str2);// address compare krega
		System.out.println(str == str1);// address compare krega
		str = str + "bye";
		str = "hello";
		System.out.println(str == str1);
		System.out.println(str1.equals(str2));// content compare krega 

	}

}
