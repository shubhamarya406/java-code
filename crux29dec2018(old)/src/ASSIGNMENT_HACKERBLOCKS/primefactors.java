package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class primefactors {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
	
		 int i=2;
	    	//int b=0;
	    	  for(i=2;i<=n;i++)
	    	  {
	    		  while(n%i==0) {
	    			  System.out.println(i);
	    			  n=n/i;
	    		  }
	    	
	}

}
}	
