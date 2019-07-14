package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class PASCALARRAY {
	
  public static void main(String[] args) {
	 Scanner scn=new Scanner(System.in);
	 int n=scn.nextInt();
	 int arr[]=new int[n];
	 for(int nst=1;nst<arr.length;nst++)
	 {   int sum=0;
		for( int i=1;i<=nst; i++ )
		{ if(arr[i]==0||arr[i]==nst)
		{
			System.out.print(1+"\t");
		}
		else {
			System.out.print(sum+"\t");
		}
		sum=arr[0+i]+arr[i+1];
			 
		}
		nst++;
		 
	 }
			  
	
}
}
