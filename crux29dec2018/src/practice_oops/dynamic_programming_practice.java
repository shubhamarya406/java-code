package practice_oops;

import java.util.Arrays;
import java.util.Scanner;

public class dynamic_programming_practice {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
//String str1=scn.next();
//String str2=scn.next();

		// System.out.println(fibonacciTD(100000,new int[100000+1]));
		// fibonacciBU(10000);
		// System.out.println(mazepath(0, 0, 2, 2));
//System.out.println(mazepathTD(0, 0, 2, 2,new int[4][4]));
		//mazepathbdu(0, 0, 3, 3);
	System.out.println(LCS("abcdtgtrutiurhgdgdhfhry","agcfdjhgyfytertiujiuot,khuifytfdgdt"));
	}

	private static int fibonacciTD(int n, int[] strg) {
		if (n == 0 || n == 1)
			return n;
		if (strg[n] != 0) {
			return strg[n];
		}
		int fnm1 = fibonacciTD(n - 1, strg);
		int fnm2 = fibonacciTD(n - 2, strg);

		int fn = fnm1 + fnm2;
		strg[n] = fn;
		return fn;

	}

	public static void fibonacciBU(int n) {
		int strg[] = new int[n + 1];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i < strg.length; i++) {
			strg[i] = strg[i - 1] + strg[i - 2];
		}
		System.out.println(strg[strg.length - 1]);
	}

	public static void fibonacciSE(int n) {
		int strg[] = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i <= n; i++) {
			int temp = strg[1];
			strg[1] = strg[0] + strg[1];
			strg[0] = temp;

		}
		System.out.println(strg[1]);
	}

	public static int mazepath(int cr, int cc, int er, int ec)

	{
		if (cr == er && cc == ec) {
			// System.out.println(str);

			return 1;
		}
		if (cr > er || cc > ec)
			return 0;

		int ch = mazepath(cr, cc + 1, er, ec);

		int cv = mazepath(cr + 1, cc, er, ec);
		return ch + cv;

	}

	public static int mazepathTD(int cr, int cc, int er, int ec, int[][] strg) {
		if (cr == er && cc == ec) {
			// System.out.println(str);
        strg[cr][cc]=1;
			return 1;
		}
		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}
		if (cr > er || cc > ec)
			return 0;

		int ch = mazepathTD(cr, cc + 1, er, ec, strg);

		int cv = mazepathTD(cr + 1, cc, er, ec, strg);
		strg[cr][cc] = ch + cv;
		return ch + cv;

	}

	public static void mazepathBU(int cr, int cc, int er, int ec) {

		int arr[][] = new int[er + 2][ec + 2];
		for (int row = er; row >= 0; row--) {
			for (int col = ec; col >= 0; col--) {
				if (row == er && col == ec) {
					arr[row][col] = 1;
				} else {
					arr[row][col] = arr[row + 1][col] + arr[row][col + 1];
				}

			}
		}
		System.out.println(arr[0][0]);
	}

	public static void mazepathSE(int cr, int cc, int er, int ec) {
		int arr[] = new int[er + 1];
		Arrays.fill(arr, 1);
		for (int i = er - 1; i >= 0; i--) {
			for (int j = arr.length - 2; j >= 0; j--) {

				arr[j] = arr[j] + arr[j + 1];
			}

		}
		System.out.println(arr[0]);
	}

	public static void mazepathbdu(int cr, int cc, int er, int ec) {

		int arr[] = new int[er + 1];
		Arrays.fill(arr, 1);
		int temp = 1;
		for (int i = er - 1; i >= 0; i--) {
			for (int j = arr.length - 2; j >= 0; j--) {
				if (i == arr.length - 2) {
					temp = 1;

				}
				int sum = arr[j] + arr[j + 1] + temp;
				temp = arr[j];
				arr[j] = sum;

			}

		}
		System.out.println(arr[0]);
	}

	public static int LCS(String str1,String str2)
	{if(str1.length()==0||str2.length()==0)
	{
		return 0;
	}
	
		char ch1=str1.charAt(0);
		char ch2=str2.charAt(0);
		String roq1=str1.substring(1);
		String roq2=str2.substring(1);
		int ans=0;
		
		if(ch1==ch2)
		{
			int  cnt=LCS(roq1, roq2)+1;
			ans+=cnt;
		}
		else
		{
			int f=LCS(str1, roq2);
			int s=LCS(roq1, str2);
			ans+=Math.max(f, s);
			
			
		}
		return ans;
	}
	public static void td
}