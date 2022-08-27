package Lec33;

public class LinkedList {

	public class Node {

		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

// O(1)
	public void addfirst(int item) {
		if (this.size == 0) {
			Node nn = new Node();
			nn.data = item;
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			Node nn = new Node();
			nn.data = item;
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}

	}

	// O(1)
	public void addlast(int item) {
		if (this.size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			this.tail.next = nn;
			this.tail = nn;
			this.size++;

		}

	}

	// O(N)
	public void addatindex(int item, int k) throws Exception {
		if (k < 0 || k > this.size) {
			throw new Exception("Index vailed nhi hai bklol ho valid index do");

		}
		if (k == 0) {
			addfirst(item);
		} else if (k == this.size) {
			addlast(item);
		} else {
			Node nn = new Node();
			nn.data = item;
			Node k_1th = getNode(k - 1);
			nn.next = k_1th.next;
			k_1th.next = nn;
			this.size++;

		}

	}

	private Node getNode(int k) throws Exception {
		if (k < 0 || k >= this.size) {
			throw new Exception("Index vailed nhi hai bklol ho valid index do");

		}
		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;

		}
		return temp;
	}

	public int Getfirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list khaali hai");
		}
		return this.head.data;
	}

	public int Getlast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list khaali hai");
		}
		return this.tail.data;
	}

	public int Getatindex(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list khaali hai");
		}
		if (k == 0) {
			return Getfirst();
		} else if (k == size - 1) {
			return Getlast();
		} else {

			return getNode(k).data;
		}

	}

	public int removefirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list khaali hai");
		}
		Node temp = this.head;

		if (size == 1) {

			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
			temp.next = null;
		}
		this.size--;

		return temp.data;

	}

	public int removelast() throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list khaali hai");
		}
		Node temp = this.head;

		if (size == 1) {
			return removefirst();

		} else {
			Node sl = getNode(size - 2);
			int rv = this.tail.data;
			this.tail = sl;
			this.tail.next = null;
			this.size--;
			return rv;
		}
	}

	public int removeatindex(int k) throws Exception {
		if (this.size == 0) {
			throw new Exception("Linked list khaali hai");
		}
		Node kth = getNode(k);
		Node k_1th = getNode(k - 1);
		k_1th.next = kth.next;
		kth.next = null;
		this.size--;
		return kth.data;

	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println(".");

	}

}
