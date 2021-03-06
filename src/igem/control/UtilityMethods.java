package igem.control;

import igem.model.CodonOptimization;
import igem.model.Data;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		if(seq.compareToIgnoreCase(Data.GCA) == 0 || seq.compareToIgnoreCase(Data.GCC) == 0 || seq.compareToIgnoreCase(Data.GCG) == 0 || seq.compareToIgnoreCase(Data.GCT) == 0){
			aminoAcidIndex = Data.ALANINE;
		}
		
		/* Arganine AGA AGG CGA CGC CGG CGT */
		else if(seq.compareToIgnoreCase(Data.AGA) == 0 || seq.compareToIgnoreCase(Data.AGG) == 0 || seq.compareToIgnoreCase(Data.CGA) == 0 || seq.compareToIgnoreCase(Data.CGC) == 0
				|| seq.compareToIgnoreCase(Data.CGG) == 0 || seq.compareToIgnoreCase(Data.CGT) == 0){
			aminoAcidIndex = Data.ARGANINE;
		}
		
		/* Asparagine AAC AAT */
		else if(seq.compareToIgnoreCase(Data.AAC) == 0 || seq.compareToIgnoreCase(Data.AAT) == 0){
			aminoAcidIndex = Data.ASPARAGINE;
		}
		
		/* Aspartic Acid GAC GAT */
		else if(seq.compareToIgnoreCase(Data.GAC) == 0 || seq.compareToIgnoreCase(Data.GAT) == 0){
			aminoAcidIndex = Data.ASPARTIC_ACID;
		}
		
		/* Cysteine TGC TGT */
		else if(seq.compareToIgnoreCase(Data.TGC) == 0 || seq.compareToIgnoreCase(Data.TGT) == 0){
			aminoAcidIndex = Data.CYSTEINE;
		}
		
		/* Glutamine CAA CAG*/
		else if(seq.compareToIgnoreCase(Data.CAA) == 0 || seq.compareToIgnoreCase(Data.CAG) == 0){
			aminoAcidIndex = Data.GLUTAMINE;
		}
		
		/* Glutamic Acid GAA GAG*/
		else if(seq.compareToIgnoreCase(Data.GAA) == 0 || seq.compareToIgnoreCase(Data.GAG) == 0){
			aminoAcidIndex = Data.GLUTAMIC_ACID;
		}
		
		/* Glycine GGA GGC GGG GGT*/
		else if(seq.compareToIgnoreCase(Data.GGA) == 0 || seq.compareToIgnoreCase(Data.GGC) == 0 || seq.compareToIgnoreCase(Data.GGG) == 0 || seq.compareToIgnoreCase(Data.GGT) == 0){
			aminoAcidIndex = Data.GLYCINE;
		}
		
		/* Histidine CAC CAT*/
		else if(seq.compareToIgnoreCase(Data.CAC) == 0 || seq.compareToIgnoreCase(Data.CAT) == 0){
			aminoAcidIndex = Data.HISTIDINE;
		}
		
		/* Isoleucine  ATA ATC ATT*/
		else if(seq.compareToIgnoreCase(Data.ATA) == 0 || seq.compareToIgnoreCase(Data.ATC) == 0 || seq.compareToIgnoreCase(Data.ATT) == 0){
			aminoAcidIndex = Data.ISOLEUCINE;
		}
		
		/* Leucine CTA CTC CTG CTT TTA TTG*/
		else if(seq.compareToIgnoreCase(Data.CTA) == 0 || seq.compareToIgnoreCase(Data.CTC) == 0 || seq.compareToIgnoreCase(Data.CTG) == 0 || seq.compareToIgnoreCase(Data.CTT) == 0 
				|| seq.compareToIgnoreCase(Data.TTA) == 0 || seq.compareToIgnoreCase(Data.TTG) == 0){
			aminoAcidIndex = Data.LEUCINE;
		}
		
		/* Lysine AAA AAG*/
		else if(seq.compareToIgnoreCase(Data.AAA) == 0 || seq.compareToIgnoreCase(Data.AAG) == 0){
			aminoAcidIndex = Data.LYSINE;
		}
		
		/* Methionine ATG*/
		else if(seq.compareToIgnoreCase(Data.ATG) == 0){
			aminoAcidIndex = Data.METHIONINE;
		}
		
		/* Phenalyaline TTT TTC*/
		else if(seq.compareToIgnoreCase(Data.TTT) == 0 || seq.compareToIgnoreCase(Data.TTC) == 0){
			aminoAcidIndex = Data.PHENYLALANINE;
		}
		
		/* Proline  CCA CCC CCG CCT*/
		else if(seq.compareToIgnoreCase(Data.CCA) == 0 || seq.compareToIgnoreCase(Data.CCC) == 0 || seq.compareToIgnoreCase(Data.CCG) == 0 || seq.compareToIgnoreCase(Data.CCT) == 0){
			aminoAcidIndex = Data.PROLINE;
		}
		
		/* Serine AGC AGT TCA TCC TCG TCT*/
		else if(seq.compareToIgnoreCase(Data.AGC) == 0 || seq.compareToIgnoreCase(Data.AGT) == 0 || seq.compareToIgnoreCase(Data.TCA) == 0 || seq.compareToIgnoreCase(Data.TCC) == 0 
				|| seq.compareToIgnoreCase(Data.TCG) == 0 || seq.compareToIgnoreCase(Data.TCT) == 0){
			aminoAcidIndex = Data.SERINE;
		}
		
		/* Threonine ACA ACC ACG ACT*/
		else if(seq.compareToIgnoreCase(Data.ACA) == 0 || seq.compareToIgnoreCase(Data.ACC) == 0 || seq.compareToIgnoreCase(Data.ACG) == 0 || seq.compareToIgnoreCase(Data.ACT) == 0){
			aminoAcidIndex = Data.THREONINE;
		}
		
		/* Tryptophan TGG*/
		else if(seq.compareToIgnoreCase(Data.TGG) == 0){
			aminoAcidIndex = Data.TRYPTOPHAN;
		}
		
		/* Tyrosine TAC TAT*/
		else if(seq.compareToIgnoreCase(Data.TAC) == 0 || seq.compareToIgnoreCase(Data.TAT) == 0){
			aminoAcidIndex = Data.TYROSINE;
		}
		
		/* Valine GTA GTC GTG GTT*/
		else if(seq.compareToIgnoreCase(Data.GTA) == 0 || seq.compareToIgnoreCase(Data.GTC) == 0 || seq.compareToIgnoreCase(Data.GTG) == 0 || seq.compareToIgnoreCase(Data.GTT) == 0){
			aminoAcidIndex = Data.VALINE;
		}
		
		/* Stop Codon  TAA TAG TGA*/
		else if(seq.compareToIgnoreCase(Data.TAA) == 0 || seq.compareToIgnoreCase(Data.TAG) == 0 || seq.compareToIgnoreCase(Data.TGA) == 0){
			aminoAcidIndex = Data.STOP_CODON;
		}
		// TODO Catch all to find where error is
		else{
			aminoAcidIndex = Data.STOP_CODON;
			System.out.println("SAF " + seq);
		}
		
		return aminoAcidIndex;
	}
	
	public static boolean checkNucleotideSequence(String sequence){
		Pattern p = Pattern.compile("[^gtacGATC]");
		Matcher m = p.matcher(sequence);
		if(m.find())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static CodonOptimization performCodonOptimization(CodonOptimization informationBundle){
			String modifiedSequence;
			ArrayList<Integer> tempChanges = new ArrayList<Integer>();
			// call the function that replaces codons
			modifiedSequence = SeqModification.seqOptimizationAlgorithimSimple(informationBundle.unmodifiedSequence, informationBundle.getOrganism());

			// find the changes that are made
			informationBundle.setModifiedSequence(modifiedSequence);
			informationBundle.findChanges();

			// print out the unmodified sequence
			System.out.println("\nUNMODIFIED SEQUENCE : " + informationBundle.unmodifiedSequence);

			// print out the modified sequence
			System.out.println("MODIFIED SEQUENCE : " + modifiedSequence);

			String changesString = "CHANGES : ";
			// print out the changes array
			for(int i = 0; i < informationBundle.changes.size(); i++){
			changesString += informationBundle.changes.get(i);
			changesString += " : ";
			}

			System.out.println(changesString);

			System.out.println("NUMBER OF CHANGES : " + informationBundle.changes.size());

			// Run through standard check
			modifiedSequence = SeqModification.standardCheck(informationBundle.modifiedSequence, informationBundle.getOrganism(), informationBundle.getStandard());
			informationBundle.setModifiedSequence(modifiedSequence);
			informationBundle.findChanges();

			// print out the unmodified sequence
			System.out.println("\nUNMODIFIED SEQUENCE AFTER STANDARD CHECK : " + informationBundle.unmodifiedSequence);

			// print out the modified sequence
			System.out.println("MODIFIED SEQUENCE AFTER STANDARD CHECK : " + modifiedSequence);

			// print out the changes array
			changesString = "CHANGES AFTER MODIFICATION ";
			for(int i = 0; i < informationBundle.changes.size(); i++){
			tempChanges.add(informationBundle.changes.get(i));
			changesString += informationBundle.changes.get(i);
			changesString += " : ";
			}


			System.out.println(changesString);

			System.out.println("NUMBER OF CHANGES : " + informationBundle.changes.size());
			
			
			// design the primers
			informationBundle = PrimerDesign.linearPrimerDesignAlgo(informationBundle, informationBundle.getStandard());
			
			
			// replace all the changes I understand this is really messy cod
			informationBundle.changes.clear();
			
			for(int i = 0; i < tempChanges.size(); i++){
				informationBundle.changes.add(tempChanges.get(i));
			}
			

			/*String fName;

			for(int i = 0; i < sequence.primers.size(); i++){
			fName = "BBa_K191003_" + i + ".cpp";
			SiteDirectedMutagenesis newProtocol = new SiteDirectedMutagenesis(sequence.primers.get(i), sequence);
			newProtocol.run(fName);
			}*/


		
		return informationBundle;
	}
	
	public static CodonOptimization performStandardCheck(CodonOptimization informationBundle){
		String modifiedSequence;
		String changesString;
		ArrayList<Integer> tempChanges = new ArrayList<Integer>();
		
		// Run through standard check
		modifiedSequence = SeqModification.standardCheck(informationBundle.unmodifiedSequence, informationBundle.getOrganism(), informationBundle.getStandard());
		informationBundle.setModifiedSequence(modifiedSequence);
		informationBundle.findChanges();

		// print out the unmodified sequence
		System.out.println("\nUNMODIFIED SEQUENCE AFTER STANDARD CHECK : " + informationBundle.unmodifiedSequence);

		// print out the modified sequence
		System.out.println("MODIFIED SEQUENCE AFTER STANDARD CHECK : " + modifiedSequence);

		// print out the changes array
		changesString = "CHANGES AFTER MODIFICATION ";
		for(int i = 0; i < informationBundle.changes.size(); i++){
			tempChanges.add(informationBundle.changes.get(i));
			changesString += informationBundle.changes.get(i);
			changesString += " : ";
		}
		
		System.out.println(changesString);

		System.out.println("NUMBER OF CHANGES : " + informationBundle.changes.size());


		// design the primers
		informationBundle = PrimerDesign.linearPrimerDesignAlgo(informationBundle, informationBundle.getStandard());
					
					
		// replace all the changes I understand this is really messy cod
		informationBundle.changes.clear();
					
		for(int i = 0; i < tempChanges.size(); i++){
			informationBundle.changes.add(tempChanges.get(i));
		}
		return informationBundle;
}
	
}
