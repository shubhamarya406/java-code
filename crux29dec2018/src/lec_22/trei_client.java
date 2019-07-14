package lec_22;

public class trei_client {

	public static void main(String[] args) {
		Trei trei=new Trei();
		trei.addword("been");
		trei.addword("bee");
		trei.addword("bea");
		trei.addword("bean");
		trei.addword("beens");
		trei.display();
		System.out.println(trei.search("bea"));
		trei.remove("bean");
		trei.display();
		

	}

}
