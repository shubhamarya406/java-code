package Assignment_hackerblocks;

import java.util.Scanner;

public class fibonacccinth {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		int i = 1;
		 int row=2;
		System.out.print(a);
		System.out.println();
		while (i <n) {
			
			
			int j=1;
			while(j<=row)
			{
				a = b;
				b = c;
				c = a + b;
				System.out.print(c+"\t");
				j++;
			}
			row++;
			i++;
			System.out.println();

		}
	}
}
