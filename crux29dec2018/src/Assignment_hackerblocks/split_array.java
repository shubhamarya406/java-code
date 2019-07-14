package Assignment_hackerblocks;

import java.util.Scanner;

public class split_array {
	static int ct1 = 0;
	static int ct2 = 0;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();
//		int i=0;
//		int j=arr.length/2;
		int ans = split(arr, 0, 0, "", "", 0);
		System.out.println(ans);

	}

	public static int split(int arr[], int ans1, int ans2, String str1, String str2, int vidx) {
		if (vidx == arr.length) {
			if (ans1 == ans2) {
				System.out.print(str1 + "and " + str2);
				System.out.println();
				
				return 1;

			}

			return 0;
		}
		int ct = 0;
		ct1 += split(arr, ans1 + arr[vidx], ans2, str1 + arr[vidx] + " ", str2, vidx + 1);
		ct2 += split(arr, ans1, ans2 + arr[vidx], str1, str2 + arr[vidx] + " ", vidx + 1);
		return ct1 + ct2;
	}

}
