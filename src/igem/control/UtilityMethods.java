package igem.control;

import igem.model.Data;

public class UtilityMethods {
	/**
	 * Given a three character codon it determines the amino acid that corresponds.
	 * 
	 * @param codon
	 * @return integer corresponding to amino acid in organism codon table
	 */
	public static int findAminoAcidIndex(String codon){
		String seq = codon.toLowerCase();
		int aminoAcidIndex = -1;
		
		/* Alanine GCA GCC GCG GCT*/
		if(seq.compareTo(Data.GCA) == 0 || seq.compareTo(Data.GCC) == 0 || seq.compareTo(Data.GCG) == 0 || seq.compareTo(Data.GCT) == 0){
			aminoAcidIndex = Data.ALANINE;
		}
		
		/* Arganine AGA AGG CGA CGC CGG CGT */
		else if(seq.compareTo(Data.AGA) == 0 || seq.compareTo(Data.AGG) == 0 || seq.compareTo(Data.CGA) == 0 || seq.compareTo(Data.CGC) == 0
				|| seq.compareTo(Data.CGG) == 0 || seq.compareTo(Data.CGT) == 0){
			aminoAcidIndex = Data.ARGANINE;
		}
		
		/* Asparagine AAC AAT */
		else if(seq.compareTo(Data.AAC) == 0 || seq.compareTo(Data.AAT) == 0){
			aminoAcidIndex = Data.ASPARAGINE;
		}
		
		/* Aspartic Acid GAC GAT */
		else if(seq.compareTo(Data.GAC) == 0 || seq.compareTo(Data.GAT) == 0){
			aminoAcidIndex = Data.ASPARTIC_ACID;
		}
		
		/* Cysteine TGC TGT */
		else if(seq.compareTo(Data.TGC) == 0 || seq.compareTo(Data.TGT) == 0){
			aminoAcidIndex = Data.CYSTEINE;
		}
		
		/* Glutamine CAA CAG*/
		else if(seq.compareTo(Data.CAA) == 0 || seq.compareTo(Data.CAG) == 0){
			aminoAcidIndex = Data.GLUTAMINE;
		}
		
		/* Glutamic Acid GAA GAG*/
		else if(seq.compareTo(Data.GAA) == 0 || seq.compareTo(Data.GAG) == 0){
			aminoAcidIndex = Data.GLUTAMIC_ACID;
		}
		
		/* Glycine GGA GGC GGG GGT*/
		else if(seq.compareTo(Data.GGA) == 0 || seq.compareTo(Data.GGC) == 0 || seq.compareTo(Data.GGG) == 0 || seq.compareTo(Data.GGT) == 0){
			aminoAcidIndex = Data.GLYCINE;
		}
		
		/* Histidine CAC CAT*/
		else if(seq.compareTo(Data.CAC) == 0 || seq.compareTo(Data.CAT) == 0){
			aminoAcidIndex = Data.HISTIDINE;
		}
		
		/* Isoleucine  ATA ATC ATT*/
		else if(seq.compareTo(Data.ATA) == 0 || seq.compareTo(Data.ATC) == 0 || seq.compareTo(Data.ATT) == 0){
			aminoAcidIndex = Data.ISOLEUCINE;
		}
		
		/* Leucine CTA CTC CTG CTT TTA TTG*/
		else if(seq.compareTo(Data.CTA) == 0 || seq.compareTo(Data.CTC) == 0 || seq.compareTo(Data.CTG) == 0 || seq.compareTo(Data.CTT) == 0 
				|| seq.compareTo(Data.TTA) == 0 || seq.compareTo(Data.TTG) == 0){
			aminoAcidIndex = Data.LEUCINE;
		}
		
		/* Lysine AAA AAG*/
		else if(seq.compareTo(Data.AAA) == 0 || seq.compareTo(Data.AAG) == 0){
			aminoAcidIndex = Data.LYSINE;
		}
		
		/* Methionine ATG*/
		else if(seq.compareTo(Data.ATG) == 0){
			aminoAcidIndex = Data.METHIONINE;
		}
		
		/* Phenalyaline TTC TTG*/
		else if(seq.compareTo(Data.TTC) == 0 || seq.compareTo(Data.TTG) == 0){
			aminoAcidIndex = Data.PHENYLALANINE;
		}
		
		/* Proline  CCA CCC CCG CCT*/
		else if(seq.compareTo(Data.CCA) == 0 || seq.compareTo(Data.CCC) == 0 || seq.compareTo(Data.CCG) == 0 || seq.compareTo(Data.CCT) == 0){
			aminoAcidIndex = Data.PROLINE;
		}
		
		/* Serine AGC AGT TCA TCC TCG TCT*/
		else if(seq.compareTo(Data.AGC) == 0 || seq.compareTo(Data.AGT) == 0 || seq.compareTo(Data.TCA) == 0 || seq.compareTo(Data.TCC) == 0 
				|| seq.compareTo(Data.TCG) == 0 || seq.compareTo(Data.TCT) == 0){
			aminoAcidIndex = Data.SERINE;
		}
		
		/* Threonine ACA ACC ACG ACT*/
		else if(seq.compareTo(Data.ACA) == 0 || seq.compareTo(Data.ACC) == 0 || seq.compareTo(Data.ACG) == 0 || seq.compareTo(Data.ACT) == 0){
			aminoAcidIndex = Data.THREONINE;
		}
		
		/* Tryptophan TGG*/
		else if(seq.compareTo(Data.TGG) == 0){
			aminoAcidIndex = Data.TRYPTOPHAN;
		}
		
		/* Tyrosine TAC TAT*/
		else if(seq.compareTo(Data.TAC) == 0 || seq.compareTo(Data.TAT) == 0){
			aminoAcidIndex = Data.TYROSINE;
		}
		
		/* Valine GTA GTC GTG GTT*/
		else if(seq.compareTo(Data.GTA) == 0 || seq.compareTo(Data.GTC) == 0 || seq.compareTo(Data.GTG) == 0 || seq.compareTo(Data.GTT) == 0){
			aminoAcidIndex = Data.VALINE;
		}
		
		/* Stop Codon  TAA TAG TGA*/
		else if(seq.compareTo(Data.TAA) == 0 || seq.compareTo(Data.TAG) == 0 || seq.compareTo(Data.TGA) == 0){
			aminoAcidIndex = Data.STOP_CODON;
		}
		
		return aminoAcidIndex;
	}
}
