package Lec40;

public class Student<T> {
	T key;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(T key) {
		// TODO Auto-generated constructor stub
		this.key=key;
	}
	public static void main(String[] args) {
		Student<Boolean> s = new Student<>();
		s.key=true;
		Student<Integer> s1 = new Student<>();
		
	}

}
