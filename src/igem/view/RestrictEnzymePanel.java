package igem.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class RestrictEnzymePanel extends JPanel{
	
	public RestrictEnzymePanel(){
		setBorder(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JCheckBox lblAgei = new JCheckBox("AgeI");
		GridBagConstraints gbc_lblAgei = new GridBagConstraints();
		gbc_lblAgei.anchor = GridBagConstraints.WEST;
		gbc_lblAgei.insets = new Insets(5, 5, 5, 5);
		gbc_lblAgei.gridx = 0;
		gbc_lblAgei.gridy = 0;
		add(lblAgei, gbc_lblAgei);
		
		JCheckBox lblKpni = new JCheckBox("KpnI");
		GridBagConstraints gbc_lblKpni = new GridBagConstraints();
		gbc_lblKpni.anchor = GridBagConstraints.WEST;
		gbc_lblKpni.insets = new Insets(0, 20, 5, 5);
		gbc_lblKpni.gridx = 1;
		gbc_lblKpni.gridy = 0;
		add(lblKpni, gbc_lblKpni);
		
		JCheckBox lblSapi = new JCheckBox("SapI");
		GridBagConstraints gbc_lblSapi = new GridBagConstraints();
		gbc_lblSapi.anchor = GridBagConstraints.WEST;
		gbc_lblSapi.insets = new Insets(0, 20, 5, 0);
		gbc_lblSapi.gridx = 2;
		gbc_lblSapi.gridy = 0;
		add(lblSapi, gbc_lblSapi);
		
		JCheckBox lblAvrii = new JCheckBox("AvrII");
		GridBagConstraints gbc_lblAvrii = new GridBagConstraints();
		gbc_lblAvrii.anchor = GridBagConstraints.WEST;
		gbc_lblAvrii.insets = new Insets(5, 5, 5, 5);
		gbc_lblAvrii.gridx = 0;
		gbc_lblAvrii.gridy = 1;
		add(lblAvrii, gbc_lblAvrii);
		
		JCheckBox lblMfei = new JCheckBox("MfeI");
		GridBagConstraints gbc_lblMfei = new GridBagConstraints();
		gbc_lblMfei.anchor = GridBagConstraints.WEST;
		gbc_lblMfei.insets = new Insets(0, 20, 5, 5);
		gbc_lblMfei.gridx = 1;
		gbc_lblMfei.gridy = 1;
		add(lblMfei, gbc_lblMfei);
		
		JCheckBox lblSbfi = new JCheckBox("SbfI");
		GridBagConstraints gbc_lblSbfi = new GridBagConstraints();
		gbc_lblSbfi.anchor = GridBagConstraints.WEST;
		gbc_lblSbfi.insets = new Insets(0, 20, 5, 0);
		gbc_lblSbfi.gridx = 2;
		gbc_lblSbfi.gridy = 1;
		add(lblSbfi, gbc_lblSbfi);
		
		JCheckBox lblBamhi = new JCheckBox("BamHI");
		GridBagConstraints gbc_lblBamhi = new GridBagConstraints();
		gbc_lblBamhi.anchor = GridBagConstraints.WEST;
		gbc_lblBamhi.insets = new Insets(5, 5, 5, 5);
		gbc_lblBamhi.gridx = 0;
		gbc_lblBamhi.gridy = 2;
		add(lblBamhi, gbc_lblBamhi);
		
		JCheckBox lblNcoi = new JCheckBox("NcoI");
		GridBagConstraints gbc_lblNcoi = new GridBagConstraints();
		gbc_lblNcoi.anchor = GridBagConstraints.WEST;
		gbc_lblNcoi.insets = new Insets(0, 20, 5, 5);
		gbc_lblNcoi.gridx = 1;
		gbc_lblNcoi.gridy = 2;
		add(lblNcoi, gbc_lblNcoi);
		
		JCheckBox lblScai = new JCheckBox("ScaI");
		GridBagConstraints gbc_lblScai = new GridBagConstraints();
		gbc_lblScai.anchor = GridBagConstraints.WEST;
		gbc_lblScai.insets = new Insets(0, 20, 5, 0);
		gbc_lblScai.gridx = 2;
		gbc_lblScai.gridy = 2;
		add(lblScai, gbc_lblScai);
		
		JCheckBox lblBglii = new JCheckBox("BglII");
		GridBagConstraints gbc_lblBglii = new GridBagConstraints();
		gbc_lblBglii.anchor = GridBagConstraints.WEST;
		gbc_lblBglii.insets = new Insets(5, 5, 5, 5);
		gbc_lblBglii.gridx = 0;
		gbc_lblBglii.gridy = 3;
		add(lblBglii, gbc_lblBglii);
		
		JCheckBox lblNhei = new JCheckBox("NheI");
		GridBagConstraints gbc_lblNhei = new GridBagConstraints();
		gbc_lblNhei.anchor = GridBagConstraints.WEST;
		gbc_lblNhei.insets = new Insets(0, 20, 5, 5);
		gbc_lblNhei.gridx = 1;
		gbc_lblNhei.gridy = 3;
		add(lblNhei, gbc_lblNhei);
		
		JCheckBox lblSpei = new JCheckBox("SpeI");
		GridBagConstraints gbc_lblSpei = new GridBagConstraints();
		gbc_lblSpei.anchor = GridBagConstraints.WEST;
		gbc_lblSpei.insets = new Insets(0, 20, 5, 0);
		gbc_lblSpei.gridx = 2;
		gbc_lblSpei.gridy = 3;
		add(lblSpei, gbc_lblSpei);
		
		JCheckBox lblBsai = new JCheckBox("BsaI");
		GridBagConstraints gbc_lblBsai = new GridBagConstraints();
		gbc_lblBsai.anchor = GridBagConstraints.WEST;
		gbc_lblBsai.insets = new Insets(5, 5, 5, 5);
		gbc_lblBsai.gridx = 0;
		gbc_lblBsai.gridy = 4;
		add(lblBsai, gbc_lblBsai);
		
		JCheckBox lblNoti = new JCheckBox("NotI");
		GridBagConstraints gbc_lblNoti = new GridBagConstraints();
		gbc_lblNoti.anchor = GridBagConstraints.WEST;
		gbc_lblNoti.insets = new Insets(0, 20, 5, 5);
		gbc_lblNoti.gridx = 1;
		gbc_lblNoti.gridy = 4;
		add(lblNoti, gbc_lblNoti);
		
		JCheckBox lblSphi = new JCheckBox("SphI");
		GridBagConstraints gbc_lblSphi = new GridBagConstraints();
		gbc_lblSphi.anchor = GridBagConstraints.WEST;
		gbc_lblSphi.insets = new Insets(0, 20, 5, 0);
		gbc_lblSphi.gridx = 2;
		gbc_lblSphi.gridy = 4;
		add(lblSphi, gbc_lblSphi);
		
		JCheckBox lblDraiii = new JCheckBox("DraIII");
		GridBagConstraints gbc_lblDraiii = new GridBagConstraints();
		gbc_lblDraiii.anchor = GridBagConstraints.WEST;
		gbc_lblDraiii.insets = new Insets(5, 5, 5, 5);
		gbc_lblDraiii.gridx = 0;
		gbc_lblDraiii.gridy = 5;
		add(lblDraiii, gbc_lblDraiii);
		
		JCheckBox lblPsti = new JCheckBox("PstI");
		GridBagConstraints gbc_lblPsti = new GridBagConstraints();
		gbc_lblPsti.anchor = GridBagConstraints.WEST;
		gbc_lblPsti.insets = new Insets(0, 20, 5, 5);
		gbc_lblPsti.gridx = 1;
		gbc_lblPsti.gridy = 5;
		add(lblPsti, gbc_lblPsti);
		
		JCheckBox lblSspi = new JCheckBox("SspI");
		GridBagConstraints gbc_lblSspi = new GridBagConstraints();
		gbc_lblSspi.anchor = GridBagConstraints.WEST;
		gbc_lblSspi.insets = new Insets(0, 20, 5, 0);
		gbc_lblSspi.gridx = 2;
		gbc_lblSspi.gridy = 5;
		add(lblSspi, gbc_lblSspi);
		
		JCheckBox lblEagi = new JCheckBox("EagI");
		GridBagConstraints gbc_lblEagi = new GridBagConstraints();
		gbc_lblEagi.anchor = GridBagConstraints.WEST;
		gbc_lblEagi.insets = new Insets(5, 5, 5, 5);
		gbc_lblEagi.gridx = 0;
		gbc_lblEagi.gridy = 6;
		add(lblEagi, gbc_lblEagi);
		
		JCheckBox lblPvui = new JCheckBox("PvuI");
		GridBagConstraints gbc_lblPvui = new GridBagConstraints();
		gbc_lblPvui.anchor = GridBagConstraints.WEST;
		gbc_lblPvui.insets = new Insets(0, 20, 5, 5);
		gbc_lblPvui.gridx = 1;
		gbc_lblPvui.gridy = 6;
		add(lblPvui, gbc_lblPvui);
		
		JCheckBox lblStyi = new JCheckBox("StyI");
		GridBagConstraints gbc_lblStyi = new GridBagConstraints();
		gbc_lblStyi.anchor = GridBagConstraints.WEST;
		gbc_lblStyi.insets = new Insets(0, 20, 5, 0);
		gbc_lblStyi.gridx = 2;
		gbc_lblStyi.gridy = 6;
		add(lblStyi, gbc_lblStyi);
		
		JCheckBox lblEcori = new JCheckBox("EcoRI");
		GridBagConstraints gbc_lblEcori = new GridBagConstraints();
		gbc_lblEcori.anchor = GridBagConstraints.WEST;
		gbc_lblEcori.insets = new Insets(5, 5, 5, 5);
		gbc_lblEcori.gridx = 0;
		gbc_lblEcori.gridy = 7;
		add(lblEcori, gbc_lblEcori);
		
		JCheckBox lblPvuii = new JCheckBox("PvuII");
		GridBagConstraints gbc_lblPvuii = new GridBagConstraints();
		gbc_lblPvuii.anchor = GridBagConstraints.WEST;
		gbc_lblPvuii.insets = new Insets(0, 20, 5, 5);
		gbc_lblPvuii.gridx = 1;
		gbc_lblPvuii.gridy = 7;
		add(lblPvuii, gbc_lblPvuii);
		
		JCheckBox lblXbali = new JCheckBox("XbalI");
		GridBagConstraints gbc_lblXbali = new GridBagConstraints();
		gbc_lblXbali.anchor = GridBagConstraints.WEST;
		gbc_lblXbali.insets = new Insets(0, 20, 5, 0);
		gbc_lblXbali.gridx = 2;
		gbc_lblXbali.gridy = 7;
		add(lblXbali, gbc_lblXbali);
		
		JCheckBox lblEcorv = new JCheckBox("EcoRV");
		GridBagConstraints gbc_lblEcorv = new GridBagConstraints();
		gbc_lblEcorv.anchor = GridBagConstraints.WEST;
		gbc_lblEcorv.insets = new Insets(5, 5, 5, 5);
		gbc_lblEcorv.gridx = 0;
		gbc_lblEcorv.gridy = 8;
		add(lblEcorv, gbc_lblEcorv);
		
		JCheckBox lblSaci = new JCheckBox("SacI");
		GridBagConstraints gbc_lblSaci = new GridBagConstraints();
		gbc_lblSaci.anchor = GridBagConstraints.WEST;
		gbc_lblSaci.insets = new Insets(0, 20, 5, 5);
		gbc_lblSaci.gridx = 1;
		gbc_lblSaci.gridy = 8;
		add(lblSaci, gbc_lblSaci);
		
		JCheckBox lblXhoi = new JCheckBox("XhoI");
		GridBagConstraints gbc_lblXhoi = new GridBagConstraints();
		gbc_lblXhoi.anchor = GridBagConstraints.WEST;
		gbc_lblXhoi.insets = new Insets(0, 20, 5, 0);
		gbc_lblXhoi.gridx = 2;
		gbc_lblXhoi.gridy = 8;
		add(lblXhoi, gbc_lblXhoi);
		
		JCheckBox lblHindiii = new JCheckBox("HindIII");
		GridBagConstraints gbc_lblHindiii = new GridBagConstraints();
		gbc_lblHindiii.anchor = GridBagConstraints.WEST;
		gbc_lblHindiii.insets = new Insets(5, 5, 0, 5);
		gbc_lblHindiii.gridx = 0;
		gbc_lblHindiii.gridy = 9;
		add(lblHindiii, gbc_lblHindiii);
		
		JCheckBox lblSali = new JCheckBox("SalI");
		GridBagConstraints gbc_lblSali = new GridBagConstraints();
		gbc_lblSali.anchor = GridBagConstraints.WEST;
		gbc_lblSali.insets = new Insets(0, 20, 0, 5);
		gbc_lblSali.gridx = 1;
		gbc_lblSali.gridy = 9;
		add(lblSali, gbc_lblSali);
		
	}

}
