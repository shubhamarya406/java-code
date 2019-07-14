package recursion_print_L10;

public class ssascii {

	public static void main(String[] args) {
		printssAscii("abc","");
	}
public static void printssAscii(String que,String ans)
{if(que.length()==0)
{
	System.out.println(ans);
	return;
	
}
	char ch=que.charAt(0);
	String roq=que.substring(1);
	printssAscii(roq,ans);
	printssAscii(roq,ans+ch);
	printssAscii(roq,ans+ch+(int)ch);
	
}
}
