package Assignment_hackerblocks;

import java.util.Scanner;



public class stock_span_client  {

	public static void main(String[] args) throws Exception {
		//stack st = new stack();
		stock_span_client   obj = new stock_span_client();
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		StacksUsingArrays helper = obj.new StacksUsingArrays();
		for (int i = 0; i < n; i++) {

			
			arr[i] = scn.nextInt();
			
		}
		int ans[]=span(arr,helper);
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
		System.out.print("END");
	}
	
	public static int[]span(int []arr,StacksUsingArrays helper) throws Exception{
		
		int ans[] = new int[arr.length];
		
	//	int ct = 0;
		//helper.push(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			while (!helper.isEmpty() && arr[helper.top()]<arr[i]) {
			 helper.pop();
			}
			if(helper.isEmpty())
			{
				ans[i]=i+1;
			}
			else
			{
				ans[i]=i-helper.top();
			}
			helper.push(i);
		}
		
		return ans;
	}
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
	protected class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {
			// TODO Auto-generated constructor stub
			this(DEFAULT_CAPACITY);
		}

		protected StacksUsingArrays(int capacity) throws Exception {
			if (capacity <= 0) {
				System.out.println("Invalid Capacity");
			}
			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}

		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}

		public void display() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}

		}

	}

}
