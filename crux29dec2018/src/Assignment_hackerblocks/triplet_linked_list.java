package Assignment_hackerblocks;

import java.util.Scanner;



public class triplet_linked_list {

	private class node {

		int data;
		node next;

	}

	private node head;
	private node tail;
	private int size;

	public int size() {
		return this.size;
	}

	public int getfirst() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		return this.head.data;

	}

	public int getlast() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		return this.tail.data;
	}

	public boolean isempty() {
		return this.size == 0;
	}

	public int getat(int idx) throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		if (idx < 0 || idx >= size) {
			throw new Exception("invalid index");
		}
		node temp = this.head;
		int ans = 0;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
			ans = temp.data;

		}

		return ans;
	}

	public void display() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}

		node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;

		}
		System.out.println();
	}

	public void addatlast(int item) {

		node nn = new node();
		nn.data = item;
		nn.next = null;
		if (isempty()) {
			this.head = nn;
			this.tail = nn;
			size = 1;

		} else {
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}
	}

	public void addfirst(int item) {
		node nn = new node();
		nn.data = item;
		nn.next = null;
		if (isempty()) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			nn.next = this.head;
			this.head = nn;
			;
			size++;
		}

	}

	public node getnodeat(int idx) throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		if (idx < 0 || idx >= this.size) {
			throw new Exception("invalid index");
		}
		node temp = this.head;
		node ans = null;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;

		}

		return temp;
	}

	public void addat(int item, int idx) throws Exception {

		if (isempty()) {
			throw new Exception("ll is empty");
		}
		if (idx < 0 || idx > this.size) {
			throw new Exception("invalid index");
		}
		if (idx == 0) {
			addfirst(item);
		} else if (idx == this.size) {
			addatlast(item);
		} else {

			node nn = new node();
			nn.data = item;
			nn.next = null;
			node nm1 = getnodeat(idx - 1);
			node np1 = getnodeat(idx);
			nm1.next = nn;
			nn.next = np1;
			this.size++;

		}
	}

	public int removefirst() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		if (this.size == 1) {
			int val = this.head.data;
			this.head = null;
			this.tail = null;
			this.size = 0;
			return val;

		} else {
			int val = this.head.data;
			this.head = this.head.next;
			this.size--;
			return val;
		}
	}

	public int removelast() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}

		if (this.size == 1) {
			int val = this.tail.data;
			this.head = null;
			this.tail = null;
			this.size = 0;
			return val;
		} else {

			int val = this.tail.data;
			node nm2 = this.getnodeat(size - 2);
			nm2 = this.tail;
			size--;
			return val;

		}
	}

	public int removeat(int idx) throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("invalid index");

		}
		if (idx == 0) {
			int val = removefirst();
			return val;
		} else if (idx == this.size - 1) {
			int val = removelast();
			return val;
		} else {
			node nm1 = getnodeat(idx - 1);
			node nm = getnodeat(idx);
			int val = nm.data;
			node np1 = nm.next;
			nm1.next = np1;
			this.size--;
			return val;

		}
	}

	public void reversepointerrec() {

		reversepointerrec(this.head, this.head.next);
		node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	private void reversepointerrec(node prev, node curr) {
		if (curr == null) {
			return;
		}

		reversepointerrec(curr, curr.next);
		curr.next = prev;

	}

	public triplet_linked_list mergesorttwo(triplet_linked_list oth) {
		node first = this.head;
		node second = oth.head;

		triplet_linked_list tt = new triplet_linked_list();
		while (first != null && second != null) {
			if (first.data < second.data) {
				tt.addatlast(first.data);
				first = first.next;

			} else {
				tt.addatlast(second.data);
				second = second.next;

			}

		}
		while (first != null) {
			tt.addatlast(first.data);
			first = first.next;

		}
		while (second != null) {
			tt.addatlast(second.data);
			second = second.next;
		}

		return tt;
	}

	private node midnode() {

		node slow = this.head;
		node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}
		return slow;

	}

	public void mergesort() {

		if (this.size() == 1)
			return;

		triplet_linked_list fh = new triplet_linked_list();
		node mid = midnode();
		node midn = mid.next;
		fh.head = this.head;
		fh.tail = mid;
		fh.tail.next = null;
		fh.size = (this.size + 1) / 2;
		triplet_linked_list sh = new triplet_linked_list();
		sh.head = midn;
		sh.tail = this.tail;
		sh.tail.next=null;
		sh.size = (this.size) / 2;
		fh.mergesort();
		sh.mergesort();
		triplet_linked_list ans = fh.mergesorttwo(sh);
		this.head = ans.head;
		this.tail = ans.tail;
		this.tail.next = null;
		this.size = ans.size;

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		triplet_linked_list la = new triplet_linked_list();
		triplet_linked_list lb = new triplet_linked_list();
		triplet_linked_list lc = new triplet_linked_list();
		for (int i = 0; i < a; i++) {
			la.addatlast(scn.nextInt());

		}
		for (int i = 0; i < b; i++) {
			lb.addatlast(scn.nextInt());

		}
		for (int i = 0; i < c; i++) {
			lc.addatlast(scn.nextInt());

		}

		int target = scn.nextInt();
		la.targets(lb, lc, target);

	}

	public void targets(triplet_linked_list lb, triplet_linked_list lc, int target) {
		lb.mergesort();
		lc.mergesort();
		lc.reversepointerrec();
		node tempa = this.head;

		while (tempa != null) {
			node tempb = lb.head;
			node tempc = lc.head;
			while (tempb != null && tempc != null) {
				if (tempa.data + tempb.data + tempc.data == target) {
					System.out.print(tempa.data + " " + tempb.data + " " + tempc.data);
					return;
				} else if ((tempa.data + tempb.data + tempc.data) < target) {
					tempb = tempb.next;
				} else if ((tempa.data + tempb.data + tempc.data) > target) {
					tempc = tempc.next;
				}
				 
			}
			tempa=tempa.next;
		}
		
	}
}
