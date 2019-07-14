package practice_oops;

import java.awt.DisplayMode;
import java.util.Arrays;
import java.util.Scanner;

public class BST {
	public class Node {
		Node left;
		Node right;
		int data;
	}

	private Node root;

	public void construct(int in[]) {
		this.root = construct( in,0, in.length-1);
	}

	private Node construct( int in[], int lo,int hi) {
		if (lo >hi) {
			return null;
		}
		int mid = (lo + hi) / 2;
		Node nn = new Node();
		nn.data = in[mid];

		nn.left = construct( in, lo,mid-1);
		nn.right=construct( in, mid+1, hi);
	
		return nn;
	}

	public void display() {
		display(this.root);
	}

	private void display(Node Node) {
		if (Node == null) {
			return;
		}
		String str = "";
		if (Node.left != null) {
			str += Node.left.data;
		} else {
			str += "END";
		}
		str += "==>" + Node.data + "==>";
		if (Node.right != null) {
			str += Node.right.data;
		} else {
			str += "END";
		}
		System.out.println(str);
		display(Node.left);
		display(Node.right);
		return;
	}

	public int size() {
		return size(this.root);
	}

	private int size(Node root) {
		if(root==null)
		{
			return 0;
		}
		int size = 0;
		size += size(root.left);
		size += size(root.right);
		return size + 1;

	}
	public int max()
	{
		return max(this.root);
	}
	private int max(Node Node)
	{
		if(Node.right==null)
	{
		return Node.data;
	}
		int max;
		//int max=Node.data;
		max=max(Node.right);
		return max;
	}
	public boolean find(int item)
	{
		return find(this.root,item);
	}

	private boolean  find(Node Node, int item) {
		if(Node==null)
		{
			return false;
		}
		boolean bn=false;
		if(item==Node.data)
		{
			return true;
		}
		if(item>Node.data)
		{
			bn=find(Node.right,item);
		}
		if(item<Node.data)
		{
			bn=find(Node.left,item);
		}
		return bn;
	}
	public int  ht()
	{
		return ht(this.root);
	}

	private int ht(Node Node) {
		if(Node==null)
		{
			return -1;
		}
		int lht=ht(Node.left);
		int rht=ht(Node.right);
		int sp=Math.max(lht, rht)+1;
		return sp;
		//return 0;
	}
	public void printinrange(int lo,int hi)
	{
		printinrange(this.root,lo, hi);
	}

	private void printinrange(Node Node, int lo, int hi) {
		
		if(Node==null)
		{
			return;
		}
			if(Node.data<lo)
		{
			printinrange(Node.right, lo,hi);
		}
		if(Node.data>hi)
		{
			printinrange(Node.left,lo, hi);
		}
		else
		{
			String str="";
			if(Node.left!=null)
			str+=Node.left.data;
			else
				str+="END";
			
			str+="==>"+Node.data+"==>";
			if(Node.right!=null)
			str+=Node.right.data;
			else
				str+="END";
			System.out.println(str);
			printinrange(Node.left,lo, hi);
			printinrange(Node.right,lo, hi);
		}
	}
	public void dec()
	{
		dec(this.root);
	}

	private void dec(Node Node) {
		if(Node==null)
		{
			return;
		}
		dec(Node.right);
		System.out.println(Node.data);
	
		dec(Node.left);
	}
	public void add(int item)
	{
		add(this.root,item);
	}

	private void add(Node node, int item) {
		
		if(node==null)
		{
			return ;
		}
		if(item>node.data)
		{
			if(node.right==null)
			{
				Node nn=new Node();
				nn.data=item;
				node.right=nn;
			}
			else
			add(node.right,item);
		}
		else if(item<=node.data)
		{

			if(node.left==null)
			{
				Node nn=new Node();
				nn.data=item;
				node.left=nn;
			}
			else
				
			add(node.left, item);
		}
		
	}
	public void lca(int first,int second)
	{
		
		Node ans=lca(this.root,first,second);
		System.out.println(ans.data);
		
	}
	private Node lca(Node node, int first, int second) {
	if(node==null)
	{
		return null;
	}
		if(node.data==first||node.data==second)
	{
		return node;
	}
		Node left=null;
		Node right=null;
		
		if(first>node.data||second>node.data)
		{
			left=lca(node.right, first, second);
		}
		if(first<node.data||second<node.data)
		{
			right=lca(node.left, first, second);
			
		}
		if(left!=null&&right!=null)
		{
			return node;
		}
			
		if(left==null&&right==null)
		{
			return null;
		}
		if(left!=null)
		{
			//if(right==null)
			return left;
		}
	else 
	{
	
			return right;
	}
	}
	static int sum=0;
	public int  maxvalue(int  item,int[]In)
	{Arrays.sort(In);
		int sum=0;
		int i=In.length-1;
		while(In[i]>item)
		{
			//sum=sum+In[i];
			i--;
		}
		return sum;
	}
	public void replacesum()
	{
		replacesum(this.root);
	}
	private void  replacesum(Node node) {
	if(node==null)
	{
		return ;
	}
		replacesum(node.right);
		
		if(sum>node.data)
		{
			node.data=sum;
		}
		sum=sum+node.data;
		if(sum<node.data)
			node.data=0;
		
		replacesum(node.left);
		
	}
	static Scanner scn=new Scanner(System.in);
		public static void main(String[]args)
		{int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.nextInt();
		}
		Arrays.sort(arr);
			BST bst=new BST();
			bst.construct(arr);
		//	bst.replacesum();
			bst.display();
//			int p=scn.nextInt();
//			int m=scn.nextInt();
			//bst.lca(p, m);
			
			
			
		}
}
