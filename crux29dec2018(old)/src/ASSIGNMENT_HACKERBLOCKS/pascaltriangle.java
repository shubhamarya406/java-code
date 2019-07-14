package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class pascaltriangle {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		int n=scn.nextInt();
	//	int nst=0;
		int row=1;
		int val=1;
	//	int sum=0;
		for(int i=0;i<n;i++)
		{
			val=1;
			
			for(int j=0;j<=i;j++)
			{
//			{if(j==0||j==row)
//			{
//				System.out.println(1+"\t");
//			}
					
		//	else 
				{	
						
					System.out.print(val+"\t");	
					val=val*(i-j)/(j+1);

			}
				
				
			}
			
			
			System.out.println();
			
			//row++;
			
			 //nst++;
		}
	}
}