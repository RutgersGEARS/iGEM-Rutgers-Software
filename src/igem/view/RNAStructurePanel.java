package igem.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.border.EtchedBorder;

public class RNAStructurePanel extends JPanel{
	private JPanel originalRNAPanel;
	private JPanel modifiedRNAPanel;
	
	public RNAStructurePanel(){
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblOriginalRnaStructure = new JLabel("Original RNA Structure");
		GridBagConstraints gbc_lblOriginalRnaStructure = new GridBagConstraints();
		gbc_lblOriginalRnaStructure.anchor = GridBagConstraints.WEST;
		gbc_lblOriginalRnaStructure.insets = new Insets(5, 10, 5, 5);
		gbc_lblOriginalRnaStructure.gridx = 0;
		gbc_lblOriginalRnaStructure.gridy = 0;
		add(lblOriginalRnaStructure, gbc_lblOriginalRnaStructure);
		
		JLabel lblModifiedRnaStructure = new JLabel("Modified RNA Structure");
		GridBagConstraints gbc_lblModifiedRnaStructure = new GridBagConstraints();
		gbc_lblModifiedRnaStructure.anchor = GridBagConstraints.WEST;
		gbc_lblModifiedRnaStructure.insets = new Insets(5, 15, 5, 0);
		gbc_lblModifiedRnaStructure.gridx = 1;
		gbc_lblModifiedRnaStructure.gridy = 0;
		add(lblModifiedRnaStructure, gbc_lblModifiedRnaStructure);
		
		originalRNAPanel = new JPanel();
		originalRNAPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		originalRNAPanel.setBackground(Color.WHITE);
		GridBagConstraints gbc_originalRNAPanel = new GridBagConstraints();
		gbc_originalRNAPanel.insets = new Insets(0, 10, 10, 15);
		gbc_originalRNAPanel.fill = GridBagConstraints.BOTH;
		gbc_originalRNAPanel.gridx = 0;
		gbc_originalRNAPanel.gridy = 1;
		add(originalRNAPanel, gbc_originalRNAPanel);
		
		modifiedRNAPanel = new JPanel();
		modifiedRNAPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		modifiedRNAPanel.setBackground(Color.WHITE);
		GridBagConstraints gbc_modifiedRNAPanel = new GridBagConstraints();
		gbc_modifiedRNAPanel.insets = new Insets(0, 15, 10, 10);
		gbc_modifiedRNAPanel.fill = GridBagConstraints.BOTH;
		gbc_modifiedRNAPanel.gridx = 1;
		gbc_modifiedRNAPanel.gridy = 1;
		add(modifiedRNAPanel, gbc_modifiedRNAPanel);
		
	}

}
