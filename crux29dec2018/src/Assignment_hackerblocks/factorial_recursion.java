package Assignment_hackerblocks;

import java.util.Scanner;

public class factorial_recursion {

	public static void main(String[] args) {
		Scanner  scn=new Scanner (System.in);
		int n=scn.nextInt();
		
		System.out.println(facto(n));
		
	}
 public static int facto(int n)
 {
	 if(n==1||n==0)
		 return n;
	 
	 int fnm2=facto(n-2);
	
	 int fnm1= facto(n-1);
	 int fn=fnm1+fnm2;
	 return fn;
	 
 }
}
