package igem.view;

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
	
	JLabel sequenceLabel;
	JLabel organismLabel;
	JLabel standardLabel;
	
	JButton cancelButton;
	JButton submitButton;
	
	JRadioButton textRadioButton;
	JRadioButton fileRadioButton;
	
	JComboBox organismComboBox;
	JComboBox standardComboBox;
	
	ButtonGroup inputTypeButtonGroup;
	
	JTextArea sequenceArea;
	
	JScrollPane sequenceScroll;
	
	protected SequenceListener sl;
	
	GridBagLayout gb = new GridBagLayout();
	GridBagConstraints gc = new GridBagConstraints();
	
	public static final Color foreColor = Color.black;
	
	public static final Font fontBold = new Font("Courier", Font.BOLD, 24);
	public static final Font font = new Font("Courier", Font.PLAIN, 14);
	
	public AnalyzeSequenceView(){
		super("Analyze Sequence");
		
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
		 * SAF Temp until I hook this up with backend
		 */
		Vector<String> orgVector = new Vector<String>();
		orgVector.add("E Coli");
		orgVector.add("Yeast");
		orgVector.add("Insect");
		orgVector.add("Reptile");
		orgVector.add("Mammal");
		orgVector.add("Human");
		
		Vector<String> standVector = new Vector<String>();
		standVector.add("BioBrick Assembly Standard 10");
		standVector.add("BioBrick Assembly Standard 21");
		standVector.add("BioBrick Assembly Standard 23");
		standVector.add("BioBrick Assembly Standard 25");
		
		// populate up combo boxes
		organismComboBox = new JComboBox(orgVector);
		organismComboBox.setFont(font);
		
		standardComboBox = new JComboBox(standVector);
		standardComboBox.setFont(font);
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
		
		gc.gridx = 2;
		gc.gridy = 4;
		gc.ipady = 8;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(cancelButton, gc);
		add(cancelButton);
		
		gc.gridx = 3;
		gc.gridy = 4;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(submitButton, gc);
		add(submitButton);
		
	}
	
	
	public boolean checkInput(){
		return true;
	}
	
	/**
	 * Handles all events on the main menu buttons
	 */
	protected class SequenceListener implements ActionListener	{
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton)e.getSource();
			
			if(source == cancelButton){
				
			}
			else if(source == submitButton){
				
				// check to make sure all fields are filled in
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