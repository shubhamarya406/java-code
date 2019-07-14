package Assignment_hackerblocks;

import java.util.Scanner;

public class phone {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		int cta = 0;
		int cth = 0;
		int suma=0;
		int sumh=0;
		int a=0;
		int b=0;
		String f2 = "Aayush";
		String f1 = "Harshit";
		while (t > 0) {
			int m = scn.nextInt();
			int n = scn.nextInt();
			while (suma <=m &&sumh <= n) {

				if (cta > cth) {
					cth = cta +1;
					a=cth+sumh;
					
					if(a<=m)
					sumh=sumh+cth;
				} else {
					cta = cth + 1;
					b=cta+suma;
					if(b<=n)
					suma=suma+cta;
				}
			}
			if (suma>sumh) {
				System.out.println(f2);

			} else

			{
				System.out.println(f1);
			}

			t--;

		}

	}

}
