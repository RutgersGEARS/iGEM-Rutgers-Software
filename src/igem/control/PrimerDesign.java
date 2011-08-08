package igem.control;

import igem.model.GeneSequence;
import igem.model.Primer;

import java.util.ArrayList;

public class PrimerDesign {
	
	/**
	 * @param seq
	 * @return
	 */
	public static GeneSequence linearPrimerDesignAlgo(GeneSequence seq){
		int[] primerIndices = new int[4];
		ArrayList<Integer> internalChanges = seq.changes;
		int primerDesignCount;
		int pivotChange;
		int currentChangeIndex;
		
		boolean tooFar;
		System.out.println("Number of changes : " + internalChanges.size());
		// Go through each change and see if anything is close to it
		for(int i = 0; i < internalChanges.size(); i++){
			
			/*
			 * If the change has not already been incorporated into a primer
			 */
			if(internalChanges.get(i) != -1){
				
				/* initialize array for primer design to -1 at each entry*/
				for(int j = 0; j < 4; j++){
					primerIndices[j] = -1;
				}
				
				tooFar = false;
				pivotChange = internalChanges.get(i);
				
				primerDesignCount = 0;
				primerIndices[primerDesignCount] = pivotChange;
				
				System.out.println("SAF Mutation at : " + pivotChange);
				
				/*
				 * Not at last change check for things that are close
				 */
				if(i < internalChanges.size() - 1){
					currentChangeIndex = i + 1;
					
					/*
					 * find all changes up to 4 that are closer than 25 bp
					 * and make sure you don't get an ArrayOutOfBounds exception
					 */
					while(tooFar == false && currentChangeIndex < internalChanges.size()){
						if(internalChanges.get(currentChangeIndex) - pivotChange <= 25 && primerDesignCount < 3){
								primerDesignCount++;
								primerIndices[primerDesignCount] = internalChanges.get(currentChangeIndex);
								
								currentChangeIndex++;

								System.out.println("SAF Mutation in same primer : " + primerIndices[primerDesignCount]);
						}
						else{
							tooFar = true;
						}
					}
					
				}

					/*
					 * Loop through to make sure that the primer is able to be made
					 */
					Primer tempPrimer;
					
					for(int verifyIndex = primerDesignCount; verifyIndex >= 0; verifyIndex--){
						/* call the primer design method  with the indices that need to be changed */
						//tempPrimer = designPrimer(seq, primerIndices);
						
						//TODO test this and print out indices then put in line above and comment this one out
						tempPrimer = fakeDesignPrimer(primerIndices, primerDesignCount + 1);
						
						/* success */
						if(tempPrimer != null){
							
							/* add primer to input sequence */
							seq.addPrimer(tempPrimer);
							
							/* clear out changes that went into primer*/
							for(int clearIndex = i; clearIndex < i + verifyIndex + 1; clearIndex ++){
								internalChanges.set(clearIndex, -1);
							}
							
							break;
							
						}
						/* failure */
						else{
							/* even a single change index doesn't work */
							if(verifyIndex == 0){
								
								/* don't have to worry about clearing last change from changes array because 
								 * they'll just stay in good way to let user know which ones aren't changed
								 */
							}
							/* delete last entry from the primer array */
							primerIndices[verifyIndex] = -1;
						}
					}
					
			}
			
			
		}
		seq.changes = internalChanges;
		/*
		 * TODO for testing purposes only print out all the information about the indices of the designed primer
		 */
		
		// prints the list of primers with their change indices
		for(int i = 0; i < seq.primers.size(); i++){
			System.out.println(seq.primers.get(i).getTopSequence());
		}
		
		// prints the final changes unable to be made
		String remainingChanges = "";
		for(int i = 0; i < seq.changes.size(); i++){
			remainingChanges += seq.changes.get(i);
			remainingChanges += " ";
		}
		System.out.println(remainingChanges);
		
		return seq;
	}
	/*
	 * Just used to test for now
	 */
	public static Primer designPrimer(GeneSequence seq, int[] indices){

		int firstIndex = indices[0];
		int lastIndex = 0;
		
		int begPrimer;
		int endPrimer;
		
		int numberMismatches = 1;
		int primerLength;
		
		double gcContentPrimer;
		double meltingTemperature;
		
		boolean success;
		
		// find last viable index
		for(int i = 0; i < indices.length ; i++){
			if(indices[i] != -1){
				lastIndex = indices[i]; 
				numberMismatches++;
			}
		}
		
		/* 
		 * Only 1 mismatch
		 * Primer length 30 to 40
		 * Try to make primer as small as possible
		 */
		// TODO handle primer going off one of the ends depending on standard
		
		begPrimer = firstIndex - 10;
		endPrimer = lastIndex + 10;
		
		// goes off the beginning of the sequence
		if(begPrimer < 0){
			
		}
		
		// goes off the end of the sequence
		if(endPrimer >= seq.unmodifiedSequence.length()){
			
		}
		
		success = false;
		
		// may be repeating code might want to place in method
		for(primerLength = endPrimer - begPrimer + 1 ; primerLength < 46 ; primerLength += 2){
			
			// primer has not been able to be successfully designed yet
			if(success == false){
				// Find gc content of substring of genetic sequence
				gcContentPrimer = GeneSequence.getGCPercentage(seq.modifiedSequence.substring(begPrimer, endPrimer + 1));
					
				// Find Tm of the primer
				meltingTemperature = findMeltingTemperature(endPrimer - begPrimer + 1, gcContentPrimer, numberMismatches);
					
				// Primers an ok length
				if((meltingTemperature > 78) && (primerLength > 25)){
					success = true;
				}
				// Primer needs to be longer
				else{
					begPrimer --;
					endPrimer ++;
				}
			}	
		}
		
		// can't design primer
		if(success == false){
			return null;
		}
		
		// can design primer
		else{
			// Use helper method to figure out sequence given indices and return new primer
			return transcribePrimerSequences(seq, begPrimer, endPrimer, numberMismatches);	
		}
	}
	
