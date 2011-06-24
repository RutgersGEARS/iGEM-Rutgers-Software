package igem.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Vector;


public class Data implements Serializable {
	

	public static final String	TTT = "ttt";
	public static final String	TTC = "ttc";
	public static final String	TTA = "tta";
	public static final String	TTG = "ttg";
	public static final String	CTT = "ctt";
	public static final String	CTC = "ctc";
	public static final String	CTA = "cta";
	public static final String	CTG = "ctg";
	public static final String	ATT = "att";
	public static final String	ATC = "atc";
	public static final String	ATA = "ata";
	public static final String	ATG = "atg";
	public static final String 	GTT = "gtt";
	public static final String 	GTC = "gtc";
	public static final String 	GTA = "gta";
	public static final String 	GTG = "gtg";
	public static final String 	TCT = "tct";
	public static final String 	TCC = "tcc";
	public static final String 	TCA = "tca";
	public static final String 	TCG = "tcg";
	public static final String 	CCT = "cct";
	public static final String 	CCC = "ccc";
	public static final String 	CCA = "cca";
	public static final String 	CCG = "ccg";
	public static final String 	ACT = "act";
	public static final String	ACC = "acc";
	public static final String 	ACA = "aca";
	public static final String 	ACG = "acg";
	public static final String 	GCT = "gct";
	public static final String 	GCC = "gcc";
	public static final String 	GCA = "gca";
	public static final String 	GCG = "gcg";
	public static final String 	TAT = "tat";
	public static final String 	TAC = "tac";
	public static final String 	TAA = "taa";
	public static final String 	TAG = "tag";
	public static final String 	CAT = "cat";
	public static final String 	CAC = "cac";
	public static final String 	CAA = "caa";
	public static final String 	CAG = "cag";
	public static final String 	AAT = "aat";
	public static final String 	AAC = "aac";
	public static final String 	AAA = "aaa";
	public static final String 	AAG = "aag";
	public static final String 	GAT = "gat";
	public static final String 	GAC = "gac";
	public static final String 	GAA = "gaa";
	public static final String 	GAG = "gag";
	public static final String 	TGT = "tgt";
	public static final String 	TGC = "tgc";
	public static final String 	TGA = "tga";
	public static final String 	TGG = "tgg";
	public static final String 	CGT = "cgt";
	public static final String 	CGC = "cgc";
	public static final String 	CGA = "cga";
	public static final String 	CGG = "cgg";
	public static final String 	AGT = "agt";
	public static final String 	AGC = "agc";
	public static final String 	AGA = "aga";
	public static final String 	AGG = "agg";
	public static final String 	GGT = "ggt";
	public static final String 	GGC = "ggc";
	public static final String 	GGA = "gga";
	public static final String 	GGG = "ggg";
	
	public static final int		ALANINE			=	0;
	public static final int		ARGANINE		=	1;
	public static final int		ASPARAGINE		=	2;
	public static final int		ASPARTIC_ACID	=	3;
	public static final int		CYSTEINE 		=	4;
	public static final int		GLUTAMINE		=	5;
	public static final int		GLUTAMIC_ACID	=	6;
	public static final int		GLYCINE			=	7;
	public static final int		HISTIDINE		=	8;
	public static final int		ISOLEUCINE		=	9;
	public static final int		LEUCINE			=	10;
	public static final int		LYSINE			=	11;
	public static final int		METHIONINE		=	12;
	public static final int		PHENYLALANINE	=	13;
	public static final int		PROLINE			=	14;
	public static final int		SERINE			=	15;
	public static final int		THREONINE		=	16;
	public static final int		TRYPTOPHAN		=	17;
	public static final int		TYROSINE		=	18;
	public static final int		VALINE			=	19;
	public static final int		STOP_CODON		=	20;
	
