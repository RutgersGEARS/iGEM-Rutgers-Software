package igem.view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddOrganismView extends JFrame{
	MainMenu mainMenu;
	
	JPanel codonPanel;
	
	JLabel organismLabel;
	
	JComboBox orgComboBox;
	
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
		
		codonPanel = new CodonPanel();
			
		organismLabel = new JLabel("Organism");
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
		
		// TODO hook up to back end this is just temporary
		Vector<String> orgNames = new Vector<String>();
		orgNames.add("Unicorn");
		orgNames.add("E Coli");
		orgNames.add("Mouse");
		orgNames.add("Walrus");
		
		orgComboBox = new JComboBox(orgNames);
		orgComboBox.setFont(font);
		
		
		

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
		gb.setConstraints(orgComboBox, gc);
		add(orgComboBox);
		
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
	
	
	protected class OrganismListener implements ActionListener	{
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton)e.getSource();
			
			if(source == clearButton){
				
			}
			else if(source == cancelButton){
				mainMenu.closeAddOrganismView();
			}
			else if(source == submitButton){
				
			}
		}		
	}
}
