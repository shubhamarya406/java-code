package crux29dec2018;

import java.util.Scanner;

public class loopdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
 Scanner scn=new Scanner(System.in);
 int sum=0;
 int n=scn.nextInt();
 int ct=1;//initialization
 while (ct<=n) {
	 sum=sum+ct;
	 ct++;
 }
 System.out.println("the output is"+sum);
 
 
	}

}
