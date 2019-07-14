package Assignment_hackerblocks;

import java.util.Scanner;

public class Rat_chase_its_cheese {
	static int ct = 0;

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int M=scn.nextInt();
		char board[][]=new char[N][M];
		int cheese[][]=new int[N][M];
		for(int i=0;i<board.length;i++)
		{   String str=scn.next();
			for(int j=0;j<str.length();j++)
				board[i][j]=str.charAt(j);
		}
		rat(board,1,1,N,M,cheese);
		if(ct==0)
		{
			System.out.println("NO PATH FOUND");
		}

	}

	public static void rat(char board[][], int cc, int cr, int er, int ec, int cheese[][]) {
		if (cc >=board[0].length|| cr >=board.length|| cc<0 || cr<0 ||board[cr][cc]=='X'||cheese[cr][cc]==1) {
			return;
		}
		if (cc == ec && cr == er) {
			display(cheese);
			ct++;
			return;
		}

		
		cheese[cr][cc] = 1;
		rat(board, cc, cr + 1, er, ec, cheese);
		rat(board, cc + 1, cr, er, ec, cheese);
		rat(board, cc - 1, cr, er, ec, cheese);
		rat(board, cc, cr - 1, er, ec, cheese);
		cheese[cr][cc] = 0;

	}

	public static void display(int[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++)
				System.out.print(board[i][j] + " ");
			System.out.println();
		}
	}
}
