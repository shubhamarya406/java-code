package Assignment_hackerblocks;

import java.util.Scanner;

public class pallindromic_string {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		int i=0;
		System.out.println(ispallindromic(str,i));

	}
public static boolean ispallindromic(String str,int i)
{
	if(str.charAt(i)!=str.charAt(str.length()-i-1))
   	return false;
	if(i==str.length()-1)
	{
		return true;
		
	}
	
	boolean bn=ispallindromic(str,i+1);
	if(bn)
		return true;
	else
		return false;
	
	
}
}
