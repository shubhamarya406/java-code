package Assignment_hackerblocks;

import java.util.Scanner;

public class Lexicographical_print {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	int end=scn.nextInt();
       lexico(0,end);
	}
public static void lexico(int curr,int end)
{ if(curr>end)
{
	return;
}
	System.out.print(curr+" ");

	
	int i=0;
	if(curr==0)
		i=1;
		while(i<=9)
		{
		lexico(10*curr+i,end);
		i++;
		}
	
	
}
}
