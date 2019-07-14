package ASSIGNMENT_HACKERBLOCKS;

import java.util.Arrays;
import java.util.Scanner;

public class TARGETSUMPAIRSARRAYS {

	public static void main(String[] args) {
	Scanner scn=new Scanner (System.in);	
    int n=scn.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=scn.nextInt();
    	
    }
    Arrays.sort(arr);
    int t=scn.nextInt();
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=i+1;j<arr.length;j++)
    		
    	{  
    		for(int k=j+1;k<arr.length-1;k++)
    		{
    		sum=arr[i]+arr[j]+arr[k];
    		if(sum==t) {
    			System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
    		}
    		
    	}
    	}
    	
    }
	
	}

}












