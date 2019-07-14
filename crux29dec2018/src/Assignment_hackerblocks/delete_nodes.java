package Assignment_hackerblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class delete_nodes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {

			arr[i] = scn.nextInt();

		}
		ArrayList<Integer> narr = new ArrayList<>();
		for (int i = 0; i < arr.length - 1; i++) {
			flag = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					flag = 1;
					break;

				}
			}
			if (flag == 0) {
				narr.add(arr[i]);
			}

		}
		narr.add(arr[arr.length - 1]);
		for (Integer num : narr) {
			System.out.print(num + " ");
		}
	}

}
