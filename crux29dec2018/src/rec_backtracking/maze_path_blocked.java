package rec_backtracking;

public class maze_path_blocked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		boolean[][] check = new boolean[4][4];
		System.out.println(mazeb(board, 0, 0, "", check));
	}

	public static int mazeb(int[][] board, int cr, int cc, String ans, boolean[][] check) {

		if (cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || check[cr][cc] == true
				|| board[cr][cc] == 1) {
			return 0;
		}

		if (cr == board.length - 1 && cc == board[0].length - 1) {
			System.out.println(ans);
			return 1;
		}
		int t = 0, l = 0, d = 0, r = 0;
		check[cr][cc] = true;
		t = t + mazeb(board, cr - 1, cc, ans + "t", check);
		r += mazeb(board, cr, cc + 1, ans + "r", check);
		d += mazeb(board, cr + 1, cc, ans + "d", check);
		l += mazeb(board, cr, cc - 1, ans + "l", check);
		check[cr][cc] = false;
		return t + l + r + d;
	}
}
