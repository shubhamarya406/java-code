package crux29dec2018;

import java.util.Scanner;

public class fibon {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	
	        int a=0;
	        int b=1;
	        int c=0;
	        int i=1;           
	        while(i<=n)
	        {
	           c=a+b;
	           b=a;
	           a=c;	         
	           i++;
	           
	        }
	        System.out.print(c);
	    }
}