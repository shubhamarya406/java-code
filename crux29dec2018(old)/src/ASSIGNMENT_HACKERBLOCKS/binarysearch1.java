package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class binarysearch1 {
 static  Scanner scn=new Scanner(System.in); 
	public static void main(String[] args) {
		int[] array=input();
		int ans=binary(array);
		System.out.println(ans);
	}

	public static int[] input()
	{
		int n=scn.nextInt();
		int  arr[]=new int[n]; 
		for(int i=0;i<n;i++)
			
		{
			arr[i]=scn.nextInt();
			
		}
		return arr;
		
		
	}
	
	public static int binary(int arr[])
	{    int n=scn.nextInt();
	
		 int l=0,h=arr.length-1;
		
		 while(l<=h)
		 {
			int  mid=l+h/2;
			 if(n>arr[mid])
				 
			 {
				 l=mid+1;
			 }
			 else if(n<arr[mid])
			 {
				 h=mid-1;
				
			 }
			 else 
				 return mid;
		 }
		 return -1;
	}
	
	
}
