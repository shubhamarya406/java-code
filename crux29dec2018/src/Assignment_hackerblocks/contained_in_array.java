package Assignment_hackerblocks;

import java.util.Scanner;

public class contained_in_array {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=scn.nextInt();
		}
    int m=scn.nextInt();
    int i=0;
   System.out.println(ispossible(arr,m,i));
	}
public static boolean ispossible(int[]arr,int m,int i)
{
	
	if(arr[i]==m)
	{
		
		return true;
	}
	if(i==arr.length-1)
		return false;
boolean bn=	ispossible(arr, m, i+1);
	if(bn)
		return true;
	else
		return false;
	
	
}
}
