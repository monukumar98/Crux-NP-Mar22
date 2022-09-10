package Lec36;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree_Traversal {
	public class Node {
		int data;
		Node left;
		Node right;
	}

	Scanner sc = new Scanner(System.in);
	private Node root;

	public BinaryTree_Traversal() {
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

	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		PostOrder(node.left);

		PostOrder(node.right);
		System.out.print(node.data + " ");
	}

	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		PreOrder(node.left);

		PreOrder(node.right);

	}

	public void InOrder() {
		InOrder(root);
		System.out.println();
	}

	private void InOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		InOrder(node.left);
		System.out.print(node.data + " ");
		InOrder(node.right);

	}

	public void LevelOrder() {
		// Queue<Node> qq = new LinkedList<>();
		LinkedList<Node> qq = new LinkedList<>();
		qq.add(root);// add me last krega
		while (!qq.isEmpty()) {
			Node rv = qq.remove();// first se remove krega
			System.out.print(rv.data + " ");
			if (rv.left != null) {
				qq.add(rv.left);
			}
			if (rv.right != null) {
				qq.add(rv.right);
			}
		}
		
	}

	public static void main(String[] args) {
		BinaryTree_Traversal bt = new BinaryTree_Traversal();
		// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true
		// 70 false false false
		bt.PostOrder();
		bt.PreOrder();
		bt.InOrder();
	}

}
