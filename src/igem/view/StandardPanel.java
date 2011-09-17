package igem.view;

import igem.control.UtilityMethods;
import igem.model.RestrictionEnzyme;
import igem.model.Standard;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class StandardPanel extends JPanel{
	
	RestrictEnzymePanel enzymePanel;
	JList standardList;
	
	Vector<String> standardVector = new Vector<String>();
	
	int selectedIndex;
	int editIndex;
	int editState;
	
	private JTextField nameTextField;
	private JTextField prefixTextField;
	private JTextField suffixTextField;
	private JButton deleteButton;
	private JButton saveButton;
	private JButton addButton;
	private JButton cancelButton;
	
	public StandardPanel(){
		
		editIndex = 0;
		
		for(int i = 0; i < MainFrame.myss.standards.size(); i++){
			standardVector.add(MainFrame.myss.standards.get(i).getName());
		}
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 115, 0, 96, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 357, 60, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCurrentStandards = new JLabel("Current Standards");
		GridBagConstraints gbc_lblCurrentStandards = new GridBagConstraints();
		gbc_lblCurrentStandards.anchor = GridBagConstraints.WEST;
		gbc_lblCurrentStandards.gridwidth = 2;
		gbc_lblCurrentStandards.insets = new Insets(5, 5, 5, 5);
		gbc_lblCurrentStandards.gridx = 0;
		gbc_lblCurrentStandards.gridy = 0;
		add(lblCurrentStandards, gbc_lblCurrentStandards);
		
		JLabel lblStandardName = new JLabel("Standard Name");
		GridBagConstraints gbc_lblStandardName = new GridBagConstraints();
		gbc_lblStandardName.anchor = GridBagConstraints.WEST;
		gbc_lblStandardName.insets = new Insets(5, 20, 5, 5);
		gbc_lblStandardName.gridx = 2;
		gbc_lblStandardName.gridy = 0;
		add(lblStandardName, gbc_lblStandardName);
		
		nameTextField = new JTextField();
		GridBagConstraints gbc_nameTextField = new GridBagConstraints();
		gbc_nameTextField.gridwidth = 3;
		gbc_nameTextField.insets = new Insets(0, 0, 5, 0);
		gbc_nameTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_nameTextField.gridx = 3;
		gbc_nameTextField.gridy = 0;
		add(nameTextField, gbc_nameTextField);
		nameTextField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 5, 5, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		standardList = new JList(standardVector);
		standardList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		standardList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					selectedIndex = standardList.getSelectedIndex();
					//System.out.println("Activated list listener : " + selectedIndex);
					
					// if something is chosen display it
					if(selectedIndex != -1){
								if(editState == 0 || editState == 2){
									enableAllComponents();
									displayStandard(selectedIndex);
									
									// save index so that when saving it the right organism can be changed
									editIndex = selectedIndex;
									editState = 2;
									//System.out.println("Edit State : " + editState);
								}
								else if(editState == 1){
									ErrorMessage.giveErrorMessage("Please either save or cancel adding a new standard.");
								}
								
					}
				}
			}
		});
		scrollPane.setViewportView(standardList);
		standardList.setBorder(null);
		
		JLabel lblPrefix = new JLabel("Prefix");
		GridBagConstraints gbc_lblPrefix = new GridBagConstraints();
		gbc_lblPrefix.anchor = GridBagConstraints.WEST;
		gbc_lblPrefix.insets = new Insets(5, 20, 5, 5);
		gbc_lblPrefix.gridx = 2;
		gbc_lblPrefix.gridy = 1;
		add(lblPrefix, gbc_lblPrefix);
		
		prefixTextField = new JTextField();
		GridBagConstraints gbc_prefixTextField = new GridBagConstraints();
		gbc_prefixTextField.gridwidth = 3;
		gbc_prefixTextField.insets = new Insets(0, 0, 5, 0);
		gbc_prefixTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_prefixTextField.gridx = 3;
		gbc_prefixTextField.gridy = 1;
		add(prefixTextField, gbc_prefixTextField);
		prefixTextField.setColumns(10);
		
		JLabel lblSuffix = new JLabel("Suffix");
		GridBagConstraints gbc_lblSuffix = new GridBagConstraints();
		gbc_lblSuffix.anchor = GridBagConstraints.WEST;
		gbc_lblSuffix.insets = new Insets(5, 20, 5, 5);
		gbc_lblSuffix.gridx = 2;
		gbc_lblSuffix.gridy = 2;
		add(lblSuffix, gbc_lblSuffix);
		
		suffixTextField = new JTextField();
		GridBagConstraints gbc_suffixTextField = new GridBagConstraints();
		gbc_suffixTextField.gridwidth = 3;
		gbc_suffixTextField.insets = new Insets(0, 0, 5, 0);
		gbc_suffixTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_suffixTextField.gridx = 3;
		gbc_suffixTextField.gridy = 2;
		add(suffixTextField, gbc_suffixTextField);
		suffixTextField.setColumns(10);
		
		JLabel lblRestrictionSites = new JLabel("Restriction Sites");
		GridBagConstraints gbc_lblRestrictionSites = new GridBagConstraints();
		gbc_lblRestrictionSites.gridwidth = 4;
		gbc_lblRestrictionSites.insets = new Insets(10, 0, 5, 0);
		gbc_lblRestrictionSites.gridx = 2;
		gbc_lblRestrictionSites.gridy = 3;
		add(lblRestrictionSites, gbc_lblRestrictionSites);
		
		enzymePanel = new RestrictEnzymePanel();
		enzymePanel.setBorder(null);
		enzymePanel.setOpaque(false);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 4;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 4;
		add(enzymePanel, gbc_panel);
		
		/*
		 * Add standard
		 * 
		 */
		addButton = new JButton("+");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// somthing is notify user
				if(editState == 2){
					ErrorMessage.giveErrorMessage("Please either save or cancel changes to the standard being modified");
				}
				else if(editState == 1){
					ErrorMessage.giveErrorMessage("Please either save or cancel adding new standard.");
				}
				// nothing else is going on
				else{
					enableAllComponents();
					editState = 1;
					System.out.println("Edit State : " + editState);
				}
			}
		});
		GridBagConstraints gbc_addButton = new GridBagConstraints();
		gbc_addButton.insets = new Insets(0, 0, 0, 5);
		gbc_addButton.gridx = 0;
		gbc_addButton.gridy = 5;
		add(addButton, gbc_addButton);
		
		/*
		 * Delete a standard
		 * 
		 */
		deleteButton = new JButton("-");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO allow this to be an actual choice
				// show dialog that requires user to confirm whether or not they want to delete the organism
				ErrorMessage.giveErrorMessage("Are you sure you want to delete this standard?");
				
				
				// delete organism
				int selectedIndex = standardList.getSelectedIndex();
				
				if(selectedIndex != -1){
					MainFrame.myss.removeStandard(selectedIndex);
					clearFields();
					updateList();
					disableAllComponents();
					editState = 0;
					ErrorMessage.giveErrorMessage("Standard deleted successfully");
					
				}
			}
		});
		GridBagConstraints gbc_deleteButton = new GridBagConstraints();
		gbc_deleteButton.anchor = GridBagConstraints.WEST;
		gbc_deleteButton.insets = new Insets(0, 0, 0, 5);
		gbc_deleteButton.gridx = 1;
		gbc_deleteButton.gridy = 5;
		add(deleteButton, gbc_deleteButton);
		
		saveButton = new JButton("Save");
		/*
		 * Save changes
		 * 
		 */
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Standard newStandard;
				newStandard = gatherData();
				// adding new organism
				if(editState == 1){
					if(newStandard != null){
						if(MainFrame.myss.addStandard(newStandard)){
							ErrorMessage.giveErrorMessage("Standard added successfully.");
						}
						else{
							ErrorMessage.giveErrorMessage("Unable to add standard.");
						}
						
						clearFields();
						updateList();
						disableAllComponents();
						editState = 0;
						// TODO delete test statement
						System.out.println("Edit State : " + editState);
					}
				}
				//editing existing organism
				if(editState == 2){
					if(newStandard != null){
						MainFrame.myss.replaceStandard(editIndex, newStandard);
						ErrorMessage.giveErrorMessage("Standard modified successfully");
						clearFields();
						updateList();
						disableAllComponents();
						editState = 0;
						// TODO remove test statement
						System.out.println("Edit State : " + editState);
					}
					
				}
			}
		});
		GridBagConstraints gbc_saveButton = new GridBagConstraints();
		gbc_saveButton.insets = new Insets(0, 0, 0, 5);
		gbc_saveButton.gridx = 4;
		gbc_saveButton.gridy = 5;
		add(saveButton, gbc_saveButton);
		
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// set state
				if(editState == 1 || editState == 2){
					clearFields();
					disableAllComponents();
					standardList.setSelectedIndex(-1);
					editState = 0;
					// TODO remove test statement
					System.out.println("Edit State : " + editState);
				}
			}
		});
		GridBagConstraints gbc_cancelButton = new GridBagConstraints();
		gbc_cancelButton.gridx = 5;
		gbc_cancelButton.gridy = 5;
		add(cancelButton, gbc_cancelButton);
		
	}
	
	public void displayStandard(int index){
		Standard tempStandard = MainFrame.myss.getStandard(index);
		
		this.nameTextField.setText(tempStandard.getName());
		this.prefixTextField.setText(tempStandard.getPrefix());
		this.suffixTextField.setText(tempStandard.getSuffix());
		
		
	}
	
	public Standard gatherData(){
		if(checkFields() == false){
			return null;
		}
		else{
			String prefix = this.prefixTextField.getText();
			String suffix = this.suffixTextField.getText();
			String name = this.nameTextField.getText();
			
			Standard newStandard = new Standard(prefix, suffix, name);
			RestrictionEnzyme enzyme;
			
			for(int i = 0; i < this.enzymePanel.enzymeCheckBoxes.length; i++){
				if(this.enzymePanel.enzymeCheckBoxes[i].isSelected() == true){
					enzyme = MainFrame.myss.getEnzyme(i);
					newStandard.addRestrictionSite(enzyme, false);
				}
			}
			
			return newStandard;
		}
	}
	
	public boolean checkFields(){
		boolean allGood = true;
		boolean noEnzymes = true;
		
		String name = this.nameTextField.getText();
		String prefix = this.prefixTextField.getText();
		String suffix = this.suffixTextField.getText();
		
		// check name
		if(name.compareTo("") == 0){
			ErrorMessage.giveErrorMessage("Please enter a name for the standard.");
			allGood = false;
		}
		
		// check prefix
		if(prefix.compareTo("") == 0){
				ErrorMessage.giveErrorMessage("Please enter a prefix for the standard.");
				allGood = false;
		}
		else{
			if(UtilityMethods.checkNucleotideSequence(prefix) == false){
				ErrorMessage.giveErrorMessage("Prefix does not have an appropriate nucleotide sequence.");
				allGood = false;
			}
		}
		
		// check suffix
		if(suffix.compareTo("") == 0){
			ErrorMessage.giveErrorMessage("Please enter a suffix for the standard.");
			allGood = false;
		}
		else{
			if(UtilityMethods.checkNucleotideSequence(suffix) == false){
				ErrorMessage.giveErrorMessage("Suffix does not have an appropriate nucleotide sequence.");
				allGood = false;
			}
		}

		// check if there are any enzymes selected
		for(int i = 0; i < this.enzymePanel.enzymeCheckBoxes.length; i++){
			if(this.enzymePanel.enzymeCheckBoxes[i].isSelected() == true){
				noEnzymes = false;
			}
		}
		
		// no enzymes selected
		// TODO add a dialog box that gives you options
		if(noEnzymes == true){
			ErrorMessage.giveErrorMessage("No restriction sites were selected.");
		}
		
		return allGood;
	}
	
	public void updateList(){
		standardVector = MainFrame.myss.getStandardNames();
		standardList.setListData(standardVector);
	}
	
	public void clearFields(){
		this.nameTextField.setText("");
		this.prefixTextField.setText("");
		this.suffixTextField.setText("");
		
		for(int i = 0; i < this.enzymePanel.enzymeCheckBoxes.length; i++){
			this.enzymePanel.enzymeCheckBoxes[i].setSelected(false);
		}
		
	}
	
	public void enableAllComponents(){
		this.nameTextField.setEnabled(true);
		this.prefixTextField.setEditable(true);
		this.suffixTextField.setEditable(true);
		
		for(int i = 0; i < this.enzymePanel.enzymeCheckBoxes.length; i++){
			this.enzymePanel.enzymeCheckBoxes[i].setEnabled(true);
		}
		
		this.saveButton.setEnabled(true);
		this.cancelButton.setEnabled(true);
		
	}
	
	public void disableAllComponents(){
		this.nameTextField.setEnabled(false);
		this.prefixTextField.setEditable(false);
		this.suffixTextField.setEditable(false);
		
		for(int i = 0; i < this.enzymePanel.enzymeCheckBoxes.length; i++){
			this.enzymePanel.enzymeCheckBoxes[i].setEnabled(false);
		}
		
		this.saveButton.setEnabled(false);
		this.cancelButton.setEnabled(false);
	}
	

}
