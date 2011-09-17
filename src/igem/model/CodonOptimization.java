package igem.model;

public class CodonOptimization extends GeneSequence {
	
	OrgCodonTable organism;
	Standard format;
	
	String unmodifiedHTML;
	String modifiedHTML;
	String primerHTML;
	String protocolHTML;
	
	
	public CodonOptimization(String newSeq, Backbone plasmid, OrgCodonTable org, Standard standard){
		super(newSeq, plasmid);
		
		this.organism = org;
		this.format = standard;
	}

}
