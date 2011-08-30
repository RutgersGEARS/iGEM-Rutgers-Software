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

public class MainFrame extends JFrame{
	public Data myss;
	
	ManageFrame manageView;
	
	private JTextField textField;
	
	
	public MainFrame(){
		super("MYS!S");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMyss = new JMenu("MYS!S");
		menuBar.add(mnMyss);
		
		JMenuItem mntmAboutMyss = new JMenuItem("About MYS!S");
		mnMyss.add(mntmAboutMyss);
		
		JSeparator separator = new JSeparator();
		mnMyss.add(separator);
		
		JMenuItem mntmPreferences = new JMenuItem("Preferences");
		mnMyss.add(mntmPreferences);
		
		JMenuItem mntmManageComponents = new JMenuItem("Manage Components");
		mntmManageComponents.addActionListener(new ActionListener() {
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
		mnMyss.add(mntmManageComponents);
		
		JSeparator separator_1 = new JSeparator();
		mnMyss.add(separator_1);
		
		JMenuItem mntmQuit = new JMenuItem("Quit");
		mnMyss.add(mntmQuit);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewSequenceAnalysis = new JMenuItem("New Sequence Analysis");
		mnFile.add(mntmNewSequenceAnalysis);
		
		JMenuItem mntmOpenSequenceAnalysis = new JMenuItem("Open Sequence Analysis");
		mnFile.add(mntmOpenSequenceAnalysis);
		
		JSeparator separator_3 = new JSeparator();
		mnFile.add(separator_3);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mnFile.add(mntmClose);
		
		JSeparator separator_2 = new JSeparator();
		mnFile.add(separator_2);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save As");
		mnFile.add(mntmSaveAs);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelpContents = new JMenuItem("Help Contents");
		mnHelp.add(mntmHelpContents);
		
		JSeparator separator_4 = new JSeparator();
		mnHelp.add(separator_4);
		
		JMenuItem mntmTutorial = new JMenuItem("Tutorial");
		mnHelp.add(mntmTutorial);
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
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(5, 5, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		getContentPane().add(textField, gbc_textField);
		textField.setColumns(15);
		
		JLabel lblOrganism = new JLabel("Organism");
		GridBagConstraints gbc_lblOrganism = new GridBagConstraints();
		gbc_lblOrganism.anchor = GridBagConstraints.EAST;
		gbc_lblOrganism.insets = new Insets(5, 5, 5, 5);
		gbc_lblOrganism.gridx = 2;
		gbc_lblOrganism.gridy = 0;
		getContentPane().add(lblOrganism, gbc_lblOrganism);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(5, 5, 5, 5);
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 0;
		getContentPane().add(comboBox, gbc_comboBox);
		
		JLabel lblStandard = new JLabel("Standard");
		GridBagConstraints gbc_lblStandard = new GridBagConstraints();
		gbc_lblStandard.insets = new Insets(5, 5, 5, 5);
		gbc_lblStandard.anchor = GridBagConstraints.EAST;
		gbc_lblStandard.gridx = 4;
		gbc_lblStandard.gridy = 0;
		getContentPane().add(lblStandard, gbc_lblStandard);
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(5, 5, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 5;
		gbc_comboBox_1.gridy = 0;
		getContentPane().add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblPlasmid = new JLabel("Plasmid");
		GridBagConstraints gbc_lblPlasmid = new GridBagConstraints();
		gbc_lblPlasmid.anchor = GridBagConstraints.EAST;
		gbc_lblPlasmid.insets = new Insets(5, 5, 5, 5);
		gbc_lblPlasmid.gridx = 6;
		gbc_lblPlasmid.gridy = 0;
		getContentPane().add(lblPlasmid, gbc_lblPlasmid);
		
		JComboBox comboBox_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(5, 5, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 7;
		gbc_comboBox_2.gridy = 0;
		getContentPane().add(comboBox_2, gbc_comboBox_2);
		
		JButton btnGo = new JButton("Go!");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnGo = new GridBagConstraints();
		gbc_btnGo.insets = new Insets(5, 5, 5, 5);
		gbc_btnGo.gridx = 8;
		gbc_btnGo.gridy = 0;
		getContentPane().add(btnGo, gbc_btnGo);
		
		/*
		 * Handles everything with the tabbed pane layout
		 * 
		 */
		
		// add the panels to the tabs
		SeqAnalysisPanel sequencePanel = new SeqAnalysisPanel();
		
		// set to transparent so you don't have to worry about the background
		sequencePanel.setOpaque(false);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		// add sequnce analysis view
		tabbedPane.addTab("Sequence", sequencePanel);
		
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.gridwidth = 9;
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 1;
		getContentPane().add(tabbedPane, gbc_tabbedPane);
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
		this.manageView.setVisible(false);
        this.manageView.dispose();
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
		
		mainMenu.pack();  // least possible size for your window
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		mainMenu.setLocation(d.width/2-mainMenu.getWidth()/2,
					  d.height/2-mainMenu.getHeight()/2);
		mainMenu.setResizable(true);
		mainMenu.setVisible(true);
	}

}




