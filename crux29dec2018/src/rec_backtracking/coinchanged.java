package rec_backtracking;

public class coinchanged {

	public static void main(String[] args) {
		int []denom= {2,3,5,6};
		
coin(denom, 10,0,"",0);
	}
public static void coin(int []denom,int tot,int ca,String ans,int lastcol)
{
	if(ca==tot)
	{
		System.out.println(ans);
		return;
	}
	if(ca>tot)
	{
		return;
	}
	
	for(int i=lastcol;i<denom.length;i++)
	{
		
		coin(denom, tot, ca+denom[i], ans+" "+denom[i],lastcol+i);
	}
	
}
}
