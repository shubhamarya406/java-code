package lec_13;

public class linkedclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      linkedlist list=new linkedlist();
      list.addLast(10);
      list.addLast(20);
      list.addLast(30);
      list.addLast(40);
      list.display();
      System.out.println(list.getat(2));
      System.out.println(list.getfirst());
      
	}

}
