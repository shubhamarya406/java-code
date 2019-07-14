package Assignment_hackerblocks;

import java.util.Scanner;

public class vivek_array_game {
	static int ans = 0;

	static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();

			}
			sort(arr,0,arr.length-1);
			System.out.println(ans);
			t--;

		}

	}

	public static int  sort(int[] arr, int si, int ei) {
    if(ei==si)
    {
    	return 1;
    }
    if(si>ei)
    {
    	return  0;
    }
    int ct1=0;
    int ct2=0;
		for (int i = si; i < ei; i++) {
			int fh = sum(arr, si, i);
			int sh = sum(arr, i + 1, ei);

			if (fh == sh) {
				 ct1+= sort(arr, si, i);
				 ct2+= sort(arr, i + 1, ei);
				ans=Math.max(ct1, ct2);
			}
		}
return ans;
	}

	public static int sum(int arr[], int i, int j) {
		int sum = 0;
		for (int k = i; k <= j; k++) {
			sum += arr[i];

		}
		return sum;

	}
}
