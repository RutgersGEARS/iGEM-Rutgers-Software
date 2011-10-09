package igem.view;


import igem.model.Data;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;



@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	public static Data myss;
	
	private int seqViewVisible;

	// 0 nothing open
	// 1 codon optimization
	// 2 format check
	private int isAnalysisOpen;
	
	private Vector<String> orgVector = new Vector<String>();
	private Vector<String> standardVector = new Vector<String>();
	private Vector<String> plasmidVector = new Vector<String>();
	
	ManageFrame manageView;
	
	CodonOptimizationPanel codonOptimizationPanel;
	
	// Stuff that has to do with handling opening and closing of files
	//JFileChooser fileChooser;
	//FileFilter codonOptimizationFilter;
	//FileFilter formatCheckFilter;
	
	private JMenuBar menuBar;
	private JMenu myssMenu;
	private JMenu fileMenu;
	//private JMenu helpMenu;
	//private JMenu newSubmenu;
	
	//private JMenuItem aboutMyssMenuItem;
	//private JMenuItem prefMyssMenuItem;
	
	//private JMenuItem openSequenceItem;
	//private JMenuItem closeMenuItem;
	//private JMenuItem saveMenuItem;
	//private JMenuItem saveAsMenuItem;
	
	private JMenuItem codonMenuItem;
	private JMenuItem formatCheckMenuItem;
	
	//private JMenuItem helpContentsMenuItem;
	private JMenuItem manageMyssMenuItem;
	private JMenuItem quitMyssMenuItem;
	//private JMenuItem tutorialMenuItem;
	
	
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
		 
		 // Set up everything for the file chooser
		 /*fileChooser = new JFileChooser();
		 codonOptimizationFilter = new FileNameExtensionFilter("Codon Optimization File", ".cdp");
		 formatCheckFilter = new FileNameExtensionFilter("Standard Check File", ".stk");
		 
		 fileChooser.addChoosableFileFilter(codonOptimizationFilter);
		 fileChooser.addChoosableFileFilter(formatCheckFilter);
		 fileChooser.setAcceptAllFileFilterUsed(false);*/
		 
		 seqViewVisible = 0;
		isAnalysisOpen = 0;
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		myssMenu = new JMenu("MYS!S");
		menuBar.add(myssMenu);
		
		//aboutMyssMenuItem = new JMenuItem("About MYS!S");
		//myssMenu.add(aboutMyssMenuItem);
		
		/*JSeparator separator = new JSeparator();
		myssMenu.add(separator);*/
		
		//prefMyssMenuItem = new JMenuItem("Preferences");
		//myssMenu.add(prefMyssMenuItem);
		
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
				myss.saveData(myss);
				System.exit(0);
			}
		});
		myssMenu.add(quitMyssMenuItem);
		
		fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		
		// the new components submenu
		//newSubmenu = new JMenu("New");
		//fileMenu.add(newSubmenu);
		
		codonMenuItem = new JMenuItem("New Codon Optimization");
		codonMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isAnalysisOpen == 0){
					isAnalysisOpen = 1;
					newCodonOptimizationAnalysis(isAnalysisOpen);
				}
				// notify user to close things
				else{
					closeCodonOptimizationAnalysis();
					isAnalysisOpen = 1;
					newCodonOptimizationAnalysis(isAnalysisOpen);
				}
			}
		});
		fileMenu.add(codonMenuItem);
		
		formatCheckMenuItem = new JMenuItem("New Assembly Standard Check");
		formatCheckMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(isAnalysisOpen == 0){
					isAnalysisOpen = 2;
					newCodonOptimizationAnalysis(isAnalysisOpen);
				}
				// notify user to close things
				else{
					closeCodonOptimizationAnalysis();
					isAnalysisOpen = 2;
					newCodonOptimizationAnalysis(isAnalysisOpen);
				}
				
			}
		});
		fileMenu.add(formatCheckMenuItem);
		

		
		/*
		 * Open an analysis of some type
		 * 
		 */
		/*openSequenceItem = new JMenuItem("Open");
		openSequenceItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// go ahead open
				if(isAnalysisOpen == 0){
					
					//Open file chooser:
					int returnVal = fileChooser.showOpenDialog(openSequenceItem);
					
				     if (returnVal == JFileChooser.APPROVE_OPTION) {
				            File file = fileChooser.getSelectedFile();
				            // try and open a file
				            System.out.println("Choose a file");
				            
				        } else {
				            // cancelled opening a file
				        	System.out.println("Did not chooses a file");
				        }
					
				}
				// ask whether you want to save the existing analysis
				else{
					
				}
			}
		});
		fileMenu.add(openSequenceItem);*/
		
		/*JSeparator separator_3 = new JSeparator();
		fileMenu.add(separator_3);*/
		
		/*closeMenuItem = new JMenuItem("Close");
		closeMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {*/
				
				/*
				 * Codon Optimization
				 * prompt user if they want to close and if so if they want to save
				 * 
				 */ 
				/*if(isAnalysisOpen == 1){
					
					// TODO change so that there are options to save or just close
					ErrorMessage.giveErrorMessage("SAF need to remove and give user options");
					closeCodonOptimizationAnalysis();
					isAnalysisOpen = 0;
				}*/
				
				/*
				 * Standard Check
				 * prompt user if they want to close and whether or not they want to save
				 * 
				 */
				/*if(isAnalysisOpen == 2){
					
					
				}
			}
		});
		fileMenu.add(closeMenuItem);*/
		
		/*JSeparator separator_2 = new JSeparator();
		fileMenu.add(separator_2);*/
		
		/*saveMenuItem = new JMenuItem("Save");
		saveMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Open file chooser only if it has not been saved yet
				if(isAnalysisOpen == 1){
					// has not been saved yet open file chooser
					if(codonOptimizationPanel.currentCO.getCurrentFilePath().compareTo("") == 0){
						int returnVal = fileChooser.showSaveDialog(saveMenuItem);
						
						// if you decide to save
						if(returnVal == JFileChooser.APPROVE_OPTION){
							
							// save the file
							File file = fileChooser.getSelectedFile();
							String path = file.getPath() + ".cdp";
							
							// set path in object
							codonOptimizationPanel.currentCO.setCurrentFilePath(path);
							
							// TODO test statement
							System.out.println("path");
							
							if(codonOptimizationPanel.currentCO.saveData(codonOptimizationPanel.currentCO, path) == -1 ){
								ErrorMessage.giveErrorMessage("Unable to save file.");
							}
							
							
						}
						
					}

					
				}
			}
		});
		fileMenu.add(saveMenuItem);*/
		
		/*saveAsMenuItem = new JMenuItem("Save As");
		saveAsMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Open file choose
				if(isAnalysisOpen == 1){
					int returnVal = fileChooser.showSaveDialog(saveMenuItem);

					// if you decide to save
					if(returnVal == JFileChooser.APPROVE_OPTION){
						
						// save the file
						File file = fileChooser.getSelectedFile();
						String path = file.getPath() + ".cdp";
						
						// TODO test statement
						System.out.println("path");
						if(codonOptimizationPanel.currentCO.saveData(codonOptimizationPanel.currentCO, path) == -1 ){
							ErrorMessage.giveErrorMessage("Unable to save file.");
						}	
					}
				}
			}
		});
		fileMenu.add(saveAsMenuItem);*/
		
		/*helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		
		helpContentsMenuItem = new JMenuItem("Help Contents");
		helpContentsMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		helpMenu.add(helpContentsMenuItem);*/
		
		/*JSeparator separator_4 = new JSeparator();
		helpMenu.add(separator_4);
		
		tutorialMenuItem = new JMenuItem("Tutorial");
		tutorialMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		helpMenu.add(tutorialMenuItem);*/
		
		/*
		 * Set parameters for grid bag
		 */
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
	}
	

	
	public static void main(String[] args){

		MainFrame mainMenu = new MainFrame();
		mainMenu.isAnalysisOpen = 0;
		// set the close program operation
		mainMenu.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// TODO make sure everything saves
				
				System.exit(0);
			}
		});
		//mainMenu.setSize(1000, 700);
		//mainMenu.pack();  // least possible size for your window
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		mainMenu.setSize(d.width, d.height);
		//mainMenu.setLocation(d.width/2-mainMenu.getWidth()/2,
					  //d.height/2-mainMenu.getHeight()/2);
		mainMenu.setResizable(true);
		mainMenu.setVisible(true);
	}
	
	public void openManageComponentsView(){
		this.manageView = new ManageFrame();
		
		this.manageView.pack();  // least possible size for your window
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		this.manageView.setLocation(d.width/2-this.manageView.getWidth()/2,
					  d.height/2-this.manageView.getHeight()/2);
		this.manageView.setResizable(true);
		this.manageView.setVisible(true);
	}
	
	public void closeManageComponentsView(){
		myss.saveData(myss);
		this.manageView.setVisible(false);
        this.manageView.dispose();
	}
	
	public void newCodonOptimizationAnalysis(int mode){
		
		if(seqViewVisible == 0){
			
			// set the parameter so multiple sequence views don't appear
			seqViewVisible = 1;
			
			codonOptimizationPanel = new CodonOptimizationPanel(mode);
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.fill = GridBagConstraints.BOTH;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 0;
			getContentPane().add(codonOptimizationPanel, gbc_panel);
			
			this.paintAll(getGraphics());
		}
		
		else{
			// need to have an error message that tells you that hey you have something open would you like to close and or save it
			ErrorMessage.giveErrorMessage("Please close or save sequence before creating a new one");
		}
		
	}
	
	public void closeCodonOptimizationAnalysis(){
		getContentPane().remove(codonOptimizationPanel);
		this.paintAll(getGraphics());
		seqViewVisible = 0;
	}
	
	public void refreshSequenceAnalysisComboBoxes(){
		orgVector = myss.getOrganismNames();

		
		for(int i = 0; i < myss.standards.size(); i++){
			standardVector.add(myss.standards.get(i).getName());
		}

		
		for(int i = 0; i < myss.backbones.size(); i++){
			plasmidVector.add(myss.backbones.get(i).getPlasmidName());
		}
		
	}
	
	
	
}




