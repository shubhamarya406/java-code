package Assignment_hackerblocks;

public class min_money {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	
	System.out.println(money(5,5,arr,1));
}
	public static int  money(int n,int w,int arr[],int i)
	{
		if(i==arr.length)
		{
			return arr[i-1];
		}
		
		int fp=money(n,w,arr,i+1);
		int sp=0;
		if(w>0)
		sp=money(n,w-i,arr,i+1)+arr[i];
		
		int ans=Math.min(fp, sp);
		return ans;
		
	}
	
	
	
}
