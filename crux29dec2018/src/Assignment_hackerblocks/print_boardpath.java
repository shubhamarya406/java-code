package Assignment_hackerblocks;

import java.util.Scanner;

public class print_boardpath {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		boardpath(n,m,0,"");
		int ans=boardpaths(n,m,0,"");
		System.out.println("\n"+ans);
	}
public static void boardpath(int n,int m,int curr,String ans)
{
	if(curr==n)
	{
		System.out.print(ans+" ");
		return;
		
	}
	if(curr>m)
		return ;
	for(int i=1;i<=n;i++)
	{
		boardpath(n,m,curr+i,ans+i);
	
	}
	
}
public static int boardpaths(int n,int m,int curr,String ans)
{
	

	if(curr==n)
	{
		System.out.println(ans);
		return 1;
		
	}
	if(curr>m)
	{
		
		return 0;
	}
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		sum+=boardpaths(n,m,curr+i,ans+i);
	
	}

	return sum;
}
}
