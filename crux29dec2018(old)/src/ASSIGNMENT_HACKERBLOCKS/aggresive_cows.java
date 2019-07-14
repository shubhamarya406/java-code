package ASSIGNMENT_HACKERBLOCKS;

import java.util.Arrays;
import java.util.Scanner;

public class aggresive_cows {
static Scanner scn=new Scanner (System.in);
	public static void main(String[] args) {
		
int s=scn.nextInt();
int c=scn.nextInt();
int arr[]=new int [s];
for(int i=0;i<arr.length;i++)
{
	arr[i]=scn.nextInt();
}
Arrays.sort(arr);
int lo=0,hi=arr[arr.length-1];
int mid=0;
int fa=0;
while(lo<=hi)
{
	mid=(lo+hi)/2;
	int ans=ispossible(arr,c,mid);
	if(ans==0)
	{
		lo=mid+1;
		fa=mid;
		
	}
	
	
	else
		hi=mid-1;
}
System.out.println(fa);
	}
public static int ispossible(int[]arr,int c,int mid )
{  int noc=0;
	int d=mid;
	int pos=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(i==0)
	{
		noc++;
		
		
	}
	
	else if(arr[i]-pos>=mid)
		
		{
			noc++;
			pos=arr[i];
			
		if(noc==c)
			return 0;
			
		}
		
		
	}
	return -1;
	
}
}
