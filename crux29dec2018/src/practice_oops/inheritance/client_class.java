package practice_oops.inheritance;

public class client_class {

	public static void main(String[] args) {
   p ref=new p();
  System.out.println(ref.d);
  System.out.println(ref.d1);
  ref.fun();
  ref.fun1();
  
  
  System.out.println("case 2");
  p ref1=new c();
  
  System.out.println(((c)ref1).d2);
  
	}

}
