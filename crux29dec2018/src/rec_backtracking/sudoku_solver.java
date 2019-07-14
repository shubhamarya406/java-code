package rec_backtracking;

import java.util.Scanner;

public class sudoku_solver {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		sudoku(arr, 0, 0);

	}

	public static void sudoku(int[][] arr, int row, int col) {
		if (row == arr.length) {
			display(arr);
			return;
		}
		if (col == arr[0].length) {
			sudoku(arr, row + 1, 0);
			return;
		}

		if (arr[row][col] != 0) {
			sudoku(arr, row, col + 1);
		return;
		}
		for (int i = 1; i <= 9; i++) {
			if (isitsafe(i, row, col, arr)) {
				arr[row][col] = i;
				sudoku(arr, row, col + 1);
				arr[row][col] = 0;
			}

		}

	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}

	public static boolean isitsafe(int val, int row, int col, int arr[][]) {

		return iscol(val, row, col, arr) && isrow(val, row, col, arr) && rowcol(val, row, col, arr);
			
	}

	public static boolean iscol(int val, int row, int col, int arr[][]) {
		
		for (int r = 0; r < arr.length; r++) {
			if (arr[r][col] == val)

				return false;

		}
		return true;
	}

	public static boolean isrow(int val, int row, int col, int[][] arr) {
		
		for (int c = 0; c< arr[0].length; c++) {
			if (arr[row][c] == val)

				return false;
		}
		return true;
	}

	public static boolean rowcol(int val, int row, int col, int[][] arr) {
		int rs = row - row % 3;
		int cs = col - col % 3;
		for (int i = rs; i < rs + 3; i++) {
			for (int j = cs; j < cs + 3; j++) {
				if (arr[i][j] == val)

					return false;
			}
		}
		return true;
	}
}
