package Lec37;

public class BinarySearchTree {

	public class Node {
		int data;
		Node left;
		Node right;

	}

	private Node root;

	public BinarySearchTree(int[] in) {
		this.root = CreateTree(in, 0, in.length - 1);
	}

	private Node CreateTree(int[] in, int si, int ei) {
		// TODO Auto-generated method stub
		if (si > ei) {
			return null;
		}

		int mid = (si + ei) / 2;
		Node n = new Node();
		n.data = in[mid];
		n.left = CreateTree(in, si, mid - 1);
		n.right = CreateTree(in, mid + 1, ei);
		return n;
	}

	public void Display() {
		Display(root);
	}

	private void Display(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		Display(node.left);
		Display(node.right);

	}

	public int min() {
		return min(root);
	}

	private int min(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return Integer.MAX_VALUE;
		}

		int left = min(node.left);
		return Math.min(left, node.data);

	}
}
