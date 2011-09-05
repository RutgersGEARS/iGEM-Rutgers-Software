package igem.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Backbone implements Serializable {

	private static final long serialVersionUID = 1560228994971879067L;
	
	private ArrayList<String> resistance;
	private String plasmidName;
	private int length;
	
	public Backbone(int l, String name){
		this.plasmidName = name;
		this.resistance = new ArrayList<String>();
		this.length = l;
	}
	
	public String getAntibioticString(){
		String antibiotics = "";
		for(int i = 0; i < this.resistance.size(); i++){
			if(i == 0){
				antibiotics = antibiotics + this.resistance.get(i);
			}
			else{
				antibiotics = antibiotics + " or " + this.resistance.get(i);
			}
		}
		
		return antibiotics;
	}
	
	public int getLength(){
		return this.length;
	}
	
	public String getPlasmidName(){
		return this.plasmidName;
	}
	
	public void addResistance(String antibiotic){
		this.resistance.add(antibiotic);
	}
	
	public void setLength(int l){
		this.length = l;
	}
}
