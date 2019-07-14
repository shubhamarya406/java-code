package lec_21;

import java.util.ArrayList;
import java.util.Scanner;

public class heap {
	ArrayList<Integer> data = new ArrayList<>();

	public void add(int item) {
		data.add(item);
		upheapify(data.size() - 1);

	}

	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (data.get(pi) > data.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private void swap(int i, int j) {
		int ith = data.get(i);
		int jth = data.get(j);
		data.set(i, jth);
		data.set(j, ith);
	}

	public int remove() {
		swap(0, data.size() - 1);
		int temp = data.remove(data.size() - 1);
		downheapify(0);
		return temp;

	}

	private void downheapify(int pi) {
		int lc = (2 * pi) + 1;
		int rc = (2 * pi) + 2;
		int mini = pi;
		if (lc < data.size() - 1 && data.get(lc) < data.get(mini)) {
			mini = lc;

		}
		if (rc < data.size() - 1 && data.get(rc) < data.get(mini)) {

			mini = rc;
		}
		if (mini != pi) {
			swap(mini, pi);
			downheapify(mini);
		}
	}

	public boolean isempty() {
		return data.size() == 0;
	}

	public void display() {
		for (int val : data) {
			System.out.println(val);
		}
	}

	public int gethp() {
		return data.get(0);
	}
	
}
