package igem.model;

public class RestrictionEnzyme {
	
	/**
	 * Recognition sequence in the 5' to 3' direction
	 */
	private String recognitionSequence;
	
	/**
	 * Name of restriction enzyme
	 */
	private String name;
	
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
	
	public String getRecognitionSequence(){
		return this.recognitionSequence;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String modifiedName){
		this.name = modifiedName;
	}
	
	public void setRecognitionSequence(String newReq){
		this.recognitionSequence = newReq;
	}

}
