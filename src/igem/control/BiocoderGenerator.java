package igem.control;

import java.io.*;

/**
 * @author Boris Joffe
 *
 * Works only for Linux. May work for Macs, Sun, other Unices
 * TODO - get it to run on Windows
 * 		* Add compiler directives to cpp files for Windows
 * 		* Modify Makefile to create Windows DLLs
 * 		* Update BiocoderGenerator to run the Windows Makefile
 */
public class BiocoderGenerator {
	
	private final boolean DEBUG = true; 	// Set to true to give extra debugging information
	
	// Directory to the BioCoder files
	private String workingDirectory = "BioCoder";
	
	// Protocol to be compiled
	private String protocol = "DNA_Sequencing";
	
	
	public String getDirectory() {
		return workingDirectory;
	}
	
	public void setDirectory(String workingDirectory) {
		this.workingDirectory = workingDirectory;
	}
	
	public String getProtocol() {
		return protocol;
	}
	
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String myDir = "/Users/sfairclough/Documents/iGEM-Rutgers-Software";
		String myProtocol = "DNA_Sequencing";
		BiocoderGenerator bg = new BiocoderGenerator (myDir, myProtocol);
		bg.make();		// Run make
		bg.clean();		// Run make clean 
	}

	// Empty constructor
	public BiocoderGenerator() {

	}

	public BiocoderGenerator(String dir, String protocol) {
		workingDirectory = dir;
		this.protocol = protocol;
	}
	
	public void make() {
		exec("make -C " + workingDirectory + " PROTOCOL=" + protocol);
		System.out.println("'make' completed");
	}
	
	public void clean() {
		exec("make -C " + workingDirectory + " clean PROTOCOL=" + protocol);
		System.out.println("'make clean' completed");
	}
	
	private void exec(String cmd){
		try { 
			Process p = Runtime.getRuntime().exec(cmd);
			p.waitFor(); 
			
			if (DEBUG) {
				BufferedReader reader=new BufferedReader(new InputStreamReader(p.getInputStream())); 
				String line=reader.readLine(); 
				
				while(line != null) { 
					System.out.println(line); 
					line=reader.readLine(); 
				}
			}

		} 
		catch(IOException e1) {} 
		catch(InterruptedException e2) {} 
		
		if (DEBUG) System.out.println("Finished running command: '" + cmd + "'");
	}
	
	

}
