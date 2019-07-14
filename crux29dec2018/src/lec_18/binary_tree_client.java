package lec_18;

public class binary_tree_client {

	public static void main(String[] args) {

		// 10 true 20 true 40 false false true 50 false false true 30 false true 70 false false
		// 
		// 10 true 20 true 40 true 80 true 90 true 100 true 110 false false false false
		// false true 50 false true 120 false true 130 false true 140 false false true
		// 30 true 60 false false true 70 false false
//10 true 20 true 30 false false false false
		
		binary_tree bt = new binary_tree();
		//10 true 20 true 30 false false true 50 false false true 40 true 60 false false true 73 false false
		//bt.display();
//		System.out.println(bt.size());
//		System.out.println(bt.find(90));
	//	System.out.println(bt.ht());
	//System.out.println(bt.diameter());
//		System.out.println(bt.diameter2());
//	System.out.println(bt.isbalanced());
	//	bt.preorder();
		//bt.lowestcommon(50,60);
		//bt.leafsum(60);
		bt.pvertical();

	}

}
