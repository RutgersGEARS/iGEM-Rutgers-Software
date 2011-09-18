package igem.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class SeqAnalysisPanel extends JPanel{
	private JEditorPane originalEditorPane;
	private JEditorPane primerEditorPane;
	private JEditorPane modifiedEditorPane;
		
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
			gbc_lblOriginalDnaSequence.insets = new Insets(0, 5, 5, 5);
			gbc_lblOriginalDnaSequence.gridx = 0;
			gbc_lblOriginalDnaSequence.gridy = 0;
			add(lblOriginalDnaSequence, gbc_lblOriginalDnaSequence);
			
			JLabel lblPrimers = new JLabel("Primers");
			GridBagConstraints gbc_lblPrimers = new GridBagConstraints();
			gbc_lblPrimers.anchor = GridBagConstraints.WEST;
			gbc_lblPrimers.insets = new Insets(0, 5, 5, 0);
			gbc_lblPrimers.gridx = 1;
			gbc_lblPrimers.gridy = 0;
			add(lblPrimers, gbc_lblPrimers);
			
			JScrollPane originalScrollPane = new JScrollPane();
			GridBagConstraints gbc_originalScrollPane = new GridBagConstraints();
			gbc_originalScrollPane.fill = GridBagConstraints.BOTH;
			gbc_originalScrollPane.insets = new Insets(5, 5, 5, 5);
			gbc_originalScrollPane.gridx = 0;
			gbc_originalScrollPane.gridy = 1;
			add(originalScrollPane, gbc_originalScrollPane);
			
			originalEditorPane = new JEditorPane();
			originalScrollPane.setViewportView(originalEditorPane);
			originalEditorPane.setText("Enter DNA sequence to be analyzed here");
			
			JScrollPane primerScrollPane = new JScrollPane();
			GridBagConstraints gbc_primerScrollPane = new GridBagConstraints();
			gbc_primerScrollPane.fill = GridBagConstraints.BOTH;
			gbc_primerScrollPane.gridheight = 3;
			gbc_primerScrollPane.insets = new Insets(5, 5, 5, 5);
			gbc_primerScrollPane.gridx = 1;
			gbc_primerScrollPane.gridy = 1;
			add(primerScrollPane, gbc_primerScrollPane);
			
			primerEditorPane = new JEditorPane();
			primerScrollPane.setViewportView(primerEditorPane);
			primerEditorPane.setEditable(false);
			
			JLabel lblModifiedDnaSequence = new JLabel("Modified DNA Sequence");
			GridBagConstraints gbc_lblModifiedDnaSequence = new GridBagConstraints();
			gbc_lblModifiedDnaSequence.anchor = GridBagConstraints.WEST;
			gbc_lblModifiedDnaSequence.insets = new Insets(5, 5, 5, 5);
			gbc_lblModifiedDnaSequence.gridx = 0;
			gbc_lblModifiedDnaSequence.gridy = 2;
			add(lblModifiedDnaSequence, gbc_lblModifiedDnaSequence);
			
			JScrollPane modifiedScrollPane = new JScrollPane();
			GridBagConstraints gbc_modifiedScrollPane = new GridBagConstraints();
			gbc_modifiedScrollPane.fill = GridBagConstraints.BOTH;
			gbc_modifiedScrollPane.insets = new Insets(5, 5, 5, 5);
			gbc_modifiedScrollPane.gridx = 0;
			gbc_modifiedScrollPane.gridy = 3;
			add(modifiedScrollPane, gbc_modifiedScrollPane);
			
			modifiedEditorPane = new JEditorPane();
			modifiedScrollPane.setViewportView(modifiedEditorPane);
			modifiedEditorPane.setEditable(false);
			
		}
		
		public String getOrginalText(){
			return this.originalEditorPane.getText();
		}
		
		public String getModifiedText(){
			return this.modifiedEditorPane.getText();
		}
		
		public String getPrimerText(){
			return this.primerEditorPane.getText();
		}
		
		public void setOrginalText(String text){
			this.originalEditorPane.setText(text);
		}
		
		public void setModifiedPane(String text){
			this.modifiedEditorPane.setText(text);
		}
		
		public void setPrimerPane(String text){
			this.primerEditorPane.setText(text);
		}

	}


