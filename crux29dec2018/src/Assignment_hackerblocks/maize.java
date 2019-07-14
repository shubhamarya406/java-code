package Assignment_hackerblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class maize {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int erow = scn.nextInt();
		int ecol = scn.nextInt();
		int crow = scn.nextInt();
		int ccol = scn.nextInt();
		System.out.println(maize(crow, ccol, erow, ecol));

	}

	public static ArrayList<String> maize(int crow, int ccol, int erow, int ecol) {
		if (crow == erow && ccol == ecol) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;

		}
		if (crow > erow || ccol > ecol) {

			ArrayList<String> br = new ArrayList<>();

			return br;

		}
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = maize(crow + 1, ccol, erow, ecol);
		for (String val : rr) {
			mr.add(val + "v");

		}
		rr = maize(crow, ccol + 1, erow, ecol);
		for (String val : rr) {
			mr.add(val + "h");

		}
		return mr;
	}
}
