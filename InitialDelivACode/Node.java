import java.util.*;

// A node of a graph for the Spring 2018 ICS 340 program

public class Node  {

	String name;
	String val;  // The value of the Node
	String abbrev;  // The abbreviation for the Node
	Boolean visited;
	int start;
	int end;
	
	int timestamp;
	ArrayList<Edge> outgoingEdges;  
	ArrayList<Edge> incomingEdges;
	
	public Node( String theAbbrev ) {
		setAbbrev( theAbbrev );
		val = null;
		name = null;
		visited = false;
		start = 0;
		end = start;
		timestamp = 0;
		outgoingEdges = new ArrayList<Edge>();
		incomingEdges = new ArrayList<Edge>();
	}
	
  

   
    
    public int getStart() {
		return start;
	}





	public void setStart(int start) {
		this.start = start;
	}





	public int getEnd() {
		return end;
	}





	public void setEnd(int end) {
		this.end = end;
	}





	







	
	public Boolean getVisited() {
		return visited;
	}





	public void setVisited(Boolean visited) {
		this.visited = visited;
	}





	public String getAbbrev() {
		return abbrev;
	}
	
	public String getName() {
		return name;
	}
	
	public String getVal() {
		return val;
	}
	
	public ArrayList<Edge> getOutgoingEdges() {
		return outgoingEdges;
	}
	
	public ArrayList<Edge> getIncomingEdges() {
		return incomingEdges;
	}
	
	public void setAbbrev( String theAbbrev ) {
		abbrev = theAbbrev;
	}
	
	public void setName( String theName ) {
		name = theName;
	}
	
	public void setVal( String theVal ) {
		val = theVal;
	}
	
	public void addOutgoingEdge( Edge e ) {
		outgoingEdges.add( e );
	}
	
	public void addIncomingEdge( Edge e ) {
		incomingEdges.add( e );
	}







	@Override
	public String toString() {
		return String.format("%-15s %-10d %d", getName(), getStart(), getEnd());
	}
	







	
	

		
	





	










	
}
