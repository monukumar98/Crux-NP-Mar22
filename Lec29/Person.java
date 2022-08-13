package Lec29;

public class Person {
	private String name = "Vishal";
	private int age = 20;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		
			this.age = age;
	}

	// public Person() {
//		this.name = "Rahul";
//		this.age = 23;
//	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
//	
//	public Person() {
//		
//	}

	public void fun() {

		System.out.println("Hey I am in fun " + this.name + " and my age " + this.age);
	}

}
