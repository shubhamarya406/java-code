package ASSIGNMENT_HACKERBLOCKS;

import java.util.Arrays;
import java.util.Scanner;
public class deepakandroses {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		int a=0,b=0;
		while(t>0)
		{
			
			int n=scn.nextInt();
			int arr[]=new int[n];
		    for(int i=0;i<arr.length;i++)
		    {
		    	
		    	arr[i]=scn.nextInt();
		    	
		    }
		    Arrays.sort(arr);
		    int m=scn.nextInt();
		    int sum=0,c,s1=0;
		    for(int i=0;i<arr.length;i++)
		    {
		    	for(int j=i+1;j<arr.length;j++)
		    	{
		    		sum=arr[i]+arr[j];
		    		if(sum==m)
		    		{
		    			
		    			if(arr[i]>arr[j])
		    			{
		    				c=arr[i]-arr[j];
		    				if(c<s1||s1==0)
		    				{
		    				s1=c;
		    				a=arr[i];
		    				b=arr[j];
		    				}
		    				
		    			}
//		    		  else if(arr[j]>arr[i])
//		    			{
//		    				c=arr[j]-arr[i];
//		    				if(c<s1||s1==0)
//		    				{
//		    				s1=c;
//		    				a=arr[i];
//		    				b=arr[j];
//		    				}
//		    			}
		    			else 
		    			{
		    				c=arr[i]-arr[j];
		    				s1=c;
		    				a=arr[i];
		    				b=arr[j];
		    			}
		    		}
		    		
		    	
		    	
		    	
		    
		    	}
		    }
			
			
			System.out.println("Deepak should buy roses whose prices are "+a + " and "+b +".");
			
			t--;
		

	

		}
	}
}
	