package ASSIGNMENT_HACKERBLOCKS;

import java.util.ArrayList;

public class subsequences {

	public static void main(String[] args) {
		String str="abc";
		System.out.println(getss(str));
 getssAscii(str);
	}
public static ArrayList<String> getss(String str)
{
	if(str.length()==0)
	{
		ArrayList<String>br=new ArrayList<>();
		br.add("");
		return br;
		
	}
	char c =str.charAt(0);
	String re=str.substring(1);
	ArrayList<String> rr=getss( re);
	ArrayList<String>mr=new ArrayList<>();
	
	for(int i=0;i<str.length();i++)
	{
		
		mr.add(rr.get(i));
		mr.add(c+rr.get(i));
	}
	return mr;
}
public static ArrayList<String>getssAscii(String str)
{
	char ch=str.charAt(0);
	String ros=str.sub
	
}
}
