package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class toogle_case {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		StringBuilder sb=new StringBuilder(str);
		toogle(sb);
	}
public static void toogle(StringBuilder str)
{
  int dif=0;
  String ans="";
	for(int i=0;i<str.length();i++)
	{ char  ch=str.charAt(i);
		if(Character.isUpperCase(ch))
		{
		str.setCharAt(i, Character.toLowerCase(ch));
		}
	else if(Character.isLowerCase(str.charAt(i)))
		str.setCharAt(i,Character.toUpperCase(ch));
		
	}
	System.out.println(str);
}
}
