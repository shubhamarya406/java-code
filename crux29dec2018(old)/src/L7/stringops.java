package L7;

public class stringops {

	public static void main(java.lang.String[] args) {
		String str;
		str = "nitin";
		boolean bn = ispallindrome(str);
		substring(str);
//System.out.print(bn);
palindromesubstring(str);

	}

	public static boolean ispallindrome(String  str)
	{  boolean bn;
	bn=true;
	  int i=0;
	  int j=str.length()-1;
	 while(i<j)
	 {
		 if(str.charAt(i)!=str.charAt(j))
		 {
			 return false;
		 }
		 i++;
		 j--;
	 }
	 return bn;
		
		
	}
	public static void substring(String str)
	{
		for(int i=0;i<str.length()-1;i++) {
			
		//	for(int j=i+1;j<=str.length();j++)
			//	System.out.println(str.substring(i, j));
		}
		
		
	}
public static void palindromesubstring(String str)
{
	
	for(int i=0;i<str.length()-1;i++) {
		
		for(int j=i+1;j<=str.length();j++)
		{  String s=str.substring(i,j);
			if(ispallindrome(s))
			System.out.println(str.substring(i, j));
	}
	
	
}
}
public static void reverse(Stri)
}