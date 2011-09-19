package igem.view;

import igem.control.UtilityMethods;
import igem.model.Backbone;
import igem.model.CodonOptimization;
import igem.model.OrgCodonTable;
import igem.model.Standard;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class CodonOptimizationPanel extends JPanel{
	
	private Vector<String> organismVector = new Vector<String>();
	private Vector<String> standardVector = new Vector<String>();
	private Vector<String> plasmidVector = new Vector<String>();
	
	SeqAnalysisPanel sequencePanel = new SeqAnalysisPanel();
	ProtocolPanel protocolPanel = new ProtocolPanel();
	RNAStructurePanel structurePanel = new RNAStructurePanel();
	
	CodonOptimization currentCO;
	
	private final JTextField nameTextField = new JTextField();

	private final JComboBox organismComboBox;
	private final JComboBox standardComboBox;
	private final JComboBox plasmidComboBox;
	
	private final JButton goButton = new JButton("Go!");
	
	private final JLabel plasmidLabel = new JLabel("Plasmid");
	private final JLabel organismLabel = new JLabel("Organism");
	private final JLabel standardLabel = new JLabel("Standard");
	
	public CodonOptimizationPanel(){
		
		// get vectors of component names
		
		organismVector = MainFrame.myss.getOrganismNames();

		
		for(int i = 0; i < MainFrame.myss.standards.size(); i++){
			standardVector.add(MainFrame.myss.standards.get(i).getName());
		}

		
		for(int i = 0; i < MainFrame.myss.backbones.size(); i++){
			plasmidVector.add(MainFrame.myss.backbones.get(i).getPlasmidName());
			
		}
		
		organismComboBox = new JComboBox(organismVector);
		standardComboBox = new JComboBox(standardVector);
		plasmidComboBox = new JComboBox(plasmidVector);
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 132, 0, 0, 47, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel nameLabel = new JLabel("Sequence Name");
		GridBagConstraints gbc_nameLabel = new GridBagConstraints();
		gbc_nameLabel.anchor = GridBagConstraints.EAST;
		gbc_nameLabel.insets = new Insets(5, 10, 5, 5);
		gbc_nameLabel.gridx = 0;
		gbc_nameLabel.gridy = 0;
		add(nameLabel, gbc_nameLabel);
		
		nameTextField.setColumns(15);
		GridBagConstraints gbc_nameTextField = new GridBagConstraints();
		gbc_nameTextField.insets = new Insets(5, 0, 5, 5);
		gbc_nameTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_nameTextField.gridx = 1;
		gbc_nameTextField.gridy = 0;
		add(nameTextField, gbc_nameTextField);
		
		GridBagConstraints gbc_organismLabel = new GridBagConstraints();
		gbc_organismLabel.anchor = GridBagConstraints.EAST;
		gbc_organismLabel.insets = new Insets(5, 5, 5, 5);
		gbc_organismLabel.gridx = 2;
		gbc_organismLabel.gridy = 0;
		add(organismLabel, gbc_organismLabel);
		
		GridBagConstraints gbc_organismComboBox = new GridBagConstraints();
		gbc_organismComboBox.insets = new Insets(5, 0, 5, 5);
		gbc_organismComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_organismComboBox.gridx = 3;
		gbc_organismComboBox.gridy = 0;
		add(organismComboBox, gbc_organismComboBox);
		
		GridBagConstraints gbc_standardLabel = new GridBagConstraints();
		gbc_standardLabel.anchor = GridBagConstraints.EAST;
		gbc_standardLabel.insets = new Insets(5, 5, 5, 5);
		gbc_standardLabel.gridx = 4;
		gbc_standardLabel.gridy = 0;
		add(standardLabel, gbc_standardLabel);
		
		GridBagConstraints gbc_standardComboBox = new GridBagConstraints();
		gbc_standardComboBox.insets = new Insets(5, 0, 5, 5);
		gbc_standardComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_standardComboBox.gridx = 5;
		gbc_standardComboBox.gridy = 0;
		add(standardComboBox, gbc_standardComboBox);
		
		GridBagConstraints gbc_plasmidLabel = new GridBagConstraints();
		gbc_plasmidLabel.anchor = GridBagConstraints.EAST;
		gbc_plasmidLabel.insets = new Insets(5, 5, 5, 5);
		gbc_plasmidLabel.gridx = 6;
		gbc_plasmidLabel.gridy = 0;
		add(plasmidLabel, gbc_plasmidLabel);
		
		GridBagConstraints gbc_plasmidComboBox = new GridBagConstraints();
		gbc_plasmidComboBox.insets = new Insets(5, 0, 5, 5);
		gbc_plasmidComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_plasmidComboBox.gridx = 7;
		gbc_plasmidComboBox.gridy = 0;
		add(plasmidComboBox, gbc_plasmidComboBox);
		
		GridBagConstraints gbc_goButton = new GridBagConstraints();
		gbc_goButton.insets = new Insets(5, 5, 5, 0);
		gbc_goButton.gridx = 8;
		gbc_goButton.gridy = 0;
		goButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// check fields
				if(checkFields() == true){
					// gather data
				CodonOptimization nucleotideSequence = gatherData();
				
				// create CodonOptimization object
				nucleotideSequence = UtilityMethods.performCodonOptimization(nucleotideSequence);
				setEditorPanes(nucleotideSequence);	
				}
				else{
					ErrorMessage.giveErrorMessage("Unable to perform codon optimization.");
				}
			}
		});
		add(goButton, gbc_goButton);
		
		// set to transparent so you don't have to worry about the background
		sequencePanel.setOpaque(false);
		protocolPanel.setOpaque(false);
		structurePanel.setOpaque(false);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		// add sequnce analysis view
		tabbedPane.addTab("Sequence", sequencePanel);
		tabbedPane.addTab("RNA Structure", structurePanel);
		tabbedPane.addTab("Protocol", protocolPanel);
					
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.insets = new Insets(0, 0, 0, 5);
		gbc_tabbedPane.gridwidth = 9;
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 1;
		add(tabbedPane, gbc_tabbedPane);
		
	}
	
	public boolean checkFields(){
		if(this.nameTextField.getText().compareTo("") == 0){
			ErrorMessage.giveErrorMessage("Please enter a sequence name.");
			return false;
		}
		
		if(this.sequencePanel.getOriginalText().compareTo("") == 0){
			ErrorMessage.giveErrorMessage("Please enter a genetic sequence.");
			return false;
		}
		else{
			if(UtilityMethods.checkNucleotideSequence(this.sequencePanel.getOriginalText()) == false){
				ErrorMessage.giveErrorMessage("Nucleotide sequence must contain only the characters 'g', 'c', 'a', 't', 'G', 'C', 'A', or 'T'.");
				return false;
			}
		}
		
		if((this.organismComboBox.getSelectedIndex() == -1) || (this.standardComboBox.getSelectedIndex() == -1) || (this.plasmidComboBox.getSelectedIndex() == -1)){
			ErrorMessage.giveErrorMessage("Please select an organism, a standard, and a plasmid.");
			return false;
		}

		return true;
	}
	
	public CodonOptimization gatherData(){
		
		String name;
		OrgCodonTable organism;
		Standard standard;
		Backbone backbone;
		
		String nucleotideSequence;
		
		name = this.nameTextField.getName();
		organism = MainFrame.myss.getOrganism(this.organismComboBox.getSelectedIndex());
		standard = MainFrame.myss.getStandard(this.standardComboBox.getSelectedIndex());
		backbone = MainFrame.myss.getBackbone(this.plasmidComboBox.getSelectedIndex());
		nucleotideSequence = this.sequencePanel.getOriginalText();
		
		CodonOptimization sequence = new CodonOptimization(nucleotideSequence, backbone, name, organism, standard);
	
		return sequence;
	}
	
	public void setEditorPanes(CodonOptimization seq){
		seq.generateUnmodifiedHTML();
		seq.generateModifiedHTML();
		seq.generatePrimerHTML();
		
		this.sequencePanel.setOriginalText(seq.getUnmodifiedHTML());
		this.sequencePanel.setModifiedPane(seq.getModifiedHTML());
		
	}

}
