package ASSIGNMENT_HACKERBLOCKS;

public class Snippet {
	Scanner scn=new Scanner (System.in);	
	    int n=scn.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=scn.nextInt();
	    	
	    }
	    int t=scn.nextInt();
	    int sum=0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	for(int j=i+1;j<arr.length;j++)
	    	{ sum=arr[i]+arr[j];
	    		if(t==sum)
	    		{
	    			System.out.println(arr[i]+" and "+arr[j]);
	    			
	    		}
	    	}
	    	
	    }
		
		}
	
	}
	
}

