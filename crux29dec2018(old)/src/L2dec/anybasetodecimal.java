package L2dec;

import java.util.Scanner;

public class anybasetodecimal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int sb=scn.nextInt();
		int ans=0,rem=0,multip=1;
		while(n!=0)
		{
			rem=n%10;
			ans=rem*multip+ans;
			multip=multip*sb;
			n=n/10;
		}
		System.out.println(ans);
		
		

	}

}
