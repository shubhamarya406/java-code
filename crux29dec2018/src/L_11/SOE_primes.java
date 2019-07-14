package L_11;

import java.util.Arrays;

public class SOE_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
primes(25);
	}

	public static void primes(int n) {
		boolean arr[] = new boolean[n + 1];
		Arrays.fill(arr, true);
		arr[0] = false;
		arr[1] = true;

		for (int table = 2; table * table <= n; table++) {
			if (arr[table] == false) {
				continue;
			}
			for (int multip = 2; multip * table < n; multip++)
				arr[multip * table] = false;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true) {

				System.out.println(i);
			}
		}
	}
}
