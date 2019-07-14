package Assignment_hackerblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class maize_path {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int er=scn.nextInt();
		//int ec=scn.nextInt();
		//System.out.println(maze(er,ec,1,1));
		int ans=(mazesd2(er,er,1,1,""));
		//System.out.println("\n"+ans);
		System.out.println("\n"+ans);

	}
public static ArrayList<String> maze(int er,int ec,int cr,int cc )
{  if(cr==er&&cc==ec)
{
	ArrayList<String> br=new ArrayList<>();
	br.add("");
	return br;
}
	if(cc>ec||cr>er)
	{
		ArrayList<String> br=new ArrayList<>();
		
		return br;
	}
	ArrayList<String> mr=new ArrayList<>();
	ArrayList<String> rr=maze(er,ec,cr,cc+1);
	for(String val:rr)
	{
		mr.add(val+"H");
		
	}
	
	
	rr=maze(er,ec,cr+1,cc);
	for(String val:rr)
	{
		mr.add(val+"V");
		
	}
	return mr;
}
public static int mazes(int er,int ec,int cr,int cc ,String ans)
{  if(cr==er&&cc==ec)
{
	
	System.out.print(ans+" ");
return 1;
}
	if(cc>ec||cr>er)
	{
		
		
		return 0;
	}
	int sum=0;
	sum+=mazes(er,ec,cr+1,cc,ans+"V");
	sum+=mazes(er,ec,cr,cc+1,ans+"H");
	
	

	return sum;
}
public static int mazesd(int er,int ec,int cr,int cc ,String ans)
{  if(cr==er&&cc==ec)
{
	
	System.out.print(ans+" ");
return 1;
}
	if(cc>ec||cr>er)
	{
		
		
		return 0;
	}
	int sum=0;
	sum+=mazesd(er,ec,cr+1,cc,ans+"V");
	sum+=mazesd(er,ec,cr,cc+1,ans+"H");
	sum+=mazesd(er,ec,cr+1,cc+1,ans+"D");
	

	return sum;
}
public static int mazesd2(int er,int ec,int cr,int cc ,String ans)
{  if(cr==er&&cc==ec)
{
	
	System.out.print(ans+" ");
return 1;
}
	if(cc>ec||cr>er)
	{
		
		
		return 0;
	}
	int sum=0;
	sum+=mazesd2(er,ec,cr+1,cc,ans+"V");
	sum+=mazesd2(er,ec,cr,cc+1,ans+"H");
	if(cr==cc)
	sum+=mazesd2(er,ec,cr+1,cc+1,ans+"D");
	

	return sum;
}
}
