package igem.view;

import igem.model.Data;
import igem.model.OrgCodonTable;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


@SuppressWarnings("serial")
public class OrganismPanel extends JPanel{
	Data myss;
	CodonTablePanel codonPanel;
	JList organismList;
	
	int selectedIndex;
	
	private Vector<String> orgVector = new Vector<String>();
	
	private JTextField orgNameTextField;
	private JButton addButton;
	private JButton deleteButton;
	private JButton saveButton;
	private JButton cancelButton;
	
	public OrganismPanel(Data data){
		// all the logic stuff
		this.myss = data;
		orgVector = myss.getOrganismNames();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{75, 70, 136, 214, 0, 40, 0};
		gridBagLayout.rowHeights = new int[]{0, 38, 445, 60, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblCurrentOrganisms = new JLabel("Current Organisms");
		GridBagConstraints gbc_lblCurrentOrganisms = new GridBagConstraints();
		gbc_lblCurrentOrganisms.anchor = GridBagConstraints.WEST;
		gbc_lblCurrentOrganisms.gridwidth = 2;
		gbc_lblCurrentOrganisms.insets = new Insets(5, 5, 5, 5);
		gbc_lblCurrentOrganisms.gridx = 0;
		gbc_lblCurrentOrganisms.gridy = 0;
		add(lblCurrentOrganisms, gbc_lblCurrentOrganisms);
		
		JLabel lblOrganismName = new JLabel("Organism Name");
		GridBagConstraints gbc_lblOrganismName = new GridBagConstraints();
		gbc_lblOrganismName.anchor = GridBagConstraints.WEST;
		gbc_lblOrganismName.insets = new Insets(5, 20, 5, 5);
		gbc_lblOrganismName.gridx = 2;
		gbc_lblOrganismName.gridy = 0;
		add(lblOrganismName, gbc_lblOrganismName);
		
		orgNameTextField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(5, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 0;
		add(orgNameTextField, gbc_textField);
		orgNameTextField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridheight = 2;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 5, 5, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		

		organismList = new JList(orgVector);
		organismList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		organismList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				selectedIndex = organismList.getSelectedIndex();
				
				// if something is chosen display it
				if(selectedIndex != -1){
					displayOrganism(selectedIndex);
				}
				
				
			}
		});
		scrollPane.setViewportView(organismList);
		organismList.setBorder(null);
		
		JLabel lblCodonUsageTable = new JLabel("Codon Usage Table");
		GridBagConstraints gbc_lblCodonUsageTable = new GridBagConstraints();
		gbc_lblCodonUsageTable.anchor = GridBagConstraints.WEST;
		gbc_lblCodonUsageTable.insets = new Insets(0, 20, 5, 5);
		gbc_lblCodonUsageTable.gridx = 2;
		gbc_lblCodonUsageTable.gridy = 1;
		add(lblCodonUsageTable, gbc_lblCodonUsageTable);
		
		// set the panel to the codon panel
		codonPanel = new CodonTablePanel(this.myss);
		codonPanel.setBorder(null);
		codonPanel.setOpaque(false);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 4;
		gbc_panel.insets = new Insets(0, 20, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 2;
		gbc_panel.gridy = 2;
		add(codonPanel, gbc_panel);
		
		addButton = new JButton("+");
		GridBagConstraints gbc_addButton = new GridBagConstraints();
		gbc_addButton.insets = new Insets(0, 0, 0, 5);
		gbc_addButton.gridx = 0;
		gbc_addButton.gridy = 3;
		add(addButton, gbc_addButton);
		
		deleteButton = new JButton("-");
		GridBagConstraints gbc_deleteButton = new GridBagConstraints();
		gbc_deleteButton.anchor = GridBagConstraints.WEST;
		gbc_deleteButton.insets = new Insets(0, 0, 0, 5);
		gbc_deleteButton.gridx = 1;
		gbc_deleteButton.gridy = 3;
		add(deleteButton, gbc_deleteButton);
		
		saveButton = new JButton("Save");
		GridBagConstraints gbc_saveButton = new GridBagConstraints();
		gbc_saveButton.insets = new Insets(0, 0, 0, 5);
		gbc_saveButton.gridx = 4;
		gbc_saveButton.gridy = 3;
		add(saveButton, gbc_saveButton);
		
		cancelButton = new JButton("Cancel");
		GridBagConstraints gbc_cancelButton = new GridBagConstraints();
		gbc_cancelButton.gridx = 5;
		gbc_cancelButton.gridy = 3;
		add(cancelButton, gbc_cancelButton);
		
	}
	
	public OrgCodonTable gatherData(){
		return null;
	}
	
	public void displayOrganism(int index){
		OrgCodonTable currentOrg  = this.myss.getOrganism(index);
		
		this.orgNameTextField.setText(currentOrg.getOrganismName());
		
		
		
		this.paintAll(getGraphics());
	}

}
