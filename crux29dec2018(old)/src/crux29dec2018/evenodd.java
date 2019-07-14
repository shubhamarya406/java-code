package crux29dec2018;

import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
	//	System.out.println("enter the input");
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the input");
		int n = scn.nextInt();
//LOGIC
		if (n % 2 == 0) {
			System.out.println("no is even");
		} else {
			System.out.println("no is odd");
			
		}

	}
}
