package practice_oops;

public class queue {

	protected int size;
	protected int front;
	protected int data[];

	public queue() {
		this.data = new int[5];
		this.front = 0;
		this.size = 0;
	}

	public queue(int n) {
		this.data = new int[n];
		this.front = 0;
		this.size = 0;

	}

	public void enqueue(int item) throws Exception {
		if (isfull())
			throw new Exception("queue is full");

		int ni = (this.front + this.size) % this.data.length;
		this.data[ni] = item;
		this.size++;

	}

	public int dequeue() throws Exception {
		if (isempty())
			throw new Exception("queue is empty");
		
		int val = this.data[this.front];
		this.data[this.front] = 0;
		this. front = (this.front+1) % this.data.length;
		
	    this.size--;
		return val;
	}

	public boolean isfull() {
		return this.size == this.data.length;

	}

	public boolean isempty() {
		return this.size == 0;
	}

	public void display() {
		for (int i = 0; i < this.size; i++) {
			int ni = (i + this.front) % this.data.length;
			System.out.print(data[ni] + " ");
		}
	}
	public int size()
	{
		return this.size--;
		
	}
	public int getfront() throws Exception
	{
		if(isempty())
		{
			throw new Exception("queue is full");
		}
		int val=this.data[this.front];
		return val;
	}
}
