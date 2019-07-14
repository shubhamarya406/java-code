package L8;

import java.util.ArrayList;

public class recursion_get {

	public static void main(String[] args) {
		String str="abc";
		
		System.out.println(permutation(str));
	}
public  static ArrayList<String>permutation(String str)
{
	
	if(str.length()==0)
	{
		ArrayList<String> br=new ArrayList<>();
		br.add("");
		return br;
		
	}
	
	char ch=str.charAt(0);
	System.out.println(ch);
	String res= str.substring(1);
	System.out.println(res);
	
	ArrayList<String> rr=permutation(res);
	ArrayList<String> mr=new ArrayList<>();
	for(String val:rr)
	{System.out.println(val);
		for(int i=0;i<=val.length();i++)
		{
		mr.add(val);
		mr.add(rr+val);
		mr.add(str.charAt(i)+val);
		System.out.println(mr);
	}
	}
	return mr;
}
}
