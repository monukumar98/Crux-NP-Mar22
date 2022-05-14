package Lec13;

public class Spiral_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 }, { 2, 4, 6, 8, 10 }, { 3, 5, 7, 9, 11 } };
		Print(arr);
	}

	public static void Print(int[][] arr) {
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		int count = 0;
		int total = arr.length * arr[0].length;
		while (count < total) {
			for (int i = minc; i <= maxc && count < total; i++) {
				System.out.print(arr[minr][i] + " ");
				count++;

			}
			minr++;
			for (int i = minr; i <= maxr && count < total; i++) {
				System.out.print(arr[i][maxc] + " ");
				count++;
			}
			maxc--;
			for (int i = maxc; i >= minc && count < total; i--) {
				System.out.print(arr[maxr][i] + " ");
				count++;
			}
			maxr--;
			for (int i = maxr; i >= minr && count < total; i--) {
				System.out.print(arr[i][minc] + " ");
				count++;
			}
			minc++;

		}

	}

}
