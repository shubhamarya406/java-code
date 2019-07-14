package Assignment_hackerblocks;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
//import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
//import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class levelbinary {

	private class node {
		int data;
		node left;
		node right;

	}

	private node root;

	public void construct(ArrayList<Integer> arr) {
		Queue<node> queue = new LinkedList<>();
		this.root = construct(arr, queue);

	}

	private node construct(ArrayList<Integer> arr, Queue<node> queue) {
		int count = 0;
		node nn = new node();
		boolean bn = false;
		nn.data = arr.get(0);
		queue.add(nn);
		node c = null;
		for (int i = 1; i < arr.size(); i++) {
			node node = new node();
			node.data = arr.get(i);
			if (!bn) {
				c = queue.remove();
			}
			if (!bn) {
				bn = true;
				c.left = node;
			} else {

				bn = false;
				c.right = node;
			}
			if (arr.get(i) != -1) {
				queue.add(node);
			}
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

	public void leave() {
		leave(this.root);
	}

	private void leave(node root) {
		if (root == null) {
			return;
		}

		if (root.left == null && root.right == null) {
			System.out.print(root.data + " ");
		}
		leave(root.left);
		leave(root.right);

	}

	public void bottom() {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		bottom(this.root, map, 0);

		System.out.println(map);

	}

	private void bottom(node Node, HashMap<Integer, Integer> map, int hd) {
		if (Node == null) {
			return;
		}
		if (map.containsKey(hd)) {
			map.remove(map.get(hd));
			map.put(hd, Node.data);

		} else {

			map.put(hd, Node.data);
		}
		bottom(Node.left, map, hd - 1);
		bottom(Node.right, map, hd + 1);
	}

	public void top() {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		top(this.root, map, 0);
		System.out.println(map);
	}

	private void top(node Node, HashMap<Integer, Integer> map, int hd) {
		if (Node == null) {
			return;
		}
		if (!map.containsKey(hd)) {
			map.put(hd, Node.data);

		}

		top(Node.left, map, hd - 1);
		top(Node.right, map, hd + 1);
	}

	public void left() {
		left(this.root, 1);
	}

	private class VOPair implements Comparable<VOPair> {

		int data;
		int vd;
		int hd;

		@Override
		public String toString() {
			return this.data + "";
		}

		@Override
		public int compareTo(VOPair o) {
			return this.hd - o.hd;
		}
	}

	public void verticalDisplay() {

		HashMap<Integer, ArrayList<VOPair>> map = new HashMap<>();
		verticalDisplay(this.root, map, 0, 0);

		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys);

		ArrayList<VOPair> list = null;
		// Collections.sort(list, new VOPairComparator());
		for (int key : keys) {

			list = map.get(key);
			Collections.sort(list);
			System.out.print(list.get(0)+" ");
			//System.out.println("---------");
			//System.out.println(list.get(0));

		}
//		ArrayList<VOPair> nlist = null;
//		//System.out.println("---------");
//		// Collections.sort(list, new VOPairComparator());
//		for (int key : keys) {
//
//			nlist = map.get(key);
//			Collections.sort(nlist);
//			//System.out.println(list.get(list.size() - 1));
//			
//			System.out.print(nlist.get(0)+" ");
//
//		}
//		
	}

	private void verticalDisplay(node Node, HashMap<Integer, ArrayList<VOPair>> map, int vDist, int hDist) {

		if (Node == null) {
			return;
		}

		VOPair np = new VOPair();
		np.data = Node.data;
		np.hd = hDist;
		np.vd = vDist;

		if (!map.containsKey(vDist)) {
			map.put(vDist, new ArrayList<>());
		}
     if(np.data!=-1)
		map.get(vDist).add(np);

		verticalDisplay(Node.left, map, vDist - 1, hDist + 1);
		verticalDisplay(Node.right, map, vDist + 1, hDist + 1);
	}

//	private class VOPairComparator implements Comparator<VOPair> {
//
//		@Override
//		public int compare(VOPair o1, VOPair o2) {
//			return o1.hd - o2.hd;
//		}
//
//	}
//
//	private class IntegerComparator implements Comparator<Integer> {
//
//		@Override
//		public int compare(Integer o1, Integer o2) {
//			return o2.intValue() - o1.intValue();
//		}
//
//	}

	static int maxlevel = 0;

	private void left(node root2, int level) {

		if (root2 == null) {
			return;
		}
		if (maxlevel < level && root2.data != -1) {
			System.out.print(root2.data);
			maxlevel = level;
		}

		left(root2.left, level + 1);
		left(root2.right, level + 1);
	}

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		levelbinary bt = new levelbinary();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		while (scn.hasNextInt()) {
			arr.add(scn.nextInt());
		}
		bt.construct(arr);
		//bt.display();
		// bt.leave();
		// bt.bottom();
		// bt.left();
		//bt.top();
		bt.verticalDisplay();
	}
}
