package igem.view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class SeqAnalysisPanel extends JPanel{

		
		public SeqAnalysisPanel(){
			setBackground(UIManager.getColor("TabbedPane.background"));
			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWidths = new int[]{555, 209, 0};
			gridBagLayout.rowHeights = new int[]{16, 234, 16, 234, 0};
			gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
			setLayout(gridBagLayout);
			
			JLabel lblOriginalDnaSequence = new JLabel("Original DNA Sequence");
			GridBagConstraints gbc_lblOriginalDnaSequence = new GridBagConstraints();
			gbc_lblOriginalDnaSequence.anchor = GridBagConstraints.WEST;
			gbc_lblOriginalDnaSequence.insets = new Insets(5, 5, 5, 5);
			gbc_lblOriginalDnaSequence.gridx = 0;
			gbc_lblOriginalDnaSequence.gridy = 0;
			add(lblOriginalDnaSequence, gbc_lblOriginalDnaSequence);
			
			JLabel lblPrimers = new JLabel("Primers");
			GridBagConstraints gbc_lblPrimers = new GridBagConstraints();
			gbc_lblPrimers.anchor = GridBagConstraints.WEST;
			gbc_lblPrimers.insets = new Insets(5, 5, 5, 5);
			gbc_lblPrimers.gridx = 1;
			gbc_lblPrimers.gridy = 0;
			add(lblPrimers, gbc_lblPrimers);
			
			JEditorPane originalEditorPane = new JEditorPane();
			originalEditorPane.setText("Enter DNA sequence to be analyzed here");
			GridBagConstraints gbc_originalEditorPane = new GridBagConstraints();
			gbc_originalEditorPane.insets = new Insets(5, 5, 5, 5);
			gbc_originalEditorPane.fill = GridBagConstraints.BOTH;
			gbc_originalEditorPane.gridx = 0;
			gbc_originalEditorPane.gridy = 1;
			add(originalEditorPane, gbc_originalEditorPane);
			
			JEditorPane primerEditorPane = new JEditorPane();
			primerEditorPane.setEditable(false);
			GridBagConstraints gbc_primerEditorPane = new GridBagConstraints();
			gbc_primerEditorPane.gridheight = 3;
			gbc_primerEditorPane.insets = new Insets(5, 5, 5, 5);
			gbc_primerEditorPane.fill = GridBagConstraints.BOTH;
			gbc_primerEditorPane.gridx = 1;
			gbc_primerEditorPane.gridy = 1;
			add(primerEditorPane, gbc_primerEditorPane);
			
			JLabel lblModifiedDnaSequence = new JLabel("Modified DNA Sequence");
			GridBagConstraints gbc_lblModifiedDnaSequence = new GridBagConstraints();
			gbc_lblModifiedDnaSequence.anchor = GridBagConstraints.WEST;
			gbc_lblModifiedDnaSequence.insets = new Insets(5, 5, 5, 5);
			gbc_lblModifiedDnaSequence.gridx = 0;
			gbc_lblModifiedDnaSequence.gridy = 2;
			add(lblModifiedDnaSequence, gbc_lblModifiedDnaSequence);
			
			JEditorPane modifiedEditorPane = new JEditorPane();
			modifiedEditorPane.setEditable(false);
			GridBagConstraints gbc_modifiedEditorPane = new GridBagConstraints();
			gbc_modifiedEditorPane.insets = new Insets(5, 5, 5, 5);
			gbc_modifiedEditorPane.fill = GridBagConstraints.BOTH;
			gbc_modifiedEditorPane.gridx = 0;
			gbc_modifiedEditorPane.gridy = 3;
			add(modifiedEditorPane, gbc_modifiedEditorPane);
			
		}

	}


