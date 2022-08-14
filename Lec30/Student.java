package Lec30;

public class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;

	}

	public String getName() {

		return this.name;
	}

	public int getAge() {

		return this.age;
	}

	public void setName(String name) throws Exception {
		setAge(-90);
		this.name = name;
	}

	public void setAge(int age)throws Exception {
		if(age<0) {
		throw new Exception("Pgl h kya Age -ve nhi hota h ");
		}
		this.age = age;
	}
}
