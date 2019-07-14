package Assignment_hackerblocks;

import java.util.Scanner;
import java.util.Stack;

public class strongest_fighter {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		Stack<Integer> stack = new Stack<>();
		int i=0;
		for(i=0;i<k;i++)
		{
			
			while(!stack.isEmpty()&&arr[i]>arr[stack.peek()])
			{
				
			stack.pop();
			}
			stack.push(i);
		
		}
		while(i<n)
		{  System.out.println(arr[stack.pop()]);
			while(!stack.isEmpty()&&stack.peek()<=i-k)
			{
				stack.pop();
			}
			while(!stack.isEmpty()&&arr[i]>arr[stack.peek()])
			{
				
			stack.pop();
			}
			stack.push(i);
			
			i++;
			System.out.println(stack.peek());
		}
		
		
	}

}
