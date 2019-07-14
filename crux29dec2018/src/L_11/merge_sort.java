package L_11;

import java.util.Scanner;

public class merge_sort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int arr[] = new int[7];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();
		int ans[] = mergesort(arr, 0, arr.length - 1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

	public static int[] mergesort(int arr[], int lo, int hi) {
		if (lo == hi) {
			int[] narr = new int[1];
			narr[0] = arr[lo];
			return narr;
		}

		int mid = (lo + hi) / 2;
		int[] f = mergesort(arr, lo, mid);
		int[] s = mergesort(arr, mid + 1, hi);

		int ans[] = mergesorted(f, s);
		return ans;

	}

	public static int[] mergesorted(int[] f, int[] s) {
		int merge[] = new int[f.length + s.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < f.length && j < s.length) {
			if (f[i] < s[j]) {
				merge[k] = f[i];
				i++;
				k++;
			} else {
				merge[k] = s[j];
				j++;
				k++;
			}
			if (i == f.length) {
				for (; j < s.length; j++) {
					merge[k] = s[j];
					k++;
				}

			}
			if (j == s.length) {
				for (; i < f.length; i++) {
					merge[k] = f[i];
					k++;
				}

			}
		}
		return merge;
	}
}
