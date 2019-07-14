package practice_oops;

public class stack {

	protected int data[];
	protected int tos;
	public stack()
	{
		this.data=new int[5];
		this.tos=-1; 	
	}
	
	private stack(int n)
	{
		this.data=new int[n];
		this.tos=-1;
	}
	public  void push(int item)throws Exception
	{ if(isfull())
	{
		throw new Exception("stack is full");
	}
		this.tos++;
		this.data[this.tos]=item;
		
	}
	public int  pop() throws Exception
	{ if(isempty())
	{
		throw new Exception("stack is empty");
	}
		int val=this.data[this.tos];
		this.data[this.tos]=0;
		this.tos--;
		return val;
		
	}
	public int peek() throws Exception
	{
		if(isempty())
		{
			throw new Exception("stack is empty");
		}
		int val=this.data[this.tos];
		
		
		return val;
		
	}
	public boolean isempty()
	{
		if(this.tos==-1)
			return true;
		return false;
		
	}
	public boolean isfull()
	{
		if(this.size()==this.data.length)
			return true;
		else
			return false;
		
	}
	public int size()
	{
		return this.tos+1;
	}
	public void display()
	{
		
		for(int i=0;i<this.data.length;i++)
			System.out.print(this.data[i]+" ");
		  System.out.println();
	}
}
