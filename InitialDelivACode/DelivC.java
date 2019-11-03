import java.io.File;
import java.io.PrintWriter;
import java.util.Random;

// Class DelivC does the work for deliverable DelivC of the Prog340

public class DelivC {

	File inputFile;
	File outputFile;
	PrintWriter output;
	Graph g;
	
	public DelivC( File in, Graph gr ) {
		
      

        Random r = new Random();
		
        // uncomment the setSeed(…) line to get a nonrandom starting assignment. 
        // different seeds will give different assignments.  
        // !!!--- comment the next line out before turning in the program ---!!!
        // r.setSeed( 10 );
        for ( int course = 0; course < 21; course++ ) {
            int sem = r.nextInt( 7 );
            // Assign this course to be taken this semester.
        }
        
     

		
		
		
		
		
		inputFile = in;
		g = gr;
		
		// Get output file name.
		String inputFileName = inputFile.toString();
		String baseFileName = inputFileName.substring( 0, inputFileName.length()-4 ); // Strip off ".txt"
		String outputFileName = baseFileName.concat( "_out.txt" );
		outputFile = new File( outputFileName );
		if ( outputFile.exists() ) {    // For retests
			outputFile.delete();
		}
		
		try {
			output = new PrintWriter(outputFile);			
		}
		catch (Exception x ) { 
			System.err.format("Exception: %s%n", x);
			System.exit(0);
		}
		
		
		
		
		
		System.out.println( "DelivC:  To be implemented");
	}
}

