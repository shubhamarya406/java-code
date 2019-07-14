package Assignment_hackerblocks;

import java.util.Scanner;

public class minimum_no {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();
		while(t>0)
		{
		String str=scn.next();
        min(str);
        t--;
		}
	}

	public static void min(String str) {
		int ct = 1;
		int arr[] = new int[str.length() + 1];
		for (int i = 0; i <=str.length(); i++) {
			
			if (i == str.length() ||str.charAt(i) == 'I') {
				arr[i] = ct;
				ct++;
				
			
				for (int j = i - 1; j >=0 && str.charAt(j) != 'I'; j--) {
					arr[j] = ct;
					ct++;

				}

			}
		}
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.print(arr[i]);
     }
     System.out.println();
		}

	}


