package rec_backtracking;

public class toss_print {

	public static void main(String[] args) {
	tp(3,"",false,true);

	}
public static void tp(int n,String ans,boolean bnh,boolean bnt)
{if(n==0)
{
	System.out.println(ans);
	return;
}
if(bnt)
	tp(n-1,ans+"t",true,false);
if(bnh)
	tp(n-1,ans+"h",false,true);

	
else {	
	tp(n-1,ans+"h",true,false);
	tp(n-1,ans+"t",false,true);
}	
}
}
