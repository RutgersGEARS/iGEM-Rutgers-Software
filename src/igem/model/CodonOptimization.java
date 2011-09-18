package igem.model;

public class CodonOptimization extends GeneSequence {
	
	OrgCodonTable organism;
	Standard format;
	
	String unmodifiedHTML;
	String modifiedHTML;
	String primerHTML;
	String protocolHTML;
	
	
	public CodonOptimization(String newSeq, Backbone plasmid, String identifier, OrgCodonTable org, Standard standard){
		super(newSeq, plasmid, identifier);
		
		this.organism = org;
		this.format = standard;
	}
	
	public OrgCodonTable getOrganism(){
		return this.organism;
	}
	
	public Standard getStandard(){
		return this.format;
	}
	
	public void generateUnmodifiedHTML(){
		
	}
	
	public void generateModifiedHTML(){
		
	}
	
	public void generatePrimerHTML(){
		
	}

}
