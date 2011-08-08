package igem.view;

import igem.model.Codon;
import igem.model.OrgCodonTable;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddOrganismView extends JFrame{
	MainMenu mainMenu;
	
	CodonPanel codonPanel;
	
	JLabel organismLabel;
	
	JTextField orgTextField;
	
	JButton clearButton;
	JButton cancelButton;
	JButton submitButton;
	
	public static final Font fontBold = new Font("Courier", Font.BOLD, 24);
	public static final Font font = new Font("Courier", Font.PLAIN, 14);
	
	protected OrganismListener ol;
	
	GridBagLayout gb = new GridBagLayout();
	GridBagConstraints gc = new GridBagConstraints();
	
	public AddOrganismView(MainMenu menu){
		super("Add Organsim");
		
		mainMenu = menu;
		
		make();
		setLayout(gb);
		layOut();
	}
	
	public void make(){
		ol = new OrganismListener();
		
		codonPanel = new CodonPanel(this.mainMenu);
			
		organismLabel = new JLabel("Organism Name");
		organismLabel.setFont(font);
		
		clearButton = new JButton("Clear");
		clearButton.setFont(font);
		clearButton.addActionListener(ol);
		
		submitButton = new JButton("Submit");
		submitButton.setFont(font);
		submitButton.addActionListener(ol);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setFont(font);
		cancelButton.addActionListener(ol);
		
		orgTextField = new JTextField(35);
		orgTextField.setFont(font);
		
	}
	
	public void layOut(){
		gc.insets = new Insets(8,8,8,8);
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipadx = 8;
		gb.setConstraints(organismLabel, gc);
		add(organismLabel);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(orgTextField, gc);
		add(orgTextField);
		
		gc.gridx = 0;
		gc.gridy = 2;
		gc.ipady = 8;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(clearButton, gc);
		add(clearButton);
		
		gc.gridx = 0;
		gc.gridy = 3;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(cancelButton, gc);
		add(cancelButton);
		
		gc.gridx = 0;
		gc.gridy = 4;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(submitButton, gc);
		add(submitButton);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.gridwidth = GridBagConstraints.REMAINDER;
		gc.gridheight = GridBagConstraints.REMAINDER;
		gb.setConstraints(codonPanel, gc);
		add(codonPanel);
		
	}
	
	public OrgCodonTable gatherData(){
		String tempSeq;
		Double tempFreq;
		String organismName = this.orgTextField.getText();
		OrgCodonTable newOrg = new OrgCodonTable(organismName);
		
		for(int i = 0; i < 64; i++){
			tempSeq = this.codonPanel.getCodonString(i);
			tempFreq = Double.parseDouble(codonPanel.getCodonFrequency(i));

			Codon tempCodon = new Codon(tempSeq, tempFreq);
			newOrg.addCodon(tempCodon);
		}
		
		// SAF test statement
		System.out.println(newOrg.toString());
		return newOrg;
	}
	
	
	protected class OrganismListener implements ActionListener	{
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton)e.getSource();
			
			if(source == clearButton){
				
			}
			else if(source == cancelButton){
				mainMenu.closeAddOrganismView();
			}
			else if(source == submitButton){
				
				// TODO check if all fields are filled in also need to check whether it has been succesfully added or not and all fields everywhere else have been updated
				
				if(mainMenu.myss.addOrganism(gatherData())){
					// SAF  Test statement
					System.out.println("Adding organism worked!!!!");
					mainMenu.closeAddOrganismView();
				}
				
			}
		}		
	}
}
