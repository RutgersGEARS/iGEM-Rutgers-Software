package igem.view;

import igem.control.PrimerDesign;
import igem.control.SeqModification;
import igem.model.GeneSequence;
import igem.model.OrgCodonTable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AnalyzeSequenceView extends JFrame{
	MainMenu mainMenu;
	JLabel sequenceLabel;
	JLabel organismLabel;
	JLabel standardLabel;
	JLabel plasmidLabel;
	
	JButton cancelButton;
	JButton submitButton;
	
	JRadioButton textRadioButton;
	JRadioButton fileRadioButton;
	
	JComboBox organismComboBox;
	JComboBox standardComboBox;
	JComboBox plasmidComboBox;
	
	ButtonGroup inputTypeButtonGroup;
	
	JTextArea sequenceArea;
	
	JScrollPane sequenceScroll;
	
	protected SequenceListener sl;
	
	GridBagLayout gb = new GridBagLayout();
	GridBagConstraints gc = new GridBagConstraints();
	
	public static final Color foreColor = Color.black;
	
	public static final Font fontBold = new Font("Courier", Font.BOLD, 24);
	public static final Font font = new Font("Courier", Font.PLAIN, 14);
	
	public AnalyzeSequenceView(MainMenu main){
		super("Analyze Sequence");
		mainMenu = main;
		make();
		setLayout(gb);
		layOut();
	}
	
	public void make(){
		sl = new SequenceListener();
		
		sequenceLabel = new JLabel("Sequence");
		sequenceLabel.setFont(font);
		
		organismLabel = new JLabel("Organism");
		organismLabel.setFont(font);
		
		standardLabel = new JLabel("Standard");
		standardLabel.setFont(font);
		
		plasmidLabel = new JLabel("Plasmid");
		plasmidLabel.setFont(font);
		
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(sl);
		
		submitButton = new JButton("Submit");
		submitButton.addActionListener(sl);
		
		sequenceArea = new JTextArea("Enter Sequence Here", 50, 50);
		sequenceArea.setEditable(true);
		
		sequenceScroll = new JScrollPane(sequenceArea);
		sequenceScroll.setPreferredSize(new Dimension(425, 125));
		
		textRadioButton = new JRadioButton("Text");
		textRadioButton.setSelected(true);
		
		fileRadioButton = new JRadioButton("File");
		
		inputTypeButtonGroup = new ButtonGroup();
		inputTypeButtonGroup.add(textRadioButton);
		inputTypeButtonGroup.add(fileRadioButton);
		
		/*
		 * TODO Temp until I hook this up with backend
		 */
		Vector<String> orgVector = new Vector<String>();
		orgVector = mainMenu.myss.getOrganismNames();
		
		Vector<String> standardVector = new Vector<String>();
		for(int i = 0; i < mainMenu.myss.standards.size(); i++){
			standardVector.add(mainMenu.myss.standards.get(i).getName());
		}
		
		Vector<String> plasmidVector = new Vector<String>();
		for(int i = 0; i < mainMenu.myss.backbones.size(); i++){
			plasmidVector.add(mainMenu.myss.backbones.get(i).getPlasmidName());
		}
		
		// populate up combo boxes
		organismComboBox = new JComboBox(orgVector);
		organismComboBox.setFont(font);
		
		standardComboBox = new JComboBox(standardVector);
		standardComboBox.setFont(font);
		
		plasmidComboBox = new JComboBox(plasmidVector);
		plasmidComboBox.setFont(font);
	}
	
	public void layOut(){
		gc.insets = new Insets(8,8,8,8);
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipadx = 8;
		gb.setConstraints(sequenceLabel, gc);
		add(sequenceLabel);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.gridwidth = GridBagConstraints.REMAINDER;
		gb.setConstraints(sequenceScroll, gc);
		add(sequenceScroll);
		
		gc.gridx = 2;
		gc.gridy = 1;
		// this is really important to the layout
		gc.gridwidth = 1;
		gb.setConstraints(textRadioButton, gc);
		add(textRadioButton);
		
		gc.gridx = 3;
		gc.gridy = 1;
		gb.setConstraints(fileRadioButton, gc);
		add(fileRadioButton);
		
		gc.gridx = 0;
		gc.gridy = 2;
		gb.setConstraints(organismLabel, gc);
		add(organismLabel);
		
		gc.gridx = 1;
		gc.gridy = 2;
		gb.setConstraints(organismComboBox, gc);
		add(organismComboBox);
		
		gc.gridx = 0;
		gc.gridy = 3;
		gb.setConstraints(standardLabel, gc);
		add(standardLabel);
		
		gc.gridx = 1;
		gc.gridy = 3;
		gb.setConstraints(standardComboBox, gc);
		add(standardComboBox);
		
		gc.gridx = 0;
		gc.gridy = 4;
		gb.setConstraints(plasmidLabel, gc);
		add(plasmidLabel);
		
		gc.gridx = 1;
		gc.gridy = 4;
		gb.setConstraints(plasmidComboBox, gc);
		add(plasmidComboBox);
		
		gc.gridx = 2;
		gc.gridy = 5;
		gc.ipady = 8;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(cancelButton, gc);
		add(cancelButton);
		
		gc.gridx = 3;
		gc.gridy = 5;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(submitButton, gc);
		add(submitButton);
		
	}
	
	
	public boolean checkInput(){
		
		return true;
	}
	
	public boolean testChangeCodons(){

		
		// get both the organism and the unmodified sequece from the users input
		OrgCodonTable organism = mainMenu.myss.getOrganism(this.organismComboBox.getSelectedIndex());
		String unmodifiedSequence = this.sequenceArea.getText();
		
		String modifiedSequence;
		String changesString = "";
		
		// GeneSequence object
		GeneSequence sequence = new GeneSequence(unmodifiedSequence);
		
		// call the function that replaces codons
		modifiedSequence = SeqModification.seqOptimizationAlgorithimSimple(unmodifiedSequence, organism);
		
		// find the changes that are made
		sequence.setModifiedSequence(modifiedSequence);
		sequence.findChanges();
		
		sequence = PrimerDesign.linearPrimerDesignAlgo(sequence);
		
		// print out the unmodified sequence
		System.out.println("UNMODIFIED SEQUENCE : " + unmodifiedSequence);
		
		// print out the modified sequence
		System.out.println("MODIFIED SEQUENCE : " + modifiedSequence);
		
		// print out the changes array
		for(int i = 0; i < sequence.changes.size(); i++){
			changesString += sequence.changes.get(i);
			changesString += " : ";
		}
		
		System.out.println(changesString);
		
		
		return true;
	}
	
	
	/**
	 * Handles all events on the main menu buttons
	 */
	protected class SequenceListener implements ActionListener	{
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton)e.getSource();
			
			if(source == cancelButton){
				
				// exit window
				mainMenu.closeAnalyzeSequenceView();

			}
			else if(source == submitButton){
				//ErrorMessage.giveErrorMessage("Please enter a genetic sequence");
				
				testChangeCodons();
				
				// check to make sure all fields are filled in
				// TODO get this working
				if(checkInput() == true){
					// continue
					
				}
				else{
					// give user an error message
				}
			}

		}		
	}
	
}
