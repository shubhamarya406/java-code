package Assignment_hackerblocks;

import java.util.Scanner;

public class twodarrayinputops {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		
		int m=scn.nextInt();
		int n=scn.nextInt();
		int arr[][]=new int[m][n];
         arr=takeinput(arr,m,n);
         output(arr,m,n);
	}
 public static int[][] takeinput(int arr[][],int m,int n)
 {
	 for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<m;j++)
		 {
			 arr[i][j]=scn.nextInt();
		 }
		 
	 }
	 return arr;
 } 
 public static void output(int arr[][],int n,int m)
 {
	 
	 for(int i=0;i<n;i++)
	 {
		 
		 for(int j=0;j<m;j++)
			 System.out.print(arr[i][j]+" ");
		 System.out.println();
	 }
	 
 }
}
