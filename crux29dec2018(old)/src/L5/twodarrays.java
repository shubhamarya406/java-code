package L5;

import java.util.Scanner;

public class twodarrays {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int rows = scn.nextInt();
		int arr[][] = new int[rows][];
		arr = takeinput(arr);
		output(arr);

	}

	public static int[][] takeinput(int[][] arr) {

		for (int row = 0; row < arr.length; row++) {
			int cols = scn.nextInt();
			arr[row] = new int[cols];
			for (int col = 0; col < arr[row].length; col++) {
				arr[row][col] = scn.nextInt();

			}

		}

		return arr;
	}

	public static void output(int[][] arr) {

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}
}
