package Assignment_hackerblocks;

import java.util.Scanner;

public class duplicate_charcter {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		StringBuilder sb=new StringBuilder(str);
		duplicate(sb);
	}
public static void duplicate(StringBuilder sb)
{  StringBuilder nsb=new StringBuilder();
  int ct=0;
	for(int i=0;i<sb.length();i=i+ct)
	{  ct=0;
		char ch1=sb.charAt(i);
		for(int j=i;j<sb.length();j++)
		{
			char ch2=sb.charAt(j);
		if(ch2!=ch1)
		{  
			nsb.append(ch1);
			break;
		}
		 ct++;
		}
	}nsb.append(sb.charAt(sb.length()-1));
	System.out.println(nsb);
	}
}