	public static Primer transcribePrimerSequences(GeneSequence seq, int begIndex, int endIndex, int numbMismatches){
		Primer newPrimer;
		String bottomSeq;
		String topSeq;
		char[] nucleotides;
		char currentNuc;
		int index;
		int counter;
		
		// bottom primer
		bottomSeq = seq.modifiedSequence.substring(begIndex, endIndex + 1);
		
		// top primer
		counter = 0;
		nucleotides = new char[endIndex - begIndex + 1];
		for(index = endIndex; endIndex >= begIndex; index--){
			currentNuc = seq.modifiedSequence.charAt(index);
			
			// get complement of nucleotide
			switch(currentNuc){
			case 'c' :
				currentNuc = 'g';
			case 'C' :
				currentNuc = 'g';
			case 'g' :
				currentNuc = 'c';
			case 'G' :
				currentNuc = 'c';
			case 'a' :
				currentNuc = 't';
			case 'A' :
				currentNuc = 't';
			case 't' :
				currentNuc = 'a';
			case 'T' :
				currentNuc = 'a';
				
			// TODO figure this out later should be no error checking for nucleotides
			default :
				currentNuc = 'g';
			}
			// set correct nucleotide
			nucleotides[counter] = seq.modifiedSequence.charAt(index);
			counter++;
		}
		
		// set top sequence
		topSeq = new String(nucleotides);
		
		// create new primer
		newPrimer = new Primer(topSeq, bottomSeq, numbMismatches);
		
		return newPrimer;
	}
	
	/**
	 * Finds the melting temperature of a primer given the length, gc percentage, and the number of mismatches
	 * 
	 * @param primerLength
	 * @param gcContent
	 * @param numbMismatches
	 * @return
	 */
	public static double findMeltingTemperature(int primerLength, double gcContent, int numbMismatches){
		double meltingTemperature;
		meltingTemperature = 81.5 + (0.41 * (gcContent)) - (675 / primerLength) - (numbMismatches / primerLength);
		return meltingTemperature;
	}
	
	public static Primer fakeDesignPrimer(int[] indices, int numbMismatch){
		String indexString = "Indexes of mismatches in primer are ";
		for(int i = 0; i < numbMismatch; i++){
			indexString += indices[i];
			indexString += " ";
		}
		Primer fakePrimer = new Primer(indexString, numbMismatch);
		return fakePrimer;
	}
	
	public static void main(String[] args){
		GeneSequence firstSequence = new GeneSequence();

		
		linearPrimerDesignAlgo(firstSequence);
		
		
		System.out.println("Got to the end of the primer design algorithim");
		
	}
	
}
