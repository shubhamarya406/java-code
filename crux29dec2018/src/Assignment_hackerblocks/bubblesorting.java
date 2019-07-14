package Assignment_hackerblocks;

import java.util.Scanner;

public class bubblesorting {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int arr[] = new int[n];

		arr = input(arr);
		arr = bubblsort(arr);
		output(arr);
	}

	public static int[] input(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();
		return arr;
	}

	public static int[] bubblsort(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] >arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
 return arr;
	}
	public static void output(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}
