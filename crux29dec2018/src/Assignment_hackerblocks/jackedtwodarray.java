package Assignment_hackerblocks;

import java.util.Scanner;

public class jackedtwodarray {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int m=scn.nextInt();
		int arr[][]=new int[m][];
		arr=input(arr,m);
		output(arr);

	}
	public static int [][]input(int arr[][],int m)
	{
		for(int i=0;i<arr.length;i++)
		{
			int j=scn.nextInt();
			arr[i]= new int[j];
			for( j=0;j<arr[i].length;j++)
			{
				
				arr[i][j]=scn.nextInt();
			}
		}
		return arr;
		
	}
	public static void  output(int[][]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
	}

}
