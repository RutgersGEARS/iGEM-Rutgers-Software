package igem.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;


public class OrganismPanel extends JPanel{
	private JTextField textField;
	
	public OrganismPanel(){
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{75, 70, 50, 136, 214, 0, 0, 40, 0};
		gridBagLayout.rowHeights = new int[]{0, 38, 445, 62, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCurrentOrganisms = new JLabel("Current Organisms");
		GridBagConstraints gbc_lblCurrentOrganisms = new GridBagConstraints();
		gbc_lblCurrentOrganisms.anchor = GridBagConstraints.WEST;
		gbc_lblCurrentOrganisms.gridwidth = 3;
		gbc_lblCurrentOrganisms.insets = new Insets(5, 5, 5, 5);
		gbc_lblCurrentOrganisms.gridx = 0;
		gbc_lblCurrentOrganisms.gridy = 0;
		add(lblCurrentOrganisms, gbc_lblCurrentOrganisms);
		
		JLabel lblOrganismName = new JLabel("Organism Name");
		GridBagConstraints gbc_lblOrganismName = new GridBagConstraints();
		gbc_lblOrganismName.anchor = GridBagConstraints.WEST;
		gbc_lblOrganismName.insets = new Insets(5, 20, 5, 5);
		gbc_lblOrganismName.gridx = 3;
		gbc_lblOrganismName.gridy = 0;
		add(lblOrganismName, gbc_lblOrganismName);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(5, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 0;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblCodonUsageTable = new JLabel("Codon Usage Table");
		GridBagConstraints gbc_lblCodonUsageTable = new GridBagConstraints();
		gbc_lblCodonUsageTable.anchor = GridBagConstraints.WEST;
		gbc_lblCodonUsageTable.insets = new Insets(0, 20, 5, 5);
		gbc_lblCodonUsageTable.gridx = 3;
		gbc_lblCodonUsageTable.gridy = 1;
		add(lblCodonUsageTable, gbc_lblCodonUsageTable);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.gridheight = 2;
		gbc_list.gridwidth = 3;
		gbc_list.insets = new Insets(5, 10, 5, 5);
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 0;
		gbc_list.gridy = 1;
		add(list, gbc_list);
		
		// set the panel to the codon panel
		CodonTablePanel codonPanel = new CodonTablePanel();
		codonPanel.setBorder(null);
		codonPanel.setOpaque(false);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 5;
		gbc_panel.insets = new Insets(0, 20, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 3;
		gbc_panel.gridy = 2;
		add(codonPanel, gbc_panel);
		
		JButton button = new JButton("+");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 3;
		add(button, gbc_button);
		
		JButton button_1 = new JButton("-");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 3;
		add(button_1, gbc_button_1);
		
		JButton btnSave = new JButton("Save");
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.insets = new Insets(0, 0, 0, 5);
		gbc_btnSave.gridx = 5;
		gbc_btnSave.gridy = 3;
		add(btnSave, gbc_btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancel.gridx = 6;
		gbc_btnCancel.gridy = 3;
		add(btnCancel, gbc_btnCancel);
		
	}

}
