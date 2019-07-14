package lec_18;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class binary_tree {

	static Scanner scn = new Scanner(System.in);

	private class node {
		int data;
		node left;
		node right;

	}

	private node root;

	public binary_tree() {
		this.root = binary_tree(null, true);

	}

	private node binary_tree(node parent, boolean ilc) {
//		if (parent == null) {
//			System.out.println("enter the data of the parent");
//		} else {
//			if (ilc) {
//				System.out.println("enter the data for left  child of" + parent.data);
//			} else {
//				System.out.println("enter the data foer right child");
//			}
//		}
		int item = scn.nextInt();
		node nn = new node();
		nn.data = item;
		// System.out.println("is left child of " + nn.data);
		boolean lc = scn.nextBoolean();
		if (lc) {
			nn.left = binary_tree(nn, true);
		}
		// System.out.println("is right child of" + nn.data);
		boolean rc = scn.nextBoolean();
		if (rc) {
			nn.right = binary_tree(nn, false);
		}
		return nn;
	}

	public void display() {
		display(this.root);
	}

	private void display(node Node) {

		if (Node == null) {
			return;
		}

		String str = "";
		if (Node.left == null) {
			str += ".";
		} else {
			str += Node.left.data;

		}
		str += "->" + Node.data + "->";
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
		if (item == Node.data) {
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
		if (Node == null)
			return 0;
		int lm = max(Node.left);
		int rm = max(Node.right);
		return Math.max(Node.data, Math.max(lm, rm));
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

	private class diapair {
		int diameter = 0;
		int height = -1;
	}

	public int diameter2() {
		return diameter2(this.root).diameter;
	}

	private diapair diameter2(node Node) {

		if (Node == null) {
			diapair dpf = new diapair();
			return dpf;
		}
		diapair dph = diameter2(Node.left);
		diapair dpr = diameter2(Node.right);

		int lht = dph.height;
		int rht = dpr.height;
		int sp = lht + rht + 2;
		diapair dp = new diapair();
		int fh = Math.max(lht, rht) + 1;
		int fd = Math.max(sp, Math.max(dph.diameter, dpr.diameter));

		dp.height = fh;
		dp.diameter = fd;

		return dp;
	}

	private class balpair {
		int height = -1;
		boolean balance = true;

	}

	public boolean isbalanced() {

		return isbalanced(this.root).balance;
	}

	private balpair isbalanced(node Node) {
		if (Node == null)

		{
			balpair bbp = new balpair();
			return bbp;
		}
		balpair lbp = isbalanced(Node.left);
		balpair rbp = isbalanced(Node.right);
		int sp = Math.abs(lbp.height - rbp.height);
		balpair bp = new balpair();
		if (lbp.balance && rbp.balance && sp <= 1) {

			bp.balance = true;

		} else {
			bp.balance = false;
		}
		bp.height = Math.max(lbp.height, rbp.height) + 1;

		return bp;

	}

	private class pair {
		node Node;
		boolean sp;
		boolean left;
		boolean right;
	}

	// public void preorder() {

	// preorder(this.root);
	// }

	private void preorder(node Node) {
		LinkedList<pair> stack = new LinkedList<>();
		pair np = new pair();
		np.Node = this.root;
		stack.addFirst(np);
		while (!stack.isEmpty()) {
			pair rp = stack.getFirst();
			if (rp.sp == false) {
				System.out.println(rp.Node.data);
				rp.sp = true;
			} else if (rp.left == false) {
				pair npl = new pair();
				npl.Node = rp.Node.left;
				if (npl.Node != null)
					stack.addFirst(npl);
				rp.left = true;

			} else if (rp.right == false) {
				pair nnpl = new pair();
				nnpl.Node = rp.Node.right;
				if (nnpl.Node != null)
					stack.addFirst(nnpl);
				rp.right = true;

			} else {
				stack.removeFirst();
			}

		}
	}

	public void preorder(int[] pre, int[] In) {

		this.root = preorder(pre, 0, pre.length - 1, In, 0, In.length - 1);
	}

	private node preorder(int[] pre, int lp, int hp, int[] In, int li, int hi) {

		if (lp > hp || li > hi) {
			return null;
		}

		node nn = new node();
		nn.data = pre[lp];
		int si = -1;
		for (int i = li; i <= hi; i++) {

			if (pre[lp] == In[i]) {

				si = i;
				break;
			}

		}
		int nel = si - li;
		nn.left = preorder(pre, lp + 1, lp + nel, In, li, si - 1);
		nn.right = preorder(pre, lp + nel + 1, hp, In, si + 1, hi);
		return nn;
	}

	private class BSTPair {
		boolean isbst = true;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

	}

	public boolean istrees() {
		return istrees(this.root).isbst;
	}

	private BSTPair istrees(node Node) {
		if (Node == null) {
			return new BSTPair();
		}
		BSTPair bl = istrees(Node.left);
		BSTPair br = istrees(Node.right);

		BSTPair mb = new BSTPair();
		if (bl.isbst && br.isbst && bl.max < Node.data && br.min > Node.data) {

			mb.isbst = true;
		} else
			mb.isbst = false;
		mb.max = Math.max(Node.data, Math.max(bl.max, br.max));
		mb.min = Math.min(Node.data, Math.min(bl.min, br.min));
		return mb;

	}

	public class Dpair {
		int data;
		int vd;
		int hd;

	}

	public void verticalorder() {
		int vdis = 0;
		int hdis = 0;
		HashMap<Integer, ArrayList<Dpair>> map = new HashMap<>();
		verticalorder(this.root, vdis, hdis, map);
		System.out.println(map);
	}

	private void verticalorder(node Node, int vdis, int hdis, HashMap<Integer, ArrayList<Dpair>> map) {
		Dpair dp = new Dpair();
		dp.data = Node.data;
		dp.hd = hdis;
		dp.vd = vdis;
		if (!map.containsKey(vdis)) {
			ArrayList<Dpair> list = new ArrayList<binary_tree.Dpair>();
			list.add(dp);
			map.put(vdis, list);

		} else {
			map.get(vdis).add(dp);
		}

		verticalorder(Node.left, vdis - 1, hdis + 1, map);
		verticalorder(Node.left, vdis + 1, hdis + 1, map);

	}

	static int sum = 0;

	private class distance {
		ArrayList<Integer> first = new ArrayList<Integer>();
		ArrayList<Integer> second = new ArrayList<Integer>();

	}

	public void leafsum(int tar) {
		ArrayList<Integer> list = new ArrayList<>();
		leafsum(this.root, tar, 0, list);
	}

	private void leafsum(node parent, int tar, int sum, ArrayList<Integer> list) {

		if (parent == null) {
			if (sum == tar) {
				while (!list.isEmpty()) {
					int item = list.remove(0);
					System.out.print(item + " ");
					sum = 0;

				}
			}
			return;
		}

		list.add(parent.data);
		leafsum(parent.left, tar, sum + parent.data, list);
		leafsum(parent.right, tar, sum + parent.data, list);

	}

	public void delete() {
		delete(this.root);

	}

	private node delete(node root2) {

		if (root2 == null) {
			return null;
		}
		if (root2.left == null && root2.right == null) {
			root2 = null;
			return null;

		}

		if (root2.left != null) {
			node left = delete(root2.left);
		}
		if (root2.right != null) {
			node right = delete(root2.right);
		}
		return root2;
	}

	public void levelbinary(ArrayList<Integer> arr) {
//Queue<node>	queue=new LinkedList<>();
		this.root = levelbinary(arr, 0);

	}

	private node levelbinary(ArrayList<Integer> arr, int i) {
		if (i > arr.size() || arr.get(i) == -1) {
			return null;
		}

		node nn = new node();
		nn.data = arr.get(i);
		nn.left= levelbinary(arr, 2 * i + 1);
		nn.right = levelbinary(arr, 2 * i + 2);

		return nn;

	}

	public class ppair {
		int data;
		int hd;
	}

	public void pvertical() {
		HashMap<Integer, ArrayList<ppair>> map = new HashMap<Integer, ArrayList<ppair>>();
		pvertical(this.root, map, 0);

		System.out.println(map);
	}

	private void pvertical(node Node, HashMap<Integer, ArrayList<ppair>> map, int hd) {
		if (Node == null) {
			return;
		}
		ppair pair = new ppair();
		pair.data = Node.data;
		pair.hd = hd;
		if (!map.containsKey(hd)) {
			ArrayList<ppair> arr = new ArrayList<>();
			arr.add(pair);
			map.put(hd, arr);

		} else {
			map.get(hd).add(pair);
		}
		pvertical(Node.left, map, hd - 1);
		pvertical(Node.right, map, hd + 1);

	}

	 public void printKFar(int tar, int k) {
	        this.printKFar(this.root, tar, k);
	    }

	    private int printKFar( node Node, int tar, int k) {
                  
	    	if(Node.data==tar)
	    	{
	    		for(int i=0;i<k;i++)
	    		{
	    			printKDown(Node,k);
	    		}
	    	}
	    	
	    	printKFar(Node.left, k,tar);
	       }

	    private void printKDown( node Node, int k) {
                
                
              
              if(k==0)
              {
                  System.out.print(Node.data+" ");
              }
                
               
	      }
	public static void main(String[] args) {
//
//		 10 true 20 true 40 false false true 50 false false true 30 false true 70
	// false false
//		//
//		// 10 true 20 true 40 true 80 true 90 true 100 true 110 false false false false
//		// false true 50 false true 120 false true 130 false true 140 false false true
//		// 30 true 60 false false true 70 false false
////10 true 20 true 30 false false false false
//
////		System.out.println(bt.size());
////		System.out.println(bt.find(90));
//		// System.out.println(bt.ht());
//		// System.out.println(bt.diameter());
////		System.out.println(bt.diameter2());
////	System.out.println(bt.isbalanced());
////	//Scanner scn=new Scanner(System.in);
////	////int n=scn.nextInt();
////	
////	int arr1[]=new int[n];
////	
////	for(int i=0;i<n;i++)
////	{
////		arr1[i]=scn.nextInt();
////	}
////	int m=scn.nextInt();
////	int arr2[]=new int[m];
////	for(int i=0;i<m;i++)
////	{
////		arr2[i]=scn.nextInt();
////	}
////	
////		preorder(arr1,arr2);
////		display();
////
////	
////int pr[]= {10,20,40,80,90,190,160,50,30,60,100,120,130,140,70};
////int in[]= {80,40,90,190,190,160,20,50,10,100,60,130,120,140,30,70};
		binary_tree bt = new binary_tree();
//		//bt.lowestcommon(50, 60);
//bt.verticalorder();
//int n=scn.nextInt();
		// bt.leafsum(n);
		// bt.display();
//		ArrayList<Integer> arr = new ArrayList<>();
//
//		while (scn.hasNextInt()) {
//			arr.add(scn.nextInt());
//
//		}
//		bt.levelbinary(arr);
//		bt.display();
//		bt.delete();
//		bt.display();
		bt.pvertical();
//
	}
}
