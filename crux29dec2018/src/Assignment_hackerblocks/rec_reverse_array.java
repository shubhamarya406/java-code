package Assignment_hackerblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class rec_reverse_array {

	public static void main(String[] args) {
  Scanner scn=new Scanner(System.in );
  String str=scn.nextLine();
  int ans=0;
 System.out.println(stringrev(str,ans));
	
		
	}
	public static void stringrev(String str,int  ans)
	{
		if(str.length()==0)
		{
			return ;
			
		}
		String mr=new String();
		char ch=str.charAt(0);
	 ans=ans+ch;
//		 System.out.println(ans);
		String rev=str.substring(1);
		System.out.println(stringrev(rev,ans));
		
		
	}
}