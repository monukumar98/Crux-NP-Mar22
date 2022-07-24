package Lec24;

import java.util.ArrayList;
import java.util.List;

public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "nitin";
		List<String> list = new ArrayList<>();
		List<List<String>> ans = new ArrayList<>();
		partition(ques, list, ans);
		System.out.println(ans);

	}

	public static void partition(String ques, List<String> list, List<List<String>> ans) {
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			// System.out.println(list);
			ans.add(new ArrayList<>(list));
			return;
		}

		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			if (isPalindrome(s) == true) {
				list.add(s);
				partition(ques.substring(i), list, ans);
				list.remove(list.size() - 1);
			}

		}

	}

	public static boolean isPalindrome(String s) {

		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
