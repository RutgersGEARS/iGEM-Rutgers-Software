package igem.view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddOrganismView extends JFrame{
	
	JLabel codonTableLabel;
	JLabel organismLabel;
	JLabel[] codonLabels;
	
	JTextField[] codonTextFields;
	
	JComboBox orgComboBox;
	
	JButton clearButton;
	JButton cancelButton;
	JButton submitButton;
	
	public static final Font fontBold = new Font("Courier", Font.BOLD, 24);
	public static final Font font = new Font("Courier", Font.PLAIN, 14);
	
	protected OrganismListener ol;
	
	GridBagLayout gb = new GridBagLayout();
	GridBagConstraints gc = new GridBagConstraints();
	
	public AddOrganismView(){
		super("Add Organsim");
		
		make();
		setLayout(gb);
		layOut();
	}
	
	public void make(){
		ol = new OrganismListener();
		
		codonTableLabel = new JLabel("Codon Occurence Per 1000 Codons");
		codonTableLabel.setFont(font);
		
		organismLabel = new JLabel("Organism");
		organismLabel.setFont(font);
		
		clearButton = new JButton("Clear");
		clearButton.setFont(font);
		clearButton.addActionListener(ol);
		
		submitButton = new JButton("Submit");
		submitButton.setFont(font);
		submitButton.addActionListener(ol);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setFont(font);
		cancelButton.addActionListener(ol);
		
		// TODO hook up to back end this is just temporary
		Vector<String> orgNames = new Vector<String>();
		orgNames.add("Unicorn");
		orgNames.add("E Coli");
		orgNames.add("Mouse");
		orgNames.add("Walrus");
		
		orgComboBox = new JComboBox(orgNames);
		orgComboBox.setFont(font);
		
		for(int i = 0; i < 64; i++){
			codonLabels[i] = new JLabel(MainMenu.myss.getCodonFromTable(i));
			codonLabels[i].setFont(font);
		}
		
		for(int i = 0; i < 64; i++){
			codonTextFields[i] = new JTextField(15);
			codonTextFields[i].setFont(font);
		}
	}
	
	public void layOut(){
		gc.insets = new Insets(8,8,8,8);
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipadx = 8;
		gc.gridwidth = GridBagConstraints.REMAINDER;
		gb.setConstraints(codonTableLabel, gc);
		add(codonTableLabel);
		
		
	}
	
	
	protected class OrganismListener implements ActionListener	{
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton)e.getSource();

		}		
	}
}
