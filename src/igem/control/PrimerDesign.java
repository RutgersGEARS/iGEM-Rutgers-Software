package igem.control;

import igem.model.CodonOptimization;
import igem.model.GeneSequence;
import igem.model.Primer;
import igem.model.Standard;

import java.util.ArrayList;

public class PrimerDesign {
	
	/**
	 * @param seq
	 * @return
	 */
	public static CodonOptimization linearPrimerDesignAlgo(CodonOptimization seq, Standard format){
		int[] primerIndices = new int[4];
		ArrayList<Integer> internalChanges = seq.changes;
		int primerDesignCount;
		int pivotChange;
		int currentChangeIndex;
		
		boolean tooFar;

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
				
				//System.out.println("SAF Mutation at : " + pivotChange);
				
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

								//System.out.println("SAF Mutation in same primer : " + primerIndices[primerDesignCount]);
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
						tempPrimer = designPrimer(seq, primerIndices, format);
						
						//TODO test this and print out indices then put in line above and comment this one out
						//tempPrimer = fakeDesignPrimer(primerIndices, primerDesignCount + 1, format);
						
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
								System.out.println("Unable to design primer for change " + primerIndices[verifyIndex]);
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
		seq.setRemainingChanges(internalChanges);

		
		/*
		 * TODO for testing purposes only print out all the information about the indices of the designed primer
		 */
		// prints the list of primers with their change indices
		//for(int i = 0; i < seq.primers.size(); i++){
			//System.out.println(seq.primers.get(i).getTopSequence());
		//}
		
		// prints the final changes unable to be made
		/*String remainingChanges = "REMAINING CHANGES ";
		for(int i = 0; i < seq.changes.size(); i++){
			if(seq.get(i) != -1){
				remainingChanges += seq.changes.get(i);
				remainingChanges += " ";
			}

		}
		System.out.println(remainingChanges);*/
		
		return seq;
	}
	/*
	 * Just used to test for now
	 */
	public static Primer designPrimer(CodonOptimization seq, int[] indices, Standard format){
		

		
		String seqPrefix = format.getPrefix();
		String seqSuffix = format.getSuffix();
		
		String fullSequence = seqPrefix + seq.modifiedSequence + seqSuffix;
		
		// TODO remove after testing
		String indexString = "Indexes of mismatches in primer are ";
		
		int firstIndex;
		int lastIndex = 0;
		
		int begPrimer;
		int endPrimer;
		
		int numberMismatches = 0;
		int primerLength;
		
		double gcContentPrimer;
		double meltingTemperature;
		
		boolean success;
		
		// set first index of primer
		firstIndex = indices[0] + seqPrefix.length();
		
		// find last viable index & adjust for prefix being there
		for(int i = 0; i < indices.length ; i++){
			if(indices[i] != -1){
				lastIndex = indices[i] + seqPrefix.length();
				numberMismatches++;
				
				// TODO remove after testing
				indexString += indices[i];
				indexString += " ";
			}
		}
		
		// TODO remove after testing
		System.out.println(indexString);
		
		begPrimer = firstIndex - 10;
		endPrimer = lastIndex + 10;
		
		if(begPrimer < 0){
			begPrimer = 0;
		}
		if(endPrimer >= fullSequence.length()){
			endPrimer = fullSequence.length() - 1;
		}

		
		/* 
		 * Primer length less than 47
		 * Try to make primer as small as possible
		 */
		success = false;
		for(primerLength = endPrimer - begPrimer + 1 ; primerLength < 46 ; primerLength += 2){
			
			// primer has not been able to be successfully designed yet
			if(success == false){
				
				
				// Find gc content of substring of genetic sequence
				gcContentPrimer = GeneSequence.getGCPercentage(fullSequence.substring(begPrimer, endPrimer + 1));

				// Find Tm of the primer
				meltingTemperature = findMeltingTemperature(endPrimer - begPrimer + 1, gcContentPrimer, numberMismatches);
				
				// Primers an ok length
				if((meltingTemperature > 78) && (primerLength > 25)){
					System.out.println("\tMelting Temperature " + meltingTemperature);
					success = true;
				}
				// Primer needs to be longer
				else{
					begPrimer --;
					endPrimer ++;
					
					if(begPrimer < 0){
						begPrimer = 0;
						// compensate at the end
						endPrimer++;
					}
					if(endPrimer >= fullSequence.length()){
						endPrimer = fullSequence.length() - 1;
						// compensate at the beginning
						begPrimer++;
					}
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
			
			
			return transcribePrimerSequences(fullSequence.substring(begPrimer, endPrimer + 1), numberMismatches);	
		}
	}
	
	public static Primer transcribePrimerSequences(String primerSequence, int numbMismatches){
		Primer newPrimer;
		String bottomSeq;
		String topSeq = "";
		//char[] nucleotides;
		char currentNuc;
		int index;
		//int counter;
		
		// bottom primer
		bottomSeq = primerSequence;
		
		// top primer
		//counter = 0;
		//nucleotides = new char[primerSequence.length()];
		for(index = primerSequence.length() - 1; index >= 0; index--){
			currentNuc = primerSequence.charAt(index);
			
			if(currentNuc == 'c'){
				topSeq += "g";
			}
			else if(currentNuc == 'g'){
				topSeq += "c";
			}
			else if(currentNuc == 't'){
				topSeq += "a";
			}
			else if(currentNuc == 'a'){
				topSeq += "t";
			}

		}
		
		// create new primer
		newPrimer = new Primer(topSeq, bottomSeq, numbMismatches);
		
		// TODO remove after testing
		System.out.println("\tTop Sequence : " + topSeq);
		System.out.println("\tBottom Sequence : " + bottomSeq);
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
	
	
}
