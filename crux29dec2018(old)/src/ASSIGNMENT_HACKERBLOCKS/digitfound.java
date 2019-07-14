package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class digitfound {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int d=scn.nextInt();
		int count =0;
		int rem=0;
		while(n!=0)
		{	rem=n%10;
			if(rem==d)
				count++;
			n=n/10;
		}
		System.out.println(count);

	}

}
