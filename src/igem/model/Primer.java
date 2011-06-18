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
	String topSequence;
	
	/**
	 * is exactly the same as the modified sequence in the same order
	 */
	String bottomSequence;
	
	/**
	 * The number of mismatches in the primer sequence
	 */
	int numbMismatches;
	
	/**
	 * The melting temperature of the primer, algorithim may change in the future
	 */
	double meltingTemperature;
	
	/**
	 * The gc content of the primer
	 */
	double gcContent;
	
	public Primer(String top, String bottom, int mismatches){
		this.topSequence = top;
		this.bottomSequence = bottom;
		this.numbMismatches = mismatches;
		this.gcContent = GeneSequence.getGCPercentage(this.topSequence);
		this.meltingTemperature = PrimerDesign.findMeltingTemperature(top.length(), this.gcContent, this.numbMismatches);
	}

}