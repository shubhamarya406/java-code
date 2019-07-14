package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class sumofarrays {
 static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int n=scn.nextInt();
		int arr[]=new int[n];
		int array[]=new int[n];
		int sumf=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
			
		{
			arr[i]=scn.nextInt();
			array[i]=arr[i];
			
		}
		int r=scn.nextInt();
		
		//int sumarr=0;
		for(int i=0;i<r;i++)
		{
	 int ans[]=rotate(array,-1*r);
	 for( i=0;i<array.length;i++)
		{
			
		
			sum=arr[i]+ans[i];
			 sumf=sum+sumf;

	 
		}
	 System.out.println(sumf);
			
		
	}
		
	
	}

	public static int[] rotate( int arr[],int r)
	{
		// r=scn.nextInt();
		r=r%arr.length;
		if(r<arr.length)
		{
			r=r+arr.length;
		}
		int temp=0;
		while(r!=0)
		{ temp=arr[0];
		
		 for(int i=0;i<arr.length-1;i++)
		 {
			
			 arr[i]=arr[i+1];
			
			 
			// System.out.print(arr[i]);
		 }
		 arr[arr.length-1]=temp;
		 r--;
			
		}
		return arr;
		
	}
	
}
