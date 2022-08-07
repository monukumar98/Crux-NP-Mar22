package Lec28;

import java.util.*;

public class Random_Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 3, 14, 5, 7, 2, 4, 1, 4 };
		QuickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void QuickSort(int[] arr, int si, int ei) {

		if (si > ei) {
			return;
		}
		int idx = Partitions(arr, si, ei);
		QuickSort(arr, si, idx - 1);
		QuickSort(arr, idx + 1, ei);

	}

	public static int Partitions(int[] arr, int si, int ei) {
		Random(arr, si, ei);
		int pivot = arr[ei];
		int pos = si;
		for (int i = si; i < ei; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[pos];
				arr[pos] = temp;
				pos++;
			}

		}
		int temp = arr[ei];
		arr[ei] = arr[pos];
		arr[pos] = temp;
		return pos;

	}

	public static void Random(int[] arr, int lo, int hi) {
		Random rd = new Random();
		int idx = rd.nextInt(hi - lo + 1) + lo;
		int temp = arr[idx];
		arr[idx] = arr[hi];
		arr[hi] = temp;

	}

}
