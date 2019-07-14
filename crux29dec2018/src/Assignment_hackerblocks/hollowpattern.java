package Assignment_hackerblocks;

import java.util.Scanner;

public class hollowpattern {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
       int row=1;
       int nst=n;
       int nsp=row-1;
       while(row<=n)
       {
    	   int cst=1;
    	   while(cst<nst)
    	   {
    		   System.out.print("*");
    	        System.out.print(" ");
    	        cst++;
    	   }
    	   int csp=1;
    	   while(csp<=nsp)
    	   {
    		   System.out.print(" ");
    		   csp++;
    	   }
    	   System.out.println();
    	  if(row<=n/2)
    	  {
    		  nst=nst-2;
    		  nsp=nsp+1;
    	  }
    	  else {
    		  nst=nst+2;
    		  nsp=nsp+1;
    		  
    	  }
    	  row++;
       }
	}

}
