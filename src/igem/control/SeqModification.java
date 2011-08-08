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
			// get the next codon
			currentCodon = sequence.substring(seqIndex, seqIndex + 3);
			
			// find what amino acid it is
			currentAA = codonTable.aminoAcids.get(UtilityMethods.findAminoAcidIndex(currentCodon));
			
			// get most frequent amino acid
			optimalCodon = currentAA.getDesiredCodon(0).sequence;
			
			// add it to the modified sequence
			modifiedSequence += optimalCodon;	
		}
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
		int indexRestrictSite;
		int offset;
		String codonToBeModified;
		String optimalCodon;
		
		AminoAcid aminoAcid;
		
		// TODO only handles required restriction sites need to figure out how to work this with settings
		for(int i = 0; i < format.getNumbRestrictionEnzymes(); i++){
			indexRestrictSite = sequence.indexOf(format.getRestrictionString(i));
			while(indexRestrictSite != -1){
				//find start of codon
				
				// codon begins at index
				if(indexRestrictSite % 3 == 0){
					codonToBeModified = sequence.substring(indexRestrictSite, indexRestrictSite + 3);
					offset = 0;
				}
				else if(indexRestrictSite % 3 == 1){
					codonToBeModified = sequence.substring(indexRestrictSite + 2, indexRestrictSite + 5);
					offset = 2;
				}
				else{
					codonToBeModified = sequence.substring(indexRestrictSite + 1, indexRestrictSite + 4);
					offset = 1;
				}
				
				// change codon to the next best one for the amino acid
				aminoAcid = codonTable.aminoAcids.get(UtilityMethods.findAminoAcidIndex(codonToBeModified));
				
				// assuming everything is most optimal get second most optimal
				optimalCodon = aminoAcid.getDesiredCodon(1).sequence;
				
				// take the first part of the sequence concat with new codon then concat with the rest of the sequence
				sequence = sequence.substring(0, indexRestrictSite + offset) + optimalCodon + sequence.substring(indexRestrictSite + (3 + offset));
				
				// find next restriction sequence if it exists
				indexRestrictSite = sequence.indexOf(format.getRestrictionString(i));
			}
			
		}
		return sequence;
		
	}

}
