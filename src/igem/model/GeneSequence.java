package igem.model;

public class GeneSequence {
	String unmodifiedSequence;
	String modifiedSequence;
	int codingIndex;
	int[] changes;
	
	public GeneSequence(String newSeq){
		unmodifiedSequence = newSeq;
		codingIndex = GeneSequence.findStartOfCodingSequence(unmodifiedSequence);
		modifiedSequence = null;
		changes = null;
	}
	
	
	/**
	 * @return
	 */
	public static int findStartOfCodingSequence(String seq){
		return -1;
	}
}
