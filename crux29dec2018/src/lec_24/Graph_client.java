package lec_24;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph_client {

	public static void main(String[] args) {
		Graph gp=new Graph();
  gp.addvertex("A");
  gp.addvertex("B");
  gp.addvertex("C");
  gp.addvertex("D");
  gp.addvertex("E");
  gp.addvertex("F");
  gp.addvertex("G");
  gp.addEdge("A","B", 2);
  gp.addEdge("A","D",10);
  gp.addEdge("B","C", 1);
  gp.addEdge("C", "D", 3);
  gp.addEdge("D","E", 4);
  gp.addEdge("E","F",3);
  gp.addEdge("E","G",3);
  gp.addEdge("F","G",3);
//  gp.display();
  //gp.haspath("A","F", new HashMap<String, Boolean>() , "");
 //gp.dfs("A","F");
 gp.bft("A", "F");
// System.out.println(gp.iscycle());
// System.out.println(gp.isconnected());
// System.out.println(gp.istree());
// System.out.println(gp.getconnected());
//System.out.println(gp.isbipartite());
gp.prims().display();
	}

}
