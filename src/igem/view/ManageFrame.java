package igem.view;

import igem.model.Data;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class ManageFrame extends JFrame{
	

	OrganismPanel organismPanel;
	StandardPanel standardPanel;
		
	public ManageFrame(){
		super("Manage Components");
		//setAlwaysOnTop(true);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		
		
		// set to panels to transparent so you don't have to worry about the background
		organismPanel = new OrganismPanel();
		organismPanel.setBorder(null);
		organismPanel.setOpaque(false);

		standardPanel = new StandardPanel(MainFrame.myss);
		standardPanel.setOpaque(false);
		standardPanel.setBorder(null);
		
		JTabbedPane manageTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		// add tabs to tabbed pane layout
		manageTabbedPane.addTab("Organisms", organismPanel);
		manageTabbedPane.addTab("Standards", standardPanel);
		
		
		GridBagConstraints gbc_manageTabbedPane = new GridBagConstraints();
		gbc_manageTabbedPane.fill = GridBagConstraints.BOTH;
		gbc_manageTabbedPane.gridx = 0;
		gbc_manageTabbedPane.gridy = 0;
		getContentPane().add(manageTabbedPane, gbc_manageTabbedPane);
		
		
		
	}
}
