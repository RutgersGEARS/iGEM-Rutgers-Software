package igem.model;

public class GeneSequence {
	String sequence;
	int codingIndex;
	int[] changes;
	
	public GeneSequence(String newSeq){
		sequence = newSeq;
		
		/*
		 * All need to change just testing sequences
		 */
		codingIndex = 0;
		changes = null;
		
	}
	
	/* no error checking yet */
	public int findStartOfCodingSequence(){
		return this.sequence.indexOf("ATG");
	}
}
