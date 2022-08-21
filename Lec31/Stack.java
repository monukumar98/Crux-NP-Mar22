package Lec31;

public class Stack {
	protected int[] data;
	protected int top;

	public Stack() {
		// TODO Auto-generated constructor stub
		this.data = new int[5];
		top = -1;

	}

	public Stack(int cap) {
		// TODO Auto-generated constructor stub
		this.data = new int[cap];
		top = -1;

	}

	public boolean isEmpty() {
		return this.top == -1;

	}

	public boolean isFull() {
		return this.top == this.data.length - 1;
	}

	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Bhai Stack full h pgl h element kyu add kr raha h ");
		}
		this.top++;
		this.data[this.top] = item;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("bhai pgl hai Stack khaali h");
		}
		int rv = this.data[this.top];
		this.top--;
		return rv;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("bhai pgl hai Stack khaali h");
		}
		int rv = this.data[this.top];

		return rv;
	}

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.print(this.data[i] + " ");

		}
		System.out.println();
	}

	public int size() {
		return top + 1;
	}

}
