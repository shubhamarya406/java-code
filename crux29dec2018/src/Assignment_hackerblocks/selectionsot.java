package Assignment_hackerblocks;

import java.util.Scanner;

public class selectionsot {
 static Scanner scn=new Scanner (System.in);
	public static void main(String[] args) {
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=scn.nextInt();
        sorting(arr);
	}
	public static void sorting(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{   int min=arr[i];
			for(int j=0;j<arr.length;j++)
			{
			if(min>arr[i])
			{
				int temp=arr[i];
				arr[0]=arr[j];
				arr[j]=temp;
				
				
			}
			}
			for( i=0;i<arr.length;i++)
				  System.out.print(arr[i]);
				}
		}
		
		
	}


