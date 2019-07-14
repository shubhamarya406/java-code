package Assignment_hackerblocks;

import java.util.Scanner;

public class maximumsumpatharrays {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t != 0) {
			int m = scn.nextInt();
			int n = scn.nextInt();
			int arr1[] = new int[m];
			int arr2[] = new int[n];
			int sum1 = 0, sum2 = 0,n=0;
			for (int i = 0; i < arr1.length; i++)
			{
				arr1[i] = scn.nextInt();
				
			}
			for (int i = 0; i < arr2.length; i++)
			{
				arr2[i] = scn.nextInt();
				
			}
			for(int i=0;i<arr1.length;i++)
			{
				sum1=sum1+arr1[i];
				for( i=0;i<arr2.length;i++)
					sum2=sum2+arr2[i];
					 n=arr1[i];
					 int l=0,h=arr2.length-1;
						
					 while(l<=h)
					 {
						int  mid=l+h/2;
						 if(n>arr2[mid])
							 
						 {
							 l=mid+1;
						 }
						 else if(n<arr2[mid])
						 {
							 h=mid-1;
							
						 }
						 else 
						 {
							 if(sum1>sum2)
							 {
								 
							 }
							 
							 
						 }
				
				
			}

		}

		t--;
	}
}
