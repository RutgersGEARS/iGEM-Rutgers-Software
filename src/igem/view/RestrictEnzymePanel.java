package igem.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class RestrictEnzymePanel extends JPanel{
	
		JCheckBox[] enzymeCheckBoxes = new JCheckBox[MainFrame.myss.getNumberOfEnzymes()];
	
	public RestrictEnzymePanel(){
		
		for(int i = 0; i < enzymeCheckBoxes.length; i++){
			enzymeCheckBoxes[i] = new JCheckBox(MainFrame.myss.getEnzyme(i).getName());
		}
		setBorder(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		// AgeI
		GridBagConstraints gbc_lblAgei = new GridBagConstraints();
		gbc_lblAgei.anchor = GridBagConstraints.WEST;
		gbc_lblAgei.insets = new Insets(5, 5, 5, 5);
		gbc_lblAgei.gridx = 0;
		gbc_lblAgei.gridy = 0;
		add(enzymeCheckBoxes[0], gbc_lblAgei);
		
		// KpnI
		GridBagConstraints gbc_lblKpni = new GridBagConstraints();
		gbc_lblKpni.anchor = GridBagConstraints.WEST;
		gbc_lblKpni.insets = new Insets(0, 20, 5, 5);
		gbc_lblKpni.gridx = 1;
		gbc_lblKpni.gridy = 0;
		add(enzymeCheckBoxes[10], gbc_lblKpni);
		
		// SapI
		GridBagConstraints gbc_lblSapi = new GridBagConstraints();
		gbc_lblSapi.anchor = GridBagConstraints.WEST;
		gbc_lblSapi.insets = new Insets(0, 20, 5, 0);
		gbc_lblSapi.gridx = 2;
		gbc_lblSapi.gridy = 0;
		add(enzymeCheckBoxes[20], gbc_lblSapi);		
		
		// AvrII
		GridBagConstraints gbc_lblAvrii = new GridBagConstraints();
		gbc_lblAvrii.anchor = GridBagConstraints.WEST;
		gbc_lblAvrii.insets = new Insets(5, 5, 5, 5);
		gbc_lblAvrii.gridx = 0;
		gbc_lblAvrii.gridy = 1;
		add(enzymeCheckBoxes[1], gbc_lblAvrii);
		
		// MfeI
		GridBagConstraints gbc_lblMfei = new GridBagConstraints();
		gbc_lblMfei.anchor = GridBagConstraints.WEST;
		gbc_lblMfei.insets = new Insets(0, 20, 5, 5);
		gbc_lblMfei.gridx = 1;
		gbc_lblMfei.gridy = 1;
		add(enzymeCheckBoxes[11], gbc_lblMfei);
		
		// SbfI
		GridBagConstraints gbc_lblSbfi = new GridBagConstraints();
		gbc_lblSbfi.anchor = GridBagConstraints.WEST;
		gbc_lblSbfi.insets = new Insets(0, 20, 5, 0);
		gbc_lblSbfi.gridx = 2;
		gbc_lblSbfi.gridy = 1;
		add(enzymeCheckBoxes[21], gbc_lblSbfi);

		
		// BamHI
		GridBagConstraints gbc_lblBamhi = new GridBagConstraints();
		gbc_lblBamhi.anchor = GridBagConstraints.WEST;
		gbc_lblBamhi.insets = new Insets(5, 5, 5, 5);
		gbc_lblBamhi.gridx = 0;
		gbc_lblBamhi.gridy = 2;
		add(enzymeCheckBoxes[2], gbc_lblBamhi);
		
		// NcoI
		GridBagConstraints gbc_lblNcoi = new GridBagConstraints();
		gbc_lblNcoi.anchor = GridBagConstraints.WEST;
		gbc_lblNcoi.insets = new Insets(0, 20, 5, 5);
		gbc_lblNcoi.gridx = 1;
		gbc_lblNcoi.gridy = 2;
		add(enzymeCheckBoxes[12], gbc_lblNcoi);
		
		// ScaI
		GridBagConstraints gbc_lblScai = new GridBagConstraints();
		gbc_lblScai.anchor = GridBagConstraints.WEST;
		gbc_lblScai.insets = new Insets(0, 20, 5, 0);
		gbc_lblScai.gridx = 2;
		gbc_lblScai.gridy = 2;
		add(enzymeCheckBoxes[22], gbc_lblScai);
		
		// BglII
		GridBagConstraints gbc_lblBglii = new GridBagConstraints();
		gbc_lblBglii.anchor = GridBagConstraints.WEST;
		gbc_lblBglii.insets = new Insets(5, 5, 5, 5);
		gbc_lblBglii.gridx = 0;
		gbc_lblBglii.gridy = 3;
		add(enzymeCheckBoxes[3], gbc_lblBglii);
		
		// NheI
		GridBagConstraints gbc_lblNhei = new GridBagConstraints();
		gbc_lblNhei.anchor = GridBagConstraints.WEST;
		gbc_lblNhei.insets = new Insets(0, 20, 5, 5);
		gbc_lblNhei.gridx = 1;
		gbc_lblNhei.gridy = 3;
		add(enzymeCheckBoxes[13], gbc_lblNhei);
		
		// SpeI
		GridBagConstraints gbc_lblSpei = new GridBagConstraints();
		gbc_lblSpei.anchor = GridBagConstraints.WEST;
		gbc_lblSpei.insets = new Insets(0, 20, 5, 0);
		gbc_lblSpei.gridx = 2;
		gbc_lblSpei.gridy = 3;
		add(enzymeCheckBoxes[23], gbc_lblSpei);
		
		
		// BsaI
		GridBagConstraints gbc_lblBsai = new GridBagConstraints();
		gbc_lblBsai.anchor = GridBagConstraints.WEST;
		gbc_lblBsai.insets = new Insets(5, 5, 5, 5);
		gbc_lblBsai.gridx = 0;
		gbc_lblBsai.gridy = 4;
		add(enzymeCheckBoxes[4], gbc_lblBsai);
		
		// NotI
		GridBagConstraints gbc_lblNoti = new GridBagConstraints();
		gbc_lblNoti.anchor = GridBagConstraints.WEST;
		gbc_lblNoti.insets = new Insets(0, 20, 5, 5);
		gbc_lblNoti.gridx = 1;
		gbc_lblNoti.gridy = 4;
		add(enzymeCheckBoxes[14], gbc_lblNoti);
		
		// SphI
		GridBagConstraints gbc_lblSphi = new GridBagConstraints();
		gbc_lblSphi.anchor = GridBagConstraints.WEST;
		gbc_lblSphi.insets = new Insets(0, 20, 5, 0);
		gbc_lblSphi.gridx = 2;
		gbc_lblSphi.gridy = 4;
		add(enzymeCheckBoxes[24], gbc_lblSphi);
		
		// DraIII
		GridBagConstraints gbc_lblDraiii = new GridBagConstraints();
		gbc_lblDraiii.anchor = GridBagConstraints.WEST;
		gbc_lblDraiii.insets = new Insets(5, 5, 5, 5);
		gbc_lblDraiii.gridx = 0;
		gbc_lblDraiii.gridy = 5;
		add(enzymeCheckBoxes[5], gbc_lblDraiii);
		
		// PstI
		GridBagConstraints gbc_lblPsti = new GridBagConstraints();
		gbc_lblPsti.anchor = GridBagConstraints.WEST;
		gbc_lblPsti.insets = new Insets(0, 20, 5, 5);
		gbc_lblPsti.gridx = 1;
		gbc_lblPsti.gridy = 5;
		add(enzymeCheckBoxes[15], gbc_lblPsti);
		
		// SspI
		GridBagConstraints gbc_lblSspi = new GridBagConstraints();
		gbc_lblSspi.anchor = GridBagConstraints.WEST;
		gbc_lblSspi.insets = new Insets(0, 20, 5, 0);
		gbc_lblSspi.gridx = 2;
		gbc_lblSspi.gridy = 5;
		add(enzymeCheckBoxes[25], gbc_lblSspi);
		
		// EagI
		GridBagConstraints gbc_lblEagi = new GridBagConstraints();
		gbc_lblEagi.anchor = GridBagConstraints.WEST;
		gbc_lblEagi.insets = new Insets(5, 5, 5, 5);
		gbc_lblEagi.gridx = 0;
		gbc_lblEagi.gridy = 6;
		add(enzymeCheckBoxes[6], gbc_lblEagi);
		
		// PvuI
		GridBagConstraints gbc_lblPvui = new GridBagConstraints();
		gbc_lblPvui.anchor = GridBagConstraints.WEST;
		gbc_lblPvui.insets = new Insets(0, 20, 5, 5);
		gbc_lblPvui.gridx = 1;
		gbc_lblPvui.gridy = 6;
		add(enzymeCheckBoxes[16], gbc_lblPvui);

		// StyI
		GridBagConstraints gbc_lblStyi = new GridBagConstraints();
		gbc_lblStyi.anchor = GridBagConstraints.WEST;
		gbc_lblStyi.insets = new Insets(0, 20, 5, 0);
		gbc_lblStyi.gridx = 2;
		gbc_lblStyi.gridy = 6;
		add(enzymeCheckBoxes[26], gbc_lblStyi);
		
		// EcoRI
		GridBagConstraints gbc_lblEcori = new GridBagConstraints();
		gbc_lblEcori.anchor = GridBagConstraints.WEST;
		gbc_lblEcori.insets = new Insets(5, 5, 5, 5);
		gbc_lblEcori.gridx = 0;
		gbc_lblEcori.gridy = 7;
		add(enzymeCheckBoxes[7], gbc_lblEcori);
		
		// PvuII
		GridBagConstraints gbc_lblPvuii = new GridBagConstraints();
		gbc_lblPvuii.anchor = GridBagConstraints.WEST;
		gbc_lblPvuii.insets = new Insets(0, 20, 5, 5);
		gbc_lblPvuii.gridx = 1;
		gbc_lblPvuii.gridy = 7;
		add(enzymeCheckBoxes[17], gbc_lblPvuii);
		
		// XbalI
		GridBagConstraints gbc_lblXbali = new GridBagConstraints();
		gbc_lblXbali.anchor = GridBagConstraints.WEST;
		gbc_lblXbali.insets = new Insets(0, 20, 5, 0);
		gbc_lblXbali.gridx = 2;
		gbc_lblXbali.gridy = 7;
		add(enzymeCheckBoxes[27], gbc_lblXbali);
		
		// EcoRV
		GridBagConstraints gbc_lblEcorv = new GridBagConstraints();
		gbc_lblEcorv.anchor = GridBagConstraints.WEST;
		gbc_lblEcorv.insets = new Insets(5, 5, 5, 5);
		gbc_lblEcorv.gridx = 0;
		gbc_lblEcorv.gridy = 8;
		add(enzymeCheckBoxes[8], gbc_lblEcorv);
		
		// ScaI
		GridBagConstraints gbc_lblSaci = new GridBagConstraints();
		gbc_lblSaci.anchor = GridBagConstraints.WEST;
		gbc_lblSaci.insets = new Insets(0, 20, 5, 5);
		gbc_lblSaci.gridx = 1;
		gbc_lblSaci.gridy = 8;
		add(enzymeCheckBoxes[18], gbc_lblSaci);
		
		// XhoI
		GridBagConstraints gbc_lblXhoi = new GridBagConstraints();
		gbc_lblXhoi.anchor = GridBagConstraints.WEST;
		gbc_lblXhoi.insets = new Insets(0, 20, 5, 0);
		gbc_lblXhoi.gridx = 2;
		gbc_lblXhoi.gridy = 8;
		add(enzymeCheckBoxes[28], gbc_lblXhoi);
		
		// HindIII
		GridBagConstraints gbc_lblHindiii = new GridBagConstraints();
		gbc_lblHindiii.anchor = GridBagConstraints.WEST;
		gbc_lblHindiii.insets = new Insets(5, 5, 0, 5);
		gbc_lblHindiii.gridx = 0;
		gbc_lblHindiii.gridy = 9;
		add(enzymeCheckBoxes[9], gbc_lblHindiii);
		
		// SalI
		GridBagConstraints gbc_lblSali = new GridBagConstraints();
		gbc_lblSali.anchor = GridBagConstraints.WEST;
		gbc_lblSali.insets = new Insets(0, 20, 0, 5);
		gbc_lblSali.gridx = 1;
		gbc_lblSali.gridy = 9;
		add(enzymeCheckBoxes[19], gbc_lblSali);
		
	}

}
