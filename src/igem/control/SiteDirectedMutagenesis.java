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
		String newFluid;
		
		// create new fluid for forward primer
		newFluid = "Fluid forwardPrimer = new_fluid(\"Forward primer\", \"10uM\")";
		this.materials.add(newFluid);
		
		// create new fluid for previous primer
		newFluid = "Fluid reversePrimer = new_fluid(\"Reverse primer\", \"10uM\"";
		this.materials.add(newFluid);
		
		// create new fluid for the template aka the mini-prepped DNA from a biobrick transformation
		newFluid = "Fluid biobrickPart = new_fluid(\"dsDNA template\", \"5 - 50ng or a 10X dilution from a miniprep\"";
		this.materials.add(newFluid);
	}
	
	private void tempCycle(){
		String newFluid;
		String newContainer;
		String newStep;
		
		// declare materials needed
		
		// 5 µl of 10× reaction buffer
		newFluid = "Fluid buffer = new_fluid(\"10x PCR Reaction Buffer\");";
		this.materials.add(newFluid);
		
		// 1 µl of dNTP mix
		newFluid = "Fluid dNTP = new_fluid(\"dNTP mix\");";
		this.materials.add(newFluid);
		

		//1 µl of PfuTurbo DNA polymerase (2.5 U/µl)
		newFluid = "Fluid polymerase = new_fluid(\"PfuTurbo DNA polymerase\");";
		this.materials.add(newFluid);
		
		// distilled water
		newFluid = "Fluid ddWater = new_fluid(\"Distilled Water\");";
		this.materials.add(newFluid);
		
		newContainer = "Container pcr_reaction_tube = new_container(STERILE_PCR_TUBE);";
		this.containers.add(newContainer);
		
		// all the set up for pcr
		newStep = "first_step(\"PCR reaction mix\");";
		this.steps.add(newStep);
		
		newStep = "Fluid fluid_array[4] = {biobrickPart, forwardPrimer, reversePrimer, buffer, dNTP, ddWater};";
		this.steps.add(newStep);
		
		newStep = "char* tubes[1] = {\"PCR Reaction for Quick Change\"};";
		this.steps.add(newStep);
		
		newStep = "Volume* volume[6] = {vol(1, UL), vol(1, UL), vol(1, UL), vol(5, UL), vol(1, UL), vol(XVAL, UL)};";
		this.steps.add(newStep);
		
		newStep = "mixing_table(2, 7, fluid_array, tubes, volume, vol(50, UL), pcr_reaction_tube);";
		this.steps.add(newStep);
		
		// add pfu Turbo
		newStep = "next_step()";
		this.steps.add(newStep);
		
		newStep = "measure_fluid(polymerase, vol(1, UL), pcr_reaction_tube);";
		this.steps.add(newStep);
		
		// pcr steps
		newStep = "next_step(\"PCR conditions\")";
		this.steps.add(newStep);
		
		newStep = "pcr_init_denat(pcr_reaction_tube, 95, time(30, SECS));";
		this.steps.add(newStep);
		
		newStep = "thermocycler(pcr_reaction_tube, 12, 95, time(30, SECS), 53, time(60, SECS), 68, time(" + this.determineTimeReplication() + " , SECS), NORMAL);";
		this.steps.add(newStep);
		
		// incubate on ice for 2 minutes
		newStep = "next_step(\"Store on ice\");";
		this.steps.add(newStep);
		
		newStep = "incubate(pcr_reaction_tube, ON_ICE, time(2, MINS));";
		this.steps.add(newStep);
		
		newStep = "comment(\"Check for amplification by running a 1% agarose gel or checking concentration with a spectrophotometer\");";
		
		
		
		
	}
	
	private void digestion(){
		String newFluid;
		String newContainer;
		String newStep;
		
		// declare materials needed
		
		// create new fluid for the restriction enzyme that digests methylated DNA
		newFluid = "Fluid dpnI = new_fluid(\"DpnI restriction enzyme\", vol(1, UL));";
		this.materials.add(newFluid);
		
		

		// next step
		newStep = "next_step(\"Digestion of methylated DNA by dpnI\");";
		this.steps.add(newStep);
		
		// measure dpnI into PCR reaction tube
		newStep = "measure_fluid(dpnI, vol(1, UL), pcr_reaction_tube);";
		this.steps.add(newStep);
		
		// mix by pipetting up and down
		newStep = "pipet(pcr_reaction_tube);";
		this.steps.add(newStep);
		
		// centrifuge for one minute
		newStep = "centrifuge(pcr_reaction_tube, speed(SPEED_MAX, RPM), RT, time(1, MINS));";
		this.steps.add(newStep);
		
		// incubate for one hour
		newStep = "incubate(pcr_reaction_tube, 37, time(1, HRS));";
		this.steps.add(newStep);
		

		
	}

	private void transformation(){
		
		String newFluid;
		String newContainer;
		String newStep;
		
		// chemically competent cells
		newFluid = "Fluid competent_cells = new_fluid(\"Chemically competent cells\", VOL(50, UL));";
		this.materials.add(newFluid);
		
		newFluid = "Plate plate = new_container(\"Plate made with " + this.sequence.getAntibioticResistance() + " antibiotic\");";
		this.materials.add(newFluid);
		
		
		// container with the comp cells in them
		newContainer = "Container comp_cell_tube = new_container(SCREW_CAP_TUBE, competent_cells);";
		this.containers.add(newContainer);
		
		
		// thaw competent cells on ice
		newStep = "next_step(\"Thaw comp cells\")";
		this.steps.add(newStep);
		
		newStep = "store_until(comp_cell_tube, ON_ICE, THAW_ICE)";
		this.steps.add(newStep);
		
		// transfer DNA to competent cells
		newStep = "next_step(\"Transfer dpnI DNA to competent cells\");";
		this.steps.add(newStep);
		
		newStep = "measure_fluid(pcr_reaction_tube, VOL(1, UL), comp_cell_tube);";
		this.steps.add(newStep);
		
		newStep = "tap(comp_cell_tube);";
		this.steps.add(newStep);
		
		// store on ice for 30 mins
		newStep = "incubate(comp_cell_tube, ON_ICE, time(30, MINS));";
		this.steps.add(newStep);
		
		// heat pulse for 45 sec at 42 degrees
		newStep = "next_step(\"Heat pulse cells\");";
		this.steps.add(newStep);
		
		newStep = "incubate(comp_cell_tube, 42, time(45, SECS));";
		this.steps.add(newStep);
		
		// store on ice for 2 mins
		newStep = "next_step(\"Ice cells\");";
		this.steps.add(newStep);
		
		newStep = "incubate(comp_cell_tube, ON_ICE, time(2, MINS));";
		this.steps.add(newStep);
		
		// plate cells
		newStep = "next_step(\"Plate cells\");";
		this.steps.add(newStep);
		
		newStep = "plate_out(plate, comp_cell_tube, vol_range(35, 50, UL));";
		this.steps.add(newStep);
		
		// incubate cells
		newStep = "incubate(plate, 37, time(16, HRS));";
		this.steps.add(newStep);
		
		// end the protocol
		newStep = "end_protocol()";
		this.steps.add(newStep);
		
	}
	
	public int determineTimeReplication(){
		double time;
		time = this.sequence.getTotalPlasmidBP() / 1000;
		time = time * 60;
		return (int)time;
	}
	
	public void printToFile(String fileName){
		
	}
	
	public static void main(String args[]){
		int i;
		
		Primer practicePrimer = new Primer("agctgcgctagcgctagcgctagctc", "agctgcgctagcgctagcgctagctc", 1);
		
		Plasmid practicePlasmid = new Plasmid("Kanamycin", 5000);
		
		GeneSequence practiceSequence = new GeneSequence("agatcgatgcagggactcgaaccgtgtgacgt", practicePlasmid);
		
		SiteDirectedMutagenesis practiceRun = new SiteDirectedMutagenesis(practicePrimer, practiceSequence);
		
		practiceRun.run();
		System.out.println("#include \"biocoder.h\"");
		System.out.println("void main()");
		System.out.println("{");
		
		System.out.println("\t" + "start_protocol(\"Quik Change Sited Directed Mutagenesis\");");
		System.out.println("\n");
		
		System.out.println("\t" + "// Materials needed");
		for(i = 0; i < practiceRun.materials.size(); i++){
			System.out.println("\t" + practiceRun.materials.get(i));
		}
		
		System.out.println("\n");
		System.out.println("\t" + "// Containers needed");
		
		for(i = 0; i < practiceRun.containers.size(); i++){
			System.out.println("\t" + practiceRun.containers.get(i));
		}
		
		System.out.println("\n");
		System.out.println("\t" + "// Steps needed to complete protocol");
		
		for(i = 0; i < practiceRun.steps.size(); i++){
			if(practiceRun.steps.get(i).startsWith("next_step") == true && i != 0){
				System.out.println("\n");
			}
			System.out.println("\t" + practiceRun.steps.get(i));
		}
		
		System.out.println("}");
	}
	
}
