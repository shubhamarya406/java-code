package Assignment_hackerblocks;

import java.util.Scanner;

public class oddevensum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		int esum=0;
		int osum=0;
		int i=0;
		int rem=0;
		while(n!=0)
		{
			if(i%2!=0)
			{    rem=n%10;
				osum=osum+rem;
			}
			else
			{   rem=n%10;
				esum=esum+rem;
			}
			n=n/10;
			i++;
		}
          System.out.println(esum);
          System.out.println(osum);
	}

}
