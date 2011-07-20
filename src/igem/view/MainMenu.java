package igem.view;

import igem.model.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainMenu extends JFrame {
	
	public static Data myss;
	
	AnalyzeSequenceView seqView;
	AddOrganismView orgView;
	
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
	
	public static final Color foreColor = Color.black;
	
	public static final Font fontBold = new Font("Courier", Font.BOLD, 24);
	public static final Font font = new Font("Courier", Font.PLAIN, 14);
		
	public MainMenu(){
		super("MYS!S Menu");
		
		myss = new Data();
		
		make();
		setLayout(gb);
		layOut();
	}
	
	public void make(){
		ml = new MenuListener();
		
		welcomeMessageLabel = new JLabel("Welcome to MYS!S");
		welcomeMessageLabel.setFont(fontBold);
		
		analyzeSequenceButton = new JButton("Analyze Sequence");
		analyzeSequenceButton.setFont(font);
		analyzeSequenceButton.addActionListener(ml);
		
		addOrganismButton = new JButton("Add Organism");
		addOrganismButton.setFont(font);
		addOrganismButton.addActionListener(ml);
		
		modifyOrganismButton = new JButton("Modify Organism");
		modifyOrganismButton.setFont(font);
		modifyOrganismButton.addActionListener(ml);
		
		addStandardButton = new JButton("Add Standard");
		addStandardButton.setFont(font);
		addStandardButton.addActionListener(ml);
		
		modifyStandardButton = new JButton("Modify Standard");
		modifyStandardButton.setFont(font);
		modifyStandardButton.addActionListener(ml);
		
		settingsButton = new JButton("Settings");
		settingsButton.setFont(font);
		settingsButton.addActionListener(ml);
	}
	
	public void layOut(){
		gc.insets = new Insets(8,8,8,8);
		
		gc.gridx = 1;
		gc.gridy = 0;
		gb.setConstraints(welcomeMessageLabel, gc);
		add(welcomeMessageLabel);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.ipady = 16;
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
	
	public void openAnalyzeSequenceView(){
		this.seqView = new AnalyzeSequenceView(this);
		
		this.seqView.pack();  // least possible size for your window
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		this.seqView.setLocation(d.width/2-this.seqView.getWidth()/2,
					  d.height/2-this.seqView.getHeight()/2);
		this.seqView.setResizable(true);
		this.seqView.setVisible(true);
	}
	
	public void closeAnalyzeSequenceView(){
		this.seqView.setVisible(false);
        this.seqView.dispose();
	}
	
	public void openAddOrganismView(){
		this.orgView = new AddOrganismView(this);
		this.orgView.pack();  // least possible size for your window
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		this.orgView.setLocation(d.width/2-this.orgView.getWidth()/2,
					  d.height/2-this.orgView.getHeight()/2);
		this.orgView.setResizable(true);
		this.orgView.setVisible(true);
		
	}
	
	public void closeAddOrganismView(){
		this.orgView.setVisible(false);
        this.orgView.dispose();
	}
	public static void main(String[] args){
		
		MainMenu main = new MainMenu();
		myss = new Data();
		
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
			
			// open the analyze sequence window
			if(source == analyzeSequenceButton){			
				openAnalyzeSequenceView();
				
				// set the close program operation
				seqView.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						closeAnalyzeSequenceView();
					}
				});
				

			}
			
			else if(source == addOrganismButton){
				openAddOrganismView();
				
				// set the close program operation
				orgView.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						closeAddOrganismView();
					}
				});
				

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
