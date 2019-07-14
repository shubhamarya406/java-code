package Assignment_hackerblocks;

import java.util.Scanner;

public class generateparantheses {
static int ct=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		parantheses(n, n, 0, 0, "");
	}

	public static void parantheses(int n, int  ct, int open, int close, String ans) {
		if (close == n) {

			System.out.println(ans);
			ct = ct + 1;
			if (ct < n)
				parantheses(n, ct-1, 0, 0, "");
			return;
		}
		
		if (open > close) {
			parantheses(n, ct, open, close + 1, ans + ")");
		}
		if (open < n) {

			parantheses(n, ct, open + 1, close, ans + "(");
		}
	}
}
