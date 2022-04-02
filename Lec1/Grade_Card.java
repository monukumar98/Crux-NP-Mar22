package Lec1;

public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 67;
		if(marks>=75) {
			System.out.println("Grade A");
		}
		else if(marks>=65 && marks<75) {
			System.out.println("Grade B");
		}
		else if(marks>=55 && marks<65) {
			System.out.println("Grade C");
		}
		
		else if(marks>=45 && marks<55) {
			System.out.println("Grade D");
		}
		else if(marks>=30 && marks<45) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
