package igem.control;

import igem.model.*;

/**
 * Contains the method for optimizing a genetic coding sequence
 * 
 * @author 
 */
public class SeqModification {
	
	/**
	 * Goes through the sequence codon per codon and optimizes based on the organism's codon table.
	 * Highest frequency codon should be put in at least in this algorithm
	 * 
	 * @param sequence
	 * @param codonTable
	 * @return
	 */
	public static String seqOptimizationAlgorithimSimple(String sequence, OrgCodonTable codonTable){
		String currentCodon;
		String optimalCodon;
		String modifiedSequence = "";
		AminoAcid currentAA;
		
		for(int seqIndex = 0; seqIndex < sequence.length(); seqIndex += 3){
			
			
			if(seqIndex + 3 <= sequence.length()){
				// get the next codon
				currentCodon = sequence.substring(seqIndex, seqIndex + 3);
				
				// find what amino acid it is
				currentAA = codonTable.aminoAcids.get(UtilityMethods.findAminoAcidIndex(currentCodon));
				
				// get most frequent amino acid
				optimalCodon = currentAA.getDesiredCodon(0).sequence;
				
				if(optimalCodon.length() != 3){
					System.out.println("MOTHER FUCKING WARNING YOU HAVE ENTERED A CODON THAT IS NOT 3 BP");
				}
				
				// add it to the modified sequence
				modifiedSequence += optimalCodon;
			}
			else{
				modifiedSequence += sequence.substring(seqIndex, sequence.length() - 1);
				System.out.println("Sequence is not a multiple of 3");
			}
			
				
		}
		
		modifiedSequence = modifiedSequence.toLowerCase();
		return modifiedSequence;
		
	}
	
	/**
	 * Goes through the modified sequence and tries to replace all restriction sequences with the next best codon.
	 * 
	 * 
	 * @param sequence
	 * @param codonTable
	 * @param format
	 * @return
	 */
	public static String standardCheck(String sequence, OrgCodonTable codonTable, Standard format){
		int offset;
		String codonToBeModified;
		String optimalCodon;
		
		AminoAcid aminoAcid;
		
		// TODO only handles required restriction sites need to figure out how to work this with settings
		for(int i = 0; i < format.getNumbRestrictionEnzymes(); i++){
			
			//indexRestrictSite = sequence.indexOf(format.getRestrictionString(i));
			
			int restrictSize = format.getRestrictionString(i).length();
			System.out.println("Restriction Site : " + format.getRestrictionString(i) + " Restriction length : " + restrictSize);
			/*while(indexRestrictSite != -1){
				
			}*/
			
			for(int j = 0; j < (sequence.length() - restrictSize); j++){
				
				if(sequence.substring(j, j + restrictSize).compareToIgnoreCase(format.getRestrictionString(i)) == 0){
					System.out.println("\tMatch at + " + j);
					
					//find start of codon
					
					// codon begins at index
					if(j % 3 == 0){
						codonToBeModified = sequence.substring(j, j + 3);
						offset = 0;
					}
					else if(j % 3 == 1){
						codonToBeModified = sequence.substring(j + 2, j + 5);
						offset = 2;
					}
					else{
						codonToBeModified = sequence.substring(j + 1, j + 4);
						offset = 1;
					}
					
					// change codon to the next best one for the amino acid
					aminoAcid = codonTable.aminoAcids.get(UtilityMethods.findAminoAcidIndex(codonToBeModified));
					
					// assuming everything is most optimal get second most optimal
					optimalCodon = aminoAcid.getDesiredCodon(1).sequence;
					
					// take the first part of the sequence concat with new codon then concat with the rest of the sequence
					sequence = sequence.substring(0, j + offset) + optimalCodon + sequence.substring(j + (3 + offset));
					
				}
			}
					
		}
		sequence = sequence.toLowerCase();
		return sequence;
		
	}

}
