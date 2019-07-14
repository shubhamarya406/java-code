package crux29dec2018;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 2;
		int flag=0;
		while (i <= n / 2) {
			if (n % i == 0) {
				flag=1;
				//System.out.println("the no is prime");
				break;

			}
			i++;

		}
		if(flag==0)
			System.out.println("prime");

	}

}
