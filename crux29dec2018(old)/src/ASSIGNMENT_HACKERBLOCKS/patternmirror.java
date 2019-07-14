package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class patternmirror {
 public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	int n=scn.nextInt();
	int nst=1;
	int row=1;
	int nsp=n/2;
	while(row<=n)
	{
		int csp=1;
		while(csp<=nsp)
		{
			System.out.print(" ");
			csp++;
		}
		int cst=1;
		while(cst<=nst)
		{
			System.out.print("*");
			System.out.print(" ");
			cst++;
		}
		System.out.println();
		if(row<n/2+1)
		{
			nst=nst+2;
			nsp=nsp-1;
		}
		else
		{
			nst=nst-2;
			nsp=nsp+1;
		}
		row++;
	}
			
}
}
