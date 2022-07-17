package Lec22;

public class Maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 4;
		int n = 3;
		Printpath(0, 0, m - 1, n - 1, "");

	}

	public static void Printpath(int cr, int cc, int er, int ec, String ans) {

		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}

		Printpath(cr + 1, cc, er, ec, ans + "V");
		Printpath(cr, cc + 1, er, ec, ans + "H");

	}

}
