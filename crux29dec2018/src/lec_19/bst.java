package lec_19;

import java.util.Arrays;
import java.util.Scanner;

public class bst {
	static int sum = 0;

	private class node {
		node left;
		int data;
		node right;

	}

	private node root;

	public void construct(int[] In) {
		this.root = construct(In, 0, In.length-1, 0);

	}
//private class pair()
//{
//	Node 
//}
//	private void pair()
//	{
//		node 
//	}
	private node construct(int[] in, int li, int hi, int flag) {
		if (li > hi) {
			return null;
		}

		int mid = (li + hi) / 2;
		node nn = new node();
		nn.data = in[mid];
//		node nn2 = new node();
//		nn2.data = in[mid];
//		if (flag == 0) {
//			nn2.left = construct(in, li, mid, 1);
//		}
			nn.left = construct(in, li, mid - 1, 0);
		
		// nn2.left=nn.left;

		// nn2.left=nn.right;
		// nn2.right = nn.right;
		
		nn.right = construct(in, mid + 1, hi, 0);
//		if(flag==0)
//		{
//			return nn2;
//		}
//		else
			return nn;
	}

	public void display() {
		display(this.root);
	}

	private void display(node Node) {

		if (Node.left != null) {
			System.out.print(Node.left.data + " => ");

		} else {
			System.out.print("END => ");
		}
		System.out.print(Node.data);
		if (Node.right != null) {
			System.out.print(" <= " + Node.right.data);
		} else {
			System.out.print(" <= END");
		}
		System.out.println();
		if (Node.left != null) {
			display(Node.left);
		}
		if (Node.right != null) {
			display(Node.right);
		}
	}

	public int size() {

		return size(this.root);

	}

	private int size(node Node) {
		if (Node == null) {
			return 0;
		}
		int size = 0;
		size += size(Node.left);
		size += size(Node.right);

		return size + 1;
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(node Node, int item) {
		if (Node == null) {
			return false;
		}
		if (item > Node.data) {
			return find(Node.right, item);

		} else if (item < Node.data) {
			return find(Node.left, item);
		} else
			return true;
	}

	public int max() {
		return max(this.root);
	}

	private int max(node Node) {
		if (Node.right == null) {
			return Node.data;
		}
		return max(Node.right);
	}

	public int ht() {
		return ht(this.root);
	}

	private int ht(node Node) {
		if (Node == null)
			return -1;
		int lh = ht(Node.left);
		int rh = ht(Node.right);
		return Math.max(lh, rh) + 1;

	}

	public int diameter() {

		return diameter(this.root);
	}

	private int diameter(node Node) {
		if (Node == null) {
			return 0;
		}

		int lht = diameter(Node.left);
		int rht = diameter(Node.right);
		int sp = ht(Node.left) + ht(Node.right) + 2;

		return Math.max(sp, Math.max(lht, rht));
	}

	public void printinrange(int lo, int hi) {
		printinrange(this.root, lo, hi);

	}

	private void printinrange(node Node, int lo, int hi) {

		if (Node == null) {
			return;
		}
		if (Node.data < lo) {

			printinrange(Node.right, lo, hi);

		}

		else if (Node.data > hi) {

			printinrange(Node.left, lo, hi);

		} else
			System.out.println(Node.data + " ");
		printinrange(Node.right, lo, hi);
		printinrange(Node.left, lo, hi);

	}

	public void dec() {
		dec(this.root);
	}

	private void dec(node Node) {
		if (Node == null) {
			return;
		}
		dec(Node.right);
		System.out.println(Node.data);
		dec(Node.left);

	}

	public void replacewith() {
		replacewith(this.root);

	}

	public void replacewith(node Node) {
		if (Node == null) {
			return;
		}
		replacewith(Node.right);
		int temp = Node.data;
		Node.data = sum;
		sum = sum + temp;
		replacewith(Node.left);

	}

	public void add(int item) {
		add(this.root, item);
	}

	private void add(node Node, int item) {
		if (Node == null) {
			return;
		}
		if (item <= Node.data) {
			if (Node.left == null) {
				node nn = new node();
				nn.data = item;
				Node.left = nn;
			} else {
				add(Node.left, item);
			}

		} else {
			if (Node.right == null) {
				node nn = new node();
				nn.data = item;
				Node.right = nn;
			} else {
				add(Node.right, item);
			}
		}

	}

	public void remove(int item) {
		remove(null, this.root, item);

	}

	private void remove(node parent, node Node, int item) {
		if (item < Node.data) {
			remove(Node, Node.left, item);

		} else if (item > Node.data) {

			remove(Node, Node.right, item);
		} else {
			if (Node.right == null && Node.left == null) {
				if (Node.data <= parent.data) {
					parent.left = null;

				} else
					parent.right = null;

			} else if (Node.right == null && Node.left != null) {
				if (Node.data <= parent.data) {
					parent.left = Node.left;

				} else
					parent.right = Node.left;

			} else if (Node.right != null && Node.left == null) {
				if (Node.data <= parent.data) {
					parent.left = Node.right;

				} else
					parent.right = Node.right;

			} else {
				int lmax = max(Node.left);
				remove(Node, Node.left, lmax);
				Node.data = lmax;

			}

		}

	}
	public void preorder()
	{
		preorder(this.root);
	}
	private void preorder(node Node) {
		   if (Node == null) { 
	            return; 
	        } 
	        System.out.print(Node.data + " "); 
	        preorder(Node.left); 
	        preorder(Node.right); 
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int n=scn.nextInt();
		
		int In[]=new int[n];
		for(int i=0;i<n;i++)
		{
			In[i]=scn.nextInt();
		}
	bst b=new bst();
		Arrays.sort(In);
		b.construct(In);
		
//		for(int i=0;i<In.length;i++)
//		{
//			System.out.println(In[i]);
//		}
//		b.printinrange(30, 60);
//		System.out.println("---");
//		b.dec();
		b.replacewith();
	b.display();
	//b.preorder();
//	
		
		

	}
}
