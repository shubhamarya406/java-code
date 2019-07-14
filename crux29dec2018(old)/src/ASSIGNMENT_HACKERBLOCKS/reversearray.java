package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class reversearray {
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int []array=input();
		reverse(array);
	}
	
	
	public static int[] input()
	{
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		return arr;
	}
	public static void reverse(int arr[])
	{
		
		for(int i=0;i<=arr.length/2;i++)
		{
			 
		int	temp=arr[i];
			//arr[temp]=;
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
			}
			 for(int  i=0;i<arr.length;i++)
			 {
				 System.out.println(arr[i]);
			 }

	

}
}

