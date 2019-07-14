package recursion_print_L10;

public class print_board_path {

	public static void main(String[] args) {
		boardpath(0,10,"");

	}
public static int boardpath(int curr,int end,String ans)
{
	if(curr==end)
	{
		
		System.out.println(ans);
		return 1;
		
	}
	int res=0;
	for(int i=1;i<=6 && curr+i<=end;)
	{
	//char ch=str.charAt(i);
	//String res=str.substring(i+1);
	res+=boardpath(curr+i,end,ans+i);
	// ans=ans+ch;
	i++;
	}
		
	return res;
}
}
