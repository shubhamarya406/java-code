package L_11;

import java.util.Scanner;

public class quick_sort {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
			
		}
		quicksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}

	}
public static void quicksort(int arr[],int lo,int hi)
{int left=lo;
int right=hi;
	
	if(lo>=hi)
{
	return ;
}
	
	int mid=(lo+hi)/2;
	int pivot=arr[mid];
	while(left<=right)
	{
		while(arr[left]<pivot)
			left++;
		while(arr[right]>pivot)
			right--;
		
	
	if(left<=right)
	{
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		right--;
		left++;
	}
	}
	quicksort(arr,lo,right);
	quicksort(arr,left,hi);
	
}
}
