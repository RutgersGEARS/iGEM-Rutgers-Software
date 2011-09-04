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
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -4969198835234364139L;
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
	
	public static final String AMPICILLIN = "Ampicillin";
	public static final String KANAMYCIN = "Kanamycin";
	public static final String CHLORAMPHENICOL = "Chloramphenicol";
	public static final String TETRACYCLINE = "Tetracycline";
	
	public static final RestrictionEnzyme AgeI = new RestrictionEnzyme("AgeI", "accggt");
	public static final RestrictionEnzyme AvrII = new RestrictionEnzyme("AvrII", "cctagg");
	public static final RestrictionEnzyme BamHI = new RestrictionEnzyme("BamHI", "ggatcc");
	public static final RestrictionEnzyme BglII = new RestrictionEnzyme("BglII", "agatct");
	public static final RestrictionEnzyme EcoRI = new RestrictionEnzyme("EcoRI", "gaatc");
	public static final RestrictionEnzyme NheI = new RestrictionEnzyme("NheI", "gctagc");
	public static final RestrictionEnzyme NgoMIV = new RestrictionEnzyme("NgoMIV", "gccggc");
	public static final RestrictionEnzyme NotI = new RestrictionEnzyme("NotI", "gcggccgc");
	public static final RestrictionEnzyme PstI = new RestrictionEnzyme("PstI", "ctgcag");
	public static final RestrictionEnzyme PvuI = new RestrictionEnzyme("PvuI", "cagctg");
	public static final RestrictionEnzyme SapI = new RestrictionEnzyme("SapI", "gctcttc");
	public static final RestrictionEnzyme SpeI = new RestrictionEnzyme("SpeI", "actagt");
	public static final RestrictionEnzyme XbaI = new RestrictionEnzyme("XbaI", "tctaga");
	public static final RestrictionEnzyme XhoI = new RestrictionEnzyme("XhoI", "ctcgac");
	
	public static final RestrictionEnzyme BsaI = new RestrictionEnzyme("BsaI", "ggtctcn");
	public static final RestrictionEnzyme DraIII = new RestrictionEnzyme("DraIII", "cacnnngtg");
	public static final RestrictionEnzyme EagI = new RestrictionEnzyme("EagI", "cggccg");
	public static final RestrictionEnzyme EcoRV = new RestrictionEnzyme("EcoRV", "gatatc");
	public static final RestrictionEnzyme HindIII = new RestrictionEnzyme("HindIII", "aagctt");
	public static final RestrictionEnzyme KpnI = new RestrictionEnzyme("KpnI", "ggtacc");
	public static final RestrictionEnzyme MfeI = new RestrictionEnzyme("MfeI", "caattg");
	public static final RestrictionEnzyme NcoI = new RestrictionEnzyme("NcoI", "ccatgg");
	public static final RestrictionEnzyme PvuII = new RestrictionEnzyme("PvuII", "cagctg");
	public static final RestrictionEnzyme SacI = new RestrictionEnzyme("SacI", "gagctc");
	public static final RestrictionEnzyme SalI = new RestrictionEnzyme("SalI", "gtcgac");
	public static final RestrictionEnzyme SbfI = new RestrictionEnzyme("SbfI", "cctgcagg");
	public static final RestrictionEnzyme ScaI = new RestrictionEnzyme("ScaI", "agtact");
	public static final RestrictionEnzyme SphI = new RestrictionEnzyme("SphI", "gcatgc");
	public static final RestrictionEnzyme SspI = new RestrictionEnzyme("SspI", "aatatt");
	public static final RestrictionEnzyme StyI = new RestrictionEnzyme("StyI", "gcwwgg");

	
	AminoAcid[]		aminoAcids;
	Codon[]			codons;
	ArrayList<OrgCodonTable>	organisms;
	public ArrayList<Standard>			standards;
	public ArrayList<Plasmid>			backbones;
	ArrayList<RestrictionEnzyme>	enzymes;
	
	/**
	 * Folder where the program's data is stored after session ends.
	 */
	public static final String storeDir = "data";
	
	/**
	 * File where the program's data is stored after session ends.
	 */
	public static final String storeFile = "myss.dat";
	
	/**
	 * Folder where protocols generated by program are stored
	 */
	public static final String protocolDirectory = "protocols";
	
	/**
	 * Use this to generate all the data
	 */
	public Data(){

		codons = new Codon[64];

		aminoAcids = new AminoAcid[21];
		
		standards = new ArrayList<Standard>();
		
		enzymes = new ArrayList<RestrictionEnzyme>();
		
		backbones = new ArrayList<Plasmid>();
		
		organisms = new ArrayList<OrgCodonTable>();
		
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
	public boolean addOrganism(OrgCodonTable newOrganism){

		// search if the organism exists already
		for(int i = 0; i < this.organisms.size(); i++){
			if(this.organisms.get(i).getOrganismName().compareTo(newOrganism.getOrganismName()) == 0){
				return false;
			}
		}
		
		// if function doesn't return then add new organism
		this.organisms.add(newOrganism);
		
		// save data
		saveData(this);
		return true;	
	}
	
	/**
	 * @param orgName
	 */
	public boolean removeOrganism(String orgName){
		// search see if organism exists
		for(int i = 0; i < this.organisms.size(); i++){
			if(this.organisms.get(i).getOrganismName().compareTo(orgName) == 0){
				this.organisms.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * @param standard
	 */
	public boolean addStandard(Standard standard){
		// search see if standard already exists
		for(int i = 0; i < this.standards.size(); i++){
			if(this.standards.get(i).getName().compareTo(standard.getName()) == 0){
				return false;
			}
		}
		
		// standard was not added yet
		this.standards.add(standard);
		return  true;
	}
	
	/**
	 * @param standardName
	 */
	public boolean removeStandard(String standardName){
		// search see if standard already exists
		for(int i = 0; i < this.standards.size(); i++){
			if(this.standards.get(i).getName().compareTo(standardName) == 0){
				this.standards.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	public Vector<String> getOrganismNames(){
		Vector<String> orgNames = new Vector<String>();
		
		for(int i = 0; i < this.organisms.size(); i++){
			orgNames.add(this.organisms.get(i).getOrganismName());
		}
		
		return orgNames;
	}
	
	public Vector<String> getStandardNames(){
		Vector<String> standNames = new Vector<String>();
		
		for(int i = 0; i < this.standards.size(); i++){
			standNames.add(this.standards.get(i).getName());
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
		
		codons[44] = new Codon("GAT", 'D');
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
		
		codons[60] = new Codon("GGT", 'G');
		codons[61] = new Codon("GGC", 'G');
		codons[62] = new Codon("GGA", 'G');
		codons[63] = new Codon("GGG", 'G');
	}
	
	public void populateAminoAcidArray(){
		aminoAcids[0] = new AminoAcid("Alanine", "Ala", 'A');
		aminoAcids[1] = new AminoAcid("Arganine", "Arg", 'R');
		aminoAcids[2] = new AminoAcid("Asparagine", "Asn", 'N');
		aminoAcids[3] = new AminoAcid("Aspartic acid", "Asp", 'D');
		aminoAcids[4] = new AminoAcid("Cysteine", "Cys", 'C');
		aminoAcids[5] = new AminoAcid("Glutamic acid", "Gly", 'E');
		aminoAcids[6] = new AminoAcid("Glutamine", "Gln", 'Q');
		aminoAcids[7] = new AminoAcid("Glycine", "Gly", 'G');
		aminoAcids[7] = new AminoAcid("Histidine", "His", 'H');
		aminoAcids[8] = new AminoAcid("Isoleucine", "Ile", 'I');
		aminoAcids[9] = new AminoAcid("Leucine", "Leu", 'L');
		aminoAcids[10] = new AminoAcid("Lysine", "Lys", 'K');
		aminoAcids[11] = new AminoAcid("Methionine", "Met", 'M');
		aminoAcids[12] = new AminoAcid("Phenylalanine", "Phe", 'F');
		aminoAcids[13] = new AminoAcid("Proline", "Pro", 'P');
		aminoAcids[14] = new AminoAcid("Serine", "Ser", 'S');
		aminoAcids[15] = new AminoAcid("Threonine", "Thr", 'T');
		aminoAcids[16] = new AminoAcid("Tryptophan", "Thr", 'W');
		aminoAcids[17] = new AminoAcid("Tyrosine", "Tyr", 'Y');
		aminoAcids[18] = new AminoAcid("Valine", "Val", 'V');
		aminoAcids[19] = new AminoAcid("Stop codon", "stop", 'X');
	}
	
	public void populateRestrictionArray(){
		enzymes.add(AgeI);
		enzymes.add(AvrII);
		enzymes.add(BamHI);
		enzymes.add(BglII);
		enzymes.add(BsaI);
		enzymes.add(DraIII);
		enzymes.add(EagI);
		enzymes.add(EcoRI);
		enzymes.add(EcoRV);
		enzymes.add(HindIII);
		enzymes.add(KpnI);
		enzymes.add(MfeI);
		enzymes.add(NcoI);
		enzymes.add(NgoMIV);
		enzymes.add(NheI);
		enzymes.add(NotI);
		enzymes.add(PstI);
		enzymes.add(PvuI);
		enzymes.add(PvuII);
		enzymes.add(SacI);
		enzymes.add(SalI);
		enzymes.add(SapI);
		enzymes.add(SbfI);
		enzymes.add(ScaI);
		enzymes.add(SpeI);
		enzymes.add(SphI);
		enzymes.add(SspI);
		enzymes.add(StyI);
		enzymes.add(XbaI);
		enzymes.add(XhoI);
		
	}
	
	public void populateStandardArray(){
		Standard assemblyStandard10 = new Standard("gaattcgcggccgcttctag", "tactagtagcggccgctgcag", "Assembly Standard 10");
		Standard assemblyStandard23 = new Standard("gaattcgcggccgcttcta", "actagtagcggccgctgcag", "Assembly Standard 23");
		Standard assemblyStandard25 = new Standard("gaattccgcggccgcttctagatggccggc", "accggttaatactagtagcggccgctgcag", "Assembly Standard 25");
		Standard assemblyStandard21 = new Standard("gaattcatgagatct", "ggatcctaactcgag", "Assembly Standard 21");
		
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
		assemblyStandard25.addRestrictionSite(EcoRI, false);
		assemblyStandard25.addRestrictionSite(XbaI, false);
		assemblyStandard25.addRestrictionSite(SpeI, false);
		assemblyStandard25.addRestrictionSite(PstI, false);
		assemblyStandard25.addRestrictionSite(NotI, false);
		assemblyStandard25.addRestrictionSite(AgeI, false);
		assemblyStandard25.addRestrictionSite(NgoMIV, false);
		
		assemblyStandard25.addRestrictionSite(PvuI, true);
		assemblyStandard25.addRestrictionSite(XhoI, true);
		assemblyStandard25.addRestrictionSite(AvrII, true);
		assemblyStandard25.addRestrictionSite(NheI, true);
		assemblyStandard25.addRestrictionSite(SapI, true);
		
		// set up assembly standard 21
		assemblyStandard21.addRestrictionSite(EcoRI, false);
		assemblyStandard21.addRestrictionSite(BglII, false);
		assemblyStandard21.addRestrictionSite(BamHI, false);
		assemblyStandard21.addRestrictionSite(XhoI, false);
		
		standards.add(assemblyStandard21);
		standards.add(assemblyStandard25);
		standards.add(assemblyStandard23);
		standards.add(assemblyStandard10);
	}
	
	public void populatePlasmidArray(){
		Plasmid psb1a3 = new Plasmid(2155, "pSB1A3");
		psb1a3.addResistance(AMPICILLIN);
		backbones.add(psb1a3);
		
		Plasmid psb1c3 = new Plasmid(2070, "pSB1C3");
		psb1c3.addResistance(CHLORAMPHENICOL);
		backbones.add(psb1c3);
		
		Plasmid psb1k3 = new Plasmid(2204, "pSB1K3");
		psb1k3.addResistance(KANAMYCIN);
		backbones.add(psb1k3);
		
		Plasmid psb1t3 = new Plasmid(2463, "pSB1T3");
		psb1t3.addResistance(TETRACYCLINE);
		backbones.add(psb1t3);
	}
	
	public void populateData(){
		populateCodonArray();
		populateAminoAcidArray();
		populateRestrictionArray();
		populateStandardArray();
		populatePlasmidArray();
	}
	

	
	public String getCodonFromTable(int index){
		return codons[index].sequence;
	}
	
	public String getEnzyme(int index){
		return enzymes.get(index).toString();
	}
	
	public int getNumberOfEnzymes(){
		return enzymes.size();
	}
	
	public OrgCodonTable getOrganism(int index){
		return organisms.get(index);
	}
	
	public Standard getStandard(int index){
		return standards.get(index);
	}
	
	public Plasmid getBackbone(int index){
		return backbones.get(index);
	}
	
}
