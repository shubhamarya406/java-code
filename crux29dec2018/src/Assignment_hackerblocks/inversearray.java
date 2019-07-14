package Assignment_hackerblocks;

import java.util.Scanner;

public class inversearray {
//	static Scanner scn=new Scanner(System.in);
	static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		
		int []array=input();
		inverse(array);
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
	public static void inverse(int arr[])
{
		//int in=0,pos=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			 {
		int	temp=arr[i];
			//arr[temp]=;
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
			}
//		for(int i=0;i<arr.length/2;i++)
//		{
		
		}
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
}

}

