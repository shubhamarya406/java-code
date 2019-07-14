package Assignment_hackerblocks;

import java.util.Scanner;

public class prateek_sir_and_coding {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int q = scn.nextInt();
		
			prateek_sir_and_coding mainobj = new prateek_sir_and_coding();
			StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
			while (q > 0) {
				int flag=0;
			int a = scn.nextInt();
			if (a == 1 &&!stack.isEmpty() ) {
				flag=1;
				int ans = stack.pop();
				System.out.println(ans);
				

			}
			 if(flag==0&&a==1) {
	        	   System.out.println("No Code");
	           }
			if (a == 2) {
				int cost = scn.nextInt();
				stack.push(cost);

			}
          
			q--;
		}

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
