package igem.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;

public class ProtocolPanel extends JPanel{
	private JEditorPane protocolPane;
	private JButton saveButton;
	private JLabel protocolLabel;

	
	public ProtocolPanel(){
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		protocolLabel = new JLabel("Protocol For Whatever");
		GridBagConstraints gbc_protocolLabel = new GridBagConstraints();
		gbc_protocolLabel.anchor = GridBagConstraints.WEST;
		gbc_protocolLabel.gridwidth = 3;
		gbc_protocolLabel.insets = new Insets(5, 15, 5, 0);
		gbc_protocolLabel.gridx = 0;
		gbc_protocolLabel.gridy = 0;
		add(protocolLabel, gbc_protocolLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(5, 15, 5, 15);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		protocolPane = new JEditorPane();
		protocolPane.setEditable(false);
		scrollPane.setViewportView(protocolPane);
		
		saveButton = new JButton("Save As");
		GridBagConstraints gbc_saveButton = new GridBagConstraints();
		gbc_saveButton.insets = new Insets(0, 0, 0, 5);
		gbc_saveButton.gridx = 1;
		gbc_saveButton.gridy = 2;
		add(saveButton, gbc_saveButton);
		
		JButton printButton = new JButton("Print");
		GridBagConstraints gbc_printButton = new GridBagConstraints();
		gbc_printButton.gridx = 2;
		gbc_printButton.gridy = 2;
		add(printButton, gbc_printButton);
		
	}
}
