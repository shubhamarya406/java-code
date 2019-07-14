package practice_oops.inheritance;

public class dq_client {

	public static void main(String[] args) throws Exception {
		dynamicqueue dq = new dynamicqueue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		dq.enqueue(60);
		dq.enqueue(70);
		// dq.display();
	//	reverse(dq, 0);
		int arr[]= {-2,3,-1,-8,6,-7,-10};
		firstnegative(arr,3);

	}

	public static void reverse(dynamicqueue dq, int count) throws Exception {
		if (count == dq.size())
			return;

		int temp = dq.dequeue();
		dq.enqueue(temp);
		reverse(dq, count + 1);
		System.out.println(temp);

	}

	public static void firstnegative(int[] arr, int k) throws Exception {
		dynamicqueue dq = new dynamicqueue();
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {
				dq.enqueue(i);
			}

		}
		for (int i = k; i < arr.length; i++) {

			if (dq.isempty()) {
				System.out.println(0);
			} else {
				System.out.println(arr[dq.getfront()]);
			}
			if (!dq.isempty() && dq.getfront() <= i - k) {
				dq.dequeue();
			}

			if (arr[i] < 0) {
				dq.enqueue(i);
			}
		}
		if (dq.isempty()) {
			System.out.println(0);
		} else {
			System.out.println(arr[dq.getfront()]);
		}
	}

}
