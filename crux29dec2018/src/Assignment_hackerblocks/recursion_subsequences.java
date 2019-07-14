package Assignment_hackerblocks;

import java.util.Scanner;

public class recursion_subsequences {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		int ans=ss(str,"");
       System.out.println("\n"+ans);
	}
   public static int ss(String str,String ans)
   { if(str.length()==0)
   {
	  System.out.print(ans+" ");
	   return 1;
   }
  
	   String ch=str.substring(0,1);
	   String res=str.substring(1);
	   int sum=0;
	  
	  
	   
	   sum+=ss(res,ans);
	   sum+=ss(res,ans+ch);
	   
	   return sum;
   }
}
