package igem.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Contains an assembly standard for biological parts including restriction sites not allowed, and the prefix and suffix of the part.
 * 
 * @author
 *
 */
public class Standard implements Serializable {
	
	private static final long serialVersionUID = 1053453863360989892L;

	/**
	 * All the restriction enzymes the part must contain
	 */
	ArrayList<RestrictionEnzyme> requiredRestrictionSites;
	
	/**
	 * All the restriction enzymes the part optionally should contain
	 */
	ArrayList<RestrictionEnzyme> optionalRestrictionSites;
	
	/**
	 * Prefix of part
	 */
	String prefix;
	
	/**
	 * Suffix of part
	 */
	String suffix;
	
	/**
	 * Name of standard
	 */
	private String standardName;
	
	/**
	 * Constructor for Standard class takes a prefix and suffix.  Restriction enzymes need to be added separately
	 * 
	 * @param prefix
	 * @param suffix
	 */
	public Standard(String prefix, String suffix, String name){
		this.standardName = name;
		this.prefix = prefix;
		this.suffix = suffix;
		requiredRestrictionSites = new ArrayList<RestrictionEnzyme>();
		optionalRestrictionSites = new ArrayList<RestrictionEnzyme>();
	}
	

	public void addRestrictionSite(RestrictionEnzyme newRestrict, boolean optional){
		if(optional == true){
			optionalRestrictionSites.add(newRestrict);
		}
		else{
			requiredRestrictionSites.add(newRestrict);
		}
		
	}
	
	public String getRestrictionString(int index){
		return this.requiredRestrictionSites.get(index).getRecognitionSequence();
	}
	
	public int getNumbRestrictionEnzymes(){
		return this.requiredRestrictionSites.size();
	}
	
	public void setName(String name){
		this.standardName = name;
	}
	
	public String getName(){
		return this.standardName;
	}
	
	
	
	

}
