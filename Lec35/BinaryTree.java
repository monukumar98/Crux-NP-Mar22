package Lec35;

import java.util.Scanner;

public class BinaryTree {
	public class Node {
		int data;
		Node left;
		Node right;
	}

	Scanner sc = new Scanner(System.in);
	private Node root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			nn.left = CreateTree();
		}
		boolean hrc = sc.nextBoolean();
		if (hrc == true) {
			nn.right = CreateTree();
		}

		return nn;
	}

	public void Display() {
		Display(root);
	}

	private static void Display(Node nn) {

		if (nn == null) {
			return;
		}
		String s = "";
		s = s + nn.data;
		s = "<--" + s + "-->";
		if (nn.left != null) {
			s = nn.left.data + s;
		} else {
			s = "." + s;
		}

		if (nn.right != null) {
			s = s + nn.right.data;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);

	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return Integer.MIN_VALUE;
		}
		int left = max(nn.left);
		int right = max(nn.right);
		return Math.max(nn.data, Math.max(left, right));

	}

	public int size() {
		return size(root);
	}

	private int size(Node nn) {
		// TODO Auto-generated method stub
		if (nn == null) {
			return 0;
		}

		int left = size(nn.left);
		int right = size(nn.right);
		return left + right + 1;

	}

	public int ht() {
		return ht(root);
	}

	private int ht(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return -1;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;
	}

	private boolean find(Node node, int item) {
		// TODO Auto-generated method stub
		if (node == null) {
			return false;
		}
		if (node.data == item) {
			return true;
		}
		return find(node.left, item) || find(node.right, item);

	}

	public boolean find(int item) {
		return find(root, item);
	}

}
