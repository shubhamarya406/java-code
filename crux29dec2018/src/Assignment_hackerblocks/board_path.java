package Assignment_hackerblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class board_path {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int curr=scn.nextInt();
		int end=scn.nextInt();
	System.out.println(board(curr,end));

	}
public static ArrayList<String>board(int curr,int end)
{
	if(curr==end)
	{
		ArrayList<String>br=new ArrayList<>();
	   br.add("");
	   return br;
	}
	if(curr>end)
	{
		ArrayList<String>br=new ArrayList<>();
		   
		   return br;
		
	}
	ArrayList<String> mr=new ArrayList<>();
	for(int i=1;i<6;i++)
	{
		//System.out.println(curr);
	ArrayList<String> rr=board( curr+i,end);
	for(String val:rr)
	{
		//System.out.println(val);
		mr.add(val+i);
		
	}
	
	
}
	return mr;
}
}
