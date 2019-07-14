package Assignment_hackerblocks;

import java.util.Scanner;

public class maximumcircularsum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		int i=0;
		while(t>0)
		{
			
		int n=scn.nextInt();
		int[]arr=new int[n];
		//int beg=0,fin=0;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
			
		}
		int crsum=0,sum=arr[0];
		for( i=0;i<arr.length;i++)
		{// crsum=0;
		 crsum=arr[i];
			for(int j=0;j<arr.length;j++)
			{ crsum=crsum+arr[j+1];
				if(crsum>sum)
				{
					sum=crsum;
				}
				
				
			}
			for(int k=0;k<i;k++)
			{
				 crsum=crsum+arr[k];
					if(crsum>sum)
					{
						sum=crsum;
					}
				
			}
		}
		System.out.println(sum);
			
			t--;
		}
	
	}
}
