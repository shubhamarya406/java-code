package ASSIGNMENT_HACKERBLOCKS;

import java.util.Scanner;

public class basealculaeor {

	public static void main(String[] args) {
		
	
	



				Scanner scn = new Scanner(System.in);
				int n3=0;
				char ch=scn.next().charAt(0);

				while(ch!='x'||ch!='X')
					
				{
				 
				
				 if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%')
				 {
					 int n1=scn.nextInt();
					int n2=scn.nextInt();
					
					
						if(ch=='+')
						{ 
					         n3=n1+n2;
						 
							System.out.println(n3);
							}
						if(ch=='-') 
						   {
							n3=n1-n2;
							System.out.println(n3);
							}
						if(ch=='*')
						{
							n3=n1*n2;
						     System.out.println(n3);
						     }
						if(ch=='/') 
						{if(n2!=0)
						{
							n3=n1/n2;
						     System.out.println(n3);
						}
						     }
						if(ch=='%') 
						{ if(n2!=0)
						{
							n3=n1%n2;
						    System.out.println(n3);
						}
						    }
						
				
				 }
				 else if{
				 if(ch=='x'||ch=='X')
						System.exit(0);
				 }
						
		else
					System.out.println("Invalid operation. Try again.");
				 
				 ch=scn.next().charAt(0);
			}
				
		}
		

	}


