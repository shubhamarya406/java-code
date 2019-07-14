package Assignment_hackerblocks;

import java.util.Scanner;

public class subset {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
			
		}
		int target=scn.nextInt();
		System.out.println(subset2(arr,target,"", 0));
		subset(arr, target, "", 0);
	}

	public static void subset(int arr[], int sum, String ans, int i) {
		if (i ==arr.length) {
			if (sum == 0) {
				System.out.print(ans);
				return ;
			}

			return ;
		}
int ct=0;
		
		subset(arr,sum-arr[i],ans+arr[i]+" ",i+1);
		subset(arr,sum,ans,i + 1);
	
	
	}
	public static int subset2(int arr[], int sum, String ans, int i) {
		if (i ==arr.length) {
			if (sum == 0) {
				//System.out.println(ans);
				return 1;
			}

			return 0;
		}
int ct=0;
		
		ct+=subset2(arr,sum-arr[i],ans+arr[i]+" ",i+1);
		ct+=subset2(arr,sum,ans,i + 1);
	
	return ct;
	
	}
}
