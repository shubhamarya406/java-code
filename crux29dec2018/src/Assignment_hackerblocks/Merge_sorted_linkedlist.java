package Assignment_hackerblocks;

import java.util.Scanner;

public class Merge_sorted_linkedlist {

	private class Node {

		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return tail.data;
	}

	public void addLast(int item) {
		// create a new node
		Node nn = new Node();

		nn.data = item;
		nn.next = null;

		// update summary
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else

		{
			this.tail.next = nn;
			this.tail = nn;

			size++;
		}

	}

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			size++;
		}

	}

	public int removeFirst() throws Exception {
		Node fn = this.head;

		if (this.size == 0)
			throw new Exception("linked list is empty");

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			size = 0;
		} else {
			Node np1 = this.head.next;
			this.head = np1;
			size--;
		}

		return fn.data;
	}

	public Merge_sorted_linkedlist sorted_list(Merge_sorted_linkedlist other) throws Exception {
		Node one = this.head;
		Node two = other.head;
		Merge_sorted_linkedlist clist = new Merge_sorted_linkedlist();
		while (one != null && two!= null) {

			if (one.data < two.data) {
				clist.addLast(one.data);
				one = one.next;

			} else if (two.data <= one.data) {
				clist.addLast(two.data);
				two = two.next;

			}
			

		}
		while(one!=null)
		{
			clist.addLast(one.data);
			one=one.next;
			
		}
		while(two!=null)
		{
			
			clist.addLast(two.data);
			two=two.next;
		}
		
		return clist;

	}

	public void display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		int t = scn.nextInt();

		while (t > 0) {

			Merge_sorted_linkedlist list1 = new Merge_sorted_linkedlist();
			int n1 = scn.nextInt();

			for (int j = 0; j < n1; j++) {
				int item = scn.nextInt();
				list1.addLast(item);
			}

			Merge_sorted_linkedlist list2 = new Merge_sorted_linkedlist();
			int n2 = scn.nextInt();

			for (int j = 0; j < n2; j++) {
				int item = scn.nextInt();
				list2.addLast(item);
			}
		Merge_sorted_linkedlist curr=	list1.sorted_list(list2);
		curr.display();
			

			t--;
		}

	}
}
