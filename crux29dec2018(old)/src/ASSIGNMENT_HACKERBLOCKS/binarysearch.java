package ASSIGNMENT_HACKERBLOCKS;

public class binarysearch {

	public static void main(String[] args) {
		
		
	}
	public static int binarysearch(int[]arr,int item) {
		int l=0,h=arr.length-1;
	
		while(l<=h)
		{
			
			int mid=(l+h)/2;
	   if(item<mid)
	   {
		   h=mid-1;
	   }
	   else if(item>mid)
	   {
		   l=mid+1;
	   }
	   else {
		   return mid;
	   }
	   return -1;
      
		}
		


}
}
