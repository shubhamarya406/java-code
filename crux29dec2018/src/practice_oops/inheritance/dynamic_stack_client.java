package practice_oops.inheritance;

public class dynamic_stack_client {

	public static void main(String[] args) throws Exception {
		dynamic_stack ds=new dynamic_stack();
		dynamic_stack helper=new dynamic_stack();
		ds.push(600);
		ds.push(700);
		ds.push(800);
		ds.push(900);
		ds.push(1000);
		ds.push(1100);
		ds.push(1200);
		ds.display();
		
		//reverse(ds);
		actualreverse(ds, helper);
		ds.display();
		
	}
	
public static void reverse (dynamic_stack ds) throws Exception
{  if(ds.size()==0)
{
	return;
}
	
	int ans=ds.peek();
	System.out.print(ans+" ");
	reverse(ds);

}
public static void  actualreverse(dynamic_stack ds,dynamic_stack helper) throws Exception
{
	if(ds.isempty())
	{
		if(helper.isempty())
		{
			return;
		}
		int ansh=helper.peek();
		actualreverse(ds, helper);
		ds.push(ansh);
		return;		
	}
	
	int ans=ds.peek();
	helper.push(ans);
	actualreverse(ds, helper);
	
	
}
}
