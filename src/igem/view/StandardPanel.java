package igem.view;

import igem.model.Data;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;

public class StandardPanel extends JPanel{
	Data myss;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public StandardPanel(Data data){
		this.myss = data;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 115, 0, 96, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 357, 60, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCurrentStandards = new JLabel("Current Standards");
		GridBagConstraints gbc_lblCurrentStandards = new GridBagConstraints();
		gbc_lblCurrentStandards.anchor = GridBagConstraints.WEST;
		gbc_lblCurrentStandards.gridwidth = 2;
		gbc_lblCurrentStandards.insets = new Insets(5, 5, 5, 5);
		gbc_lblCurrentStandards.gridx = 0;
		gbc_lblCurrentStandards.gridy = 0;
		add(lblCurrentStandards, gbc_lblCurrentStandards);
		
		JLabel lblStandardName = new JLabel("Standard Name");
		GridBagConstraints gbc_lblStandardName = new GridBagConstraints();
		gbc_lblStandardName.anchor = GridBagConstraints.WEST;
		gbc_lblStandardName.insets = new Insets(5, 20, 5, 5);
		gbc_lblStandardName.gridx = 2;
		gbc_lblStandardName.gridy = 0;
		add(lblStandardName, gbc_lblStandardName);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 0;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridheight = 4;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 5, 5, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		JList standardList = new JList();
		scrollPane.setViewportView(standardList);
		standardList.setBorder(null);
		
		JLabel lblPrefix = new JLabel("Prefix");
		GridBagConstraints gbc_lblPrefix = new GridBagConstraints();
		gbc_lblPrefix.anchor = GridBagConstraints.WEST;
		gbc_lblPrefix.insets = new Insets(5, 20, 5, 5);
		gbc_lblPrefix.gridx = 2;
		gbc_lblPrefix.gridy = 1;
		add(lblPrefix, gbc_lblPrefix);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 3;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 1;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSuffix = new JLabel("Suffix");
		GridBagConstraints gbc_lblSuffix = new GridBagConstraints();
		gbc_lblSuffix.anchor = GridBagConstraints.WEST;
		gbc_lblSuffix.insets = new Insets(5, 20, 5, 5);
		gbc_lblSuffix.gridx = 2;
		gbc_lblSuffix.gridy = 2;
		add(lblSuffix, gbc_lblSuffix);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 3;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 2;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRestrictionSites = new JLabel("Restriction Sites");
		GridBagConstraints gbc_lblRestrictionSites = new GridBagConstraints();
		gbc_lblRestrictionSites.gridwidth = 4;
		gbc_lblRestrictionSites.insets = new Insets(10, 0, 5, 0);
		gbc_lblRestrictionSites.gridx = 2;
		gbc_lblRestrictionSites.gridy = 3;
		add(lblRestrictionSites, gbc_lblRestrictionSites);
		
		RestrictEnzymePanel enzymePanel = new RestrictEnzymePanel();
		enzymePanel.setBorder(null);
		enzymePanel.setOpaque(false);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 4;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 4;
		add(enzymePanel, gbc_panel);
		
		JButton button = new JButton("+");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 5;
		add(button, gbc_button);
		
		JButton button_1 = new JButton("-");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.anchor = GridBagConstraints.WEST;
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 5;
		add(button_1, gbc_button_1);
		
		JButton btnSave = new JButton("Save");
		GridBagConstraints gbc_btnSave = new GridBagConstraints();
		gbc_btnSave.insets = new Insets(0, 0, 0, 5);
		gbc_btnSave.gridx = 4;
		gbc_btnSave.gridy = 5;
		add(btnSave, gbc_btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.gridx = 5;
		gbc_btnCancel.gridy = 5;
		add(btnCancel, gbc_btnCancel);
		
	}

}
