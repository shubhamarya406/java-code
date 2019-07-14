package Adapters;

import practice_oops.inheritance.dynamicqueue;

public class stackusingpop {

	dynamicqueue primary = new dynamicqueue();
	dynamicqueue helper = new dynamicqueue();
	public void push(int item) throws Exception {
		try {
			helper.enqueue(item);
			while(primary.size()!=0)
			{
				helper.enqueue(primary.dequeue());
				
			}
			primary=helper;
		} catch (Exception e) {
			throw new Exception("Stack is full");
		}
	}

	public int pop() throws Exception {
		try
		{
			int ans=primary.dequeue();
			return ans;
			
		} catch (Exception e) {

			throw new Exception("stack is empty");
		}
	}

	public void display() {
		helper.display();
	}

}
