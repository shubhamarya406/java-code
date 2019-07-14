package Assignment_hackerblocks;

import java.util.Scanner;

public class generate_sorted_arrays {

	public static void main(String[] args) {
		Scanner   scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=scn.nextInt();
		}
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=scn.nextInt();
		}
		
	}
		public static void generate_arrays(int[] arr1,int arr2[],int temp[],int []fa,int flag,int i,int j,int len,int maxi,int maxj,int nc)
		{
			if(flag%2!=0)
			{   if(maxj>arr1[i])
			{
				temp[len]=arr1[i];
				fa[nc]=temp[len];
				flag=flag+1;
				len=len+1;
				nc=nc+1;
				maxi=arr1[i];
				
			}
			}
			if(flag%2==0)
			{
				if(maxi>arr2[j])
				{
				temp[len]=arr2[j];
				fa[nc]=temp[len];
				display(temp);
				flag=flag+1;
				len=len+1;
				nc=nc+1;
				maxj=arr2[j];
				}
				
			}
			if(flag%2!=0)
				generate_arrays(arr1,arr2,temp,fa,flag,i=i+1,j,len,maxi,maxj,nc);
			if(flag%2==0)
		  generate_arrays(arr1,arr2,temp,fa,flag,j=j+1,j,len,maxi,maxj,nc)	;
			
}
		public static void display(int ans[])
		{
			
			for(int i=0;i<ans.length;i++)
				System.out.println(ans[i]+" ");
			System.out.println();
		}
		public static void check(int[] fp,int temp[])
		{
			
			for(int i=0;i<fp.length;i++)
			{
				if(fp[i]==temp[i]&&fp[i+1]==temp[i+1])
				{
					
				}
			}
		}
}
