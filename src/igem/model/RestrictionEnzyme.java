package igem.model;

import java.io.Serializable;

public class RestrictionEnzyme implements Serializable{
	
	private static final long serialVersionUID = 1652632383432292573L;

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
	
	public String toString(){
		return this.name + " \"" + recognitionSequence + "\"";
	}
	
	public int compareTo(RestrictionEnzyme enzyme){
		if((enzyme.getName().compareTo(this.name) == 0) 
				&& (enzyme.getRecognitionSequence().compareToIgnoreCase(this.recognitionSequence) == 0)){
			return 0;
		}
		else{
			return -1;
		}
	}

}
