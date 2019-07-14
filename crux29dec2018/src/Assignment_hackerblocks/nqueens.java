package Assignment_hackerblocks;

import java.util.Scanner;

public class nqueens {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		boolean bn[][] = new boolean[n][n];
		cnqueens(bn, 0,"");
System.out.println(cnqueens2(bn,0,""));
	}

	public static void cnqueens(boolean[][] arr, int row, String ans) {
		if (row == arr.length) {
			System.out.println(ans+" ");
			return;
		}

		for (int col =0; col <arr[0].length; col++) {
			if (issafe(arr, row, col)) {
				arr[row][col] = true;

				cnqueens(arr, row + 1, ans + "{" + (row+1) + "-" + (col+1)+ "}"+" ");
				arr[row][col] = false;
			}
		}
	}

	public static boolean issafe(boolean arr[][], int row, int col) {

		// vertical up
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (arr[r][c] == true)
				return false;
			r--;
		}
		// diagonal left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (arr[r][c] == true)
				return false;
			r--;
			c--;
		}
		// diagonal right
		c = col + 1;
		r = row - 1;
		while (r >= 0 && c < arr[0].length) {
			if (arr[r][c] == true)
				return false;
			r--;
			c++;
		}
		return true;
	}
	public static int  cnqueens2(boolean[][] arr, int row, String ans) {
		if (row == arr.length) {
			
			return 1;
		}
int sum=0;
		for (int col =0; col <arr[0].length; col++) {
			if (issafe2(arr, row, col)) {
				arr[row][col] = true;

				 sum+=cnqueens2(arr, row + 1, ans + "{" + (row+1) + "-" + (col+1)+ "}");
				arr[row][col] = false;
			}
		}
		return sum;
	}

	public static boolean issafe2(boolean arr[][], int row, int col) {

		// vertical up
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (arr[r][c] == true)
				return false;
			r--;
		}
		// diagonal left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (arr[r][c] == true)
				return false;
			r--;
			c--;
		}
		// diagonal right
		c = col + 1;
		r = row - 1;
		while (r >= 0 && c < arr[0].length) {
			if (arr[r][c] == true)
				return false;
			r--;
			c++;
		}
		return true;
	}
}
