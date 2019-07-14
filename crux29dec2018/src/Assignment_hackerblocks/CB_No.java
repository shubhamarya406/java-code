package Assignment_hackerblocks;

import java.util.Scanner;

public class CB_No {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		scn.nextInt();
		String str = scn.next();
		int ct = 0;
		boolean visited[] = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {

			for (int si = 0; si <= str.length() - len; si++) {

				int ei = si + len;
				String s = str.substring(si, ei);
				if (isvisited(visited, si, ei) && iscbno(Integer.valueOf(s))) {
					ct++;
					for (int i = si; i < ei; i++) {
						visited[i] = true;
                        }

				}

			}

		}
		System.out.println(ct);
	}

	public static boolean iscbno(int cb) {
		int arr[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		if (cb == 0 || cb == 1)
			return false;
		for (int i = 0; i < arr.length; i++) {
			if (cb == arr[i])
				return true;
			if (cb % arr[i] == 0)
				return false;
			

		}

		return true;
	}

	public static boolean isvisited(boolean[] visited, int si, int ei) {
		for (int i = si; i < ei; i++) {
			if (visited[i] == true)
				return false;
		}
		return true;
	}
}
