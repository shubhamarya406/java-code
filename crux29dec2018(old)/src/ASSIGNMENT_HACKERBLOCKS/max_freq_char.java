package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class max_freq_char {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		int ct=0;
		int max=0;
		char maxans=0;
		for(int i=0;i<str.length();i++)
		{  char ch1=str.charAt(i);
		ct=0;
			for(int j=0;j<str.length();j++)
			{
			char ch2=str.charAt(j);
			if(ch1==ch2)
			{
				
				ct++;
			}
			}
			if(max<ct)
			{
				max=ct;
				maxans=str.charAt(i);
				
			}
			
			
			
			}
		
System.out.println(maxans);
	}

}
