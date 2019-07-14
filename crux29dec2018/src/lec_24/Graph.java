package lec_24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


import lec_22.generic_heap;


public class Graph {

	private class vertex {

		HashMap<String, Integer> nbrs = new HashMap<String, Integer>();
	}

	HashMap<String, vertex> vtc = new HashMap<>();

	public int numvertex() {
		return vtc.size();
	}

	public boolean containsvertex(String vname) {
		return vtc.containsKey(vname);

	}

	public void addvertex(String vname) {
		vertex vtx = new vertex();
		vtc.put(vname, vtx);

	}

	public void removevertex(String vname) {
		vertex vtx1 = vtc.get(vname);
		// vertex vtx2=vtc.get(vname2);
		if (vtx1 == null) {
			return;
		}

		for (String key : vtx1.nbrs.keySet()) {

			if (vtx1.nbrs.containsKey(vname))
				vtc.get(key).nbrs.remove(vname);

		}
		vtc.remove(vname);

	}

	public int numedges() {

		int size = 0;
		for (String key : vtc.keySet()) {
			vertex vtx = vtc.get(key);
			size += vtx.nbrs.size();

		}
		return size / 2;
	}

	public boolean containsedge(String vname1, String vname2) {
		vertex vtx1 = vtc.get(vname1);
		vertex vtx2 = vtc.get(vname2);
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vname2)) {
			return false;
		}
		return true;

	}

	public void addEdge(String vname1, String vname2, int cost) {
		vertex vtx1 = vtc.get(vname1);
		vertex vtx2 = vtc.get(vname2);
		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vtx1.nbrs.put(vname2, cost);
		vtx2.nbrs.put(vname1, cost);
	}

	public void removeedge(String vname1, String vname2) {
		vertex vtx1 = vtc.get(vname1);
		vertex vtx2 = vtc.get(vname2);
		if (vtx1 == null || vtx2 == null) {
			return;
		}
		vtx1.nbrs.remove(vname2);
		vtx2.nbrs.remove(vname1);

	}

	public void display() {

		for (String key : vtc.keySet()) {
			vertex vtx = vtc.get(key);
			System.out.println(key + "-->" + vtx.nbrs);

		}
	}

	public boolean haspath(String src, String dst, HashMap<String, Boolean> process) {

		if (containsedge(src, dst)) {
			return true;
		}
		process.put(src, true);
		for (String nbr : vtc.get(src).nbrs.keySet()) {
			if (!process.containsKey(src))
				if (haspath(nbr, dst, process)) {
					return true;
				}

		}
		return false;
	}

	public void haspath(String src, String dst, HashMap<String, Boolean> process, String str) {

		if (src.equals(dst)) {
			System.out.println(str + dst);
			return;
		}

		process.put(src, true);
		for (String nbr : vtc.get(src).nbrs.keySet()) {
			if (!process.containsKey(nbr)) {
				haspath(nbr, dst, process, str + src);
			}
		}
		process.remove(src);

	}

	private class pair {
		String curr;
		String asf;
		String colour;

	}

	public boolean bfs(String src, String dst) {
		HashMap<String, Boolean> process = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		pair fp = new pair();
		fp.curr = src;
		fp.asf = src;
		queue.addFirst(fp);
		while (!queue.isEmpty()) {
			pair rp = queue.remove();
			if (process.containsKey(rp)) {
				continue;
			}
			process.put(src, true);
			if (containsedge(rp.curr, dst)) {
				System.out.println(rp.asf + dst);
				return true;
			}
			for (String nbr : vtc.get(rp.curr).nbrs.keySet()) {
				pair np = new pair();
				np.curr = nbr;
				np.asf = rp.asf + nbr;
				queue.add(np);
			}
		}
		return false;
	}

	public boolean dfs(String src, String dst) {
		HashMap<String, Boolean> process = new HashMap<>();
		LinkedList<pair> stack = new LinkedList<>();
		pair fp = new pair();
		fp.curr = src;
		fp.asf = src;
		stack.addFirst(fp);
		while (!stack.isEmpty()) {
			pair rp = stack.removeFirst();
			if (process.containsKey(rp)) {
				continue;
			}
			process.put(src, true);
			if (containsedge(rp.curr, dst)) {
				System.out.println(rp.asf + dst);
				return true;
			}
			for (String nbr : vtc.get(rp.curr).nbrs.keySet()) {
				pair np = new pair();
				np.curr = nbr;
				np.asf = rp.asf + nbr;
				stack.addFirst(np);
			}
		}
		return false;
	}

	public void bft(String src, String dst) {
		HashMap<String, Boolean> process = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		for (String key : vtc.keySet()) {

			if (process.containsKey(key)) {
				continue;
			}
			pair fp = new pair();
			fp.curr = key;
			fp.asf = key;
			queue.add(fp);
			while (!queue.isEmpty()) {
				pair rp = queue.remove();
				if (process.containsKey(rp.curr)) {
					continue;
				}
				process.put(rp.curr, true);

				System.out.println(rp.curr + "via" + rp.asf);

				for (String nbr : vtc.get(rp.curr).nbrs.keySet()) {
					pair np = new pair();
					np.curr = nbr;
					np.asf = rp.asf + nbr;
					queue.addLast(np);
				}
			}
		}

	}

	public boolean iscycle() {
		HashMap<String, Boolean> process = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		for (String key : vtc.keySet()) {

			if (process.containsKey(key)) {
				continue;
			}
			pair fp = new pair();
			fp.curr = key;
			fp.asf = key;
			queue.add(fp);
			while (!queue.isEmpty()) {
				pair rp = queue.remove();
				if (process.containsKey(rp.curr)) {
					return true;
				}
				process.put(rp.curr, true);

				// System.out.println(rp.curr +"via"+ rp.asf);

				for (String nbr : vtc.get(rp.curr).nbrs.keySet()) {
					pair np = new pair();
					np.curr = nbr;
					np.asf = rp.asf + nbr;
					queue.addLast(np);
				}
			}
		}

		return false;
	}

	static int count = 0;

	public boolean isconnected() {
		HashMap<String, Boolean> process = new HashMap<>();
		LinkedList<pair> queue = new LinkedList<>();
		for (String key : vtc.keySet()) {

			if (process.containsKey(key)) {
				continue;
			}
			count++;
			pair fp = new pair();
			fp.curr = key;
			fp.asf = key;
			queue.add(fp);
			while (!queue.isEmpty()) {
				pair rp = queue.remove();
				if (process.containsKey(rp.curr)) {
					continue;
					// return true;
				}
				process.put(rp.curr, true);

				// System.out.println(rp.curr +"via"+ rp.asf);

				for (String nbr : vtc.get(rp.curr).nbrs.keySet()) {
					pair np = new pair();
					np.curr = nbr;
					np.asf = rp.asf + nbr;
					queue.addLast(np);
				}
			}
		}

		if (count == 1) {
			return true;
		} else

		{
			return false;
		}
		// return false;
	}
