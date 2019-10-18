


public class DFS {
	Graph g;
	Edge e;
	Node n;
	

    public void depthFirstSearch(Node n) {
			 n.visit();		
		System.out.print(n +" ");
        for (Edge e : g.edgeList) {
            if (e.tail.equals(n) && e.head.visited) {
                depthFirstSearch(e.head);
                System.out.print(e +" ");
            }
        }
        
    }
}
