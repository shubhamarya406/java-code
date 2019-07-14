package crux29dec2018;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		System.out.println("enter the no");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();	
  int div;
  int rem=0;
  int ans=0;
  while(n!=0)
  {
	  rem=n%10;
	  ans=ans*10+rem;
	  n=n/10;
	  
  }
  System.out.println(ans);
	}

}
