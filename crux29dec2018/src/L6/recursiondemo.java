package L6;

import java.util.Scanner;

public class recursiondemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	//	int vidx = 0;
	//	int item = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextInt();
		//int max = arr[0];
		// int x = scn.nextInt();
		// pid(n);
		// System.out.println(add());
		// System.out.println(power(n, x));
		// System.out.println(fibonacci(n));

		// System.out.println(firstoccurence(arr,vidx,item));
	//	int count = 0;
		int si=0;
		// wdcxsavsc System.out.println(maximum(arr, max, vidx));
	//	System.out.println(alloccurence(arr, item, vidx, count));
System.out.println(sort(arr,si));
	}

	public static void pid(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		pid(n - 1);
		System.out.println(n);

	}

	public static int add() {
		int sum = 5 + 6;
		return sum;
	}

	public static int power(int n, int x) {
		int pow;
		if (x == 0)
			return 1;

		pow = power(n, (x - 1));
		int fpow = pow * n;
		return fpow;

	}

	public static int fibonacci(int n) {
		if (n == 0 || n == 1)
			return n;
		int fbn1 = fibonacci(n - 1);
		int fbn2 = fibonacci(n - 2);
		int fn = fbn1 + fbn2;
		return fn;

	}

	public static int firstoccurence(int arr[], int vidx, int item) {
		if (vidx == arr.length)
			return -1;
		if (item == arr[vidx])
			return vidx;
		int x = firstoccurence(arr, (vidx + 1), item);
		return x;

	}

	public static int lastoccurence(int[] arr, int vidx, int item) {
		if (vidx == arr.length)
			return -1;

		int rec = lastoccurence(arr, vidx + 1, item);
		if (rec == -1 && item == arr[vidx])
			return vidx;
		return rec;

	}

	public static int maximum(int[] arr, int max, int vidx) {
		if (vidx == arr.length)
			return max;
		if (arr[vidx] > max) {
			max = arr[vidx];
		}
		return maximum(arr, max, vidx + 1);

	}

	public static int[] alloccurence(int[] arr, int item, int vidx, int count) {

		if (vidx == arr.length) {
			int arr1[] = new int[count];
			return arr1;
		}
		if (item == arr[vidx]) {
//			count = count + 1;
			int arr2[] = alloccurence(arr, item, vidx + 1, count + 1);
			arr2[count] = vidx;
			return arr2;
		} else {
			int arr2[] = alloccurence(arr, item, vidx + 1, count);
			return arr2;
		}

//		if (item == arr[vidx]) {
//			arr2[count] = vidx;
//			return arr2;
//
//		} else
//			return arr2;
	}

    public static boolean sort(int []arr,int si)
    { if(si==arr.length-1)
    {
    	return true;
    	
    }
    	if(arr[si]>arr[si+1])
    	{
    		return false;
    	   
    	}
    boolean bn=	sort(arr,si+1);
    	
    	if(bn)
    		return true;
    	else
    		return false;
    	
    	
    	
    }




}