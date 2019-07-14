
public class patterns {

	public static void main(String[] args) {
		int n=5;
		int nst=1;
		int nsp=n-1;
		int row=1;
		while(row<=2*n-1)
		{
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}int cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			row++;
			nsp--;
			if(row<=n-1)
			{
				nst=nst+1;
				nsp=nsp-1;
			}
			else {
				nst=nst-1;
				nsp=nsp+1;
			}
			System.out.println();
		}
		
	}
	}


