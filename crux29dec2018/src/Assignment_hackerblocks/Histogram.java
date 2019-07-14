package Assignment_hackerblocks;

import java.util.Scanner;
import java.util.Stack;

public class Histogram {
	static int max = 0;
	static int crmax = 0;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int  n = scn.nextInt();
		long arr[] = new long[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		Stack<Integer> stack = new Stack<>();

		int i = 0;
		long parea = 0;
		long maxarea = Integer.MIN_VALUE;

		while (i < arr.length) {
			if (stack.isEmpty() || arr[i] > arr[stack.peek()]) {
				stack.push(i);
				i++;
			} else {
				int top = stack.pop();
				if (stack.isEmpty()) {
					int r = i;
					parea = r * arr[top];

				}

				else {
					int l = stack.peek();
					int r = i;
					parea = (r - l - 1) * arr[top];

				}
				if (parea > maxarea) {
					maxarea = parea;

				}

			}
		}
		while (!stack.isEmpty()) {
			int top = stack.pop();
			if (stack.isEmpty()) {
				int r = i;
				parea = r * arr[top];

			}

			else {
				int l = stack.peek();
				int r = i;
				parea = (r - l - 1) * arr[top];

			}
			if (parea > maxarea) {
				maxarea = parea;

			}

		}

		System.out.println(maxarea);

	}

}
