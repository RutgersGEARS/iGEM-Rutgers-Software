package igem.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CodonOptimization extends GeneSequence implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3149178138193295023L;
	
	OrgCodonTable organism;
	Standard format;
	
	String unmodifiedHTML;
	String modifiedHTML;
	String primerHTML;
	String protocolHTML;
	
	String currentFilePath;
	
	
	public CodonOptimization(String newSeq, Backbone plasmid, String identifier, OrgCodonTable org, Standard standard){
		super(newSeq, plasmid, identifier);
		
		this.organism = org;
		this.format = standard;
		
		this.currentFilePath = "";
	}
	
	public OrgCodonTable getOrganism(){
		return this.organism;
	}
	
	public Standard getStandard(){
		return this.format;
	}
	
	public void generateUnmodifiedHTML(){
		int currentIndex = 0;
		int changeIndex;
		String unmodified = "<html>\n" + "<p>" ;
		
		// go through each change
		for(int i = 0; i < this.changes.size(); i++){
			changeIndex = this.changes.get(i);
			// are there consecutive changes
			if(currentIndex < changeIndex){
				unmodified += "<font face=arial color=black>";
				// put everything up to the changes in the
				for(int j = currentIndex; j < changeIndex; j++){
					unmodified += this.unmodifiedSequence.charAt(j);
				}
				unmodified += "</font";
			}
			
			unmodified += "<font face=arial color=purple>";
			unmodified += this.unmodifiedSequence.charAt(changeIndex);
			unmodified += "</font";
			
			currentIndex = changeIndex + 1;
		}
		
		if(currentIndex < this.unmodifiedSequence.length()){
			unmodified += "<font face=arial>";
			
			// put everything up to the changes in the 
			unmodified += this.unmodifiedSequence.substring(currentIndex, this.unmodifiedSequence.length());
			unmodified += "</font";
		}
		
		unmodified += "</p";
		
		this.unmodifiedHTML = unmodified;
		return;
	}
	
	public void generateModifiedHTML(){
		//System.out.println("HTML : " + this.modifiedSequence);
		int currentIndex = 0;
		int changeIndex;
		String modified = "<html>\n" + "<p>" ;
		
		// go through each change
		for(int i = 0; i < this.changes.size(); i++){
			changeIndex = this.changes.get(i);
			// are there consecutive changes
			if(currentIndex < changeIndex){
				modified += "<font face=arial color=black>";
				// put everything up to the changes in the
				for(int j = currentIndex; j < changeIndex; j ++){
					modified += this.modifiedSequence.charAt(j);
				}
				modified += "</font";
			}
			
			modified += "<font face=arial color=green>";
			modified += this.modifiedSequence.charAt(changeIndex);
			modified += "</font";
			
			currentIndex = changeIndex + 1;
		}
		
		if(currentIndex < this.modifiedSequence.length()){
			modified += "<font face=arial>";
			
			// put everything up to the changes in the 
			modified += this.modifiedSequence.substring(currentIndex, this.modifiedSequence.length());
			modified += "</font";
		}
		
		modified += "</p";
		
		this.modifiedHTML = modified;
		return;
	}
	
	public void generatePrimerHTML(){
		
		String primerString = "<html>\n";

		Primer currentPrimer;
		
		for(int i = 0; i < this.primers.size(); i++){
			currentPrimer = this.primers.get(i);
			primerString += "<p>" + "<font face=courier color=red>" + "3' " + "</font>" ;
			
			primerString += "<font face=courier color=black>";
			for(int j = currentPrimer.getTopSequence().length() - 1; j >= 0; j--){
				primerString += currentPrimer.getTopSequence().charAt(j);
			}
			primerString +=  "</font>" + "<font face=courier color=blue>" + " 5'" + "</font>" + "</p>\n";
			
			primerString += "<p>" + "<font face=courier color=blue>" + "5' " + "</font>" + "<font face=courier color=black>";
			primerString += currentPrimer.getBottomSequence();
			primerString += "</font>" + "<font face=arial color=red>" + " 3'" + "</font>" + "</p>\n";
			
			
			primerString += "<hr width=2500>\n";
		}
		
		this.primerHTML = primerString;
		return;
	
		
	}
	
	public String getUnmodifiedHTML(){
		return unmodifiedHTML;
	}
	
	public String getModifiedHTML(){
		return modifiedHTML;
	}
	
	public String getPrimerHTML(){
		return primerHTML;
	}
	
	public String getCurrentFilePath(){
		return currentFilePath;
	}
	
	public void setCurrentFilePath(String path){
		this.currentFilePath = path;
	}
	
	/**
	 * 
	 * Stores all data into the file specified by storeDir and storeFile.
	 * 
	 * @param usrList
	 * @throws IOException
	 */
	public static void store(CodonOptimization c, String filePath) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(filePath));
		oos.writeObject(c);
	}
	
	/**
	 * @param data
	 * @return
	 */
	public int saveData(CodonOptimization c, String filePath){
		try{
		CodonOptimization.store(c, filePath);
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
	 */
	public static Data load(String filePath)
	throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(
			new FileInputStream(filePath));
		Data d = (Data)ois.readObject();
		return d;
	}
	

	public Data loadData(Data data, String filePath){
		File dataFile = new File(filePath);
		
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
	

}
