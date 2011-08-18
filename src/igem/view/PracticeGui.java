package igem.view;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import java.awt.GridLayout;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PracticeGui extends JFrame{
	public PracticeGui() {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMyss = new JMenu("MYS!S");
		menuBar.add(mnMyss);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnMyss.add(mntmAbout);
		
		JSeparator separator = new JSeparator();
		mnMyss.add(separator);
		
		JMenuItem mntmPreferences = new JMenuItem("Preferences");
		mntmPreferences.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnMyss.add(mntmPreferences);
		
		JSeparator separator_1 = new JSeparator();
		mnMyss.add(separator_1);
		
		JMenuItem mntmExit = new JMenuItem("Quit MYS!S");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnMyss.add(mntmExit);
		
		JMenu mnFile_1 = new JMenu("File");
		menuBar.add(mnFile_1);
		
		JMenuItem mntmNewSequenceAnalysis = new JMenuItem("New Sequence Analysis");
		mntmNewSequenceAnalysis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnFile_1.add(mntmNewSequenceAnalysis);
		
		JSeparator separator_2 = new JSeparator();
		mnFile_1.add(separator_2);
		
		JMenuItem mntmNewOrganism = new JMenuItem("Add Organism");
		mntmNewOrganism.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnFile_1.add(mntmNewOrganism);
		
		JMenuItem mntmNewFormat = new JMenuItem("Add Format");
		mntmNewFormat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnFile_1.add(mntmNewFormat);
		
		JMenuItem mntmAddStandard = new JMenuItem("Add Backbone");
		mntmAddStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnFile_1.add(mntmAddStandard);
		
		JSeparator separator_3 = new JSeparator();
		mnFile_1.add(separator_3);
		
		JMenuItem mntmManageOrganisms = new JMenuItem("Manage Organisms");
		mntmManageOrganisms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnFile_1.add(mntmManageOrganisms);
		
		JMenuItem mntmManageFormats = new JMenuItem("Manage Formats");
		mntmManageFormats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnFile_1.add(mntmManageFormats);
		
		JMenuItem mntmManageBackbones = new JMenuItem("Manage Backbones");
		mntmManageBackbones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnFile_1.add(mntmManageBackbones);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmTutorial = new JMenuItem("Tutorial");
		mntmTutorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnHelp.add(mntmTutorial);
		
		JMenuItem mntmHelpContents = new JMenuItem("Help Contents");
		mntmHelpContents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnHelp.add(mntmHelpContents);
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{719, 0};
		gridBagLayout.rowHeights = new int[]{517, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.WEST;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(2, 2, 2, 2);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		getContentPane().add(panel, gbc_panel);
		
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{719, 0};
		gbl_panel.rowHeights = new int[]{130, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
	}

}
