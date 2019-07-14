package Assignment_hackerblocks;

import java.util.Arrays;
import java.util.Scanner;

public class alexshopping1 {

	public static void main(String[] args) {
	Scanner scn=new Scanner (System.in);
		
		int n= scn.nextInt();// Types of items 
		
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++)
		{                                // prices of all the items
			arr[i]=scn.nextInt();
		}
		Arrays.sort(arr);
		int t=scn.nextInt();
		
		
		while(t!=0) 
		{
			int A= scn.nextInt(); // money she have 
			int k=scn.nextInt(); // no of items she buys 
			int count=0;
			int val=0;
			
				for(int i=0;i<n;i++)
		{
			int sum=arr[i];
			 val=A%sum;
			if(sum<=A&&val==0)
				count++;
		}
		if(k<=count)
			System.out.println("Yes");
		else
		{
			System.out.println("No");
		count=0;
		}
			
t--;
	}
		
	}

}


	
