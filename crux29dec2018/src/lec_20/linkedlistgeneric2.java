package lec_20;

public class linkedlistgeneric2<T> {
	private class node {

		T data;
		node next;

	}

	private node head;
	private node tail;
	private int size;

	public int size() {
		return this.size;
	}

	public T getfirst() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		return this.head.data;

	}

	public T atlast() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		return this.tail.data;
	}

	public boolean isempty() {
		return this.size == 0;
	}

	public T getat(int idx) throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		if (idx < 0 || idx >= size) {
			throw new Exception("invalid index");
		}
		node temp = this.head;
		//T ans;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp.data;
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

	public void addatlast(T item) {

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

	public void addfirst(T item) {
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

	public void addat(T item, int idx) throws Exception {

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

	public T removefirst() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}
		if (this.size == 1) {
			T val = this.head.data;
			this.head = null;
			this.tail = null;
			this.size = 0;
			return val;

		} else {
			T val = this.head.data;
			this.head = this.head.next;
			this.size--;
			return val;
		}
	}

	public T removelast() throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}

		if (this.size == 1) {
			T val = this.tail.data;
			this.head = null;
			this.tail = null;
			this.size = 0;
			return val;
		} else {

			T val = this.tail.data;
			node nm2 = this.getnodeat(size - 2);
			nm2 = this.tail;
			size--;
			return val;

		}
	}

	public T removeat(int idx) throws Exception {
		if (isempty()) {
			throw new Exception("ll is empty");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("invalid index");

		}
		if (idx == 0) {
			T val = removefirst();
			return val;
		} else if (idx == this.size - 1) {
			T val = removelast();
			return val;
		} else {
			node nm1 = getnodeat(idx - 1);
			node nm = getnodeat(idx);
			T val = nm.data;
			node np1 = nm.next;
			nm1.next = np1;
			this.size--;
			return val;

		}
	}
}
