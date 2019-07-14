package lec_22;

import java.util.ArrayList;

//import lec_20.car;
//import lec_21.heap;

public class generic_heap_client {
//
//	public static void main(String[] args) {
//		car[] cars = new car[5];
//		cars[0] = new car(10, 200, "Black");
//		cars[1] = new car(20, 100, "Green");
//		cars[2] = new car(30, 300, "red");
//		cars[3] = new car(150, 400, "Blue");
//		cars[4] = new car(70, 500, "Grey");
//		generic_heap<car> gp = new generic_heap<>();
//		for (int i = 0; i < cars.length; i++)
//
//		{
//			gp.add(cars[i]);
//		}
//		while (!gp.isempty()) {
//			System.out.println(gp.remove());
//		}
//		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
//
//		lists.add(new ArrayList<>());
//		lists.add(new ArrayList<>());
//		lists.add(new ArrayList<>());
//		lists.add(new ArrayList<>());
//
//		lists.get(0).add(1);
//		lists.get(0).add(8);
//		lists.get(0).add(9);
//		lists.get(0).add(10);
//		lists.get(0).add(12);
//
//		lists.get(1).add(5);
//		lists.get(1).add(15);
//		lists.get(1).add(20);
//
//		lists.get(2).add(7);
//		lists.get(2).add(13);
//		lists.get(2).add(25);
//		lists.get(2).add(30);
//
//		lists.get(3).add(2);
//		lists.get(3).add(3);
//
//		System.out.println(lists);
//		ArrayList<Integer> ans=merge_sorted(lists);
//		for(Integer val:ans)
//		{
//			System.out.print(val);
//		}
//
//	}

	public static class pair implements Comparable<pair> {
		int item;
		int ith;
		int lno;

		@Override
		public int compareTo(pair o) {
			return o.item - this.item;
		}

	}

	public static ArrayList<Integer> merge_sorted(ArrayList<ArrayList<Integer>> list) {
		generic_heap<pair> hp = new generic_heap<>();
		pair np = new pair();
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			np.item = list.get(i).get(0);
			np.lno = i;
			np.ith = 0;
			hp.add(np);

		}

		while (!hp.isempty()) {
			pair rp = new pair();
			rp = hp.remove();
			ans.add(rp.item);
			rp.ith++;

			if(rp.ith < list.get(rp.lno).size()) {
			np.item = list.get(np.lno).get(np.ith);
			hp.add(rp);
			}

		}
		return ans;
	}

}
