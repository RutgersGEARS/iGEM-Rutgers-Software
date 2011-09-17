package igem.model;

public class FormatCheck extends GeneSequence{
	Standard format;
	
	String unmodifiedHTML;
	String modifiedHTML;
	String primerHTML;
	String protocolHTML;
	
	public FormatCheck(String seq, Backbone plasmid, Standard standard){
		super(seq, plasmid);
		
		this.format = standard;
	}

}
