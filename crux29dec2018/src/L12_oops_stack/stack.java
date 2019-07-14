package L12_oops_stack;

public class stack {
protected int data[];
protected int tos;

public  stack()
{
this.data= new int[5];
this.tos=-1;
	
}
public  stack(int n)
{
this.data= new int[n];
this.tos=-1;
	
}
public int pop() throws Exception {
	if(isempty())
		 throw new Exception("stack is full");
	int val=this.data[this.tos];
	this.data[this.tos]=0;
	this.tos--;
	return val;
	
}
public void push(int item) throws Exception
{if(isfull())
{
	 throw new Exception("stack is full");
}
this.tos++;
	this.data[this.tos]=item;
	//int val=this.data[this.tos];
	
}
public int peek()
{
	int val=this.data[this.tos];
	return val;
}
public boolean isempty()
{
	
	if(tos==-1)
		return true;
	else
		return false;
	
}
public boolean isfull()
{
	if(tos==this.data.length)
		return true;
	else
	return false;
	
}
public void  display()
{
	for(int i=0;i<=this.tos;i++)
		System.out.print(this.data[i]+" ");
	System.out.println();
	
}
public int  size()
{
	
	
return this.tos+1;
}
}