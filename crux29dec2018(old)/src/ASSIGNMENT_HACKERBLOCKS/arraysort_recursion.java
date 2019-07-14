package ASSIGNMENT_HACKERBLOCKS;

import java.util.ArrayList;
import java.util.Scanner;

public class arraysort_recursion {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str="abcd";
int i=0;
System.out.println(ascii(str));
}
public static ArrayList<String> ascii(String str)
{
 	if(str.length()==0)
	{
		ArrayList<String> br=new ArrayList<>();
		br.add("");
		return br;
	}
	
	char ch=str.charAt(0);
	//
	//System.out.println(ch);
	String re=str.substring(1);
	//System.out.println(re);
	ArrayList<String>mr=new ArrayList<>();
	ArrayList<String>rr=ascii(re);
	
	for(  String val:rr)
	{
		
		mr.add(val);
		//System.out.println(mr);
		
		mr.add(ch+val);
		//System.out.println(mr);
		mr.add((int)ch+val);
		//System.out.println(mr);
	}
	
	return mr;
}

}