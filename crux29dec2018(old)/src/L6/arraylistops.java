package L6;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistops {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t=scn.nextInt();
		while(t>0)
		{
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int one[] = new int[n1];
		int two[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			one[i] = scn.nextInt();
		}
		for (int i = 0; i < n2; i++) {
			two[i] = scn.nextInt();
		}

		 intersection(one, two);
	//	ArrayList<Integer> temp1=sum(one,two);
		//intln(temp);
		 
  t--;
	}
	}

	public static void intersection(int[] one, int[] two) {
		ArrayList<Integer> ans = new ArrayList<>();
		int sum1=0;
		int sum2=0;
		int finalans=0;
		int i=0,j=0;
		for ( i = 0, j = 0; i <=one.length-1 &&j <= two.length-1;) {
			if (one[i] < two[j]) {
          
				sum1=sum1+one[i];
			i++;
           
				
			} else if (one[i] > two[j]) {
				
		           sum2=sum2+two[j];
		           
				j++;
			} else {
				
				finalans+=Math.max(sum1,sum2);
				finalans+=one[i];
				 sum1=0;
		           sum2=0;				
		           i++;
		           j++;
			}
		}

			if (i==one.length)
{ 			
		   while(j<two.length)
		   {
			   sum2=sum2+two[j];
			   j++;
			   
			   
		   }
		   
			
		}
				if(j==two.length)
		{   
					 while(i<one.length)
					   {
						   sum1=sum1+one[i];
						   i++;
						   
						   
					   }
			
				}
		
	
		
	finalans+=Math.max(sum1,sum2);
		System.out.println(finalans);
	

	}
	}
