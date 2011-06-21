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
			currentAA = codonTable.aminoAcids.get(Data.findAminoAcidIndex(currentCodon));
			
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
		
		return null;
		
	}

}
