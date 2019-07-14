package lec_22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class generic_heap<T extends Comparable<T>> {
	HashMap<T, Integer> map = new HashMap<>();// for prims question in lec 24;
	ArrayList<T> data = new ArrayList<>();

	public void add(T item) {
		data.add(item);
		map.put(item, this.data.size() - 1);// for prims question in lec 24;
		upheapify(data.size() - 1);

	}

	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (islarger(data.get(ci), data.get(pi)) > 0) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private void swap(int i, int j) {
		T ith = data.get(i);
		T jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);
		map.put(jth, i);
		map.put(ith, j);
	}

	public T remove() {
		swap(0, data.size() - 1);
		T temp = data.remove(data.size() - 1);
		map.remove(temp);// for prims question in lec 24;
		downheapify(0);
		return temp;

	}

	private void downheapify(int pi) {
		int lc = (2 * pi) + 1;
		int rc = (2 * pi) + 2;
		int mini = pi;
		if (lc < data.size() - 1 && islarger(data.get(lc), data.get(mini)) > 0) {
			mini = lc;

		}
		if (rc < data.size() - 1 && islarger(data.get(rc), data.get(mini)) > 0) {

			mini = rc;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}
	}

	public boolean isempty() {
		return data.size() == 0;
	}

	public void display() {
		for (T val : data) {
			System.out.println(val);
		}
	}

	public T gethp() {
		return data.get(0);
	}

	public int islarger(T t, T o) {
		return t.compareTo(o);
	}

	public int size()

	{
		return this.data.size();
	}

//	@Override
//	public int compareTo(T o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	public void upheap(T t) {
		int si = map.get(t);
		upheapify(si);

	}
static int flag=1;
	public class pair implements Comparable<pair> {
		int x;
		int y;
		int rd;

		@Override
		public int compareTo(generic_heap<T>.pair o) {
			return  this.rd-o.rd;
		}

	}

	public void dean() {
		int tq = scn.nextInt();
		int k = scn.nextInt();
		while (tq > 0) {

			int ch = scn.nextInt();
			pair np = new pair();
			generic_heap<pair> hp = new generic_heap<pair>();
			if (ch == 1) {

				np.x = scn.nextInt();
				np.y = scn.nextInt();
				np.rd = (int) (Math.pow(np.x - 0,2) + Math.pow(np.y-0, 2));

				hp.add(np);
//				pair rp=new pair();
//				rp=hp.remove();
//				System.out.println(rp.rd);
//				hp.add(rp);

			} else {
				pair rp = new pair();
				
				while (k > 1) {
					//System.out.println(rp.rd);
					flag=0;
					rp = hp.remove();
					hp.add(rp);
					System.out.println(flag);
					hp.add(rp);
					k--;

				}
				
				System.out.println(hp.remove());

			}

		}

	}

	static Scanner scn = new Scanner(System.in);
	public static   void main  (String args[]) {
	
   generic_heap  hp=new generic_heap<>();
   hp.dean();
	}
}
