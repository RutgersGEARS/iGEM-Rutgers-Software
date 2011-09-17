package igem.view;

import igem.model.Codon;
import igem.model.OrgCodonTable;

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


@SuppressWarnings("serial")
public class OrganismPanel extends JPanel{

	CodonTablePanel codonPanel;
	JList organismList;
	
	// 0 if nothing 1 if adding 2 if editing, 3 if just started up
	int editState;
	
	int selectedIndex;
	int editSelectedIndex;
	
	private Vector<String> orgVector = new Vector<String>();
	
	private JTextField orgNameTextField;
	private JButton addButton;
	private JButton deleteButton;
	private JButton saveButton;
	private JButton cancelButton;
	
	public OrganismPanel(){
		// all the logic stuff

		
		orgVector = MainFrame.myss.getOrganismNames();
		
		editState = 0;
		System.out.println("Edit State : " + editState);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{75, 70, 136, 214, 0, 40, 0};
		gridBagLayout.rowHeights = new int[]{0, 38, 445, 60, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCurrentOrganisms = new JLabel("Current Organisms");
		GridBagConstraints gbc_lblCurrentOrganisms = new GridBagConstraints();
		gbc_lblCurrentOrganisms.anchor = GridBagConstraints.WEST;
		gbc_lblCurrentOrganisms.gridwidth = 2;
		gbc_lblCurrentOrganisms.insets = new Insets(5, 5, 5, 5);
		gbc_lblCurrentOrganisms.gridx = 0;
		gbc_lblCurrentOrganisms.gridy = 0;
		add(lblCurrentOrganisms, gbc_lblCurrentOrganisms);
		
		JLabel lblOrganismName = new JLabel("Organism Name");
		GridBagConstraints gbc_lblOrganismName = new GridBagConstraints();
		gbc_lblOrganismName.anchor = GridBagConstraints.WEST;
		gbc_lblOrganismName.insets = new Insets(5, 20, 5, 5);
		gbc_lblOrganismName.gridx = 2;
		gbc_lblOrganismName.gridy = 0;
		add(lblOrganismName, gbc_lblOrganismName);
		
		orgNameTextField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(5, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 0;
		add(orgNameTextField, gbc_textField);
		orgNameTextField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 5, 5, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		

		organismList = new JList(orgVector);
		organismList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		organismList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
			      if (!e.getValueIsAdjusting()) {
						
						selectedIndex = organismList.getSelectedIndex();
						System.out.println("Activated list listener : " + selectedIndex);
						
						// if something is chosen display it
						if(selectedIndex != -1){
									if(editState == 0 || editState == 2){
										enableAllComponents();
										displayOrganism(selectedIndex);
										
										// save index so that when saving it the right organism can be changed
										editSelectedIndex = selectedIndex;
										editState = 2;
										System.out.println("Edit State : " + editState);
									}
									else if(editState == 1){
										ErrorMessage.giveErrorMessage("Please either save or cancel adding an organism.");
									}
									
						}
			      }


				
				
			}
		});
		scrollPane.setViewportView(organismList);
		organismList.setBorder(null);
		
		JLabel lblCodonUsageTable = new JLabel("Codon Usage Table");
		GridBagConstraints gbc_lblCodonUsageTable = new GridBagConstraints();
		gbc_lblCodonUsageTable.anchor = GridBagConstraints.WEST;
		gbc_lblCodonUsageTable.insets = new Insets(0, 20, 5, 5);
		gbc_lblCodonUsageTable.gridx = 2;
		gbc_lblCodonUsageTable.gridy = 1;
		add(lblCodonUsageTable, gbc_lblCodonUsageTable);
		
