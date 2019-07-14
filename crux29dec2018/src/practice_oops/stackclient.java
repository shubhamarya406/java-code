package practice_oops;

import java.util.Scanner;

public class stackclient {

	public static void main(String[] args) throws Exception {
		stack s=new stack();
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		s.push(100);
		s.push(200);
		s.push(300);
		s.push(400);
		s.push(500);
		
//	s.push(800);
//	s.push(900);
		s.display();
		s.display();
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.pop();
		s.pop();
	//s.pop();
//	s.pop();
//		s.pop();
//		s.pop();
		s.display();
		
		
		

	}

}
