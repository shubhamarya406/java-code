package Assignment_hackerblocks;

import java.util.Scanner;

public class recursion_demo {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		int n=scn.nextInt();
		int sindex=0;
		int item=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=scn.nextInt();
//	int x=scn.nextInt();
	//	pd(n);
		//System.out.println(factorial(n));
	//	System.out.println(fibonacci(n));
		//System.out.println(power(n,x));
	//	System.out.println(firstoccurence(arr,sindex,item))	;
		System.out.println(lastoccurence(arr,sindex,item))	;
		}
	public static void pd(int n)
	{
		if(n==0)
			return ;
    
     pd(n-1);
     //System.out.println(n);
}
	public static int factorial(int n)
	{  if(n==1)
		return 1;
		int fm1=factorial(n-1);
		int fact=n*fm1;
		return fact;
		
	}
	public static int fibonacci(int n)
	{ if(n==0||n==1)
		return n;
	
		int fb1=fibonacci(n-1);
		
		int fb2=fibonacci(n-2);
		
		int ffb=fb1+fb2;
		
		System.out.println(ffb);
		return ffb;
	}
	public static int power(int n,int x)
	{ if(x==0)
		return 1;
		int pow=power(n,(x-1));
		int ans=pow*n;
		return ans;
	}
	public static int firstoccurence(int[]arr,int sindex,int item)
	{
		if(item==arr[sindex])
			return sindex;
		int val=firstoccurence(arr,(sindex+1),item);
		return val;
	}
	public static int lastoccurence(int []arr,int sindex,int item)
	{
		if(item==arr[sindex])
			return sindex;
		int val=lastoccurence(arr,(sindex+1),item);
		  if(val==arr.length)
		  {
			  return val;
		  }
		  else
		  {
		  int lval=lastoccurence(arr,(val+1),item);
		  return lval;
		  }
		
	}
}