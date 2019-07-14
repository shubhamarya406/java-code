package Assignment_hackerblocks;

import java.util.Arrays;
import java.util.Scanner;

public class alexshopping {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]= scn.nextInt();
		}
		Arrays.sort(arr);
		int q=scn.nextInt();
		
		//int arr1[]=new int[q];
	//	for(int j=0;j<arr1.length;j++)
		
			//arr1[j]=scn.nextInt();
		 for(int j=0;j<q;j++)
		 {
			 int a=scn.nextInt();
			 int k=scn.nextInt();
			 int val=0;
			 int count=0;
			
		for(int i=0;i<arr.length;i++)
		{  val=arr[i]%a;
			if(a==arr[i])
			{
				count++;
			}	
			
			else if (arr[i]<a&&val==0)
			{
				count++;
			
			}
		  
		}
		
				
			if(k==count||k<count)
			{
				System.out.println("Yes");
			}
			else
				System.out.println("No");
				
			}
			
			
		}
		

	}


