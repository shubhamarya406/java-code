package Assignment_hackerblocks;

import java.util.ArrayList;

import java.util.Scanner;
import java.util.Stack;

public class playingwithcards {
	// static int count;

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int q = scn.nextInt();
		ArrayList<Stack<Integer>> stack = new ArrayList();
		for (int i = 0; i <= q; i++) {
			stack.add(new Stack<>());
		}
		ArrayList<Stack<Integer>> bstack = new ArrayList();
		for (int i = 0; i <= q; i++) {
			bstack.add(new Stack<>());
		}
		for (int i = 0; i < n; i++) {
			stack.get(0).push(scn.nextInt());
		}

		for (int i = 1; i <= q; i++) {
			int nvalue;
			while (!stack.get(i - 1).isEmpty()) {

				nvalue = stack.get(i - 1).pop();

				if (nvalue % isdivide(i) == 0)

				{
					bstack.get(i).push(nvalue);

				} else {
					stack.get(i).push(nvalue);
				}
			}

		}
		for (int i = 1; i <= q; i++) {
			while (!bstack.get(i).isEmpty()) {
				System.out.println(bstack.get(i).pop());

			}
		}
		while (!stack.get(q).isEmpty()) {
			System.out.println(stack.get(q).pop());
		}

	}

	public static int isdivide(int i) {
		int n = 2;
		int count = 0;
		while (true) {
			if (primes(n)) {

				count++;

			}
			if (count == i) {
				return n;
			}

			n++;

		}

	}

	private static boolean primes(int n) {

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

}
