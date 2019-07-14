package Assignment_hackerblocks;

import java.util.Scanner;

public class Stringtointeger {

	public static void main(String[] args) {
		int ans=0;
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		inte(str,ans);
	}
public static void inte(String str,int ans)
{
	if(str.length()==0)
	{
		
		return;
	}
	String ch=str.substring(0,1);
	ans=Integer.parseInt(ch);
	System.out.print(ans);
	String rev=str.substring(1);
	inte(rev,ans);
	
}
}
