package lec_23;

import java.util.HashMap;

import lec_22.generic_heap;

public class hoffman {
	private class node implements Comparable<node> {
		char ch;
		int cost;
		node left;
		node right;

		@Override
		public int compareTo(node o) {
			return o.cost - this.cost;

		}

	}

	HashMap<Character, String> encoder = new HashMap<Character, String>();
	HashMap<String, Character> decoder = new HashMap<String, Character>();

	public hoffman(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		generic_heap<node> heap = new generic_heap<node>();
		for (Character ch : map.keySet()) {
			node nn = new node();
			nn.cost = map.get(ch);
			nn.ch = ch;
			heap.add(nn);
		}
		while (heap.size() != 1) {
			node f = heap.remove();
			node s = heap.remove();
			node merge = new node();
			merge.cost = f.cost + s.cost;
			merge.left = f;
			merge.right = s;
			heap.add(merge);

		}
		node last = heap.remove();
		fillencoderdecoder(last, "");
		System.out.println(encoder);
		System.out.println(decoder);
	}

	public void fillencoderdecoder(node n, String ans) {
		if (n.left == null && n.right == null) {

			encoder.put(n.ch, ans);
			decoder.put(ans, n.ch);
			return;

		}
		fillencoderdecoder(n.left, ans + "0");
		fillencoderdecoder(n.right, ans + "1");
	}

	public String encoder(String str) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			ans += encoder.get(ch);

		}
		return ans;
	}

	public String decoder(String str) {
		String ans = "";
		String key = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			key += ch;

			if (decoder.containsKey(key)) {
				ans += decoder.get(key);
				key = "";
			}

		}

		return ans;

	}
}
