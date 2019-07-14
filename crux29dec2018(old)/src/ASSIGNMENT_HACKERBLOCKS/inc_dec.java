package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class inc_dec {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int n=scn.nextInt();
		int crn=scn.nextInt();
		boolean bn=true;
		while(n>1)
		{
			int nn=scn.nextInt();
			 bn=(ispossible(crn,nn));
			if(bn)
			{
			crn=nn;
			n--;
			}
			else
				break;
		}
		if(bn)
			System.out.println(true);
		else
			System.out.println(false);
		
	}
public static boolean ispossible(int nn,int crn)
{
	boolean bn=true;
	if(crn>nn&&crn!=nn)
		bn= true;
	else if(crn<nn||crn==nn)
		return false;
	
	return true;
}
	
}
