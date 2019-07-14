package Assignment_hackerblocks;

import java.util.Scanner;

public class string_compression {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		String str=scn.nextLine();
StringBuilder sb=new StringBuilder(str);
 compress(sb);
	}
public static void compress(StringBuilder sb)

{ int ct=0;
String ans="";
	for(int i=0;i<sb.length();i=i+ct)
	{ char ch1=sb.charAt(i);
	     ct=0;
		for(int j=i;j<sb.length();j++)
		{ char ch2=sb.charAt(j);
			
			if(ch1==ch2)
			{
				ct++;
				
			}
		else 
		{
			if(ct!=1)
			ans=ans+sb.charAt(i)+ct;
			else
				ans=ans+sb.charAt(i);
			break;
			
		}
			
			
		}
		
	}if(ct!=1)
	ans=ans+sb.charAt(sb.length()-1)+ct;
	else
		ans=ans+sb.charAt(sb.length()-1);
	System.out.println(ans);
}
}
