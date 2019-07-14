package Assignment_hackerblocks;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n1= scn.nextInt();
		int n2= scn.nextInt();
		int div;
		int divd;
		int rem=0;
		if(n1>n2)
		{
			 div=n1;
			 divd=n2;
		}
		else
		{
			 div=n2;
			 divd=n1;
		}
		while(divd<=div)
		{
			
			rem=div%divd;
			div=divd;
			divd=rem;
		}
		System.out.println(divd);

	}

}
