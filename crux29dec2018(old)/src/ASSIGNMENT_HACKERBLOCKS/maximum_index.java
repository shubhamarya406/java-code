package ASSIGNMENT_HACKERBLOCKS;

import java.util.Arrays;
import java.util.Scanner;

public class maximum_index {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0)
		{ 
			int n=scn.nextInt();
		int posj=0;
		int posi=0;
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++)
				arr[i]=scn.nextInt();
			Arrays.sort(arr);
			int max=arr.length/2;
				 
			
			for(int i=0;i<arr.length;i++)
			{
				
				
					int pos=arr.length-1;
					if(arr[i]<arr[pos])
					{
					int length=pos-i;
					
						if(max<length)
						{
							max=length;
							
						}
						
					}	
				
			}
				
			
			
			System.out.println(max);
			
			
			t--;
			
		}

	}

}
