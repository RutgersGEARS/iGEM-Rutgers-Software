package igem.model;

import java.util.ArrayList;

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
	ArrayList<AminoAcid> aminoAcid;
	
	/**
	 * Name of organism
	 */
	String organismName;
	
	/**
	 * Creates an organism codon object from a string of codons and frequencies.
	 * No clue what format they should be in.
	 * 
	 * @param codonInformation
	 * @param name
	 */
	public OrgCodonTable(String codonInformation, String name){
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		
		String orgCodonTableString = this.organismName + "\n";
		
		
		return null;
	}
	

}
