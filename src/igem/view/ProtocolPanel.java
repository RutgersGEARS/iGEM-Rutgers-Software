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

	
	public ProtocolPanel(){
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblProtocol = new JLabel("Protocol For Whatever");
		GridBagConstraints gbc_lblProtocol = new GridBagConstraints();
		gbc_lblProtocol.anchor = GridBagConstraints.WEST;
		gbc_lblProtocol.gridwidth = 3;
		gbc_lblProtocol.insets = new Insets(5, 15, 5, 0);
		gbc_lblProtocol.gridx = 0;
		gbc_lblProtocol.gridy = 0;
		add(lblProtocol, gbc_lblProtocol);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 3;
		gbc_scrollPane.insets = new Insets(5, 15, 5, 15);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		add(scrollPane, gbc_scrollPane);
		
		JEditorPane editorPane = new JEditorPane();
		scrollPane.setViewportView(editorPane);
		
		JButton btnSaveAs = new JButton("Save As");
		GridBagConstraints gbc_btnSaveAs = new GridBagConstraints();
		gbc_btnSaveAs.insets = new Insets(0, 0, 0, 5);
		gbc_btnSaveAs.gridx = 1;
		gbc_btnSaveAs.gridy = 2;
		add(btnSaveAs, gbc_btnSaveAs);
		
		JButton btnPrint = new JButton("Print");
		GridBagConstraints gbc_btnPrint = new GridBagConstraints();
		gbc_btnPrint.gridx = 2;
		gbc_btnPrint.gridy = 2;
		add(btnPrint, gbc_btnPrint);
		
	}
}
