package Lec39;

import java.util.*;

public class Set_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new  HashSet<>();
		set.add("kartik");
		set.add("kamlesh");
		set.add("kunal");
		set.add("pooja");
		set.add("shiva");
		set.add("anku");
		set.add("amisha");
		set.add(null);
		System.out.println(set);
//		System.out.println(set.contains("shubham"));
//		System.out.println(set.contains("amisha"));
//		System.out.println(set.remove("shubham"));
//		System.out.println(set.remove("anku"));
		TreeSet<String> set1 = new  TreeSet<>();
		set1.add("kartik");
		set1.add("kamlesh");
		set1.add("kunal");
		set1.add("pooja");
		set1.add("shiva");
		set1.add("anku");
		set1.add("amisha");	
		//set1.add(null);
		System.out.println(set1);
		LinkedHashSet<String> set2 = new  	LinkedHashSet<>();
		set2.add("kartik");
		set2.add("kamlesh");
		set2.add("kunal");
		set2.add("pooja");
		set2.add("shiva");
		set2.add("anku");
		set2.add("amisha");
		set2.add("pooja");
		//set2.add(null);
		System.out.println(set2);
		

	}

}