	public static final RestrictionEnzyme EcoRI = new RestrictionEnzyme("EcoRI", "gaatc");
	public static final RestrictionEnzyme XbaI = new RestrictionEnzyme("XbaI", "tctaga");
	public static final RestrictionEnzyme SpeI = new RestrictionEnzyme("SpeI", "actagt");
	public static final RestrictionEnzyme PstI = new RestrictionEnzyme("PstI", "ctgcag");
	public static final RestrictionEnzyme NotI = new RestrictionEnzyme("NotI", "gcggccgc");
	public static final RestrictionEnzyme PvuI = new RestrictionEnzyme("PvuI", "cagctg");
	public static final RestrictionEnzyme XhoI = new RestrictionEnzyme("XhoI", "ctcgac");
	public static final RestrictionEnzyme AvrII = new RestrictionEnzyme("AvrII", "cctagg");
	public static final RestrictionEnzyme NheI = new RestrictionEnzyme("NheI", "gctagc");
	public static final RestrictionEnzyme SapI = new RestrictionEnzyme("SapI", "gctcttc");
	public static final RestrictionEnzyme AgeI = new RestrictionEnzyme("AgeI", "tbd"); //TODO look up when I have Internet
	public static final RestrictionEnzyme NgoMIV = new RestrictionEnzyme("NgoMIV", "gccggc");
	public static final RestrictionEnzyme BglII = new RestrictionEnzyme("BglII", "agatct");
	public static final RestrictionEnzyme BamHI = new RestrictionEnzyme("BamHI", "ggatcc");
	
	
	private static final long serialVersionUID = -1052856132128737969L;
	
	AminoAcid[]		aminoAcids;
	Codon[]			codons;
	ArrayList<OrgCodonTable>	organisms;
	ArrayList<Standard>			standards;
	
	/**
	 * Folder where the program's data is stored after session ends.
	 */
	public static final String storeDir = "data";
	
	/**
	 * File where the program's data is stored after session ends.
	 */
	public static final String storeFile = "myss.dat";
	
	/**
	 * Use this to generate all the data
	 */
	public Data(){
		
		/*
		 *  Intialize all the standards
		 */
		standards = new ArrayList<Standard>();
		
		Standard assemblyStandard10 = new Standard("gaattcgcggccgcttctag", "tactagtagcggccgctgcag");
		Standard assemblyStandard23 = new Standard("gaattcgcggccgcttcta", "actagtagcggccgctgcag");
		Standard assemblyStandard25 = new Standard("gaattccgcggccgcttctagatggccggc", "accggttaatactagtagcggccgctgcag");
		Standard assemblyStandard21 = new Standard("gaattcatgagatct", "ggatcctaactcgag");
		
		// set up assembly standard 10
		assemblyStandard10.addRestrictionSite(EcoRI, false);
		assemblyStandard10.addRestrictionSite(XbaI, false);
		assemblyStandard10.addRestrictionSite(SpeI, false);
		assemblyStandard10.addRestrictionSite(PstI, false);
		assemblyStandard10.addRestrictionSite(NotI, false);
		
		assemblyStandard10.addRestrictionSite(PvuI, true);
		assemblyStandard10.addRestrictionSite(XhoI, true);
		assemblyStandard10.addRestrictionSite(AvrII, true);
		assemblyStandard10.addRestrictionSite(NheI, true);
		assemblyStandard10.addRestrictionSite(SapI, true);
		
		// set up assembly standard 23
		assemblyStandard23.addRestrictionSite(EcoRI, false);
		assemblyStandard23.addRestrictionSite(XbaI, false);
		assemblyStandard23.addRestrictionSite(SpeI, false);
		assemblyStandard23.addRestrictionSite(PstI, false);
		assemblyStandard23.addRestrictionSite(NotI, false);
		
		assemblyStandard23.addRestrictionSite(PvuI, true);
		assemblyStandard23.addRestrictionSite(XhoI, true);
		assemblyStandard23.addRestrictionSite(AvrII, true);
		assemblyStandard23.addRestrictionSite(NheI, true);
		assemblyStandard23.addRestrictionSite(SapI, true);
		
		// set up assembly standard 25
		assemblyStandard10.addRestrictionSite(EcoRI, false);
		assemblyStandard10.addRestrictionSite(XbaI, false);
		assemblyStandard10.addRestrictionSite(SpeI, false);
		assemblyStandard10.addRestrictionSite(PstI, false);
		assemblyStandard10.addRestrictionSite(NotI, false);
		assemblyStandard25.addRestrictionSite(AgeI, false);
		assemblyStandard25.addRestrictionSite(NgoMIV, false);
		
		assemblyStandard10.addRestrictionSite(PvuI, true);
		assemblyStandard10.addRestrictionSite(XhoI, true);
		assemblyStandard10.addRestrictionSite(AvrII, true);
		assemblyStandard10.addRestrictionSite(NheI, true);
		assemblyStandard10.addRestrictionSite(SapI, true);
		
		// set up assembly standard 21
		assemblyStandard21.addRestrictionSite(EcoRI, false);
		assemblyStandard21.addRestrictionSite(BglII, false);
		assemblyStandard21.addRestrictionSite(BamHI, false);
		assemblyStandard21.addRestrictionSite(XhoI, false);
	}
	
