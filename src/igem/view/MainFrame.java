package igem.view;

import igem.model.Data;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	public Data myss;
	
	private int seqViewVisible;
	
	private Vector<String> orgVector = new Vector<String>();
	private Vector<String> standardVector = new Vector<String>();
	private Vector<String> plasmidVector = new Vector<String>();
	
	ManageFrame manageView;
	
	SeqAnalysisPanel sequencePanel = new SeqAnalysisPanel();
	ProtocolPanel protocolPanel = new ProtocolPanel();
	RNAStructurePanel structurePanel = new RNAStructurePanel();
	
	
	private JMenuBar menuBar;
	private JMenu myssMenu;
	private JMenu fileMenu;
	private JMenu helpMenu;
	private JMenuItem aboutMyssMenuItem;
	private JMenuItem prefMyssMenuItem;
	private JMenuItem openSequenceMenuItem;
	private JMenuItem newSequenceMenuItem;
	private JMenuItem closeMenuItem;
	private JMenuItem saveMenuItem;
	private JMenuItem saveAsMenuItem;
	private JMenuItem helpContentsMenuItem;
	private JMenuItem manageMyssMenuItem;
	private JMenuItem quitMyssMenuItem;
	private JMenuItem tutorialMenuItem;
	
	
	private JTextField seqNameTextField;
	private JComboBox plasmidComboBox;
	private JComboBox standardComboBox;
	private JComboBox organismComboBox;
	private JButton goButton;
	

	
	
	public MainFrame(){
		super("MYS!S");
		
		// deal with loading data
		 myss = new Data();
		 myss = myss.loadData(myss);
	
		 // if there is no data load it
	
		 if(myss == null){

			 System.out.println("Data did not load");
			 myss  = new Data();
			 myss.populateData();
			 myss.saveData(myss);
		 }
		 
		seqViewVisible = 0;
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		myssMenu = new JMenu("MYS!S");
		menuBar.add(myssMenu);
		
		aboutMyssMenuItem = new JMenuItem("About MYS!S");
		myssMenu.add(aboutMyssMenuItem);
		
		JSeparator separator = new JSeparator();
		myssMenu.add(separator);
		
		prefMyssMenuItem = new JMenuItem("Preferences");
		myssMenu.add(prefMyssMenuItem);
		
		manageMyssMenuItem = new JMenuItem("Manage Components");
		manageMyssMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openManageComponentsView();
				
				// set the close program operation
				manageView.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						closeManageComponentsView();
					}
				});
			}
		});
		myssMenu.add(manageMyssMenuItem);
		
		JSeparator separator_1 = new JSeparator();
		myssMenu.add(separator_1);
		
		quitMyssMenuItem = new JMenuItem("Quit");
		quitMyssMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		myssMenu.add(quitMyssMenuItem);
		
		fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		
		newSequenceMenuItem = new JMenuItem("New Sequence Analysis");
		newSequenceMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newSequenceAnalysis();
			}
		});
		fileMenu.add(newSequenceMenuItem);
		
		openSequenceMenuItem = new JMenuItem("Open Sequence Analysis");
		openSequenceMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		fileMenu.add(openSequenceMenuItem);
		
		JSeparator separator_3 = new JSeparator();
		fileMenu.add(separator_3);
		
		closeMenuItem = new JMenuItem("Close");
		closeMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		fileMenu.add(closeMenuItem);
		
		JSeparator separator_2 = new JSeparator();
		fileMenu.add(separator_2);
		
		saveMenuItem = new JMenuItem("Save");
		saveMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		fileMenu.add(saveMenuItem);
		
		saveAsMenuItem = new JMenuItem("Save As");
		saveAsMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		fileMenu.add(saveAsMenuItem);
		
		helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		
		helpContentsMenuItem = new JMenuItem("Help Contents");
		helpContentsMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		helpMenu.add(helpContentsMenuItem);
		
		JSeparator separator_4 = new JSeparator();
		helpMenu.add(separator_4);
		
		tutorialMenuItem = new JMenuItem("Tutorial");
		tutorialMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		helpMenu.add(tutorialMenuItem);
		
		

	}
	
	public void openManageComponentsView(){
		this.manageView = new ManageFrame(this.myss);
		
		this.manageView.pack();  // least possible size for your window
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		this.manageView.setLocation(d.width/2-this.manageView.getWidth()/2,
					  d.height/2-this.manageView.getHeight()/2);
		this.manageView.setResizable(true);
		this.manageView.setVisible(true);
	}
	
	public void closeManageComponentsView(){
		this.manageView.setVisible(false);
        this.manageView.dispose();
	}
	
	public void newSequenceAnalysis(){
		
		if(seqViewVisible == 0){
			
			// set the parameter so multiple sequence views don't appear
			seqViewVisible = 1;
			
			// get vectors of component names
			
			orgVector = myss.getOrganismNames();

			
			for(int i = 0; i < myss.standards.size(); i++){
				standardVector.add(myss.standards.get(i).getName());
			}

			
			for(int i = 0; i < myss.backbones.size(); i++){
				plasmidVector.add(myss.backbones.get(i).getPlasmidName());
			}
			
			// set up the layout
			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWidths = new int[]{0, 142, 0, 125, 0, 125, 0, 125, 0, 0};
			gridBagLayout.rowHeights = new int[]{32, 529, 0};
			gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			getContentPane().setLayout(gridBagLayout);
			
			JLabel lblSequenceName = new JLabel("Sequence Name");
			GridBagConstraints gbc_lblSequenceName = new GridBagConstraints();
			gbc_lblSequenceName.anchor = GridBagConstraints.EAST;
			gbc_lblSequenceName.insets = new Insets(5, 5, 5, 5);
			gbc_lblSequenceName.gridx = 0;
			gbc_lblSequenceName.gridy = 0;
			getContentPane().add(lblSequenceName, gbc_lblSequenceName);
			
			seqNameTextField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.insets = new Insets(5, 5, 5, 5);
			gbc_textField.gridx = 1;
			gbc_textField.gridy = 0;
			getContentPane().add(seqNameTextField, gbc_textField);
			seqNameTextField.setColumns(15);
			
			JLabel lblOrganism = new JLabel("Organism");
			GridBagConstraints gbc_lblOrganism = new GridBagConstraints();
			gbc_lblOrganism.anchor = GridBagConstraints.EAST;
			gbc_lblOrganism.insets = new Insets(5, 5, 5, 5);
			gbc_lblOrganism.gridx = 2;
			gbc_lblOrganism.gridy = 0;
			getContentPane().add(lblOrganism, gbc_lblOrganism);
			
			organismComboBox = new JComboBox(orgVector);
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox.insets = new Insets(5, 5, 5, 5);
			gbc_comboBox.gridx = 3;
			gbc_comboBox.gridy = 0;
			getContentPane().add(organismComboBox, gbc_comboBox);
			
			JLabel lblStandard = new JLabel("Standard");
			GridBagConstraints gbc_lblStandard = new GridBagConstraints();
			gbc_lblStandard.insets = new Insets(5, 5, 5, 5);
			gbc_lblStandard.anchor = GridBagConstraints.EAST;
			gbc_lblStandard.gridx = 4;
			gbc_lblStandard.gridy = 0;
			getContentPane().add(lblStandard, gbc_lblStandard);
			
			standardComboBox = new JComboBox(standardVector);
			GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
			gbc_comboBox_1.insets = new Insets(5, 5, 5, 5);
			gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox_1.gridx = 5;
			gbc_comboBox_1.gridy = 0;
			getContentPane().add(standardComboBox, gbc_comboBox_1);
			
			JLabel lblPlasmid = new JLabel("Plasmid");
			GridBagConstraints gbc_lblPlasmid = new GridBagConstraints();
			gbc_lblPlasmid.anchor = GridBagConstraints.EAST;
			gbc_lblPlasmid.insets = new Insets(5, 5, 5, 5);
			gbc_lblPlasmid.gridx = 6;
			gbc_lblPlasmid.gridy = 0;
			getContentPane().add(lblPlasmid, gbc_lblPlasmid);
			
			plasmidComboBox = new JComboBox(plasmidVector);
			GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
			gbc_comboBox_2.insets = new Insets(5, 5, 5, 5);
			gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_comboBox_2.gridx = 7;
			gbc_comboBox_2.gridy = 0;
			getContentPane().add(plasmidComboBox, gbc_comboBox_2);
			
			goButton = new JButton("Go!");
			goButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			GridBagConstraints gbc_btnGo = new GridBagConstraints();
			gbc_btnGo.insets = new Insets(5, 5, 5, 5);
			gbc_btnGo.gridx = 8;
			gbc_btnGo.gridy = 0;
			getContentPane().add(goButton, gbc_btnGo);
			
			/*
			 * Handles everything with the tabbed pane layout
			 * 
			 */
			
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
			gbc_tabbedPane.gridwidth = 9;
			gbc_tabbedPane.fill = GridBagConstraints.BOTH;
			gbc_tabbedPane.gridx = 0;
			gbc_tabbedPane.gridy = 1;
			getContentPane().add(tabbedPane, gbc_tabbedPane);
			
			this.paintAll(getGraphics());
		}
		
		else{
			// need to have an error message that tells you that hey you have something open would you like to close and or save it
			ErrorMessage.giveErrorMessage("Please close or save sequence before creating a new one");
		}
		
	}
	
	public void closeSequenceAnalysis(){
		
	}
	
	public static void main(String[] args){

		MainFrame mainMenu = new MainFrame();

		// set the close program operation
		mainMenu.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// TODO make sure everything saves
				
				System.exit(0);
			}
		});
		mainMenu.setSize(900, 700);
		//mainMenu.pack();  // least possible size for your window
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		mainMenu.setLocation(d.width/2-mainMenu.getWidth()/2,
					  d.height/2-mainMenu.getHeight()/2);
		mainMenu.setResizable(true);
		mainMenu.setVisible(true);
	}

}




