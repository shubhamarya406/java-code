package L12;

import L12_oops_stack.stack;

public class dynamic_stack extends stack {

	public void push(int item) throws Exception
	{
		if(isfull())
		{
			int[] na=new int[(this.data.length)*2];
			for(int i=0;i<this.data.length;i++)
			{
				na[i]=data[i];
				
			}
			na=this.data;
			
			
		}
		 super.push(item);
		
	}
		
				
	
	
}
