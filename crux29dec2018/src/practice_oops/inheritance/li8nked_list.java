package practice_oops.inheritance;

public class li8nked_list {
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

	public void reversedata() throws Exception {
		int i = 0;
		int j = this.size - 1;
		while (i < j) {
			node left = getnodeat(i);
			node right = getnodeat(j);
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
			i++;
			j--;

		}

	}

	public void reversepointer() {
		node prev = this.head;
		node curr = prev.next;
		while (curr != null) {
			node ahead = curr.next;
			curr.next = prev;
			prev = curr;

			curr = ahead;

		}
		node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;

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

	public void reversedatarec() {
		reversedatarec(this.head, this.head, 1);

	}

	private node reversedatarec(node left, node right, int count) {
		if (right == null) {
			return left;
		}

		left = reversedatarec(left, right.next, count + 1);
		if (count <= this.size / 2) {
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
		}
		left = left.next;

		return left;
	}

	private class heap {
		node left;

	}

	public void reversedatarec2() {
		heap hp = new heap();
		hp.left = this.head;
		reversedatarec2(hp, this.head, 1);

	}

	private void reversedatarec2(heap hp, node right, int count) {
		if (right == null) {
			return;
		}
		reversedatarec2(hp, right.next, count + 1);

		if (count <= this.size / 2) {
			int temp = hp.left.data;
			hp.left.data = right.data;
			right.data = temp;
		}
		hp.left = hp.left.next;

	}

	public void fold() {
		fold(this.head, this.head, 0);

	}

	private node fold(node left, node right, int count) {
		if (right == null) {
			return left;
		}

		left = fold(left, right.next, count + 1);
		if (count > this.size / 2) {
			node ahead = left.next;
			left.next = right;
			right.next = ahead;
			left = ahead;
			return left;
		}
		if (count == this.size / 2) {

			this.tail = right;
			this.tail.next = null;
		}
		return null;

	}

	public int mid() {

		node slow = this.head;
		node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}
		return slow.data;

	}
	 public void createdummylist()
     {
   	  node n1=new node();
   	  node n2=new node();
   	  node n3=new node();
   	  node n4=new node();
   	  node n5=new node();
   	  node n6=new node();

   	  n1.data = 10;
   	  n2.data = 20;
   	  n3.data = 30;
   	  n4.data = 40;
   	  n5.data = 50;
   	  n6.data = 60;
   	  n1.next=n2;
   	  n2.next=n3;
   	  n3.next=n4;
   	  n4.next=n5;
   	  n5.next=n6;
   	  n6.next=n3;
     }

	public int kthfromlast(int k) {
		node slow = this.head;
		node fast = this.head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;

		}
		return slow.data;
	}

	public void kreverse(int k) throws Exception {

		li8nked_list prev = null;
		while (!this.isempty()) {
			li8nked_list curr = new li8nked_list();
			for (int i = 0; i < k; i++) {
				curr.addfirst((this.removefirst()));
			}
			if (prev == null) {

				prev = curr;
			} else {
				prev.tail.next = curr.head;
				prev.tail = curr.tail;
				prev.size += curr.size;
			}
		}

		this.head = prev.head;
		this.tail = prev.tail;
		this.size = prev.size;
	}

	public li8nked_list mergesorttwo(li8nked_list oth) {
		node first = this.head;
		node second = oth.head;

		li8nked_list tt = new li8nked_list();
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
		
		if(this.size() == 1)
			return;
		
		li8nked_list fh = new li8nked_list();
		node mid = midnode();
		node midn = mid.next;
		fh.head = this.head;
		fh.tail = mid;
		fh.tail.next = null;
		fh.size = (this.size + 1) / 2;
		li8nked_list sh = new li8nked_list();
		sh.head = midn;
		sh.tail = this.tail;
		sh.size = (this.size) / 2;
		fh.mergesort();
		sh.mergesort();
		li8nked_list ans = fh.mergesorttwo(sh);
		this.head = ans.head;
		this.tail = ans.tail;
		this.tail.next = null;
		this.size = ans.size;

	}
	public boolean dummyloop()
	{
		node slow=this.head;
		node fast=this.head;
		while(fast!=null&&fast.next!=null)
		{
			
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				break;
			}
			
		}
		
		if(slow==fast)
		{
			node curr=this.head;
			node loop=slow;
			while(curr.next!=loop.next)
			{
				curr=curr.next;
				loop=loop.next;
				
			}
			loop.next=null;
			return true;
			
		}
		else
		{
			return false;
		}
		
		
	}
}
