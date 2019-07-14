package lec_20;

import java.util.ArrayList;
import java.util.HashMap;

public class Hash_map {

	public static void main(String[] args) {
//enter the value and call the functions;
		int arr[]= {2,12,9,16,10,5,3,20,25,11,1,8,6};
		largeconcurrentseq(arr);
		}
	

	public static char Highestfreqchar(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		int i = 0;
		// int max=Integer.MIN_VALUE;
		while (i == str.length() - 1) {
			char ch = str.charAt(i);
			// String ros = str.substring(1);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
			i++;
		}
		int max = 0;
		char maxfreq = ' ';
		for (Character ch : map.keySet()) {
			int val = map.get(ch);
			if (val > max) {
				max = val;
				maxfreq = ch;
			}
		}
		return maxfreq;
	}

	public static ArrayList<Integer> Intersection(int[] one, int[] two) {
		int i = 0;
		ArrayList<Integer> mr = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		while (i < one.length) {
			int val = one[i];
			// String ros = str.substring(1);
			if (map.containsKey(val)) {
				map.put(val, map.get(val) + 1);
			} else {
				map.put(val, 1);
			}
			i++;

		}
		int j = 0;
		while (j < two.length) {
			int val = two[i];
			if (map.containsKey(val)) {
				mr.add(val);
				map.put(val, map.get(val) - 1);
				if (val == 0) {
					map.remove(val);
				}
			}

			j++;
		}
		return mr;
	}
	public static void largeconcurrentseq(int []arr)
	{
		HashMap<Integer, Boolean> map=new HashMap<Integer, Boolean>();
		for(int i=0;i<arr.length;i++)
		{
			int val=arr[i];
			if(map.containsKey(val-1))
			{
				map.put(val,false);
				
			}
			else
			{
				map.put(val,true);
			}
			if(map.containsKey(val+1))
			{
				map.put(val+1,false);
			}
			
			
		}
		//int count=0;
		int max=0;
		int starting=0;
		for(int key:map.keySet())
		{int count=0;
			
			if(map.get(key))
			{
			while(map.containsKey(key+count))
			{
				if(count>max)
				{
					max=count;
					starting=key;
				}
				
				count++;
				
				
			}
				
			}
			
			
		}
		for(int i=0;i<max ;i++)
		{
			System.out.println(starting+i);
		}
		
	}
}
