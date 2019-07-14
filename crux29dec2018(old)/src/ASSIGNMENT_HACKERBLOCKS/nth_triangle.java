package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class nth_triangle {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
       int n=scn.nextInt();
       int count=0;
       int sum=0;
 System.out.println(recursive(n,count,sum));
 
	}
public static int recursive(int n,int count,int sum)
{
	if(count>n)
	{
		return sum ;
	}
	sum=sum+count;
int ans=	recursive(n, count+1, sum);
	
	return ans;
	
}
}
