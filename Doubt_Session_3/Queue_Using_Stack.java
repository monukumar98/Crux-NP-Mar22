package Doubt_Session_3;

import java.util.Stack;

public class Queue_Using_Stack {
	private Stack<Integer> s=new Stack<>();

	public boolean isEmpty() {
		return this.s.size() == 0;

	}

//O(1)
	public void Enqueue(int item) throws Exception {
		s.push(item);

	}

	public int Dequeue() throws Exception {
		if (s.isEmpty()) {
			throw new Exception("bhai pgl hai Queue khaali h");
		}
		Stack<Integer> helper = new Stack<>();
		while (s.size() > 1) {

			helper.push(s.pop());

		}
		int item = s.pop();
		while (helper.size() > 0) {

			s.push(helper.pop());

		}
		return item;

	}

	public int Getfront() throws Exception {
		if (s.isEmpty()) {
			throw new Exception("bhai pgl hai Queue khaali h");
		}
		Stack<Integer> helper = new Stack<>();
		while (s.size() > 1) {

			helper.push(s.pop());

		}
		int item = s.peek();
		while (helper.size() > 0) {

			s.push(helper.pop());

		}
		return item;
	}

	public int size() {
		return s.size();
	}

	public static void main(String[] args) throws Exception {
		Queue_Using_Stack qs = new Queue_Using_Stack();
		qs.Enqueue(10);
		qs.Enqueue(20);
		qs.Enqueue(30);
		qs.Enqueue(40);
		qs.Enqueue(50);
		System.out.println(qs.Dequeue());
		System.out.println(qs.Getfront());

	}

}
