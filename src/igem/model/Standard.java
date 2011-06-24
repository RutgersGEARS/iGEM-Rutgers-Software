package igem.model;

import java.util.ArrayList;

/**
 * Contains an assembly standard for biological parts including restriction sites not allowed, and the prefix and suffix of the part.
 * 
 * @author
 *
 */
public class Standard {
	
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
	String standardName;
	
	/**
	 * Constructor for Standard class takes a prefix and suffix.  Restriction enzymes need to be added separately
	 * 
	 * @param prefix
	 * @param suffix
	 */
	public Standard(String prefix, String suffix){
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
	
	
	
	

}
