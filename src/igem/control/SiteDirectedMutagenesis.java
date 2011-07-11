package igem.control;

import igem.model.*;

import java.util.ArrayList;

public class SiteDirectedMutagenesis {
	
	ArrayList<String> materials;
	ArrayList<String> containers;
	ArrayList<String> steps;
	
	Primer primer;
	GeneSequence sequence;
	
	public SiteDirectedMutagenesis(Primer primer, GeneSequence sequence){
		this.primer = primer;
		this.sequence = sequence;
		
		materials = new ArrayList<String>();
		containers = new ArrayList<String>();
		steps = new ArrayList<String>();
	}
	
	public void run(){
		plasmidPrep();
		tempCycle();
		digestion();
		transformation();
	}
	
	private void plasmidPrep(){
		
	}
	
	private void tempCycle(){
		String newFluid;
		String newContainer;
		String newStep;
		
		// declare materials needed
		newContainer = "Container pcr_reaction_tube = new_container(STERILE_MICROFUGE_TUBE);";
		this.containers.add(newContainer);

	}
	
	private void digestion(){
		String newFluid;
		String newContainer;
		String newStep;
		
		// declare materials needed
		
		// create new fluid for the restriction enzyme that digests methylated DNA
		newFluid = "Fluid dpnI = new_fluid(\"DpnI restriction enzyme\", vol(1, UL);";
		this.materials.add(newFluid);
		
		
		
		// containers
		newStep = "next_step();";
		this.steps.add(newStep);
		newStep = "measure_fluid(dpnI, vol(1, UL), pcr_reaction_tube);";
		this.steps.add(newStep);
		
		
		// steps
		
	}

	private void transformation(){
		
	}
	
}
