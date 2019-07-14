package practice_oops.inheritance;

import practice_oops.queue;

public class dynamicqueue extends queue {

	public void enqueue(int item) throws Exception {
		if (isfull()) {

			int[] nq = new int[this.data.length * 2];
			for (int i = 0; i < this.data.length; i++) {
				int id = (i + this.front) % this.data.length;
				nq[i] = this.data[id];
			}
			this.front = 0;
			this.data = nq;
		}
		super.enqueue(item);

	}

}
