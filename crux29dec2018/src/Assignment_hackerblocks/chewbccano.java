package Assignment_hackerblocks;

import java.util.Scanner;

public class chewbccano {

	public static void main(String[] args) {

		Scanner scn=new Scanner (System.in);
		long n=scn.nextLong();
		long temp=n;
		int count=0;
		long ans=0;
		if(n!=9){
		while(temp!=0)
		{
			temp=temp/10;
			count++;
			
			
		}
		
		int a =(int)( n/Math.pow(10,count-1)) ; 
		int i=0;
		
		while(n!=0)
		{      
		 
			 int rem=(int)(n%10);
			 if(rem>=5)
		   rem=9-rem;
		  
		     
			   ans=(long)(ans + (Math.pow(10, i)*rem));
			n=n/10;
					i++;
		}
		if(a==9)
		System.out.println(a+""+ans);
		else
		System.out.println(ans);}
		else 
		System.out.println('0');

	}

	}

    

	
	}

	}


