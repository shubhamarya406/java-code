package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       int n=scn.nextInt();
       int row=1;
       int nst=1;
       
       while(row<=n)
       {int cst=1;
    	   while(cst<=nst)
    	   {
    		   if(row==nst&&cst==nst)
    		   {
    		   System.out.print(nst);
    		   
    		   }
    		   else
    			   System.out.print(0);
    		   cst++;
    	   }
    	   System.out.println();
    	      		   nst++;
    		   row++;
    		  
       }
	}
}