public  boolean istree()
{
 if(!iscycle()&&isconnected())
 {
	 return true;
 }
 else
 {
	 return false;
 }
}
public ArrayList<ArrayList<String>> getconnected()
{
	ArrayList<String> fans=new ArrayList<String>();
	ArrayList<ArrayList<String>> lans=new ArrayList<ArrayList<String>>();
	
	HashMap<String, Boolean> process = new HashMap<>();
	LinkedList<pair> queue = new LinkedList<>();
	for (String key : vtc.keySet()) {

		if (process.containsKey(key)) {
			continue;
		}
		pair fp = new pair();
		fp.curr = key;
		fp.asf = key;
		queue.add(fp);
		while (!queue.isEmpty()) {
			pair rp = queue.remove();
			if (process.containsKey(rp.curr)) {
				continue;
			}
			process.put(rp.curr, true);
               fans.add(rp.asf);
			//System.out.println(rp.curr + "via" + rp.asf);

			for (String nbr : vtc.get(rp.curr).nbrs.keySet()) {
				pair np = new pair();
				np.curr = nbr;
				np.asf = rp.asf + nbr;
				queue.addLast(np);
			}
		}
		lans.add(fans);
	}
return lans;

	
}
public boolean isbipartite()
{
	HashMap<String, String> process = new HashMap<>();
	LinkedList<pair> queue = new LinkedList<>();
	for (String key : vtc.keySet()) {

		if (process.containsKey(key)) {
			continue;
		}
		pair fp = new pair();
		fp.curr = key;
		fp.asf = key;
		fp.colour="r";
		
		queue.add(fp);
		while (!queue.isEmpty()) {
			pair rp = queue.remove();
			if (process.containsKey(rp.curr)) {
				String op=process.get(rp.asf);
				String np=rp.colour;
				if(!op.equals(np))
				{
					return false;
				}
				continue;
			}
			process.put(rp.curr,rp.colour);

			//System.out.println(rp.curr + "via" + rp.asf);

			for (String nbr : vtc.get(rp.curr).nbrs.keySet()) {
				pair np = new pair();
				np.curr = nbr;
				np.asf = rp.asf + nbr;
				np.colour=rp.colour.equals("r")?"g":"r";
				queue.addLast(np);
			}
		}
	}

return true;	
}
private class primspair implements Comparable<primspair>
{
	String vname;
	String aqname;
	int cost;
	@Override
	public int compareTo(primspair o) {
		return o.cost-this.cost;
	}
}
public Graph prims()
{
	Graph mst=new Graph();
	generic_heap<primspair> heap=new generic_heap<>();
	HashMap<String,primspair> map=new HashMap<>();
	for(String key:vtc.keySet())
	{
		primspair np=new primspair();
		np.cost=Integer.MAX_VALUE;
		np.aqname=null;
		np.vname=key;
		heap.add(np);
		map.put(key, np);
		
	}
	while(!heap.isempty())
	{
		primspair rp=heap.remove();
		map.remove(rp.vname);
		if(rp.aqname==null)
		{
			mst.addvertex(rp.vname);
		}
		else
		{
			mst.addvertex(rp.vname);
			mst.addEdge(rp.vname,rp.aqname,rp.cost);
		}
		for(String nbr:vtc.get(rp.vname).nbrs.keySet())
		{
			if(map.containsKey(nbr))
			{
				primspair nbrpair=map.get(nbr);
				int oc=map.get(nbr).cost;
				int nc=vtc.get(rp.vname).nbrs.get(nbr);
				if(nc<oc)
				{
					nbrpair.cost=nc;
					nbrpair.aqname=rp.vname;
					
				   heap.upheap(nbrpair);
				}
			}
			
			
		}
		
	}
	
	return mst;
}
}
