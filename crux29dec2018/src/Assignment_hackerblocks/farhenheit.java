package Assignment_hackerblocks;

import java.util.Scanner;

public class farhenheit {

	public static void main(String[] args) {
		Scanner scn=new Scanner( System.in);
		int min=scn.nextInt();
		int max=scn.nextInt();
		
		int step=scn.nextInt();
		while(min<=max)
		{
			int c=(int)((5/9)*(min-32));
			
			System.out.println(min+"\t"+c);
			min=min+step;
			
		}

	}

}
