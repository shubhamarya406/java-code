package Assignment_hackerblocks;

import java.util.Scanner;

import practice_oops.stack;

public class nextGreater extends stack {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {

			int n=scn.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=scn.nextInt();
			}
			greater(n, arr);
			t--;
		}

	}

	public static void greater(int n, int[] arr) {

		for (int i = 0; i < arr.length ; i++) {
			int max = -1;
			int flag = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					max = arr[j];
					flag = -1;
					System.out.println(arr[i] + "," + max);
					break;

				}
			}
			if (flag == 0) {
				System.out.println(arr[i] + "," + max);
			}

		}

	}
}
