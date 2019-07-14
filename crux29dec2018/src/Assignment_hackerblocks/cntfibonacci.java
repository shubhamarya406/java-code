package Assignment_hackerblocks;

import java.util.Scanner;

public class cntfibonacci {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c=0;
		int i=1;
		System.out.println(a);
		System.out.println(b);
		while(i<n-1)
		{
			c=a+b;
			a=b;
			b=c;
			i++;
			System.out.println(c);
		}

	}

}
