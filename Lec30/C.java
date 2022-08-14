package Lec30;

public class C extends P{
	int d = 20;
	int d2 = 200;
	@Override
	public void fun() {
		System.out.println("fun in c");
	}

	public void fun2() {
		System.out.println("fun2 in c");
	}
	@Override
	public String toString() {
		return this.d +" "+ this.d2 +" p ka d1 "+this.d1;
	}
}
