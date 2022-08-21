package Lec31;

public class Queue {
	protected int[] data;
	protected int front;
	protected int size;

	public Queue() {
		// TODO Auto-generated constructor stub
		this.data = new int[5];
		this.front = 0;
		this.size = 0;

	}

	public Queue(int cap) {
		// TODO Auto-generated constructor stub
		this.data = new int[cap];
		this.front = 0;
		this.size = 0;

	}

	public boolean isEmpty() {
		return this.size == 0;

	}

	public boolean isFull() {
		return this.size == this.data.length;
	}

	public void Enqueue(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Bhai Queue full h pgl h element kyu add kr raha h ");
		}

		int i = (size + front) % this.data.length;
		data[i] = item;
		size++;
	}

	public int Dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("bhai pgl hai Queue khaali h");
		}
		int rv = data[front];
		size--;
		front = (front + 1) % this.data.length;
		return rv;
	}

	public int Getfront() throws Exception {
		if (isEmpty()) {
			throw new Exception("bhai pgl hai Queue khaali h");
		}
		int rv = data[front];

		return rv;
	}

	public int size() {
		return size;
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			int idx = (this.front + i) % this.data.length;
			System.out.print(this.data[idx] + " ");

		}
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		Queue q = new Queue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.display();
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		q.display();
		q.Enqueue(60);
		q.Enqueue(70);
		q.display();

	}

}
