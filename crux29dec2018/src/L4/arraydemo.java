package L4;

import java.util.Scanner;

public class arraydemo {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array = takeInput();
		display(array);
		int max = maximum(array);
		System.out.println(max);
		int n1 = scn.nextInt();
		int bs = binarysearch(array, n1);
		System.out.println(bs);

	}

	public static int[] takeInput() {
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("value at" + i + "location");
			int val = scn.nextInt();
			arr[i] = val;

		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++)

			System.out.println("the value of the array at location " + i + "is" + arr[i]);

	}

	public static int maximum(int[] arr) {
		// int i=0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}
		}

		return max;

		// System.out.println("the maximum no is "+max);

	}

	public static int binarysearch(int[] arr, int item) {
		int l = 0, h = arr.length - 1;

		while (l <= h) {

			int mid = (l + h) / 2;
			if (item < mid) {
				h = mid - 1;
			} else if (item > mid) {
				l = mid + 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

}