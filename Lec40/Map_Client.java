package Lec40;

public class Map_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Rahul", 198);
		map.put("Amisha", 78);
		map.put("Ankit", 58);
		map.put("Shivani", 78);
		map.put("Kamlesh", 48);
		map.put("Raj", -98);
		System.out.println(map);
		System.out.println(map.containsKey("Amisha"));
		System.out.println(map.get("Raj"));
		HashMap<Integer, Integer> map1=new HashMap<>();
	}

}