	/**
	 * 
	 * Stores all data into the file specified by storeDir and storeFile.
	 * 
	 * @param usrList
	 * @throws IOException
	 */
	public static void store(Data d) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(storeDir + File.separator + storeFile));
		oos.writeObject(d);
	}
	
	/**
	 * @param data
	 * @return
	 */
	public int saveData(Data data){
		try{
			Data.store(data);
		}
		catch(IOException e){
			System.out.println("Data failed to save : IOException"); // Error checking statement
			return -1;
		}
		return 0;
	}
	
	
	/**
	 * 
	 * Loads all data from the file specified by storeDir and storeFile.
	 * 
	 * @return Returns the reconstructed user list from storage.
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static Data load()
	throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(
			new FileInputStream(storeDir + File.separator + storeFile));
		Data d = (Data)ois.readObject();
		return d;
	}
	
	/**
	 * @param data
	 * @return
	 */
	public Data loadData(Data data){
		File dataFile = new File(Data.storeDir + File.separator + Data.storeFile);
		
		/* check if file exists */
		if(dataFile.exists() == true){
			try{
				data = Data.load(); // loads data
			}
			catch(IOException e){
				System.out.println("Data failed to load : IOException"); // Error checking statement
				return null;
			}
			catch(ClassNotFoundException e){
				System.out.println("Data failed to load : ClassNotFoundException"); // Error checking statement
				return null;
			}
			
			return data;
		}
		
		return null;
	}
	
	/**
	 * @param newOrganism
	 */
	public void addOrganism(OrgCodonTable newOrganism){
		
	}
	
	/**
	 * @param orgName
	 */
	public void removeOrganism(String orgName){
		
	}
	
	/**
	 * @param standard
	 */
	public void addStandard(Standard standard){
		
	}
	
	/**
	 * @param standardName
	 */
	public void removeStandard(String standardName){
		
	}
	
	public Vector<String> getOrganismNames(){
		Vector<String> orgNames = new Vector<String>();
		
		for(int i = 0; i < this.organisms.size(); i++){
			orgNames.add(this.organisms.get(i).organismName);
		}
		
		return orgNames;
	}
	
	public Vector<String> getStandardNames(){
		Vector<String> standNames = new Vector<String>();
		
		for(int i = 0; i < this.standards.size(); i++){
			standNames.add(this.standards.get(i).standardName);
		}
		
		return standNames;
	}
	
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
		if(seq.compareTo(GCA) == 0 || seq.compareTo(GCC) == 0 || seq.compareTo(GCG) == 0 || seq.compareTo(GCT) == 0){
			aminoAcidIndex = ALANINE;
		}
		
		/* Arganine AGA AGG CGA CGC CGG CGT */
		else if(seq.compareTo(AGA) == 0 || seq.compareTo(AGG) == 0 || seq.compareTo(CGA) == 0 || seq.compareTo(CGC) == 0
				|| seq.compareTo(CGG) == 0 || seq.compareTo(CGT) == 0){
			aminoAcidIndex = ARGANINE;
		}
		
		/* Asparagine AAC AAT */
		else if(seq.compareTo(AAC) == 0 || seq.compareTo(AAT) == 0){
			aminoAcidIndex = ASPARAGINE;
		}
		
		/* Aspartic Acid GAC GAT */
		else if(seq.compareTo(GAC) == 0 || seq.compareTo(GAT) == 0){
			aminoAcidIndex = ASPARTIC_ACID;
		}
		
		/* Cysteine TGC TGT */
		else if(seq.compareTo(TGC) == 0 || seq.compareTo(TGT) == 0){
			aminoAcidIndex = CYSTEINE;
		}
		
		/* Glutamine CAA CAG*/
		else if(seq.compareTo(CAA) == 0 || seq.compareTo(CAG) == 0){
			aminoAcidIndex = GLUTAMINE;
		}
		
		/* Glutamic Acid GAA GAG*/
		else if(seq.compareTo(GAA) == 0 || seq.compareTo(GAG) == 0){
			aminoAcidIndex = GLUTAMIC_ACID;
		}
		
		/* Glycine GGA GGC GGG GGT*/
		else if(seq.compareTo(GGA) == 0 || seq.compareTo(GGC) == 0 || seq.compareTo(GGG) == 0 || seq.compareTo(GGT) == 0){
			aminoAcidIndex = GLYCINE;
		}
		
		/* Histidine CAC CAT*/
		else if(seq.compareTo(CAC) == 0 || seq.compareTo(CAT) == 0){
			aminoAcidIndex = HISTIDINE;
		}
		
		/* Isoleucine  ATA ATC ATT*/
		else if(seq.compareTo(ATA) == 0 || seq.compareTo(ATC) == 0 || seq.compareTo(ATT) == 0){
			aminoAcidIndex = ISOLEUCINE;
		}
		
		/* Leucine CTA CTC CTG CTT TTA TTG*/
		else if(seq.compareTo(CTA) == 0 || seq.compareTo(CTC) == 0 || seq.compareTo(CTG) == 0 || seq.compareTo(CTT) == 0 
				|| seq.compareTo(TTA) == 0 || seq.compareTo(TTG) == 0){
			aminoAcidIndex = LEUCINE;
		}
		
		/* Lysine AAA AAG*/
		else if(seq.compareTo(AAA) == 0 || seq.compareTo(AAG) == 0){
			aminoAcidIndex = LYSINE;
		}
		
		/* Methionine ATG*/
		else if(seq.compareTo(ATG) == 0){
			aminoAcidIndex = METHIONINE;
		}
		
		/* Phenalyaline TTC TTG*/
		else if(seq.compareTo(TTC) == 0 || seq.compareTo(TTG) == 0){
			aminoAcidIndex = PHENYLALANINE;
		}
		
		/* Proline  CCA CCC CCG CCT*/
		else if(seq.compareTo(CCA) == 0 || seq.compareTo(CCC) == 0 || seq.compareTo(CCG) == 0 || seq.compareTo(CCT) == 0){
			aminoAcidIndex = PROLINE;
		}
		
		/* Serine AGC AGT TCA TCC TCG TCT*/
		else if(seq.compareTo(AGC) == 0 || seq.compareTo(AGT) == 0 || seq.compareTo(TCA) == 0 || seq.compareTo(TCC) == 0 
				|| seq.compareTo(TCG) == 0 || seq.compareTo(TCT) == 0){
			aminoAcidIndex = SERINE;
		}
		
		/* Threonine ACA ACC ACG ACT*/
		else if(seq.compareTo(ACA) == 0 || seq.compareTo(ACC) == 0 || seq.compareTo(ACG) == 0 || seq.compareTo(ACT) == 0){
			aminoAcidIndex = THREONINE;
		}
		
		/* Tryptophan TGG*/
		else if(seq.compareTo(TGG) == 0){
			aminoAcidIndex = TRYPTOPHAN;
		}
		
		/* Tyrosine TAC TAT*/
		else if(seq.compareTo(TAC) == 0 || seq.compareTo(TAT) == 0){
			aminoAcidIndex = TYROSINE;
		}
		
		/* Valine GTA GTC GTG GTT*/
		else if(seq.compareTo(GTA) == 0 || seq.compareTo(GTC) == 0 || seq.compareTo(GTG) == 0 || seq.compareTo(GTT) == 0){
			aminoAcidIndex = VALINE;
		}
		
		/* Stop Codon  TAA TAG TGA*/
		else if(seq.compareTo(TAA) == 0 || seq.compareTo(TAG) == 0 || seq.compareTo(TGA) == 0){
			aminoAcidIndex = STOP_CODON;
		}
		
		return aminoAcidIndex;
	}
	
	public OrgCodonTable createOrgFromFile(String fileName){
		return null;
	}
	
	
}
