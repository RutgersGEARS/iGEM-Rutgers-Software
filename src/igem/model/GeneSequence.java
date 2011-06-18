package igem.model;

import java.util.ArrayList;

public class GeneSequence {
	
	public String unmodifiedSequence;
	public String modifiedSequence;
	public int codingIndex;
	public int[] changes;
	public ArrayList<Primer> primers;
	
	/**
	 * Constructor for a GeneSequence object
	 * 
	 * @param newSeq
	 */
	public GeneSequence(String newSeq){
		unmodifiedSequence = newSeq;
		codingIndex = GeneSequence.findStartOfCodingSequence(unmodifiedSequence);
		primers = new ArrayList<Primer>();
		modifiedSequence = null;
		changes = null;
	}
	
	public GeneSequence(){
		
		primers = new ArrayList<Primer>();
		changes = new int[20];
	}
	
	/**
	 * Determines the start of a coding sequence
	 * ??? Do we have to worry about multiple starts and stops is coding sequences for say composite parts ???
	 * 
	 * @return The index of the start of the coding sequence in a BioBrick
	 */
	public static int findStartOfCodingSequence(String seq){
		return -1;
	}
	
	
	/**
	 * Populates the changes matrix with the indices of the differences between the modified and unmodified sequence
	 * 
	 */
	public void findChanges(){
		
	}
	
	/**
	 * Determines the percentage of GC content in a particular sequence of DNA.
	 * Example for a 50% GC content the function returns 50.
	 * 
	 * @param sequence
	 * @return a number ranging from 0 to 100
	 */
	public static double getGCPercentage(String sequence){
		int length = sequence.length();
		int gcContent = 0;
		double gcPercent;
		for(int i = 0; i < sequence.length(); i++){
			if(sequence.charAt(i) == 'g' || sequence.charAt(i) == 'G' || 
					sequence.charAt(i) == 'c' || sequence.charAt(i) == 'C'){
				gcContent++;
			}
		}
		
		gcPercent = (gcContent / length) * 100;
		return gcPercent;
		
	}
	
	public void addPrimer(Primer primer){
		primers.add(primer);
	}
}
