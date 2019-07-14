package L2dec;

import java.util.Scanner;

public class binarytodecimal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int a=scn.nextInt();
		int ans=0;
		int multip=1;
		int rem=0;
		int sb=n;
		int db=m;
		int temp=0;
		temp=a;
		while(temp!=0)
		{
			rem=temp%sb;
			db=rem*multip+db;
			multip=multip*sb;
			temp=temp/db;
			
			
		}
//		rem=0;
//		multip=1;
//		while(db!=0)
//		{
//			rem=db%2;
//			ans=rem*multip+ans;
//			multip=multip*10;
//			db=db/2;
//		}		System.out.println(db);
		System.out.println(db);
	}

}
