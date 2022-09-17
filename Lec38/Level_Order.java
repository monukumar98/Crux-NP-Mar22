package Lec38;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order {
	Scanner sc = new Scanner(System.in);

	public class Node {
		int val;
		Node left;
		Node right;

	}

	private Node root;

	public Level_Order() {
		// TODO Auto-generated constructor stub
		this.root = CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		Queue<Node> qq = new LinkedList<>();
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		this.root = nn;
		qq.add(nn);
		while (!qq.isEmpty()) {
			Node rn = qq.remove();
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			if (c1 != -1) {
				Node leftnode = new Node();
				leftnode.val = c1;
				rn.left = leftnode;
				qq.add(leftnode);
			}
			if (c2 != -1) {
				Node rightnode = new Node();
				rightnode.val = c2;
				rn.right = rightnode;
				qq.add(rightnode);
			}
		}

		return nn;
	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}

	public static void main(String[] args) {
		Level_Order lbt = new Level_Order();
		lbt.PreOrder();
	}

}
