package Lec35;

public class Client_BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 true 20 true 40 false false true 50 false false true 30 false true 60 true
		// 70 false false false
		BinaryTree bt = new BinaryTree();
		bt.Display();
		System.out.println(bt.max());
		System.out.println(bt.size());
		System.out.println(bt.ht());

	}

}
