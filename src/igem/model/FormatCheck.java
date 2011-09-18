package igem.model;

public class FormatCheck extends GeneSequence{
	Standard format;
	
	String unmodifiedHTML;
	String modifiedHTML;
	String primerHTML;
	String protocolHTML;
	
	public FormatCheck(String seq, Backbone plasmid, Standard standard, String identifier){
		super(seq, plasmid, identifier);
		
		this.format = standard;
	}

}
