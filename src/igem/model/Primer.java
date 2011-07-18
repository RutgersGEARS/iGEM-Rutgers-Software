package igem.model;

import igem.control.*;

/**
 * 
 * Primers are stored in the 5' ---> 3' direction
 * 
 * @author 
 *
 */
public class Primer {
	
	/**
	 * is the complement of the modified sequence in the reverse order
	 */
	private String topSequence;
	
	/**
	 * is exactly the same as the modified sequence in the same order
	 */
	private String bottomSequence;
	
	/**
	 * The number of mismatches in the primer sequence
	 */
	private int numbMismatches;
	
	/**
	 * The melting temperature of the primer, algorithim may change in the future
	 */
	private double meltingTemperature;
	
	/**
	 * The gc content of the primer
	 */
	private double gcContent;
	
	public Primer(String top, String bottom, int mismatches){
		this.topSequence = top;
		this.bottomSequence = bottom;
		this.numbMismatches = mismatches;
		this.gcContent = GeneSequence.getGCPercentage(this.topSequence);
		this.meltingTemperature = PrimerDesign.findMeltingTemperature(top.length(), this.gcContent, this.numbMismatches);
	}
	
	public String getTopSequence(){
		return this.topSequence;
	}
	
	public String getBottomSequence(){
		return this.bottomSequence;
	}
	
	public int getNumbMismatches(){
		return this.numbMismatches;
	}
	
	public double getMeltingTemperatures(){
		return this.meltingTemperature;
	}
	
	public double getGCContent(){
		return this.gcContent;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}