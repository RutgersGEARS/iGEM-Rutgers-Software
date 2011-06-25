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
		 * Initialize Codon table this should only happen once
		 */
		codons = new Codon[64];
		populateCodonArray();
		
		/*
		 * TODO Initialize Amino Acid table again this should only happen once
		 */
		
		/*
		 *  Intialize all the standards
		 *  TODO add a couple more standards
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
	 * Ugly method to populate the codon array
	 */
	public void populateCodonArray(){
		// column 1
		codons[0] = new Codon("TTT", 'F');
		codons[1] = new Codon("TTC", 'F');
		codons[2] = new Codon("TTA", 'L');
		codons[3] = new Codon("TTG", 'L');
		
		codons[4] = new Codon("CTT", 'L');
		codons[5] = new Codon("CTC", 'L');
		codons[6] = new Codon("CTA", 'L');
		codons[7] = new Codon("CTG", 'L');
		
		codons[8] = new Codon("ATT", 'I');
		codons[9] = new Codon("ATC", 'I');
		codons[10] = new Codon("ATA", 'I');
		codons[11] = new Codon("ATG", 'M');
		
		codons[12] = new Codon("GTT", 'V');
		codons[13] = new Codon("GTC", 'V');
		codons[14] = new Codon("GTA", 'V');
		codons[15] = new Codon("GTG", 'V');
		
		// column 2
		codons[16] = new Codon("TCT", 'S');
		codons[17] = new Codon("TCC", 'S');
		codons[18] = new Codon("TCA", 'S');
		codons[19] = new Codon("TCG", 'S');
		
		codons[20] = new Codon("CCT", 'P');
		codons[21] = new Codon("CCC", 'P');
		codons[22] = new Codon("CCA", 'P');
		codons[23] = new Codon("CCG", 'P');
		
		codons[24] = new Codon("ACT", 'T');
		codons[25] = new Codon("ACC", 'T');
		codons[26] = new Codon("ACA", 'T');
		codons[27] = new Codon("ACG", 'T');
		
		codons[28] = new Codon("GCT", 'A');
		codons[29] = new Codon("GCC", 'A');
		codons[30] = new Codon("GCA", 'A');
		codons[31] = new Codon("GCG", 'A');
		
		// column 3
		codons[32] = new Codon("TAT", 'Y');
		codons[33] = new Codon("TAC", 'Y');
		codons[34] = new Codon("TAA", 'X');
		codons[35] = new Codon("TAG", 'X');
		
		codons[36] = new Codon("CAT", 'H');
		codons[37] = new Codon("CAC", 'H');
		codons[38] = new Codon("CAA", 'Q');
		codons[39] = new Codon("CAG", 'Q');
		
		codons[40] = new Codon("AAT", 'N');
		codons[41] = new Codon("AAC", 'N');
		codons[42] = new Codon("AAA", 'K');
		codons[43] = new Codon("AAG", 'K');
		
		codons[44] = new Codon("GAU", 'D');
		codons[45] = new Codon("GAC", 'D');
		codons[46] = new Codon("GAA", 'E');
		codons[47] = new Codon("GAG", 'E');
		
		//column 4
		codons[48] = new Codon("TGT", 'C');
		codons[49] = new Codon("TGC", 'C');
		codons[50] = new Codon("TGA", 'X');
		codons[51] = new Codon("TGG", 'V');
		
		codons[52] = new Codon("CGT", 'R');
		codons[53] = new Codon("CGC", 'R');
		codons[54] = new Codon("CGA", 'R');
		codons[55] = new Codon("CGG", 'R');
		
		codons[56] = new Codon("AGT", 'S');
		codons[57] = new Codon("AGC", 'S');
		codons[58] = new Codon("AGA", 'R');
		codons[59] = new Codon("AGG", 'R');
		
		codons[60] = new Codon("AAT", 'G');
		codons[61] = new Codon("AAC", 'G');
		codons[62] = new Codon("AAA", 'G');
		codons[63] = new Codon("AAG", 'G');
	}
	
	public String getCodonFromTable(int index){
		return codons[index].sequence;
	}
}
