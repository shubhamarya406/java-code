package practice_oops.inheritance;

import lec_20.car;

public class linkedclient {

	public static void main(String[] args) throws Exception {
		li8nked_list list=new li8nked_list();
		car[] cars = new car[5];
		cars[0] = new car(10, 200, "Black");
		cars[1] = new car(20, 100, "Green");
		cars[2] = new car(30, 300, "red");
		cars[3] = new car(150, 400, "Blue");
		cars[4] = new car(70, 500, "Grey");
		list.addatlast(cars[0]);
		list.addatlast(cars[0]);
		list.addatlast(cars[0]);
		list.addatlast(cars[0]);
	      list.display();

//System.out.println(list.getlast());
//System.out.println(list.getfirst());
//System.out.println(list.getat(1));
//list.addat(50, 2);
//list.display();
//list.addfirst(15);
//list.display();
//list.addatlast(45);
//list.display();
//System.out.println(list.removefirst());
//System.out.println(list.removelast());
//System.out.println(list.removeat(2));
//list.reversedata();
//list.display();
//list.reversepointer();
//list.display();
//list.reversepointerrec();
//list.display();
//list.reversedatarec();
//list.display();
//list.reversedatarec2();
//list.display();
//list.fold();
//list.display();
//System.out.println(list.mid());
//	System.out.println(list.kthfromlast(3)); 
//	list.kreverse(2);
//	list.display();
//	}
	      
	 list.mergesort();
	 list.display();
	}
}
