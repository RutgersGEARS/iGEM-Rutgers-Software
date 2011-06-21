package igem.model;

public class RestrictionEnzyme {
	
	/**
	 * Recognition sequence in the 5' to 3' direction
	 */
	String recognitionSequence;
	
	/**
	 * Name of restriction enzyme
	 */
	String name;
	
	/**
	 * Constructor for a restriction enzyme
	 * 
	 * @param name
	 * @param recogSeq
	 */
	public RestrictionEnzyme(String name, String recogSeq){
		this.name = name;
		this.recognitionSequence = recogSeq;
	}

}
