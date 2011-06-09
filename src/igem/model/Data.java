package igem.model;

import java.io.Serializable;
import java.util.ArrayList;
/*
 * TODO make singleton
 */
public class Data implements Serializable {
	
	private static Data myData = null;
	
	AminoAcid[]		aminoAcids;
	Codon[]			codons;
	ArrayList<OrgCodonTable>	organisms;
	
	public Data(){
		
	}
	
}
