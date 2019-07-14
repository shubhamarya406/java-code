package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class gcd1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int s;
		int l;
		int ans=0;
		int lcm=0;
		if(n1>n2)
		{
			l=n1;
			s=n2;
		}
		else
		{
			l=n2;
			s=n1;
		}
    for(int i=1;i<=s;i++)
    {
    	if(l%i==0&&s%i==0)
    	{
    		  ans=i;
    	}
    	
    }
    lcm=(l*s)/ans;
    System.out.println(lcm);
    System.out.println(ans);
	}

}
