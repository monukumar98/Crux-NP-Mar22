package Lec30;

public class Person {
	private String name;
	private int age;

	public String getName() {

		return this.name;
	}

	public int getAge() {

		return this.age;
	}

	public void setName(String name)  {
		setAge(90);
		this.name = name;
	}

	public void setAge(int age) {
		try {
			if (age < 0) {
				throw new Exception("Pgl h kya Age -ve nhi hota h ");
			}
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			//System.out.println(e);
		}
	
		finally {
			System.out.println("I am in finally");
		}
		
		this.age = age;
	}

}
