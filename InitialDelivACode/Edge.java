import java.util.Comparator;


//import java.util.*;

// Edge between two nodes
public class Edge  {
	
	Double weight;
	String label;
	Node tail;
	Node head;
	
	public Edge( Node tailNode, Node headNode, String theLabel ) {
		setLabel( theLabel );
		setTail( tailNode );
		setHead( headNode );
	}
	
	

	

	public String getLabel() {
		return label;
	}
	
	public Node getTail() {
		return tail;
	}
	
	public Node getHead() {
		return head;
	}
	
	public void setLabel( String s ) {
		label = s;
	}
	
	public void setTail( Node n ) {
		tail = n;
	}
	
	public void setHead( Node n ) {
		head = n;
	}

	@Override
	public String toString() {
		return "Edge [label=" + label + ", tail=" + tail + ", head=" + head + ", getLabel()=" + getLabel()
				+ ", getTail()=" + getTail() + ", getHead()=" + getHead() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}








	
	
	public static Comparator<Edge> CompareByWeight = new Comparator<Edge>() {
		@Override
		public int compare(Edge e1, Edge e2) {
			int w1 = Integer.parseInt(e1.getLabel());
			int w2 = Integer.parseInt(e2.getLabel());
			return w1 - w2;
		}
	};















	


	
	
	
	
}
