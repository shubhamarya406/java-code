package Assignment_hackerblocks;

public class binary_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public static void binary(String str,int ct,String ans)
{
	
	;
	for(int i=0;i<str.length();i++)
	{  char ch=str.charAt(0);
	if(ch=='?')
		 ans=str.substring(0,i)+1+str.substring(i+1, str.length());
		binary(str,ct,ans);
		
	}
	
	
	
	
}
}
