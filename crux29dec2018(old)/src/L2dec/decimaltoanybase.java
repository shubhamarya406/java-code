package L2dec;

import java.util.Scanner;

public class decimaltoanybase {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int db=scn.nextInt();
		int ans=0,rem=0,multip=1;
		while(n!=0)
		{
			rem=n%db;
			ans=rem*multip+ans;
			multip=multip*10;
			n=n/db;
		}
		System.out.println(ans);

	}

}
