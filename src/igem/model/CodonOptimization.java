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
		int currentIndex = 0;
		int changeIndex;
		String unmodified = "<html>\n" + "<p>" ;
		
		// go through each change
		for(int i = 0; i < this.changes.size(); i++){
			changeIndex = this.changes.get(i);
			// are there consecutive changes
			if(currentIndex < changeIndex){
				unmodified += "<font face=arial color=black>";
				// put everything up to the changes in the 
				unmodified += this.unmodifiedSequence.substring(currentIndex, changeIndex);
				unmodified += "</font";
			}
			
			unmodified += "<font face=arial color=purple>";
			unmodified += this.unmodifiedSequence.charAt(changeIndex);
			
			System.out.println(changeIndex);
			unmodified += "</font";
			
			currentIndex = changeIndex + 1;
		}
		
		if(currentIndex < this.unmodifiedSequence.length()){
			unmodified += "<font face=arial>";
			
			// put everything up to the changes in the 
			unmodified += this.unmodifiedSequence.substring(currentIndex, this.unmodifiedSequence.length());
			unmodified += "</font";
		}
		
		unmodified += "</p";
		
		this.unmodifiedHTML = unmodified;
		return;
	}
	
	public void generateModifiedHTML(){
		//System.out.println("HTML : " + this.modifiedSequence);
		int currentIndex = 0;
		int changeIndex;
		String modified = "<html>\n" + "<p>" ;
		
		// go through each change
		for(int i = 0; i < this.changes.size(); i++){
			changeIndex = this.changes.get(i);
			// are there consecutive changes
			if(currentIndex < changeIndex){
				modified += "<font face=arial color=black>";
				// put everything up to the changes in the 
				modified += this.modifiedSequence.substring(currentIndex, changeIndex);
				modified += "</font";
			}
			
			modified += "<font face=arial color=green>";
			modified += this.modifiedSequence.charAt(changeIndex);
			
			System.out.println(changeIndex);
			modified += "</font";
			
			currentIndex = changeIndex + 1;
		}
		
		if(currentIndex < this.modifiedSequence.length()){
			modified += "<font face=arial>";
			
			// put everything up to the changes in the 
			modified += this.modifiedSequence.substring(currentIndex, this.modifiedSequence.length());
			modified += "</font";
		}
		
		modified += "</p";
		
		this.modifiedHTML = modified;
		return;
	}
	
	public void generatePrimerHTML(){
		
	}
	
	public String getUnmodifiedHTML(){
		return unmodifiedHTML;
	}
	
	public String getModifiedHTML(){
		return modifiedHTML;
	}
	
	public String getPrimerHTML(){
		return primerHTML;
	}
	
	/*String initialText = "<html>\n" +
		    "<p>gcgtgcagc<font face=arial color=red>ccc</font>gcgtgcagc</p>\n";*/

}
