package rec_backtracking;

public class Nqueens {

	public static void main(String[] args) {

		nqueen(new boolean[4][4], 1, "", 0,3);
	}

	public static void nqueen(boolean[][] board, int row, String ans, int qpsf,int tot) {
//if(qpsf==tot)
//{
//	System.out.println(ans);
//	//System.out.println(qpsf);
//	return ;
//}
		if (row == board.length ) {
       System.out.println(ans);
			return ;
		}

		for (int col = 0; col < board[0].length; col++) {
			if (isitsafe(board, row, col)) {

				board[row][col] = true;
				nqueen(board, row + 1, ans + "{" + row + "-" + col + "}", qpsf + 1,tot);
				board[row][col] = false;
			}
			
		}
		
//nqueen(board,row+1,ans,qpsf,tot);
//return qpsf;
	}

	public static boolean isitsafe(boolean[][] board, int row, int col) { // vertical up
		int r = row - 1;
		int c = col;
		while (r >0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}
		// diagonal left;
		r = row - 1;
		c = col - 1;
		while (r > 0 && c >0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		// diagonal right
		r = row - 1;
		c = col + 1;
		while (r >0 && c<board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;

	}
}
