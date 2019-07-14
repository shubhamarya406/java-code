package lec_13;

public class linkedlist {

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

	public boolean isempty() {
		return this.size == 0;
	}

	public int getfirst() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		int ans = this.head.data;
		return ans;
	}

	public int getlast() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		int ans = this.tail.data;
		return ans;
	}

	public int getat(int idx) throws Exception {
		node temp = this.head;
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		if (idx < 0 || idx >= size) {
			throw new Exception("invalid index");
		}
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;

		}
		int ans = temp.data;
		return ans;
	}

	public void display() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}

	}

	public void addLast(int item) {
		node nn = new node();
		nn.data = item;
		if (isempty()) {
			tail = nn;
			head = nn;
			this.size++;

		} else {
			this.tail.next = nn;
			this.tail = nn;
			this.size++;
		}

	}

	private node getnodeat(int idx) throws Exception {
		node temp = this.head;
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		if (idx < 0 || idx >= size) {
			throw new Exception("invalid index");
		}
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;

		}

		return temp;

	}

	public void addfirst(int item) {
		node nn = new node();
		nn.data = item;
		if (isempty()) {
			this.head = nn;
			this.tail = nn;
			this.size++;

		} else {
			nn.next = head;
			head = nn;
			this.size++;

		}

	}

	public void addAt(int idx, int item) throws Exception {
		if (idx < 0 || idx > size) {
			throw new Exception("invalid index");

		} else if (idx == 0) {
			addfirst(item);
		} else if (idx == size) {
			addLast(item);
		} else {
			node nn = new node();
			nn.data = item;
			node nm1 = getnodeat(idx - 1);
			node nm2 = nm1.next;
			nm1.next = nn.next;
			nn.next = nm2.next;
			this.size++;

		}
	}

	public int removefirst() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		int rv = head.data;
		if (size == 1) {

			this.head = null;
			this.tail = null;
			size = 0;
		} else {

			this.head = this.head.next;
			size--;

		}
		return rv;
	}

	public int removelast() throws Exception {

		if (isempty()) {
			throw new Exception("ll is empty");
		}

		int rv = tail.data;

		if (size == 1) {

			this.head = null;
			this.tail = null;
			size = 0;
		} else {

			node nm = this.getnodeat(this.size - 2);
			nm.next = null;
			tail = nm;
			size--;

		}

		return rv;
	}

	public int removeat(int idx) throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		if (idx < 0 || idx >= size) {
			throw new Exception("invalid index");
		}
		if (idx == 0) {
			return removefirst();
		}
		if (idx == size - 1) {
			return removelast();
		}
		node nm1 = getnodeat(idx - 1);
		node nm = nm1.next;
		int val = nm.data;
		node np = nm.next;
		nm1.next = np;
		size--;
		return val;
	}
}
