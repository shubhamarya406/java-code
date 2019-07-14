package Assignment_hackerblocks;

import java.util.Scanner;

public class ascii_subsequences {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
       System.out.println(ascii2(str,""));
       ascii(str,"");
	}
public static void ascii(String str,String ans)
{
	if(str.length()==0)
	{
		System.out.print(ans+" ");
		return ;
	}
	char ch=str.charAt(0);
	int no=ch;
	String res=str.substring(1);
	ascii(res,ans);
	ascii(res,ans+ch);
	
	
	ascii(res,ans+no);
	
}
public static int ascii2(String str,String ans)
{
	
	if(str.length()==0)
	{
		
		return 1;
	}
	char ch=str.charAt(0);
	int no=ch;
	int sum=0;
	String res=str.substring(1);
	sum+=ascii2(res,ans);
	sum+=ascii2(res,ans+ch);

	sum+=ascii2(res,ans+no);
	return sum;
	
	
}
}
