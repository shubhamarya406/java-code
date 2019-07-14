package practice_oops.inheritance;

import java.util.Scanner;

public class binary_trees {
//	static Scanner scn = new Scanner(System.in);

	private class node {
		private int data;
		private node right;
		private node left;
	}

	private node root;

	public binary_trees() {

		this.root = binary_trees(null, false);

	}

	private node binary_trees(node parent, boolean isc) {
//		if (parent == null) {
//			System.out.println("enter the data for root node");
//
//		}
//
//		else {
//			if (isc)
//			//	System.out.println("enter the data for left child of" + parent.data);
//			else
//				System.out.println("enter the data for right child of" + parent.data);
//		}
		int item = scn.nextInt();
		node nn = new node();
		nn.data = item;
		//System.out.println("is there left child of" + nn.data);
		boolean hlc = scn.nextBoolean();
		if (hlc) {
			nn.left = binary_trees(nn, true);

		}
		//System.out.println("has right child of " + nn.data);
		boolean hrc = scn.nextBoolean();
		if (hrc) {
			nn.right = binary_trees(nn, false);

		}

		return nn;
	}

	public void display() {
		display(this.root);

	}

	private void display(node Node) {
		String str = "";
		if (Node == null) {
			return;
		}

		if (Node.left == null) {
			str += ".";
		} else {
			str += Node.left.data;
		}
		str += "-->" + Node.data + "<--";
		if (Node.right == null) {
			str += ".";
		} else {
			str += Node.right.data;
		}
		System.out.println(str);
		display(Node.left);
		display(Node.right);

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
		if (Node.data == item) {
			return true;
		}
		boolean bn;
		bn = find(Node.left, item);
		if (bn) {
			return true;

		}
		bn = find(Node.right, item);
		if (bn) {
			return true;
		}
		return false;
	}

	public int max() {
		return max(this.root);
	}

	private int max(node Node) {
		if (Node == null) {
			return -1;
		}
		int max = Integer.MIN_VALUE;
		int rmax = max(Node.left);
		int lmax = max(Node.right);
		return Math.max(Node.data, Math.max(lmax, rmax));

	}

	public int height() {
		return height(this.root);
	}

	private int height(node Node) {
		if (Node == null) {
			return -1;
		}
		int lh = height(Node.left);
		int rh = height(Node.right);
		return Math.max(lh, rh) + 1;

	}

	public int diameter() {
		return diameter(this.root);
	}

	private int diameter(node Node) {
		if (Node == null) {
			return 0;
		}
		int lh = diameter(Node.left);
		int rh = diameter(Node.right);
		int sp = height(Node.left) + height(Node.right) + 2;
		return Math.max(sp, Math.max(rh, lh));

	}

	private class diapair {
		int diameter = 0;
		int height = -1;

	}

	public int diameter2() {
		diapair dp = new diapair();
		return diameter2(this.root).diameter;

	}

	private diapair diameter2(node Node) {
		if (Node == null) {
			diapair ndp = new diapair();
			return ndp;

		}
		diapair dp = new diapair();
		diapair ldp = diameter2(Node.left);
		diapair rdp = diameter2(Node.right);
		int lht = ldp.height;
		int rht = rdp.height;
		int sp = lht + rht + 2;
		diapair cdp = new diapair();
		int fh = Math.max(lht, rht) + 1;
		int fd = Math.max(sp, Math.max(rht, lht));
		cdp.diameter = fd;
		cdp.height = fh;

		return cdp;
	}

	public void lca(int f, int s) {
		node ans=lca(this.root, f, s);
		System.out.println(ans.data);
	}

	private node lca(node Node, int f, int s) {
		 if(Node==null)
		 {
			 return null;
		 }
		if (Node.data == f || Node.data == s) {
			return Node;
		}
    node left=lca(Node.left,f,s);
   node right= lca(Node.right,f,s);
   if(left!=null&&right!=null)
   {
	   return Node;
   }
   else if(left==null&&right==null)
   {
	   return null;
   }
   else
   {
	   if(left!=null&&right==null)
	   return left;
	   else
	   {
		   return right;
	   }
   }
  
	}
	static Scanner scn=new Scanner(System.in);
	public static void main(String[]args)
	{
		binary_trees bt=new binary_trees();
		bt.lca(50,60);
	}
}
