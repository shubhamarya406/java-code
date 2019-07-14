package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class book_allocation_problem {
 static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int t=scn.nextInt();
		while(t>0)
		{
			int n=scn.nextInt();
			int arr[]=new int[n];
			int m=scn.nextInt();
			int nop=0;
			int ans=0;
			
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=scn.nextInt();
				nop+=arr[i];
			}
			int mid=0,hi=nop,lo=0;
			int fa=0;
			while(lo<=hi)
			{
			mid=(lo+hi)/2;	
			
		 ans=possible(arr,m,mid);
		    if(ans==0)
		    {
		    	hi=mid-1;
		    	fa=mid;
		    	
		    }
		 
		    else
		    {
		    	lo=mid+1;
		    }
			}
			System.out.println(fa);
			t--;
		}
	}
		
		public static int possible(int[] arr,int m,int mid)
		{   int nop=0;
		    int nos=1;
			for(int i=0;i<arr.length;)
			{ 
				if(nop+arr[i]<=mid)
					{
					
					nop+=arr[i];
					i++;
					
				}
				else
				{
					nos++;
					nop=0;
					if(nos>m)
					return -1;
				}
				
				
			}
			return 0;
		}
	

}
