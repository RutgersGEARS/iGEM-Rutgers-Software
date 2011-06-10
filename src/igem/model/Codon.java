package igem.model;

public class Codon {
	
	String sequence;
	char aminoAcidSymbol;
	double frequency;
	
	public Codon(String sequence, char aminoAcidSymbol){
		this.sequence = sequence;
		this.aminoAcidSymbol = aminoAcidSymbol;
	}
	
	public Codon(String sequence, char aminoAcidSymbol, double frequency){
		this.sequence = sequence;
		this.aminoAcidSymbol = aminoAcidSymbol;
		this.frequency = frequency;
	}	
}
