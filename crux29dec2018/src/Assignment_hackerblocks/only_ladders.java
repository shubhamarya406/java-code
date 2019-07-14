package Assignment_hackerblocks;

import java.util.Arrays;
import java.util.Scanner;

public class only_ladders {
 static int count=0;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ladder[] = ladders(primes(n));
		ladders(0, "", ladder, n);
		System.out.println();
System.out.println(count);
	}

	public static void ladders(int curr,String ans, int ladder[],  int n) {
		if (curr == n) {

			System.out.print(ans + "END" + " , ");
			count=count+1;
			return ;

		}
		if (curr > n)
			return ;
		int ct = 0;
		if (ladder[curr] != 0) {

		ladders(ladder[curr], ans + curr + " ", ladder, n);
		} else {
			for (int dice = 1; dice <= 6; dice++)
				 ladders(curr+dice, ans + curr + " ", ladder, n);
		}

		return;
	}

	public static boolean[] primes(int n) {
		boolean arr[] = new boolean[n + 1];
		Arrays.fill(arr, true);
		arr[0] = false;
		arr[1] = false;

		for (int table = 2; table * table <= n; table++) {
			if (arr[table] == false) {
				continue;
			}
			for (int multip = 2; multip * table <= n; multip++) {
				arr[multip * table] = false;
			}

		}
		return arr;
	}

	public static int[] ladders(boolean arr[]) {
		int ladder[] = new int[arr.length];

		int left = 0;
		int right = arr.length - 1;
		while (left < right) {

			while (arr[left] == false) {

				left++;
			}
			while (arr[right] == false) {
				right--;
			}
			ladder[left] = right;
			left++;
			right--;

		}
		return ladder;

	}
}
