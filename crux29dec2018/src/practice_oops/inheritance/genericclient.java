package practice_oops.inheritance;

public class genericclient {

	public static void main(String[] args) {
		//10 3 20 2 50 0 60 0 30 1 70 0 40 2 80 0 90 0
		generic_trees gt=new generic_trees();
		gt.display();
		System.out.println(gt.size());
		//System.out.println(gt.size());
		System.out.println(gt.max());
		System.out.println(gt.find(900));
		System.out.println(gt.sum());

	}

}
