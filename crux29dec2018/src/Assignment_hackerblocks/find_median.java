package Assignment_hackerblocks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class find_median {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=scn.nextInt();
		}
  int m=scn.nextInt();
 int   arr2[]=new int[m];
  for(int j=0;j<m;j++)
  {
	  arr2[j]=scn.nextInt();
  }
  ArrayList<Integer> list=new ArrayList<>();
  for(int i=0;i<arr1.length;i++)
  {
	  list.add(arr1[i]);
  }
  for(int j=0;j<arr2.length;j++)
  {
	  list.add(arr2[j]);
  }
  Collections.sort(list);
  System.out.println(list);
  if(list.size()%2==0)
  {
	int rem= list.size()/2;
//	System.out.println(list.get(rem)+" "+list.get(rem-1));
	double fp=list.get(rem);
	double sp=list.get(rem-1);
	double median=(fp+sp)/2;
	System.out.println(median);
	//sysSystem.out.println((list.get(rem)+list.get(rem-1))/2+"##");
	//System.out.println(0);
  }
  else
  {
	  System.out.println(list.get(list.size()/2));
	  System.out.println(1);
  }
	}

}
