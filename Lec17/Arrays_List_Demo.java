package Lec17;

import java.util.ArrayList;

public class Arrays_List_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		System.out.println(list.size());
		// add
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		// add at any index
		// range 0 to size
		list.add(1, -7);
		System.out.println(list);

		// remove
		System.out.println(list.remove(2));
		System.out.println(list);
		// get
		System.out.println(list.get(2));

		// print

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");

		}
		System.out.println();
		list.set(1, -90);
		//For_each_Loop
		for(int v : list) {
			System.out.print(v+" ");
		}
//		int [] arr = new int [6];
//		for( int v : arr) {
//			
//		}

	}

}
