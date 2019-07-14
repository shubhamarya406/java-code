package lec_23;

public class segment_tree {
	private class node {

		int data;
		node left;
		node right;
		int lo;
		int hi;
	}

	private node root;
   private  segmentsum sum;
	public void construct(int arr[],segmentsum sum) {
		int lo = 0;
		int hi = arr.length - 1;
		this.sum=sum;
		this.root = construct(arr, lo, hi);

	}

	private node construct(int[] arr, int lo, int hi) {
		if (lo == hi) {
			node ln = new node();
			ln.data = arr[lo];
			ln.lo = lo;
			ln.hi = hi;
			return ln;
		}
		node nn = new node();
		nn.lo = lo;
		nn.hi = hi;

		int mid = (lo + hi) / 2;
		nn.left = construct(arr, lo, mid);
		nn.right = construct(arr, mid + 1, hi);
		nn.data = nn.left.data + nn.right.data;

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

	public int query(int qsi, int qei) {

		return query(this.root, qsi, qei);

	}

	private int query(node n, int qsi, int qei) {
		if (n == null) {
			return 0;
		}
		if (n.lo >= qsi && n.hi <= qei) {
			return n.data;
		} else if (n.hi < qsi || n.lo > qei) {
			return sum.defaultvalue();
		} else {
			int fs = query(n.left, qsi, qei);
			int ss = query(n.right, qsi, qei);
			return sum.operation(fs,ss);

		}
	}

	public void update(int idx, int item) {
		update(this.root, idx, item);

	}

	private int update(node n, int idx, int item) {

		if (n.lo == idx && n.hi == idx) {
			n.data = item;
			return n.data;

		} else if (idx >= n.lo && idx <= n.hi) {
			int f = update(n.left, idx, item);
			int s = update(n.right, idx, item);
			n.data = sum.operation(f, s);
			return n.data;

		} else {
			return n.data;
		}
	}
}