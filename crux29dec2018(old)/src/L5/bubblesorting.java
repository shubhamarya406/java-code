package L5;

import java.util.Scanner;

public class bubblesorting {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		bubblesort(arr);
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		
		}
	}

	public static void bubblesort(int[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - 1 - counter; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j ] = arr[j+1];
					           
					arr[j+1] = temp;
				}

			}
		}

	}
}
