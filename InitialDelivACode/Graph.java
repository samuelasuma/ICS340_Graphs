import java.util.*;

public class Graph {

	ArrayList<Node> nodeList;
	ArrayList<Edge> edgeList;
	static Set<Node> dfsNodeList;

	public Graph() {
		nodeList = new ArrayList<Node>();
		edgeList = new ArrayList<Edge>();
		dfsNodeList = new LinkedHashSet<Node>();
	}

	public ArrayList<Node> getNodeList() {
		return nodeList;
	}

	public ArrayList<Edge> getEdgeList() {
		return edgeList;
	}

	public void addNode(Node n) {
		nodeList.add(n);
	}

	public void addEdge(Edge e) {
		edgeList.add(e);
	}

	public String toString() {
		String s = "Graph g.\n";
		if (nodeList.size() > 0) {
			for (Node n : nodeList) {
				// Print node info
				String t = "\nNode " + n.getName() + ", abbrev " + n.getAbbrev() + ", value " + n.getVal() + "\n";
				s = s.concat(t);
			}
			s = s.concat("\n");
		}

		return s;
	}

	public String toStringEdges() {
		String s = "Graph g.\n";
		if (edgeList.size() > 0) {
			for (Edge e : edgeList) {
				// Print node info
				String t = "\nEdge from " + e.getTail().getName() + " to " + e.getHead().getName() + " labeled "
						+ e.getLabel() + "\n";
				s = s.concat(t);
			}
			s = s.concat("\n");
		} else if (edgeList.size() == 0) {
			String err = "\nNo Edges\n";
			return err;
		}

		return s;
	}

	static int count = 0;

	/**
	 * @param n Recursive DFS Takes in parameter "n" as start node. Assigns
	 *          attributes boolean:visited, int:start & int:finish. Saves sorted,
	 *          visited nodes in list
	 * 
	 */
	public static void depthFirstSearch(Node n) {
		// set start node to visited
		if (!n.getVisited()) {
			n.setVisited(true);
			// Increment and set our counter(time) for visited node

			n.setStart(++count);
		}
	

		// Sort by edge weight
		Collections.sort(n.getOutgoingEdges(), Edge.CompareByWeight);
		// Add sorted nodes to list to keep track of DFS traversal
		
		dfsNodeList.add(n);
		for (Edge e : n.outgoingEdges) {

			if (!e.head.getVisited()) {
				depthFirstSearch(e.head);

			}

		}
	
			// End times for visited nodes
			n.setEnd(++count);
			
		
		

	}

}
