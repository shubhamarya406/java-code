package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class prprime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i;
		int j;
		for (i = 2; i <= n; i++) {
			int flag = 0;
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					flag++;
					break;
				}

			}

			if (flag == 0)
				System.out.println(i);

		}

	}

}
