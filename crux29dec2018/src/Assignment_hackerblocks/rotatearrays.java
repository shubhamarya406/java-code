package Assignment_hackerblocks;

import java.util.Scanner;

public class rotatearrays {
	 static Scanner  scn=new Scanner (System.in);

public static void main(String[] args) {
	int n=scn.nextInt();
	int arr[]=new int[n];
	int []array=;
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scn.nextInt();
	}
	array=rotate(arr[]);
	
	
	
}
public static int[] rotate(arr[])
{
	int ro=scn.nextInt();
	ro=ro%arr.length;
	if(ro<arr.length)
	{
		ro=ro+arr.length;
	}
	int temp=0;
	while(ro!=0)
	{ temp=arr[0];
	
	 for(int i=0;i<arr.length-1;i++)
	 {
		
		 arr[i]=arr[i+1];
		
		 
		// System.out.print(arr[i]);
	 }
	 arr[arr.length-1]=temp;
	 ro--;
		
	}
		
	
}
}
