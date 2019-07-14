package Assignment_hackerblocks;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_Sorted {

	public static void main(String[] args) {
		Scanner  scn=new Scanner(System.in);
	int cc=scn.nextInt();
	int cr=scn.nextInt();
	int er=scn.nextInt();
	int ec=scn.nextInt();
//		int arr[]=new int[n];
//for(int i=0;i<arr.length;i++)
//	arr[i]=scn.nextInt();
//int vidx=0;
//int n=scn.nextInt();
int si=0;
String str="1234";
//System.out.print(sort(arr,si));
//System.out.println(first(arr,item,vidx));
//int arr1[]=alloccurence(arr, item, vidx, ct);
//for(int i=0;i<arr1.length;i++)
//{
//	System.out.print(arr1[i]);
//}
//		String str="abc";
//	System.out.println(permutation(str));
//System.out.println(boardpath(si,ei));
//System.out.println(maizepath(hi, vi, he, ve));
//System.out.println(maizepathdiag(hi, vi, he, ve));
System.out.println(maizemultipath(cc, cr, er, ec));
//System.out.println(toss(n));
	}
public static boolean sort(int []arr,int si)
    { if(si==arr.length-1)
    {
    	return true;
    	
    }
    	if(arr[si]>arr[si+1])
    	{
    		return false;
    	   
    	}
    boolean bn=	sort(arr,si+1);
    	
    	if(bn)
    		return true;
    	else
    		return false;
    	
    	
    	
    }
public static int first(int arr[],int item,int vidx)
{if(vidx==arr.length)
	return -1;
	
		
	int pos=first(arr,item,vidx+1);
	
		if(arr[vidx]==item&&pos==-1)
			return vidx;
		
	
	else
		return pos;
	
}
public static int[] alloccurence(int []arr,int item,int vidx,int ct)
{
	if(vidx==arr.length)
	{
		int arr1[]=new int[ct];
	  return arr1;
	}
	
	
	if(arr[vidx]==item)
	
		ct++;
		
		int arr1[]=alloccurence(arr, item, vidx+1, ct);
		for(int i=0;i<ct;i++)
		{
		if(arr[vidx]==item)
		{
			arr1[i]=vidx;
			
		}
	
		}
		return arr1;
}
public static ArrayList<String> permutation(String str)
{
	
	if(str.length()==0)
	{
		
		ArrayList<String> br=new ArrayList<>();
		br.add("");
		return br;
	}
	char ch=str.charAt(0);
	String res=str.substring(1);
	ArrayList<String> rr=permutation(res);
	ArrayList<String> mr=new ArrayList<>();
	for(String val:rr)
	{
		for(int i=0;i<=val.length();i++)
		{
			mr.add(val.substring(0, i)+ch+val.substring(i));
			
		}
		
	}
	return mr;
	
}
public static ArrayList<String> boardpath(int si,int ei)
{ if(si==ei)
{
	ArrayList br=new ArrayList<>();
	br.add("");
	return br;
	
}
	if(si>ei)
	{
		
		ArrayList br=new ArrayList<>();
		return br;
		
	}
	
	
	ArrayList<String> mr=new ArrayList<>();
		
			for(int i=1;i<6;i++)
			{ArrayList<String>rr=boardpath( si+i,ei);
				for(String val:rr) {
				
				
				
				mr.add(val+i);
				
			}
			
		
	}
	return mr;
}
public static ArrayList<String> maizepath(int hi,int vi,int he,int ve)
{
	if(hi==he&&vi==ve)
	{
		
		ArrayList<String> br=new ArrayList<>();
		br.add("");
		return br;
	}
	if(hi>he||vi>ve)
	{
		ArrayList<String> br=new ArrayList<>();
		
		return br;
		
	}
	ArrayList<String> mr=new ArrayList<>();
	ArrayList<String> rr=maizepath(hi+1, vi, he, ve);
	for(String val:rr)
	{
		mr.add(val+'h');
		
	}
	
	rr=maizepath(hi, vi+1, he, ve);
	for(String val:rr)
	{
		mr.add(val+'v');
		
	}
	
	
	return mr;
	
	
}
public static ArrayList<String>maizepathdiag(int cc,int cr,int er,int ec)
{
	if(cc==ec&&cr==er)
	{
		
		ArrayList<String> br=new ArrayList<>();
		br.add("");
		return br;
	}
	if(cc>ec||cr>er)
	{
		ArrayList<String> br=new ArrayList<>();
		
		return br;
		
	}
	
	
	ArrayList<String> mr=new ArrayList<>();
	ArrayList<String> rr=maizepathdiag(cc+1, cr, er, ec);
	for(String val:rr)
	{
		mr.add(val+'h');  
		
	}
	
	rr=maizepathdiag(cc, cr+1, er, ec);
	for(String val:rr)
	{
		mr.add(val+'v');
		
	}
	
	rr=maizepathdiag(cc+1,cr+1,er,ec);
	for(String val:rr)		
	{
		
		mr.add(val+'d');
			}
	return mr;
	
}
public static ArrayList<String>maizemultipath(int cc,int cr,int er,int ec)
{
	if(cc==ec&&cr==er)
	{
		
		ArrayList<String> br=new ArrayList<>();
		br.add("");
		return br;
	}
	if(cc>ec||cr>er)
	{
		ArrayList<String> br=new ArrayList<>();
		
		return br;
		
	}
	
	
	ArrayList<String> mr=new ArrayList<>();
	for(int i=1;i<=ec-cc;i++)
	{
	ArrayList<String> rr=maizemultipath(cc+i, cr, er, ec);
	for(String val:rr)
	{
		mr.add(val+'h'+i);  
		
	}
	}
	for(int i=1;i<=er-cr;i++)
	{
		ArrayList<String> rr=maizemultipath(cc, cr+i, er, ec);
	for(String val:rr)
	{
		mr.add(val+'v'+i);
		
	}
	}
	for(int i=1;i<=er-cr&&i<=ec-cc;i++)
	{
	ArrayList<String>rr=maizemultipath(cc+i,cr+i,er,ec);
	for(String val:rr)		
	{
		
		mr.add(val+'d'+i);
			}
	}
	return mr;
	
	
}
public static ArrayList<String>toss(int n)
{
	if(n==0)
{
		
		ArrayList<String> br=new ArrayList<>();
		br.add("");
		return br;
	}
	ArrayList<String> mr=new ArrayList<>();
	ArrayList<String> rr=toss(n-1);
	for(String val:rr)
	{
		
		mr.add(val+'h');
		System.out.println("*"+val);
		System.out.println(mr);
		mr.add(val+'t');
		System.out.println("*"+val);
		System.out.println(mr);
	}
	return mr;
}

}