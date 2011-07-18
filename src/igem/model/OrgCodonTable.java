package igem.model;

import igem.control.UtilityMethods;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Stores the data for an organisms codon table
 *
 */
public class OrgCodonTable{
	
	/**
	 * Stores each amino acid in this order in the array list
	 * 
	 * Index	Code	Name
	 * 
	 * 0		A		Alanine
	 * 1		R		Arganine
	 * 2		N		Asparagine
	 * 3		D		Aspartic Acid
	 * 4		C		Cysteine
	 * 5		Q		Glutamine
	 * 6		E		Glutamic Acid
	 * 7		G		Glycine
	 * 8		H		Histidine
	 * 9		I		Isoleucine
	 * 10		L		Leucine
	 * 11		K		Lysine
	 * 12		M		Methionine
	 * 13 		F		Phenylalanine
	 * 14		P		Proline
	 * 15		S		Serine
	 * 16		T		Threonine
	 * 17		W		Tryptophan
	 * 18		Y		Tyrosine
	 * 19		V		Valine
	 * 20		X		Stop Codon
	 * 
	 */
	public ArrayList<AminoAcid> aminoAcids;
	
	/**
	 * Name of organism
	 */
	private String organismName;
	
	/**
	 * Creates an organism codon object from a string of codons and frequencies.
	 * No clue what format they should be in.
	 * 
	 * @param codonInformation
	 * @param name
	 */
	public OrgCodonTable(String name){
		this.organismName = name;
		this.aminoAcids = new ArrayList<AminoAcid>(21);
		
		AminoAcid newAmino;
		
		// populate new organism codon table
		newAmino = new AminoAcid("Alanine", "Ala", 'A');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Arganine", "Arg", 'R');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Asparagine", "Asn", 'N');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Aspartic acid", "Asp", 'D');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Cysteine", "Cys", 'C');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Glutamic acid", "Gly", 'E');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Glutamine", "Gln", 'Q');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Glycine", "Gly", 'G');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Histidine", "His", 'H');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Isoleucine", "Ile", 'I');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Leucine", "Leu", 'L');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Lysine", "Lys", 'K');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Methionine", "Met", 'M');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Phenylalanine", "Phe", 'F');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Proline", "Pro", 'P');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Serine", "Ser", 'S');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Threonine", "Thr", 'T');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Tryptophan", "Thr", 'W');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Tyrosine", "Tyr", 'Y');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Valine", "Val", 'V');
		this.aminoAcids.add(newAmino);
		
		newAmino = new AminoAcid("Stop codon", "stop", 'X');
		this.aminoAcids.add(newAmino);
	}
	
	/**
	 * Takes output from the function grab in HTMLGrabTest and puts that information into the OrgCodonTable
	 * 
	 * 
	 * @param codonHashMap
	 */
	public void populateTableFromURL(HashMap<String, String> codonHashMap){
		
	}
	
	/**
	 * @param newCodon
	 * @param index
	 * @return
	 */
	public void addCodon(Codon newCodon){
		int aminoAcidIndex;
		aminoAcidIndex = UtilityMethods.findAminoAcidIndex(newCodon.sequence);
		this.aminoAcids.get(aminoAcidIndex).insertCodon(newCodon);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		
		String orgCodonTableString = this.organismName + "\n";
		
		for(int i = 0; i < aminoAcids.size(); i++){
			// print out amino acid which in turn prints out all the codon
			orgCodonTableString += aminoAcids.get(i).toString();
		}
		
		return orgCodonTableString;
	}
	
	
	public String getOrganismName(){
		return this.organismName;
	}

}
