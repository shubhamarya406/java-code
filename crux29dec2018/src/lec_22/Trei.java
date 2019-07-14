package lec_22;

import java.util.HashMap;

public class Trei {
	private class Node {
		char ch;
		boolean eow;
		HashMap<Character, Node> map = new HashMap<>();

		public Node(char ch) {
			this.ch = ch;
			this.eow = false;
			map = new HashMap<>();

		}

	}

	private Node root;

	public Trei() {
		this.root = new Node('*');

	}

	public void addword(String word) {

		addword(this.root, word);
	}

	private void addword(Node parent, String word) {

		if (word.length() == 0) {
			parent.eow = true;
			return;
		}

		char ch = word.charAt(0);
		String row = word.substring(1);
		boolean wp = parent.map.containsKey(ch);
		if (wp) {
			addword(parent.map.get(ch), row);

		} else {
			Node nn = new Node(ch);
			parent.map.put(ch, nn);
			addword(parent.map.get(ch), row);

		}
	}

	public void display() {
		display(this.root, "");

	}

	private void display(Node parent, String ans) {
		if (parent.eow) {
			System.out.println(ans);

		}

		for (char key : parent.map.keySet()) {
			display(parent.map.get(key), ans + key);
		}

	}

	public boolean search(String str) {
		return search(this.root, str);
	}

	private boolean search(Node parent, String word) {

		if (word.length() == 0) {

			return parent.eow;
		}

		char ch = word.charAt(0);
		String row = word.substring(1);
		boolean wp = parent.map.containsKey(ch);
		if (wp) {
			return search(parent.map.get(ch), row);

		} else {
			return false;

		}
	}

	public void remove(String str) {
		remove(this.root, str);
	}

	private void remove(Node parent, String word) {
		if (word.length() == 0) {
			parent.eow = false;
			return;
		}

		char ch = word.charAt(0);
		String row = word.substring(1);
		boolean wp = parent.map.containsKey(ch);
		if (wp) {
			Node child=parent.map.get(ch);
           remove(child, row);
           
			if (parent.eow == false && child.map.size() == 0) {
			parent.map.remove(ch);
			}
		} else {

			return;

		}
	}
}
