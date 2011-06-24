package igem.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class MainMenu extends JFrame {
	
	JLabel welcomeMessageLabel;
	
	JButton analyzeSequenceButton;
	
	JButton addOrganismButton;
	
	JButton modifyOrganismButton;
	
	JButton addStandardButton;
	
	JButton modifyStandardButton;
	
	JButton settingsButton;
	
	protected MenuListener ml;
	
	GridBagLayout gb = new GridBagLayout();
	
	GridBagConstraints gc = new GridBagConstraints();
	
	/**
	 * The foreground color for all button labels.
	 */ 
	public static final Color foreColor = Color.black;
	
	/**
	 * Khaki color
	 */ 
	public static final Color khaki = new Color(255, 246, 143);
	
	public MainMenu(){
		super("MYS!S Menu");
		
		make();
		setLayout(gb);
		layOut();
	}
	
	public void make(){
		welcomeMessageLabel = new JLabel("Welcome to MYS!S");
		
		analyzeSequenceButton = new JButton("Analyze Sequence");
		analyzeSequenceButton.setForeground(foreColor);
		analyzeSequenceButton.setBackground(khaki);
		analyzeSequenceButton.addActionListener(ml);
		
		addOrganismButton = new JButton("Add Organism");
		addOrganismButton.addActionListener(ml);
		
		modifyOrganismButton = new JButton("Modify Organism");
		modifyOrganismButton.addActionListener(ml);
		
		addStandardButton = new JButton("Add Standard");
		addStandardButton.addActionListener(ml);
		
		modifyStandardButton = new JButton("Modify Standard");
		modifyStandardButton.addActionListener(ml);
		
		settingsButton = new JButton("Settings");
		settingsButton.addActionListener(ml);
	}
	
	public void layOut(){
		gc.insets = new Insets(4,4,4,4);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gb.setConstraints(welcomeMessageLabel, gc);
		add(welcomeMessageLabel);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(analyzeSequenceButton, gc);
		add(analyzeSequenceButton);
		
		gc.gridx = 1;
		gc.gridy = 1;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(addOrganismButton, gc);
		add(addOrganismButton);
		
		gc.gridx = 2;
		gc.gridy = 1;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(modifyOrganismButton, gc);
		add(modifyOrganismButton);
		
		gc.gridx = 0;
		gc.gridy = 2;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(addStandardButton, gc);
		add(addStandardButton);
		
		gc.gridx = 1;
		gc.gridy = 2;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(modifyStandardButton, gc);
		add(modifyStandardButton);
		
		gc.gridx = 2;
		gc.gridy = 2;
		gc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(settingsButton, gc);
		add(settingsButton);
	}
	
	public static void main(String[] args){
		MainMenu main = new MainMenu();
		
		// set the close program operation
		main.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// TODO make sure everything saves
				
				System.exit(0);
			}
		});
		
		main.pack();  // least possible size for your window
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		main.setLocation(d.width/2-main.getWidth()/2,
					  d.height/2-main.getHeight()/2);
		main.setResizable(true);
		main.setVisible(true);
	}
	

	/**
	 * Handles all events on the main menu buttons
	 *
	 */
	protected class MenuListener implements ActionListener	{
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton)e.getSource();
			
			if(source == analyzeSequenceButton){
				
			}
			else if(source == addOrganismButton){
				
			}
			else if(source == modifyOrganismButton){
				
			}
			else if(source == addStandardButton){
				
			}
			else if(source == modifyStandardButton){
				
			}
			else if(source == settingsButton){
				
			}
		}		
	}
}
