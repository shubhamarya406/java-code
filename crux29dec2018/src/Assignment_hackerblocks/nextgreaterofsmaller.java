package Assignment_hackerblocks;

import java.util.Scanner;

public class nextgreaterofsmaller {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int arr[] = new int[n];
			int s = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}

			int flag = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				s = arr[i];
				flag = 0;

				for (int j = i + 1; j < arr.length - 1; j++) {
					if (arr[j] > arr[i]) {
						int l = arr[j];
						for (int k = j + 1; k < arr.length; k++)

						{
							if (l < arr[k]) {
								System.out.print(arr[k]);
								flag = flag + 1;
								break;
							}

						}
						flag = flag + 1;
						break;
					}

				}
				if (flag == 0) {
					System.out.print(-1);
				}
			}
			t--;
		}

	}
}