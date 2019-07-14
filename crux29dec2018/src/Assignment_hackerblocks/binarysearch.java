package Assignment_hackerblocks;

public class binarysearch {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
				
		
		System.out.println(binarysearch(arr, 40));
		
	}
	public static int binarysearch(int[]arr,int item) {
		int l=0,h=arr.length-1;
	
		while(l<h)
		{
			
			int mid=(l+h)/2;
	   if(item<arr[mid])
	   {
		   h=mid-1;
	   }
	   else if(item>arr[mid])
	   {
		   l=mid+1;
	   }
	   else {
		   return mid;
	   }
	  
      
		}
		 return -1;


}
}
