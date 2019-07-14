package Assignment_hackerblocks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class hostelmait {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ; 
        int q = scn.nextInt() ; 
        int k = scn.nextInt() ; 
        ArrayList<Integer> ma=new ArrayList<>();
        while(q>0)
        {
        
        	int ch=scn.nextInt();
        	if(ch==1)
        	{
        		int x=scn.nextInt();
        		int y=scn.nextInt();
        		int da=(int) (Math.pow(x, 2)+Math.pow(y, 2));
        		ma.add(da);
        		q--;
        		
        		
        		
        	}
        	
        	else
        	{
        		Collections.sort(ma);
        		System.out.println(ma.get(k-1));
        		q--;
        		
        	}
        	
        	
        	
        }
	}

}
