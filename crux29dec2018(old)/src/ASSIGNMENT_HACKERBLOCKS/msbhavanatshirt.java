package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class msbhavanatshirt {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();

			for (int j = 1; j <= n; j++) {
				int rem = 0, multip = 1, ans = 0;
				int i = j;
				while (i != 0) {
					rem = i % 2;
					ans = rem * multip + ans;
					multip = multip * 10;
					i = i / 2;
					// if(ans!=0)

				}
				System.out.print(ans + " ");

			}
			System.out.println();

			t--;
		}

	}

}
