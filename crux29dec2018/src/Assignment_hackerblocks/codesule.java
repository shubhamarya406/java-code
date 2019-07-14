package Assignment_hackerblocks;

import java.util.Scanner;

public class codesule {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0)
		{
			String str=scn.next();
			System.out.println(no(str,0,0));
			
			
			
			
		}

	}
	public static int  no(String str,int i,int  ans)
	{   if(str.length()==0)
	{
		return 0;
		
	}
		char ch=str.charAt(0);
		String roq=str.substring(1);
		//int fch=(int)(ch);
		int fch=Integer.valueOf(ch);
		int froq=Integer.parseInt(roq);
		for(int j=0;j<str.length();j++)
		no(roq,i,ans+fch+froq);
		
		return ans;
		
		
		
		
		
		
	}

}
