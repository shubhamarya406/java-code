package Assignment_hackerblocks;

import java.util.ArrayList;
import java.util.Scanner;

//import practice_oops.inheritance.binary_trees.node;

public class Lowestcommonancestor_bt {
	private class node
	{
		private int data;
		private node right;
		private node left;
	}
	private node root;
	public Lowestcommonancestor_bt()
	{
		
		this.root=Lowestcommonancestor_bt(null,false);
		
	}
	Scanner scn=new Scanner(System.in);
private  node Lowestcommonancestor_bt(node parent,boolean isc)
{
	if(parent==null)
	{
		System.out.println("enter the data for root node");
		
	}
	
	else
	{
		//if(isc)
		//System.out.println("enter the data for left child of"+parent.data);
		//else
		//System.out.println("enter the data for right child of"+parent.data);
	}
	int item=scn.nextInt();
	node nn=new node();
	nn.data=item;
	System.out.println("is there left child of"+nn.data);
	boolean hlc=scn.nextBoolean();
	if(hlc)
	{
		nn.left=Lowestcommonancestor_bt(nn, true);
		
	}
	System.out.println("has right child of "+nn.data);
	boolean hrc=scn.nextBoolean();
	if(hrc)
	{
		nn.right=Lowestcommonancestor_bt(nn,false);
		
	}
	
	return nn;
}
public void display()
{
	display(this.root);
	
}
private void display(node Node)
{String str="";
	if(Node==null)
	{
		return ;
	}
	
	if(Node.left==null)
	{
		str+=".";
	}
	else
	{
	str+=Node.left.data;
	}
	str+="-->"+Node.data+"<--";
	if(Node.right==null)
	{
		str+=".";
	}
	else
	{
	str+=Node.right.data;
	}
	System.out.println(str);
	display(Node.left);
	display(Node.right);
	
}
public int size()
{    
	return size(this.root);
}
private int size(node Node)
{
	if(Node==null)
	{
		return 0;
	}
	int size=0;
	size+=size(Node.left);
	size+=size(Node.right);
	return size+1;

}
public boolean find(int item)
{
	
	return find(this.root,item);
}
private boolean find(node Node,int item)
{  if(Node==null)
{
	return false;
}
	if(Node.data==item)
	{
		return true;
	}
	boolean bn;
	bn=find(Node.left,item);
	if(bn)
	{
		return true;
		
	}
	bn=find(Node.right,item);
	if(bn)
	{
		return true;
	}
	return false;
}
public int  LCA(int fe,int se)
{ ArrayList<Integer> fa=new  ArrayList<Integer>();
   ArrayList<Integer> Sa=new  ArrayList<Integer>();

	return lca(this.root,fe,se,fa,sa);
}

	private int   lca(node Node, int fe, int se,ArrayList<Integer> fa, ArrayList<Integer> Sa) {
	
		
		
		lca(Node.left);
	lca(Node.right);
	
}
	public static void main(String[] args) {
		

	}

}
