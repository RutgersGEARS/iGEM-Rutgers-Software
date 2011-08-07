package igem.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class AddStandardView extends JFrame {
	MainMenu mainMenu;
	
	JLabel nameLabel;
	JLabel prefixLabel;
	JLabel suffixLabel;
	
	JLabel requiredLabel;
	JLabel optionalLabel;
	
	JTextField nameField;
	JTextField prefixField;
	JTextField suffixField;
	
	JButton cancelButton;
	JButton submitButton;
	JButton clearButton;
	
	ArrayList<JCheckBox> requiredEnzymes;
	ArrayList<JCheckBox> optionalEnzymes;
	
	StandardListener sl;
	
	GridBagLayout gb = new GridBagLayout();
	GridBagConstraints gc = new GridBagConstraints();
	
	public static final Color foreColor = Color.black;
	
	public static final Font fontBold = new Font("Courier", Font.BOLD, 24);
	public static final Font font = new Font("Courier", Font.PLAIN, 14);
	
	public AddStandardView(MainMenu main){
		super("Add Standard");
		mainMenu = main;
		make();
		setLayout(gb);
		layOut();
	}
	
	public void make(){
		sl = new StandardListener();
		
		nameLabel = new JLabel("Standard Name");
		nameLabel.setFont(font);
		
		prefixLabel = new JLabel("Prefix");
		prefixLabel.setFont(font);
		
		suffixLabel = new JLabel("Suffix");
		suffixLabel.setFont(font);
	
		requiredLabel = new JLabel("Required Enzymes");
		requiredLabel.setFont(font);
		
		optionalLabel = new JLabel("Optional Enzymes");
		optionalLabel.setFont(font);
		
		nameField = new JTextField(40);
		nameField.setEditable(true);

		prefixField = new JTextField(40);
		prefixField.setEditable(true);
		
		suffixField = new JTextField(40);
		suffixField.setEditable(true);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setFont(font);
		cancelButton.addActionListener(sl);
		
		submitButton = new JButton("Submit");
		submitButton.setFont(font);
		submitButton.addActionListener(sl);
		
		clearButton = new JButton("Clear");
		clearButton.setFont(font);
		clearButton.addActionListener(sl);
		
		requiredEnzymes = new ArrayList<JCheckBox>();
		optionalEnzymes = new ArrayList<JCheckBox>();
		
		// populate enzyme check box arrays
		for(int i = 0; i < mainMenu.myss.getNumberOfEnzymes(); i++){
			requiredEnzymes.add(new JCheckBox(mainMenu.myss.getEnzyme(i)));
			optionalEnzymes.add(new JCheckBox(mainMenu.myss.getEnzyme(i)));
		}
		
	}
	
	public void layOut(){
		boolean odd;
		int rowsEnzymes;
		
		gc.insets = new Insets(8,8,8,8);
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipadx = 4;
		gb.setConstraints(nameLabel, gc);
		add(nameLabel);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gb.setConstraints(prefixLabel, gc);
		add(prefixLabel);
		
		gc.gridx = 0;
		gc.gridy = 2;
		gb.setConstraints(suffixLabel, gc);
		add(suffixLabel);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.gridwidth = GridBagConstraints.REMAINDER;
		gb.setConstraints(nameField, gc);
		add(nameField);
		
		gc.gridx = 1;
		gc.gridy = 1;
		gb.setConstraints(prefixField, gc);
		add(prefixField);
		
		gc.gridx = 1;
		gc.gridy = 2;
		gb.setConstraints(suffixField, gc);
		add(suffixField);
		
		gc.gridx = 0;
		gc.gridy = 3;
		gc.gridwidth = 1;
		gb.setConstraints(requiredLabel, gc);
		add(requiredLabel);
		
		gc.gridx = 2;
		gc.gridy = 3;
		gb.setConstraints(optionalLabel, gc);
		add(optionalLabel);
		
		if((mainMenu.myss.getNumberOfEnzymes() % 2) == 0){
			odd = false;
		}
		else{
			odd = true;
		}
		
		rowsEnzymes = mainMenu.myss.getNumberOfEnzymes()/2;
		int iterator = 0;
		gc.anchor = GridBagConstraints.WEST;

		for(int i = 0; i < 2; i++){
			for(int j = 0; j < rowsEnzymes; j++){
					
				gc.gridx = i;
				gc.gridy = 4 + j;
				gb.setConstraints(requiredEnzymes.get(iterator), gc);
				add(requiredEnzymes.get(iterator));
				
				iterator++;
				
				if((i == 1) && (j == rowsEnzymes - 1) && (odd == true)){
					gc.gridx = i;
					gc.gridy = 5 + j;
					gb.setConstraints(requiredEnzymes.get(iterator), gc);
					add(requiredEnzymes.get(iterator));
				}
			}
		}
		
		iterator = 0;
		for(int i = 2; i < 4; i++){
			for(int j = 0; j < rowsEnzymes; j++){
					
				gc.gridx = i ;
				gc.gridy = 4 + j;
				gb.setConstraints(optionalEnzymes.get(iterator), gc);
				add(optionalEnzymes.get(iterator));
				
				iterator++;
				
				if((i == 3) && (j == rowsEnzymes - 1) && (odd == true)){
					gc.gridx = i ;
					gc.gridy = 5 + j;
					gb.setConstraints(optionalEnzymes.get(iterator), gc);
					add(optionalEnzymes.get(iterator));
				}
			}
		}
		
		gc.gridx = 0;
		gc.gridy = GridBagConstraints.RELATIVE;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.ipady = 8;
		gb.setConstraints(submitButton, gc);
		add(submitButton);
		
		gc.gridx = 1;
		gb.setConstraints(cancelButton, gc);
		add(cancelButton);
		
	}
	
	protected class StandardListener implements ActionListener	{
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton)e.getSource();
			
			if(source == submitButton){
				
			}
			else if(source == cancelButton){
				mainMenu.closeAddStandardView();
			}
			else if(source == clearButton){
				
			}

		}		
	}

}
