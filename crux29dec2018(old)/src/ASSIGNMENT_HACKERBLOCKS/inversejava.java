package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class inversejava {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		long n=scn.nextLong();
		//int ct=0;
		//int temp=n;
        long ans=0;
        
		
 
        int i=1;
		while(n!=0)
		{    int c=0;
			 int rem=(int)(n%10);
		 
			 ans= (long)(Math.pow(10,rem)*i+ans);
			 n=n/10;
			i++;
		}
		System.out.println(ans/10);
	}

}
