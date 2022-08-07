package Lec28;

public class Bulider_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("HelloHelloHelloqttHelloHelloHelloqrr");
		System.out.println(sb.capacity());
		sb.append("bb");
		//System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb);
		sb.append('a');
		System.out.println(sb);
		System.out.println(sb.reverse());
		String st =sb.toString();// bulider to String 
		StringBuilder sb1 = new StringBuilder(st);

		
	}

}
