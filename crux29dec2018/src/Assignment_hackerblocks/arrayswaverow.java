package Assignment_hackerblocks;

import java.util.Scanner;

public class arrayswaverow {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int row=scn.nextInt();
		int col=scn.nextInt();
		int arr[][]=new int[row][col];
		arr=input(arr,row,col);
	arr=	waverow(arr);
		output(arr);
	}
public static int[][] input(int[][]arr,int row,int col)
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
		System.out.println(" END");
	}
	
}
public static int[][] waverow(int[][]arr)
{
	for(int row=0;row<arr.length;row++)
	{
		if(row%2==0)
		{
			for(int col=0;col<arr[0].length;col++)
				arr[row][col]=arr[row][col];
		}
		else 
		{
			for(int col=arr[0].length-1;col>0;col--)
				arr[row][col]=arr[row][col];
		}
	}
//	System.out.print("END");
	return arr;
}
}
