package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class ascii_codes {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		//StringBuilder sb=new StringBuilder(str);
		difference(str);
	}
public static void difference(String sb)
{ String ans="";
	for(int i=0;i<sb.length()-1;i++)
	{  
		char ch1=sb.charAt(i);
		char ch2=sb.charAt(i+1);
		int n=ch2-ch1;
		ans=ans+ch1+n;
		
		
	}
	ans=ans+sb.charAt(sb.length()-1);
	System.out.println(ans);
}
}
