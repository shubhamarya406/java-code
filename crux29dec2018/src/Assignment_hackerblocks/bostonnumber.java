package Assignment_hackerblocks;

import java.util.Scanner;

public class bostonnumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long n=scn.nextLong();
	int ct=0;
		int temp=0;
		long  num=n;
		int sum=0;
		int sump=0;
//		while(temp!=0)
//		{
//			ct++;
//			n=n/10;
//			
//		}
     while(num!=0)
     { 
    	 int rem=(int)(num%10);
    	  sum=sum+rem;
    	  num=num/10;
     }
    	  int i=2;
    	//int b=0;
    	  for(i=2;i<=n;i++)
    	  {
    		  while(n%i==0) {
    			   temp=i;
    			  // System.out.println(i);
    			  while(temp!=0)
//    			  {
//    				  ct++;
//    				  temp=temp/10;
//    			  }
//    			  
    			  
    			  {
    				   int remp=(int)(temp%10);
    				  sump=sump+remp;
    				  temp=temp/10;
    				  
    				  
    			  }
    			  
//    			  else
//    			  {
//    				  sump=sump+i;
//    			  }
//    			  
    			  
    			  
    			  n=n/i;
    		  }
    	  }
    	  if(sump==sum)
    	  {
    		  System.out.println("1");
    		//  System.out.println(sump);
    	  }
    	  else
    	  {
    		  System.out.println("0");
    		 // System.out.println(sump);
    	  }
    		 
           
     }
}
	


