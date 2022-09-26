package Lec41;

import java.util.ArrayList;

public class Heap {

	private ArrayList<Integer> list= new ArrayList<>();

	public void add(int item) {
		list.add(item);
		upheapfy(list.size() - 1);
	}

	private void upheapfy(int ci) {
		// TODO Auto-generated method stub
		int pi = (ci - 1) / 2;
		if (list.get(ci) < list.get(pi)) {
			swap(ci, pi);
			upheapfy(pi);

		}

	}

	private void swap(int i, int j) {
		int ith = list.get(i);
		int jth = list.get(j);
		list.set(i, jth);
		list.set(j, ith);

	}

	public int remove() {
		swap(0, list.size() - 1);

		int item = list.remove(list.size() - 1);
		downheapfy(0);
		return item;

	}

	private void downheapfy(int pi) {
		// TODO Auto-generated method stub
		int mini = pi;
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		if (lci < list.size() && list.get(mini) > list.get(lci)) {
			mini = lci;
		}
		if (rci < list.size() && list.get(mini) > list.get(rci)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapfy(mini);
		}

	}

	public int get() {
		return list.get(0);
	}

	public void display() {
		System.out.println(list);
	}
}
