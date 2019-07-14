package crux29dec2018;

import org.omg.Messaging.SyncScopeHelper;

public class Gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divident = 40;
		int divisor = 64;
		int rem;
		while (divident % divisor != 0) {
			rem = divident % divisor;
			divident = divisor;
			divisor = rem;

		}
		System.out.println(divisor);
	}

}
