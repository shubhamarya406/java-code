package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class reversee {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	
		int div=0;
		int rem=0;
		while(n!=0) 
		{
			rem=n%10;
			div=div*10+rem;
			n=n/10;
		}
    System.out.println(div);
	}

}
