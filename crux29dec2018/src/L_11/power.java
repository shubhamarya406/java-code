package L_11;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(power(5,5));
	}
public static int  power(int n,int x)
{if(n==0)
{
	return 1;
}
	int ans=0;
	int hp=power(x,x*n/2);
	if(n%2==0)
	{
		 ans=hp*hp;
	}
	else
	{
		  ans=hp*hp*x;
	}
	return ans;
}
}
