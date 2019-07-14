package Assignment_hackerblocks;

import java.util.Scanner;

public class sum_of_no {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		int ans=0;
		sum(str,ans);
		
		
	}
public static void  sum(String str,int ans)
{
	
	if(str.length()==0)
	{
		System.out.println(ans);
		return ;
	}
	String ch=str.substring(0,1);
     ans=ans+Integer.parseInt(ch);
	String rev=str.substring(1);
	
	 sum(rev,ans);
//	ans=ans+ch;
//	return ans;
	
}
}
