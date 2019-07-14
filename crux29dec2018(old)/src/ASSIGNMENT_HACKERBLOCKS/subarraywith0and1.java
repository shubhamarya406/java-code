package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class subarraywith0and1 {
	// static Scanner scn=new Scanner(System.in);

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		int i = 0;
		
		
		 
		while (t != 0) {
			int count0 = 0, count1 = 0;
			int n = scn.nextInt();
			int news = 0, nos = 0;
			int j = 0;
			int li = -1;
			int arr[] = new int[n];
			int l = arr.length;
			for (i = 0; i < l; i++) {
				arr[i] = scn.nextInt();

				if (arr[i] == 1) {
					count1++;
				} else {
					count0++;
				}
				// System.out.print(" ");
			}
			nos = count0 + count1;
			for (i = 0; i < arr.length; i++) {
				if (count1 > count0)
					count1--;
				else if (count0 > count1)
					count0--;
				else
					break;
			}
			int flag=0;
			if (count1 == 0 || count0 == 0)
				System.out.println("None");
			else {
				 
				for (i = 0; i < arr.length; i++) {
					if (arr[i] == 0 && flag == 0)
					{
						
						li++;
						
					}
					else  {
						flag=1;
						if (count1 > 0) {
							if (flag == 1)
								
							{
								j = i;
							}
							
							arr[i] = 1;
							count1--;
							flag++;
							li++;
						} else if(count0>0)
						{
							arr[i] = 0;
							count0--;
							flag++;
							li++;
						}
						else
							break;
					}
       
				}
    System.out.print(j+" "+li);
			}
			t--;
		}
	}
}
