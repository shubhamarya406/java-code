package Assignment_hackerblocks;

import java.util.Scanner;

public class K_SWAPS {
	static int ans = 0;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ct = 0;
		int temp = n;
		while (temp > 0) {
			ct++;
			temp = temp / 10;

		}
		int arr[] = new int[ct];
		for (int i = arr.length - 1; i >= 0; i--) {
			int rem = n % 10;
			arr[i] = rem;
			n = n / 10;
			// ct--;

		}
		
		int k = scn.nextInt();
		kswap(arr, k);
System.out.print(ans);
		
	}

	public static void kswap(int arr[], int k) {
		
		if(k==0)
		{
			
			return;
		}
		if(k<0)
		{
			return;
		}
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					swap(arr, i, j);
					ans = calculatemax(arr);
					
					kswap(arr, k - 1);
					swap(arr, i, j);
					
					

				}

			}

		}

	}

	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static int calculatemax(int[] arr) {
		String mans = "";
		for (int i = 0; i < arr.length; i++) {
			mans += arr[i];
		}
		return (Math.max(ans, Integer.parseInt(mans)));

	}
}
