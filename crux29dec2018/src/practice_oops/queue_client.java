package practice_oops;

import java.util.Scanner;

public class queue_client {

	public static void main(String[] args) throws Exception {
		//Scanner scn=new Scanner(System.in);
		//int n=scn.nextInt();
		
		queue q=new queue();
		q.enqueue(100);
		q.enqueue(200);
		q.enqueue(300);
		q.enqueue(400);
		q.enqueue(500);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		//q.display();
		q.enqueue(7000);
		q.enqueue(8000);
		q.enqueue(9000);
	q.dequeue();
	q.enqueue(10000);
		
		q.display();

	}

}
