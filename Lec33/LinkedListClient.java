package Lec33;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addfirst(10);
		ll.addfirst(20);
		ll.addfirst(30);

		ll.addlast(40);
		ll.display();
		ll.addlast(50);
		ll.addlast(60);
		ll.addlast(70);

		ll.addatindex(15, 3);
		ll.display();
//		System.out.println(ll.removefirst());
//		System.out.println(ll.removelast());
		System.out.println(ll.removeatindex(3));
		ll.display();

	}

}
