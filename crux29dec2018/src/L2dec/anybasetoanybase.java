package L2dec;

import java.util.Scanner;

public class anybasetoanybase {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int sb=scn.nextInt();
		int db=scn.nextInt();
		int n=scn.nextInt();
		int ans=0,rem=0,multip=1,rem1=0,multip1=1,ans1=0;
		//int n1=sb;
		//int n2=db;
		while(n!=0)
		{
			rem=n%10;
			ans=rem*multip+ans;
			multip=multip*sb;
			n=n/10;
		}
		
			
			
			
			
			while(ans!=0)
			{
				rem1=ans%db;
				ans1=rem1*multip1+ans1;
				multip1=multip1*10;
				ans=ans/db;
			}
			System.out.println(ans1);

		}

	}


	