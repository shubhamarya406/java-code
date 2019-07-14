
public class pattern32 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int nst=1;
		 int nsp=row-1;
		while(row<=2*n-1)
		{
			int cst=1;
			while(cst<=nst)
			{
			 System.out.print("*");
			 cst++;
			}
			int csp=1;
			
			
			row++;
			if(row<=n-1) 
			{
				nst++;
			}
			else
				nst--;
			System.out.println();
		}
		

	}

}
