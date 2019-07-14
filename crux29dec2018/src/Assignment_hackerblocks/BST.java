package Assignment_hackerblocks;

import java.util.Arrays;
import java.util.Scanner;

import practice_oops.BST.Node;

public class BST {
	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;
	private int size;

	public BST() {
		this.root = null;
		this.size = 0;
	}
	
	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void add(int data) {
		this.add(data, this.root);
	}

	private void add(int data, Node node) {
		if (this.isEmpty()) {
			Node n = new Node(data, null, null);
			this.size++;
			this.root = n;
			return;
		} else {
			if (data > node.data && node.right == null) {
				Node n = new Node(data, null, null);
				this.size++;
				node.right = n;
			} else if (data < node.data && node.left == null) {
				Node n = new Node(data, null, null);
				this.size++;
				node.left = n;
			} else if (data > node.data) {
				add(data, node.right);
			} else if (data < node.data) {
				add(data, node.left);
			}
		}
	}

       public void remove(int data) {
		this.root = this.remove(this.root, data);
	}

	private Node remove(Node node, int data) {
		if (node == null) {
			return null;
		}
		if (data < node.data) {
			node.left = this.remove(node.left, data);
			return node;
		} else if (data > node.data) {
			node.right = this.remove(node.right, data);
			return node;
		} else {
			if (node.left == null && node.right == null) {
				this.size--;
				return null;
			} else if (node.left == null) {
				this.size--;
				return node.right;
			} else if (node.right == null) {
				this.size--;
				return node.left;
			} else {
				int lmax = node.left.data;
				node.data = lmax;
				node.left = this.remove(node.left, lmax);
				return node;
			}
		}
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + " => ");
		} else {
			System.out.print("END => ");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.print(" <= " + node.right.data);
		} else {
			System.out.print(" <= END");
		}
		System.out.println();
		if (node.left != null) {
			display(node.left);
		}
		if (node.right != null) {
			display(node.right);
		}
	}
	public int  maxvalue(int  item,int[]In)
	{Arrays.sort(In);
		int sum=0;
		int i=In.length-1;
		while(In[i]>item)
		{
			sum=sum+In[i];
			i--;
		}
		return sum;
	}
	public void replacesum(int []In)
	{
		replacesum(this.root,In);
	}
	private void  replacesum(Node node,int In[]) {
	if(node==null)
	{
		return ;
	}
		int sum=maxvalue(node.data,In);
		if(sum>node.data)
		{
			node.data=sum;
		}
		else
		{
			node.data=0;
			
		}
		replacesum(node.left,In);
		replacesum(node.right,In);
		
	}
	  public static void main (String[] args) {
	        BST bst=new BST();
          Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++){
	           int item=s.nextInt();
	           bst.add(item);
	           arr[i]=item;
	        }
	        bst.replacesum(arr);
	        bst.display();
}
}