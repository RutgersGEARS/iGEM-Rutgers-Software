package igem.model;

import java.io.Serializable;

public class Plasmid implements Serializable {
	
	private static final long serialVersionUID = -608398276320051554L;
	
	private String resistance;
	private int length;
	
	public Plasmid(String res, int l){
		this.resistance = res;
		this.length = l;
	}
	
	public String getResistance(){
		return this.resistance;
	}
	
	public int getLength(){
		return this.length;
	}
	
	public void setResistance(String res){
		this.resistance = res;
	}
	
	public void setLength(int l){
		this.length = l;
	}
}
