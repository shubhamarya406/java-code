package Assignment_hackerblocks;
import java.util.Arrays;
import java.util.Scanner;
public class pranthas {
	
	public static void main(String[] args) {
	     @SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in); 
	      p =scn.nextInt() ; 
	     int c=scn.nextInt() ; 
	     int[] Array = new int[c] ; 
	     for(int j=0;j<c;j++)
	    	Array[j]=scn.nextInt() ; 
	     Arrays.sort(Array);
	     int recans = binary(Array,c,10*p*(p+1)/2);
	     System.out.println(recans); 
		}

		
			static int p ; 
			static int get_num(int a,int max)
			{
			    int d =(int) Math.pow((a*a + 8*a*max),0.5);
			    d-=a;
			    return d / (2*a);
			}
			static int check(int arr[],int cook,int m)
			{
			    int count = 0;
			    for(int i =0 ;i<cook;i++)
			    {
			        count += get_num(arr[i],m);
			        if(count >=p )
			            return 1;
			    }
			    return 0;
			}
			static int binary(int arr[],int cook,int max)
			{
			    int low = 1,m,high = max;
			    while(low<high)
			    {
			        m = (low+high)/2;
			        if(check(arr,cook,m)==1)
			            high = m;
			        else
			            low = m + 1;
			    }
			
			    return low;
			}

		

		

	}


