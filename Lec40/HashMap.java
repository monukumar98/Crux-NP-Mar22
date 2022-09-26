package Lec40;

import java.util.ArrayList;

public class HashMap<K,V> {

	public class Node {
		K key;
		V value;
		Node next;

	}

	private ArrayList<Node> buckkarr;
	private int size = 0;

	public HashMap(int cap) {
		// TODO Auto-generated constructor stub
		this.buckkarr = new ArrayList<>();
		for (int i = 0; i < cap; i++) {
			this.buckkarr.add(null);
		}

	}

	public HashMap() {
		// TODO Auto-generated constru
		this(4);
	}

	public void put(K key, V value) {
		int bn = hashfun(key);
		Node temp = this.buckkarr.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
				return;
			}
			temp = temp.next;
		}
		Node nn = new Node();
		nn.key = key;
		nn.value = value;
		temp = this.buckkarr.get(bn);
		nn.next = temp;
		this.size++;
		this.buckkarr.set(bn, nn);
		double thf = 2.0;
		double lf = (1.0 * this.size) / this.buckkarr.size();
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		// TODO Auto-generated method stub
		ArrayList<Node> nba = new ArrayList<>();
		for (int i = 0; i < 2 * buckkarr.size(); i++) {
			nba.add(null);
		}
		ArrayList<Node> oba = buckkarr;
		buckkarr = nba;
		this.size = 0;
		for (Node nn : oba) {
			while (nn != null) {
				put(nn.key, nn.value);
				nn = nn.next;
			}
		}

	}

	public boolean containsKey(K key) {
		int bn = hashfun(key);
		Node temp = this.buckkarr.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	public V get(K key) {
		int bn = hashfun(key);
		Node temp = this.buckkarr.get(bn);
		while (temp != null) {
			if (temp.key.equals(key)) {

				return temp.value;
			}
			temp = temp.next;
		}
		return null;
	}

	public V remove(K key) {
		int bn = hashfun(key);
		Node curr = this.buckkarr.get(bn);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}
		if (curr == null) {
			return null;
		} else if (prev == null) {
			buckkarr.set(bn, curr.next);

		} else {
			prev.next = curr.next;
			curr.next = null;
		}
		this.size--;
		return curr.value;

	}

	public int hashfun(K key) {
		int bn = key.hashCode() % this.buckkarr.size();
		if (bn < 0) {
			bn = bn + this.buckkarr.size();
		}
		return bn;
	}

	@Override
	public String toString() {
		String s = "{";
		for (Node nn : buckkarr) {
			while (nn != null) {
				s = s + nn.key + " = " + nn.value + " , ";
				nn = nn.next;
			}
		}
		s = s + "}";

		return s;

	}
}
