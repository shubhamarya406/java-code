package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class spiral_print_anticlockwise {
static Scanner scn=new Scanner (System.in);
	public static void main(String[] args) {
		int row=scn.nextInt();
		int col=scn.nextInt();
		int [][]arr=new int[row][col];
		arr=input(arr,row,col);
		spiral(arr,row,col);
	}
public static int[][]input(int arr[][],int row,int col)
{
	
	for(row=0;row<arr.length;row++)
	{
		for(col=0;col<arr[row].length;col++)
			arr[row][col]=scn.nextInt();
	}
	return arr;
}
public static void spiral(int arr[][],int row,int col)
{
	int minrow=0,maxrow=arr.length-1,mincol=0,maxcol=arr[0].length-1,count=0;
	 int nel=row*col;
	 while(count<nel)
	 {
	for( row=minrow;row<=maxrow&&count<nel;row++)
	{
		System.out.print(arr[row][mincol]+", ");
		count++;
	
	}
	mincol++;
	for( col=mincol;count<nel&&col<=maxcol;col++)
	{
		
		System.out.print(arr[maxrow][col]+", ");
		count++;
		
	}
	maxrow--;
	for( row=maxrow;count<nel&&row>=minrow;row--)
	{
		System.out.print(arr[row][maxcol]+", ");
		count++;
	}
	maxcol--;
	for( col=maxcol;count<nel&&col>=mincol;col--)
	{
		System.out.print(arr[minrow][col]+", ");
		count++;
	}
	minrow++;
	 }
	System.out.print("END"); 
}

}

