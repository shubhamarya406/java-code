package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class largestsubarraywith0and1 {

	public static void main(String[] args) {
 Scanner scn=new Scanner(System.in);
 int t=scn.nextInt();
 int ct0=0;
 int ct1=0;
 while(t>0)

 {
	 int n=scn.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=scn.nextInt();
	}
	 int si=0;
	 int ei=0;
	 int max=0;
	 int tot=0;
	 int j=0;
	 for(int i=0;i<arr.length;i++)
	 {  
		 
		 for( j=0;j<arr.length;j++)
		 {
			 ct1=0;
			   ct0=0;
			 for(int k=i;k<=j;k++)
			 {

				 
				 if(arr[k]==0)
					 ct0++;
				 else
					 ct1++;
				 
			 }
		
			 if(ct1==ct0)
			 {int  length=j-i+1;
				 if(max<length)
				 {
				 si=i;
				 ei=j;
				
				max=length;
				 }	 
				
		}
		
		}
		 
	 }
	 
	 
	 if(si==0&&ei==0)
	 {
		 
		 System.out.println("None");
		 
	 }
	 else
		 System.out.println(si+" "+ei);
	 
	 t--;
	 
	 
 }
	
	
	
	}
}
		

		
		    
		     