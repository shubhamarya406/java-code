package Assignment_hackerblocks;

import java.util.Scanner;

public class smallerandgreater {
public static void main(String[] args) {
	Scanner scn=new Scanner (System.in);
	int t=scn.nextInt();
	while(t>0)
	{
		int n=scn.nextInt();
		int arr[]=new int[n];
		int flag=0;
		for(int i=0;i<n;i++)
		{
			 arr[i]=scn.nextInt();
		}
		for(int i=0;i<n;i++)
		{ flag=0;
		 for(int j=i+1;j<n;j++)
		 {  
			 if(arr[i]<arr[j])
			 {  int  l=arr[j];
			 flag=1;
				 for(int k=j+1;k<n;k++)
				 {
					 if(l>arr[k])
					 {
						 System.out.print(arr[k]+" ");
						 flag=2;
						 break;
					 }
				 }
				 if(flag==1)
					 System.out.print(-1+" ");
				 break;
			 }
			 
			 
		 }
		 if(flag==0)
			 System.out.print(-1+" ");
			
		}
		
		
		t--;
	}
}
}




