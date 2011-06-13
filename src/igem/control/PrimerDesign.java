package igem.control;

import igem.model.*;
import java.math.*;

public class PrimerDesign {

	public int randomTestPDA(GeneSequence seq){
		
		
		
		return -1;
	}
	
	public static int linearTestPDA(GeneSequence seq){
		int[] primerIndices = new int[4];
		int[] changes = seq.changes;
		int primerDesignIndex;
		int pivotChange;
		boolean tooFar;
		int tempIndex;
		
		// Go through each change and see if anything is close to it
		for(int i = 0; i < changes.length; i++){
			
			/*
			 * If the change has not already been incorporated into a primer
			 * 
			 */
			if(changes[i] != -1){
				
				/* initialize array for primer design to -1 at each entry*/
				for(int j = 0; j < 4; j++){
					primerIndices[j] = -1;
				}
				
				tooFar = false;
				pivotChange = changes[i];
				
				primerDesignIndex = 0;
				primerIndices[primerDesignIndex] = pivotChange;
				
				System.out.println("SAF Mutation at : " + pivotChange);
				
				/*
				 * so that change isn't incorporated into 2 primers
				 */
				changes[i] = -1;
				
				/*
				 * Not at last change check for things that are close
				 */
				if(i < changes.length - 1){
					tempIndex = i + 1;
					
					/*
					 * find all changes up to 4 that are closer than 25 bp
					 * and make sure you don't get an ArrayOutOfBounds exception
					 */
					while(tooFar == false && tempIndex < changes.length){
						if(changes[tempIndex] - pivotChange <= 25 && primerDesignIndex < 3){
								primerDesignIndex++;
								primerIndices[primerDesignIndex] = changes[tempIndex];
								//primerIndices[primerDesignIndex] = tempIndex;
								System.out.println("SAF Mutation in same primer : " + primerIndices[primerDesignIndex]);
								
								changes[tempIndex] = -1;
						}
						else{
							tooFar = true;
						}
						
						tempIndex++;
						
					}
					
				}
					/* call the primer design method  with the indices that need to be changed */
					designPrimer(seq, primerIndices );
				
			}
			
			
		}
		
		
		
		return -1;
	}
	/*
	 * Just used to test for now
	 * 
	 */
	public static boolean designPrimer(GeneSequence seq, int[] indices){
		
		/*
		 * Check if there are two many mismatches for GC content
		 */
		int firstIndex = indices[0];
		int lastIndex = 0;
		int numberMismatches = 1;
		
		// find last viable index
		for(int i = 1; i < indices.length ; i++){
			if(indices[i] != -1){
				lastIndex = indices[i]; 
				numberMismatches++;
			}
		}
		
		// Only 1 mismatch
		if(numberMismatches == 1){
			
		}
		// More than one mismatch
		else{
			
		}
		
		
		return false;
	}
	
	public static void main(String[] args){
		GeneSequence firstSequence = new GeneSequence();
		int x = 3;
		for(int i = 0; i < firstSequence.changes.length; i++){
			firstSequence.changes[i] = x;
			x =  x + x;
		}
		
		linearTestPDA(firstSequence);
		
	}
	
	/*public static void designPrimer(GeneSequence seq, int[] indices){
		System.out.println("    Designed Primer!");
		
		for(int i = 0; i < indices.length ; i++){
			
			if(indices[i] != -1){
				System.out.println("    Mutated Index : " + indices[i]);
			}
			
		}
		
	}*/
	
}
