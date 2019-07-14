package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class string_odd_even {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
  String str=scn.nextLine();
  StringBuilder sb=new StringBuilder(str);
  oddeven(sb);
	}
public static void oddeven(StringBuilder sb)
{
	for(int i=0;i<sb.length();i++)
	{ char ch=sb.charAt(i);
		if(i%2==0)
		{ch=(char)(ch+1);
		
			sb.setCharAt(i, ch);
			
		}
		else
		{
			ch=(char)(ch-1);
			
			sb.setCharAt(i, ch);
		}
			
		
	}
	
	System.out.println(sb);
}
}
