package lec_21;

public class heapclient {

	public static void main(String[] args) {
		heap hp = new heap();
		int arr[] = { 5, 10, 2, 8, 7, 10 };
		for (int val : arr) {
			hp.add(val);
		}
		hp.display();
		System.out.println();
		for (int i = 0; i < arr.length; i++)
			System.out.println(hp.remove());
	}

}
