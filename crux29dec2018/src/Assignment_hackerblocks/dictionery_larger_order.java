package Assignment_hackerblocks;

import java.util.Scanner;

public class dictionery_larger_order {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		large(str,"",false);
	}
public static void  large(String str,String ans,boolean large)
{if(str.length()==0)
{
	if(large)
	System.out.println(ans);
	return;
	
}
  
	
	
	for(int i=0;i<str.length();i++)
  {
	  char ch=str.charAt(i);
	  String res=str.substring(0,i)+str.substring(i+1);
	  if(large)
		  large(res,ans+ch,true);
	  else
	  {
		  if(ch>str.charAt(0))
		 large(res,ans+ch,true);
		 else if(ch==str.charAt(0))
			 large(res,ans+ch,false);
		 else
		 {
			 
		 }
		  
		  
	  }
	  
  }
	return ;
	
}
}
