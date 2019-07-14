package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class selectionsort {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int row=scn.nextInt();
		int col=scn.nextInt();
		int arr[][]=new int[row][col];
		arr=input(arr,row,col);
		//output(arr);
	waverow(arr);
//		output(arr);
	}

	public static int[][] input(int arr[][],int row,int col)
	{
		for(row=0;row<arr.length;row++)
		{
			
			for(col=0;col<arr[row].length;col++)
			arr[row][col]=scn.nextInt();
		}
		return arr;
	}
	public static void output(int arr[][])
	{
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
				System.out.print(arr[row][col]);
			System.out.println();
		}
		
	}
	public static void waverow(int[][]arr)
	{
		for(int col=0;col<arr[0].length;col++)
		{
			if(col%2==0)
			{
				for(int  row=0;row<arr.length;row++)
					System.out.print(arr[row][col]+" ,");
					
			}
			else
			{
				for(int  row=arr.length-1;row>=0;row--)
					System.out.print(arr[row][col]+" ,");
			}
//			return arr;
		}
		System.out.print("END");
		
	}
}
