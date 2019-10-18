import java.io.*;
import java.util.ArrayList;


// Class DelivB does the work for deliverable DelivB of the Prog340

public class DelivB {

	File inputFile;
	File outputFile;
	PrintWriter output;
	Graph g;
	Node n;
	Edge e;
	double w;

	public DelivB(File in, Graph gr) {
		inputFile = in;
		g = gr;

		// Get output file name.
		String inputFileName = inputFile.toString();
		String baseFileName = inputFileName.substring(0, inputFileName.length() - 4); // Strip off ".txt"
		String outputFileName = baseFileName.concat("_out.txt");
		outputFile = new File(outputFileName);
		if (outputFile.exists()) { // For retests
			outputFile.delete();
		}

		try {
			output = new PrintWriter(outputFile);
		} catch (Exception x) {
			System.err.format("Exception: %s%n", x);
			System.exit(0);
		}
		
		
		
		
		///Get Start Node "S"
		ArrayList<Node> nodeList = g.getNodeList();

		for (int i = 0; i < nodeList.size(); i++) {

			if (nodeList.get(i).getVal().equals("S")) {
				n = nodeList.get(i);
				Graph.count =0;
				
				
				
			}

		}
		

		
		
	
	
		//Do DFS
		Graph.depthFirstSearch(n);
		String header = String.format("%n %-10s %-12s %s %n", "Node", "Start Time", "End Time");
		System.out.println(header);
		//Iterate through sorted DFS list.
		for (Node node : Graph.dfsNodeList) {
		
			System.out.println(node.toString());

		}
		
	}
}
