package Assignment_hackerblocks;

import java.util.Scanner;

public class rainwatertrapping {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
	
		int t=scn.nextInt();
		while(t>0)
		{
			int n=scn.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=scn.nextInt();
			}
			int sum=0;
			int  lmax[]=leftmax(arr,n);
			int rmax[]=rightmax(arr,n);
			for(int i=0;i<arr.length;i++)
			{
				int ans=Math.min(lmax[i],rmax[i]);
				sum+=ans-arr[i];
			}
			System.out.println(sum);
			t--;
		}
	}

		
public static int[] leftmax(int[] arr,int n)
{
	int[] lmax=new int[n];
	lmax[0]=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		lmax[i]=Math.max(lmax[i-1],arr[i]);
		
	}
	return lmax;
	
}
	
private static int[] rightmax(int[] arr, int n)
{
	int rmax[]=new int[n];
	rmax[arr.length-1]=arr[arr.length-1];
	for(int i=arr.length-2;i>=0;i--)
	{
		rmax[i]=Math.max(rmax[i+1],arr[i]);
		
	}
	return rmax;
	
	
	
}
}

