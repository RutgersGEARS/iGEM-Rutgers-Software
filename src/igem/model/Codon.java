package igem.model;

/**
 * Describes a codon
 * 
 * @author Stephanie Fairclough
 *
 */
public class Codon {
	
	String sequence;
	char aminoAcidSymbol;
	double frequency;
	
	/**
	 * 
	 * Constructor for a Codon object that does require frequency
	 * 
	 * @param sequence
	 * @param aminoAcidSymbol
	 */
	public Codon(String sequence, char aminoAcidSymbol){
		this.sequence = sequence;
		this.aminoAcidSymbol = aminoAcidSymbol;
		this.frequency = -1;
	}
	
	/**
	 * Constructor for a Codon object that does not require frequency
	 * 
	 * @param sequence
	 * @param aminoAcidSymbol
	 * @param frequency
	 */
	public Codon(String sequence, char aminoAcidSymbol, double frequency){
		this.sequence = sequence;
		this.aminoAcidSymbol = aminoAcidSymbol;
		this.frequency = frequency;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String codonString;
		codonString = this.aminoAcidSymbol + " : " + this.sequence + " : " + this.frequency + "\n";
		return codonString;
	}
}
