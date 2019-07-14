package lec_19;

import java.util.Arrays;

public class bst_client {

	public static void main(String[] args) {
		int In[]= {4,3,5};
	bst b=new bst();
		Arrays.sort(In);
		b.construct(In);
		
//		for(int i=0;i<In.length;i++)
//		{
//			System.out.println(In[i]);
//		}
//		b.printinrange(30, 60);
//		System.out.println("---");
//		b.dec();
		b.replacewith();
	b.display();
	//b.preorder();
//	
		
		

	}

}
