package Assignment_hackerblocks;

import java.util.Scanner;

public class spiralclockwise {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int row = scn.nextInt();
		int col = scn.nextInt();
		int[][] arr = new int[row][col];
		arr = input(arr, row, col);
		spiral(arr, row, col);
	}

	public static int[][] input(int arr[][], int row, int col) {

		for (row = 0; row < arr.length; row++) {
			for (col = 0; col < arr[row].length; col++)
				arr[row][col] = scn.nextInt();
		}
		return arr;
	}

	public static void spiral(int arr[][], int row, int col) {

		int mincol = 0, minrow = 0, maxcol = arr[0].length - 1, maxrow = arr.length - 1;
		int nel = row * col;
		int count = 0;
		while (count < nel) {
			for (col = mincol; count < nel && col <= maxcol; col++) {
				System.out.print(arr[minrow][col]+", ");
				count++;
			}
			minrow++;
			for (row = minrow; count < nel && row <= maxrow; row++) {
				System.out.print(arr[row][maxcol]+", ");
				count++;

			}
			maxcol--;
			for (col = maxcol; count < nel && col >= mincol; col--) {
				System.out.print(arr[maxrow][col]+", ");
				count++;
			}
			maxrow--;
			for (row = maxrow; count < nel && row >= minrow; row--) {
				System.out.print(arr[row][mincol]+", ");
				count++;
			}
			mincol++;
		}
		System.out.print("END");

	}
}