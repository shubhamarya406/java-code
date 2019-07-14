package Assignment_hackerblocks;

import java.util.Scanner;

public class mirrorarrayinverse {
  static Scanner scn=new Scanner(System.in);
//	public static void main(String[] args) {
		public static void main(String[] args) {
			int n=scn.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
			{
			    array[i]=scn.nextInt(); 
			}
			reverse(array);
		}
		
		

		public static void reverse(int arr[])
		{ int flag=0;
			int arr1[]=new int[arr.length];		
			for(int i=0;i<arr.length;i++)
			{
				 
	             arr1[arr[i]]=i;
				
			}
				 for(int  i=0;i<arr.length;i++)
				 {
					 System.out.println(arr1[i]);
				 }
				 for(int i=0;i<arr.length-1;i++)
				 {// flag=0;
					 if(arr1[i]==arr[i])
						 flag=1;
					 else
					 {
						 flag=0;
					 break;
					 }
					 }
				 if(flag==1)
				 {
					 System.out.println("true");
				 }
				 else
				 {
					 System.out.println("false");
					 
				 }
		

	}
	}




