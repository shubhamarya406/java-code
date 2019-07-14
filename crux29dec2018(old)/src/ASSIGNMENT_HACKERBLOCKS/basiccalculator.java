package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class basiccalculator {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		char ch=scn.next().charAt(0);
		int ans=0;
		if(ch=='+')
		{
			int n1=scn.nextInt();
			int n2=scn.nextInt();
			ans=n1+n2;
			System.out.println(ans);
		}
		else if(ch=='-')
		{
			int n1=scn.nextInt();
			int n2=scn.nextInt();
			ans=n1-n2;
			System.out.println(ans);
		}
		else if(ch=='%') {
			int n1=scn.nextInt();
			int n2=scn.nextInt();
			if(n2!=0)
			{
				ans=n1%n2;
				System.out.println(ans);
			}
		}
		else if(ch=='/')
		{
			int n1=scn.nextInt();
			int n2=scn.nextInt();
			if(n2!=0)
			{
				ans=n1/n2;
				System.out.println(ans);
			}
		}
		else if(ch=='*')
		{int n1=scn.nextInt();
		int n2=scn.nextInt();
		ans=n1*n2;
		System.out.println(ans);
			
		}
		else if(ch=='x'||ch=='X')
			System.exit(0);
		else
		{
			System.out.println("Invalid operation. Try again.");
		}
	}

}
