package igem.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * AminoAcid class describes an amino acid that has codons which contain certain frequencies these codons are stored in order of highest to lowest frequency.
 * 
 * @author 
 *
 */
public class AminoAcid implements Serializable{

	private static final long serialVersionUID = 7063915047765042222L;
	

	ArrayList<Codon> codons;
	String name;
	String abrvName;
	char symbol;
	
	/**
	 * @param name
	 * @param abrvName
	 * @param symbol
	 */
	public AminoAcid(String name, String abrvName, char symbol){
		this.codons = new ArrayList<Codon>();
		this.name = name;
		this.abrvName = abrvName;
		this.symbol = symbol;
	}
	
	/**
	 * For rank of 1 it determines the most frequent codon,
	 * for rank 2 it determines the next most frequent codon etc.
	 * 
	 * @param rank
	 * @return The nth most frequent Codon for that particular amino acid
	 */
	public Codon getDesiredCodon(int rank){
		
		// invalid index return null
		if(this.codons.size() < rank){
			return null;
		}
		
		// valid index go get that codon
		else{
			return this.codons.get(rank);
		}
	}
	
	/**
	 * Inserts codons in order of most frequent with index 0 to least frequent with index 1 ... 6.
	 * @param newCodon
	 */
	public void insertCodon(Codon newCodon){
		
		boolean isAdded = false;
		
		// no codons are in array list yet just pop in front
		if(this.codons.size() == 0){
			this.codons.add(newCodon);
			isAdded = true;
		}
		
		// codons are already in array find appropriate spot
		else{
			for(int i = 0; i < this.codons.size(); i++){
				if(this.codons.get(i).frequency < newCodon.frequency && isAdded == false){
					this.codons.add(i, newCodon);
					isAdded = true;
				}
			}
		}
		
		if(isAdded == false){
			this.codons.add(newCodon);
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String output;
		output = this.name + "     " + this.symbol + "     " + this.abrvName + "\n";
		for(int i = 0; i < this.codons.size(); i++){
			
			output += "\t";
			output += this.codons.get(i).toString();
		}
		
		return output;
	}
}
