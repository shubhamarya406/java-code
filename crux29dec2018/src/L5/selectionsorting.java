package L5;

import java.util.Scanner;

public class selectionsorting {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		for (int counter = 0; counter < n - 1; counter++) {
			int min = counter;
			for (int j = counter + 1; j <= n - 1; j++) {
				if (arr[j] < arr[min]) {

					min = j;
				}
			}

			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}