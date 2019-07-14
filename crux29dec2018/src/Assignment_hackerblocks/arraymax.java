package Assignment_hackerblocks;

import java.util.Scanner;

public class arraymax {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		
	          int[]array= input();
	       int ans=   Linearsearch(array);
	        //  System.out.println(Linearsearch);
				
				//int ans=arraymax(array);
			//	System.out.println(ans);
	       System.out.println(ans);
				

	}
	public static int[] input()
	{
		int n=scn.nextInt();
		int arr[]=new int[n] ;
		
		for(int i=0;i<arr.length;i++)
		{//	int val=scn.nextInt();
		       arr[i]=scn.nextInt();
		       
		}
		return arr;
		
	}
	
	public static int Linearsearch(int[] arr)
	{
		//int []arr=new int[n];
		int n=scn.nextInt();
		//int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				return  i;
			}
			
			
		
			
			
		}
		return -1;

	}

}
