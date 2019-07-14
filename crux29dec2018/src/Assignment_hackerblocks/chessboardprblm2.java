package Assignment_hackerblocks;

import java.util.Arrays;
import java.util.Scanner;

import L_11.SOE_primes;

public class chessboardprblm2 {
	static int checkp = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int minesport[]=minesports(primes(n*n));
		int ans=countboard(0, 0, n-1, n-1, "",minesport);
		System.out.println("\n"+ans);

	}

	public static int  countboard(int cr, int cc, int er, int ec, String ans,int[]minesport) {

		if (cc == ec && cr == er) {
			System.out.print(ans);
			System.out.print("{" + cr + "-" + cc + "}"+" ");
			return 1;
		}
		if (cc > ec || cr > er) {
			return 0;
		}

		int check = cr * (ec + 1) + cc + 1;
		if (minesport[check] ==1) {

			return 0;
		}
 int count=0;
		if (minesport[check] ==2) {

			count+=countboard(er, ec, er, ec, ans + "{" + cr + "-" + cc + "}" + "p",minesport);
			

		}

		count+=countboard(cr + 2, cc + 1, er, ec, ans + "{" + (cr) + "-" + (cc) + "}" + "k",minesport);
		count+=countboard(cr + 1, cc + 2, er, ec, ans + "{" + (cr) + "-" + (cc) + "}" + "k",minesport);
		if (cc == 0 || cc == ec || cr == 0 || cr == er) {
			
			for (int i = 1; i + cc <= ec; i++) {
			count+=	countboard(cr, cc+i, er, ec, ans + "{" + (cr) + "-" + (cc) + "}" + "R",minesport);
			}
			for (int i = 1; i + cr <= er; i++) {
				count+=countboard(cr+i, cc, er, ec, ans + "{" + (cr) + "-" + (cc) + "}" + "R",minesport);

			}
		}
		if (cc == cr || cc + cr == er) {
			for (int i = 1; i + cr <= er && i + cc <= ec; i++)
				count+=countboard(cr + i, cc + i, er, ec, ans + "{" + (cr) + "-" + (cc) + "}" + "B",minesport);
		}
return count;
	}

	

	public static boolean[] primes(int n) {
		boolean arr[] = new boolean[n + 1];
		Arrays.fill(arr, true);
		arr[0] = false;
		arr[1] = false;

		for (int table = 2; table * table <= n; table++) {
			if (arr[table] == false) {
				continue;
			}
			for (int multip = 2; multip * table <= n; multip++)
				arr[multip * table] = false;
		}
		return arr;
	}

	public static int[] minesports(boolean[]primes)
	{
		int ct=1;
		int minesport[]=new int[primes.length];
		for(int i=0;i<primes.length;i++)
			
		{
			if(primes[i])
			{
				if(ct%2==1)
				{
					minesport[i]=1;
				}
				else
				{
					minesport[i]=2;
				}
				ct++;
			}
			
		}
		return minesport;
	}
}
