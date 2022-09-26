package Lec39;

import java.util.*;

public class HaspMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("rahul", 78);
		map.put("anish", 89);
		map.put("kunal", 67);
		map.put("pooja", 89);
		map.put("kamlesh", 72);
		//System.out.println(map);
		Set<String> set = map.keySet();
		for (String key : set) {
			System.out.println(key + " " + map.get(key));
		}
		ArrayList<String> list = new ArrayList<>(map.keySet());
		for(String key : map.keySet()) {
			
		}
//		map.put("pooja", 77);
//		System.out.println(map);
//		// containsKey
//		System.out.println(map.containsKey("kunal"));
//		
//		// remove
//		System.out.println(map.remove("shubham"));
//		System.out.println(map.remove("kamlesh"));
//		System.out.println(map);
//		
//		// Get
//		System.out.println(map.get("kunal"));
//		
//		map.put(null, 99);
//		map.put("null", 199);
//		System.out.println(map);
//		System.out.println(map.containsKey(null));

		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("rahul", 78);
		map1.put("anish", 89);
		map1.put("kunal", 67);
		map1.put("pooja", 89);
		map1.put("kamlesh", 72);
		map1.put("Shivam", null);
	//	System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("rahul", 78);
		map2.put("anish", 89);
		map2.put("kunal", 67);
		map2.put("pooja", 89);
		map2.put("kamlesh", 72);
		map2.put(null, null);
	//	System.out.println(map2);

	}

}
