package igem.model;

import java.util.ArrayList;

public class AminoAcid {
	ArrayList<Codon> codons;
	String name;
	String abrvName;
	char symbol;
	
	public AminoAcid(ArrayList<Codon> codons, String name, String abrvName, char symbol){
		this.codons = codons;
		this.name = name;
		this.abrvName = abrvName;
		this.symbol = symbol;
	}
	
	/**
	 * For rank of 1 it determines the most frequent codon,
	 * for rank 2 it determines the next most frequent codon etc.
	 * 
	 * @param rank
	 * @return The nth most frequent Codon for that particular amino acid
	 */
	public Codon getDesiredCodon(int rank){
		return null;
	}
}
