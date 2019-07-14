package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class string_pallindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String str1;
		// boolean bn=((ispossible(str)));
		substring(str);

	}

	public static boolean ispossible(String str) {
		int flag = 0;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) == str.charAt(j)) {
				flag = 1;

			} else {
				flag = -1;
				break;
			}
		}
		if (flag == 1)
			return true;
		else
			return false;
	}

	public static void substring(String str) {
		int count = 0, flag = -1;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				str.substring(i, j);
				if (ispossible(str))

				{
					System.out.println();
					flag = 0;
					count++;
				}

			}
		}
		System.out.println(count);
	}
}