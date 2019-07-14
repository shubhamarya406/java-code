package L5;

import java.util.Scanner;

public class wavearray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int rows = scn.nextInt();
		int arr[][] = new int[rows][];
		arr = takeinput(arr);
		arr = output(arr);
		arr = wave(arr);
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

	public static int[][] output(int[][] arr) {

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

		return arr;
	}

	public static int[][] wave(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {

					System.out.println(arr[row][col]);
				}

			} else {
				for (int row = arr.length - 1; row >= 0; row--)
					System.out.println(arr[row][col]);
			}
		}

		return arr;
	}
}
