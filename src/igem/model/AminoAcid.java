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
}
