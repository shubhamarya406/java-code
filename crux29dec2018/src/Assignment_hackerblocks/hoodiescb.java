package Assignment_hackerblocks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class hoodiescb {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Queue<Integer>> q = new ArrayList<>();
		for (int i = 0; i <= 4; i++) {
			q.add(new LinkedList<>());
		}
		ArrayList<Integer> course = new ArrayList<>();
		while (n > 0) {
			char ch = scn.next().charAt(0);

			if (ch == 'E') {
				int cno=scn.nextInt();
				int rno=scn.nextInt();
					q.get(cno).add(rno);
					if(!course.contains(cno))
					{
						course.add(cno);
					}
					
				
				

			} else {

			System.out.println(course.get(0)+" "+q.get(course.get(0)).remove());
			if(q.get(course.get(0)).isEmpty())
			{
				course.remove(0);
			}
				
			}
n--;
		}
	}
}