		// set the panel to the codon panel
		codonPanel = new CodonTablePanel();
		codonPanel.setBorder(null);
		codonPanel.setOpaque(false);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 4;
		gbc_panel.insets = new Insets(0, 20, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 2;
		add(codonPanel, gbc_panel);
		
		
		addButton = new JButton("+");
		/*
		 * Add organism
		 */
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// somthing is notify user
				if(editState == 2){
					ErrorMessage.giveErrorMessage("Please either save or cancel changes to the organism being modified : " + "add listener");
				}
				else if(editState == 1){
					ErrorMessage.giveErrorMessage("Please either save or cancel adding new organism : " + "add listener");
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
		gbc_addButton.gridy = 3;
		add(addButton, gbc_addButton);
		
		deleteButton = new JButton("-");
		/*
		 * Delete organism
		 */
		deleteButton.addActionListener(new ActionListener() {
			// delete organism
			public void actionPerformed(ActionEvent e) {
				// TODO allow this to be an actual choice
				// show dialog that requires user to confirm whether or not they want to delete the organism
				ErrorMessage.giveErrorMessage("Are you sure you want to delete this organism?");
				
				
				// delete organism
				int selectedIndex = organismList.getSelectedIndex();
				
				if(selectedIndex != -1){
					MainFrame.myss.removeOrganism(selectedIndex);
					
					clearFields();
					updateList();
					disableAllComponents();
					editState = 0;
					ErrorMessage.giveErrorMessage("Organism deleted successfully");
					
				}
				
			}
		});
		GridBagConstraints gbc_deleteButton = new GridBagConstraints();
		gbc_deleteButton.anchor = GridBagConstraints.WEST;
		gbc_deleteButton.insets = new Insets(0, 0, 0, 5);
		gbc_deleteButton.gridx = 1;
		gbc_deleteButton.gridy = 3;
		add(deleteButton, gbc_deleteButton);
		

		saveButton = new JButton("Save");
		/*
		 * Save changes
		 */
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrgCodonTable newOrg;
				newOrg = gatherData();
				// adding new organism
				if(editState == 1){
					if(newOrg != null){
						if(MainFrame.myss.addOrganism(newOrg)){
							ErrorMessage.giveErrorMessage("Organism added successfully : " + "save listener");
						}
						else{
							ErrorMessage.giveErrorMessage("Unable to add organism : " + "save listener");
						}
						
						clearFields();
						updateList();
						disableAllComponents();
						editState = 0;
						System.out.println("Edit State : " + editState);
					}
				}
				//editing existing organism
				if(editState == 2){
					if(newOrg != null){
						MainFrame.myss.replaceOrganism(newOrg, editSelectedIndex);
						ErrorMessage.giveErrorMessage("Organism modified successfully");
						clearFields();
						updateList();
						disableAllComponents();
						editState = 0;
						System.out.println("Edit State : " + editState);
					}
					
				}

				
			}
		});
		GridBagConstraints gbc_saveButton = new GridBagConstraints();
		gbc_saveButton.insets = new Insets(0, 0, 0, 5);
		gbc_saveButton.gridx = 4;
		gbc_saveButton.gridy = 3;
		add(saveButton, gbc_saveButton);
		
		cancelButton = new JButton("Cancel");
		
		/*
		 *  cancel adding organism
		 */
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// set state
				if(editState == 1 || editState == 2){
					clearFields();
					disableAllComponents();
					organismList.setSelectedIndex(-1);
					editState = 0;
					System.out.println("Edit State : " + editState);
				}
				
			}
		});
		GridBagConstraints gbc_cancelButton = new GridBagConstraints();
		gbc_cancelButton.gridx = 5;
		gbc_cancelButton.gridy = 3;
		add(cancelButton, gbc_cancelButton);
		
		disableAllComponents();
		
	}
	
	public boolean checkFields(){
		boolean allGood = true;
		if(this.orgNameTextField.getText().compareTo("") == 0){
			allGood = false;
		}
		
		for(int i = 0; i < 64; i++){
			if(this.codonPanel.textFieldArray[i].getText().compareTo("") == 0){
				allGood = false;
			}
			
			try{
				Double.parseDouble(this.codonPanel.textFieldArray[i].getText());
			}
			catch(NumberFormatException e){
				allGood = false;
			}
		}
		
		return allGood;
	}
	
	public void clearFields(){
		this.orgNameTextField.setText("");
		
		for(int i = 0; i < 64; i++){
			this.codonPanel.textFieldArray[i].setText("");
		}

	}
	
	public void displayOrganism(int index){

		
		OrgCodonTable currentOrg  = MainFrame.myss.getOrganism(index);
		
		this.orgNameTextField.setText(currentOrg.getOrganismName());
		
		for(int i = 0; i < 64; i++){
			this.codonPanel.textFieldArray[i].setText(Double.toString(currentOrg.getFrequencyValue(i)));
		}

	}
	
	public void updateList(){
		orgVector = MainFrame.myss.getOrganismNames();
		organismList.setListData(orgVector);
		//this.paintAll(getGraphics());
		
	}
	
	public OrgCodonTable gatherData(){
		if(checkFields() == false){
			ErrorMessage.giveErrorMessage("Please make sure all fields are filled in properly.");
			return null;
		}
		else{
			Codon tempCodon;
			OrgCodonTable newOrg = new OrgCodonTable(this.orgNameTextField.getText());
			
			for(int i = 0; i < 64; i++){
				tempCodon = MainFrame.myss.getCodonFromTable(i);
				tempCodon.setCodonFrequency(Double.parseDouble(this.codonPanel.textFieldArray[i].getText()));
				newOrg.addCodon(tempCodon);
				
				newOrg.setFrequencyValue(Double.parseDouble(this.codonPanel.textFieldArray[i].getText()), i);
			}
			
			return newOrg;
		}
	}
	
	public void enableAllComponents(){
		this.orgNameTextField.setEnabled(true);
		
		for(int i = 0; i < 64; i++){
			this.codonPanel.textFieldArray[i].setEnabled(true);
		}
		
		this.saveButton.setEnabled(true);
		this.cancelButton.setEnabled(true);
		
	}
	
	public void disableAllComponents(){
		this.orgNameTextField.setEnabled(false);
		
		for(int i = 0; i < 64; i++){
			this.codonPanel.textFieldArray[i].setEnabled(false);
		}
		
		this.saveButton.setEnabled(false);
		this.cancelButton.setEnabled(false);

		
	}

	


}
