package Assignment_hackerblocks;

import java.util.Scanner;

import Adapters.stackusingpop;

public class stack_isbalanced {
static int count=-1;
static int flag=0;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		stack_isbalanced mainobj = new stack_isbalanced();
		StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
		if (isBalanced(str, stack)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
System.out.println(depth(str, stack));
	}

	public static boolean isBalanced(String str, StacksUsingArrays stack) throws Exception {
		if (str.length() == 0) {
       if(stack.isEmpty())
       {
    	   return true;
       }
       else
    	   return false;
		}
		char ch = str.charAt(0);
		String roq = str.substring(1);
		if (ch == '(' || ch == '{' || ch == '[') {
			stack.push(ch);
		} else {
			if (ch == ')') {
				char ch2 = (char) stack.top();
				if (ch2 == '(') {
					//count=count+1;
					stack.pop();
				} else {
					return false;
				}
			}
			if (ch == ']') {
				char ch2 = (char) stack.top();
				if (ch2 == '[') {
					stack.pop();
				} else
					return false;

			}
			if (ch == '}') {

				char ch2 = (char) stack.top();
				if (ch2 == '{') {
					stack.pop();
				} else
					return false;

			}

		}
		return isBalanced(roq, stack);

	}
	public static int depth(String str,StacksUsingArrays stack) throws Exception
	{
		if(str.length()==0)
		{
			if(stack.isEmpty())
			{
				
				return 1;
			}
			
		}
		if(isBalanced(str, stack)==false&&flag==0)
		{
			return count;
		}
		int max=0;
		flag=flag+1;
		char ch=str.charAt(0);
		String roq=str.substring(1);
		if (ch == '(' || ch == '{' || ch == '[') {
			stack.push(ch);
		}
		if (ch == ')') {
			char ch2 = (char) stack.top();
			if (ch2 == '(') {
				count=count+1;
				stack.pop();
			} 
		}
		max=depth(roq, stack);
		return Math.max(count, max);
		
		
		
	}

	private class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {
			// TODO Auto-generated constructor stub
			this(DEFAULT_CAPACITY);
		}

		public StacksUsingArrays(int capacity) throws Exception {
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
