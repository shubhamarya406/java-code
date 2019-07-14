package Assignment_hackerblocks;

import java.util.Scanner;

public class depth_of_parantheses {

	static int max2 = -1;
	static int max = 0;
	static int cmax = 0;
	static int flag = 0;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {

			String que = scn.next();

			System.out.println(parantheses(que, ""));
			t--;
		}

	}

	public static boolean balance(String que, String ans) {

		if (que.length() == 0) {

			if (ans.length() == 0) {

				return true;

			} else {

				return false;
			}

		}
		char ch = que.charAt(0);
		String roq = que.substring(1);

		if (ch == '{' || ch == '[' || ch == '(') {
			ans = ans + ch;

		} else {

			if (ch == '}') {

				char ch2 = ans.charAt(ans.length() - 1);
				ans = ans.substring(0, ans.length() - 1);

				if (ch2 != '{') {

					return false;
				}
			}

			if (ch == ']') {

				char ch2 = ans.charAt(ans.length() - 1);
				ans = ans.substring(0, ans.length() - 1);

				if (ch2 != '[')

				{

					return false;
				}
			}
			if (ch == ')' && ans.length() == 0) {
				return false;
			} else if (ch == ')' && ans.length() != 0) {
				char ch2 = ans.charAt(ans.length() - 1);
				ans = ans.substring(0, ans.length() - 1);

				if (ch2 != '(') {

					return false;
				}
			}

		}

		boolean bn = balance(roq, ans);

		return bn;

	}

	public static int parantheses(String que, String ans) {

		if (que.length() == 0) {
			return max;
		}
		if (balance(que, ans) == false) {
			return max2;
		}

		char ch = que.charAt(0);
		flag = flag + 1;
		String roq = que.substring(1);
		if (ch == '(' || ch == '[' || ch == '{') {
			cmax++;
			ans = ans + ch;

		} else

		{
			if (ch == ')' && ans.length() != 0) {

				char ch2 = ans.charAt(ans.length() - 1);
				ans = ans.substring(0, ans.length() - 1);
				if (ch2 == '(') {
					cmax--;

				}
			}
			if (ch == ']' && ans.length() != 0) {
				char ch2 = ans.charAt(ans.length() - 1);
				ans = ans.substring(0, ans.length() - 1);
				if (ch2 == '[') {
					cmax--;

				}

			}
			if (ch == '}' && ans.length() != 0) {
				char ch2 = ans.charAt(ans.length() - 1);
				ans = ans.substring(0, ans.length() - 1);
				if (ch2 == '{') {
					cmax--;

				}

			}
		}
		if (cmax > max) {
			max = cmax;
		}

		max = parantheses(roq, ans);

		return max;
	}
}
