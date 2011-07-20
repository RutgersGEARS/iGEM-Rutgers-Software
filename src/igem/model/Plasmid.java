package igem.model;

public class Plasmid {
	
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
