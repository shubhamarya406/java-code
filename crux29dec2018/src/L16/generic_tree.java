package L16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class generic_tree {
	Scanner scn = new Scanner(System.in);

	private class node {
		int data;
		ArrayList<node> children = new ArrayList<>();
	}

//10 3 20 2 50 0 60 0 30 1 70 0 40 2 80 0 90 0
	private node root;

	public generic_tree() {

		this.root = construct(null, -1);

	}

	private node construct(node parent, int ith) {
		if (parent == null) {
			System.out.println("enter the data for parent");

		} else {
			System.out.println("enter the data " + ith + "child of" + parent.data);
		}
		node nn = new node();
		int item = scn.nextInt();
		nn.data = item;
		System.out.println("enter the no of child of");
		int noc = scn.nextInt();
		for (int i = 0; i < noc; i++) {
			nn.children.add(construct(nn, i));

		}
		return nn;

	}

	public void display() {

		display(root);
	}

	private void display(node Node) {
		String str = Node.data + "->";
		for (node children : Node.children) {
			str += children.data + " ";
		}

		System.out.println(str);

		for (node children : Node.children) {
			display(children);
		}
	}

	public int size() {
		return size(root);
	}

	private int size(node Node) {
		int tc = 0;
		for (node child : Node.children) {
			tc += size(child);
		}
		return tc + 1;

	}

	public int max() {
		return max(root);
	}

	private int max(node Node)

	{
		int cm = Node.data;
		for (node child : Node.children) {

			int tm = max(child);
			if (tm > cm) {
				cm = tm;

			}
		}

		return cm;
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(node Node, int item) {

		if (Node.data == item) {
			return true;
		}
		for (node child : Node.children) {

			boolean cf = find(child, item);
			if (cf)
				return true;

		}
		return false;
	}

	public void mirror() {
		mirror(this.root);
	}

	private void mirror(node Node) {
		for (int i = 0, j = Node.children.size() - 1; i < j; i++, j--) {

			node ni = Node.children.get(i);
			node nj = Node.children.get(j);
			Node.children.set(i, nj);
			Node.children.set(j, ni);

		}
		for (node child : Node.children) {
			mirror(child);

		}

	}

	public void levelprint(int level) {

		levelprint(this.root, level, 0);
	}

	private void levelprint(node Node, int level, int ct) {
		if (level == ct) {
			System.out.println(Node.data);
			return;
		}

		for (node child : Node.children) {

			levelprint(child, level, ct + 1);
		}

	}

	public void preorder() {

		preorder(this.root);
	}

	private void preorder(node Node) {

		System.out.println(Node.data);
		for (node child : Node.children) {

			preorder(child);
		}

	}

	public void postorder() {
		postorder(this.root);
	}

	private void postorder(node Node) {
		for (node child : Node.children) {
			postorder(child);
		}

		System.out.println(Node.data);
	}

	public void linearize() {
		linearize(this.root);
	}

	private void linearize(node Node) {
		for (node child : Node.children) {
			linearize(child);
		}
		while (Node.children.size() > 1) {
			node temp = gettail(Node.children.get(0));
			node rn = Node.children.remove(1);
			temp.children.add(rn);

		}

	}

	private node gettail(node Node) {
		if (Node.children.size() == 0) {
			return Node;
		}

		return gettail(Node.children.get(0));

	}

	public void levelorder() {
		levelorder(this.root);

	}

	private void levelorder(node Node) {
		LinkedList<node> queue = new LinkedList<>();
		queue.add(Node);
		while (queue.size() != 0) {
			node rn = queue.removeFirst();
			System.out.print(rn.data);
			for (node child : rn.children) {
				queue.addLast(child);
			}

		}

	}

	public void levelorderlw() {
		levelorderlw(this.root);

	}

	private void levelorderlw(node Node) {
		LinkedList<node> primary = new LinkedList<>();
		LinkedList<node> helper = new LinkedList<>();
		primary.add(Node);
		while (primary.size() != 0) {

			node rn = primary.removeFirst();
			System.out.print(rn.data);
			for (node child : rn.children) {
				helper.addLast(child);

			}
			if (primary.size() == 0) {
				primary = helper;
				helper = new LinkedList<>();
				System.out.println();
			}

		}

	}

	public void levelorderzz() {

		levelorderzz(this.root);
	}

	private void levelorderzz(node Node) {
		int ct = 0;
		LinkedList<node> stack = new LinkedList<>();
		LinkedList<node> queue = new LinkedList<>();
		queue.add(Node);
		while (queue.size() != 0) {

			node rn = queue.removeFirst();
			System.out.print(rn.data + " ");
			if (ct % 2 == 0) {
				for (node child : rn.children) {
					stack.addFirst(child);

				}
			} else {
				for (int i = rn.children.size() - 1; i >= 0; i--) {
					node temp = rn.children.get(i);
					stack.addFirst(temp);

				}
			}

			if (queue.size() == 0) {
				queue = stack;
				stack = new LinkedList<>();
				System.out.println();
				ct++;
			}
		}
	}

	private class heapmover {
		int max = Integer.MIN_VALUE;
		boolean find = false;
		int size = 0;
		int ht = 0;
		node pred;
		node succ;
		int jl = Integer.MAX_VALUE;
	}

	public void multisolver(int item) {
		heapmover mover = new heapmover();
		multisolver(this.root, mover, 0, item, 0, 0);
		System.out.println("max:" + mover.max);
		System.out.println("find:" + mover.find);
		System.out.println("size:" + mover.size);
		System.out.println("height" + mover.ht);
		System.out.println("predecessor:" + mover.pred.data);
		System.out.println("succcessor:" + mover.succ.data);
		System.out.println("just larger:" + mover.jl);

	}

	private void multisolver(node Node, heapmover mover, int ct, int item, int size, int ht) {

		mover.size++;
		if (mover.max < Node.data) {

			mover.max = Node.data;

		}
		
		if (mover.find == true && mover.succ == null) {
			mover.succ = Node;
		}

		if (Node.data == item) {
			mover.find = true;

		}
		if (mover.find == false) {
			mover.pred = Node;
		}
		
		if (Node.data > item && Node.data < mover.jl) {
			mover.jl = Node.data;

		}
		if (ct > mover.ht) {
			mover.ht = ct;

		}
		for (node child : Node.children) {
			multisolver(child, mover, ct + 1, item, size, ht);
		}
	}

}
