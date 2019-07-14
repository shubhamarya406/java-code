package Assignment_hackerblocks;

import java.util.Scanner;

public class sequence {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int flag=0;
		int a=0;
		  for (int i=0;i<n;i++)
		{    
			int  s1=scn.nextInt();
			
			if(s1<a&&flag!=1)
			{  flag=-1;
				
			}
			else if(s1>a)
			{
				  flag=1;
				  
			}
			
			else {
				int b=flag+1;
			}
			 a=s1;
			 i++;
				
		}
		if(flag==1   )
		{
			System.out.println("true");
		}
		else if(flag==-1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("fail7");
		}
		
	}

}
