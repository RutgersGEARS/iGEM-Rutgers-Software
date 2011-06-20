package igem.model;

import java.util.ArrayList;

public class GeneSequence {
	
	public String unmodifiedSequence;
	public String modifiedSequence;
	public ArrayList<Primer> primers;
	public ArrayList<Integer> changes;
	
	/**
	 * Constructor for a GeneSequence object
	 * 
	 * @param newSeq
	 */
	public GeneSequence(String newSeq){
		unmodifiedSequence = newSeq;
		modifiedSequence = null;
		
		primers = new ArrayList<Primer>();
		changes = new ArrayList<Integer>();
	}
	
	public GeneSequence(){
		primers = new ArrayList<Primer>();
		changes = new ArrayList<Integer>();
	}
	
	/**
	 * Populates the changes matrix with the indices of the differences between the modified and unmodified sequence
	 */
	public void findChanges(){
		
		if(unmodifiedSequence != null && modifiedSequence != null){
			
			for(int i = 0; i < unmodifiedSequence.length(); i++){
				if(unmodifiedSequence.charAt(i) != modifiedSequence.charAt(i)){
					this.changes.add(i);
				}
			}
		}
		
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
	
	/**
	 * Adds a primer to list of them needed to change the unmodified sequence to the modified sequence
	 * @param primer
	 */
	public void addPrimer(Primer primer){
		primers.add(primer);
	}
}
