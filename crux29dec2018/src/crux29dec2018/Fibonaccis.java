package crux29dec2018;

import java.util.Scanner;

public class Fibonaccis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	
		 
		int a = 0;
		int b = 1;
		int c=0;
		int i = 1;
		System.out.print(a );
		while (i <= n) {
			c = a + b;
			b = a;
			a = c;
			i++;
			System.out.print(c);
		}
	}

}
