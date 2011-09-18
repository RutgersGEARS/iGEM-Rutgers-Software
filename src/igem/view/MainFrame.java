package igem.view;

import igem.control.PrimerDesign;
import igem.control.SeqModification;
import igem.control.SiteDirectedMutagenesis;
import igem.model.Data;
import igem.model.GeneSequence;
import igem.model.OrgCodonTable;
import igem.model.Standard;

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
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{
	public static Data myss;
	
	private int seqViewVisible;
	
	private Vector<String> orgVector = new Vector<String>();
	private Vector<String> standardVector = new Vector<String>();
	private Vector<String> plasmidVector = new Vector<String>();
	
	ManageFrame manageView;
	
	CodonOptimizationPanel codonOptimizationPanel;
	
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
	
	public void newSequenceAnalysis(){
		
		if(seqViewVisible == 0){
			
			// set the parameter so multiple sequence views don't appear
			seqViewVisible = 1;
			
			codonOptimizationPanel = new CodonOptimizationPanel();
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
	
	public void closeSequenceAnalysis(){
		
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




