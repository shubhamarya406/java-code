package crux29dec2018;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int nsp = n - 1;
		int nst = 1;
		
		while (n != 0) {
			int csp=0;
			while (csp<nsp) {
				System.out.print(" ");
				
				csp++;
			}
			int cst=1;

				while (cst <= nst) {
					System.out.print("*");
                    cst++;
					
					
					
				}
				System.out.println();
				nst = nst + 2;
				nsp = nsp - 1;
			
			n = n - 1;
		}

	}

}
