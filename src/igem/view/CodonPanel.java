package igem.view;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CodonPanel extends JPanel{
	MainMenu mainMenu;
	JLabel codonTableLabel;
	
	JLabel[] codonLabels;
	
	JTextField[] codonTextFields;
	
	public static final Font fontBold = new Font("Courier", Font.BOLD, 24);
	public static final Font font = new Font("Courier", Font.PLAIN, 14);
	
	GridBagLayout gb = new GridBagLayout();
	GridBagConstraints gc = new GridBagConstraints();
	
	public CodonPanel(MainMenu  main){
		mainMenu = main;
		make();
		setLayout(gb);
		layOut();
	}
	
	public void make(){
		codonTableLabel = new JLabel("Codon Occurence Per 1000 Codons");
		codonTableLabel.setFont(font);
		
		codonLabels = new JLabel[64];
		for(int i = 0; i < 64; i++){
			codonLabels[i] = new JLabel(mainMenu.myss.getCodonFromTable(i));
			//codonLabels[i] = new JLabel("kitty");
			codonLabels[i].setFont(font);
		}
		
		codonTextFields = new JTextField[64];
		for(int i = 0; i < 64; i++){
			codonTextFields[i] = new JTextField(15);
			codonTextFields[i].setFont(font);
		}
	}
	
	public void layOut(){
		int counter = 0;
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.ipadx = 2;
		gc.gridwidth = GridBagConstraints.REMAINDER;
		gb.setConstraints(codonTableLabel, gc);
		add(codonTableLabel);
	
		for(int i = 0 ; i < 8; i += 2){
			for(int j = 0; j < 16; j++){
				gc.gridx = i;
				gc.gridy = j + 1;
				gc.gridwidth = 1;
				gb.setConstraints(codonLabels[counter], gc);
				add(codonLabels[counter]);
				
				gc.gridx = i + 1;
				gc.gridy = j + 1;
				gc.gridwidth = 1;
				gb.setConstraints(codonTextFields[counter], gc);
				add(codonTextFields[counter]);
				
				counter++;
			}
		}
	}

}
