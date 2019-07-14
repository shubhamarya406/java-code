package L2dec;

import java.util.Scanner;

public class rotate {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int rot = scn.nextInt();
		int count = 0;
	
		int ans = 0;
		int temp = n;
		for (temp = n; temp != 0;) {
			temp = temp / 10;
			count++;

		}

		rot = rot % count;
		if (rot < 0)
			rot = rot + count;

		int front = n % (int) Math.pow(10, rot);
		int back = n / (int) Math.pow(10, rot);

		ans = front * (int) Math.pow(10, count - rot) + back;
		System.out.println(ans);

	}

}
