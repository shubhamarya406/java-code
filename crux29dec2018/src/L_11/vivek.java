package L_11;

import java.util.Scanner;

public class vivek {
//static int ans=0;
	public static void main(String[] args) {
		

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();

			}
			int ans=sort(arr,0,arr.length-1);
			System.out.println(ans);
			t--;

		}

	}

	public static int   sort(int[] arr, int si, int ei) {
    
    int ans=0;
//    int 
//    int 
  
		for (int i = si; i < ei; i++) {
			 int fh=0;
			    int sh=0;
			for(int k=si;k<=i;k++)
			{
				fh+=arr[k];
			}
			for(int k=i+1;k<=ei;k++)
			{
				sh+=arr[k];
			}
			

			if (fh == sh) {
				int  ct1=sort(arr, si, i);
			 int  ct2=sort(arr, i + 1, ei);
				ans=Math.max(ct1, ct2)+1;
				
			}
			
		}
		return ans;
	}

	
}
