package Assignment_hackerblocks;

import java.util.Scanner;

public class recursion_isbalanced {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();

		int arr[] = new int[str.length()];
	balance(str, 0, "");

	}

	public static void balance(String que, int count, String ans) {
		if (que.length() == 0) {
			if (ans.length() == 0) {
    System.out.println(true);
			
			} 
			else
			{
				System.out.println(false);
			
			}
			return;

		}
		char ch = que.charAt(0);
		String roq = que.substring(1);
		if (ch == '{' || ch == '[' || ch == '(') {
			ans = ans + ch;
			

		} else {

			if (ch == '}') {
				char ch2 = ans.charAt(ans.length() - 1);
				ans = ans.substring(0, ans.length()-1);

				if (ch2 != '{') {
					System.out.println(false);
					return;
				}
			}  if (ch == ']') {
				char ch2 = ans.charAt(ans.length() - 1);
				ans = ans.substring(0, ans.length()-1);

				if (ch2 != '[')

				{
					System.out.println(false);
					return;
				}
			} if (ch == ')') {
				char ch2 = ans.charAt(ans.length() - 1);
				ans = ans.substring(0, ans.length()-1);

				if (ch2 != '(') {
					System.out.println(false);
					return ;
				}
			}
			
		}
		 balance(roq, count, ans);
		return;

	}
}
