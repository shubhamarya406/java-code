package lec_23;

public class segment_client {

	public static void main(String[] args) {
		segment_tree st=new segment_tree();
		int arr[]= {5,2,10,3,-6,-4,12,13};
		st.construct(arr,new  segment_treesum());
		st.display();
		System.out.println(st.query(0,2));
		System.out.println(st.query(3, 3));
		st.update(3,10);
		
		System.out.println("----------");
		st.display();
		System.out.println(st.query(3, 3));
				
		}
	

	}


