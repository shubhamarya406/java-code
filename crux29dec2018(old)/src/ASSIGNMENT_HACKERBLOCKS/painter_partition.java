package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class painter_partition {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int p=scn.nextInt();
		int b=scn.nextInt();
		int arr[]=new int[b];
		int nob=0;
		int fa=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
			nob+=arr[i];
		}
		int ans=0;
		int lo=0,hi=nob,mid=0;
		while(lo<=hi)
		{mid=(lo+hi)/2;
      ans=painter(arr,p,b,mid);
      if(ans==0)
      {
    	 fa=mid;
    	 hi=mid-1;
    	  
      }
      else
    	  lo=mid+1;
      
		}
		System.out.println(fa);
	}
	public  static int painter(int[] arr, int p, int b,int mid) {
		int nop=1;
		int tb=mid;
		for(int i=0;i<arr.length;)
		{
			if(tb-arr[i]>=0)
			{
				tb-=arr[i];
				i++;
			}
			else
			{
				nop++;
				tb=mid;
				if(nop>p)
					return -1;
				
				
			}
			
		}
		return 0;
	}

}
