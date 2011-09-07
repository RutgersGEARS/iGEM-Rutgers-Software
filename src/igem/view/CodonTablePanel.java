package igem.view;

import igem.model.Data;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CodonTablePanel extends JPanel{
	
	Data myss;
	
	private JTextField[] textFieldArray = new JTextField[64];
	
	private JLabel lblTgt;
	private JLabel lblTgc;
	private JLabel lblTga;
	private JLabel lblTgg;
	private JLabel lblCgt;
	private JLabel lblCgc;
	private JLabel lblCga;
	private JLabel lblCgg;
	private JLabel lblAgt;
	private JLabel lblAgc;
	private JLabel lblAga;
	private JLabel lblAgg;
	private JLabel lblGgt;
	private JLabel lblGgc;
	private JLabel lblGga;
	private JLabel lblGgg;

	
	public CodonTablePanel(Data data){
		this.myss = data;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 100, 0, 81, 0, 45, 0, 40, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblTtt = new JLabel("TTT");
		GridBagConstraints gbc_lblTtt = new GridBagConstraints();
		gbc_lblTtt.anchor = GridBagConstraints.EAST;
		gbc_lblTtt.insets = new Insets(0, 0, 5, 5);
		gbc_lblTtt.gridx = 0;
		gbc_lblTtt.gridy = 0;
		add(lblTtt, gbc_lblTtt);
		
		
		textFieldArray[0] = new JTextField();
		GridBagConstraints gbc_TTT_1_field = new GridBagConstraints();
		gbc_TTT_1_field.insets = new Insets(0, 0, 5, 5);
		gbc_TTT_1_field.gridx = 1;
		gbc_TTT_1_field.gridy = 0;
		add(textFieldArray[0], gbc_TTT_1_field);
		textFieldArray[0].setColumns(7);
		
		JLabel lblTct = new JLabel("TCT");
		GridBagConstraints gbc_lblTct = new GridBagConstraints();
		gbc_lblTct.anchor = GridBagConstraints.EAST;
		gbc_lblTct.insets = new Insets(0, 10, 5, 5);
		gbc_lblTct.gridx = 2;
		gbc_lblTct.gridy = 0;
		add(lblTct, gbc_lblTct);
		
		textFieldArray[16] = new JTextField();
		GridBagConstraints gbc_TCT_field = new GridBagConstraints();
		gbc_TCT_field.insets = new Insets(0, 0, 5, 5);
		gbc_TCT_field.gridx = 3;
		gbc_TCT_field.gridy = 0;
		add(textFieldArray[16], gbc_TCT_field);
		textFieldArray[16].setColumns(7);
		
		JLabel lblTat = new JLabel("TAT");
		GridBagConstraints gbc_lblTat = new GridBagConstraints();
		gbc_lblTat.anchor = GridBagConstraints.EAST;
		gbc_lblTat.insets = new Insets(0, 10, 5, 5);
		gbc_lblTat.gridx = 4;
		gbc_lblTat.gridy = 0;
		add(lblTat, gbc_lblTat);
		
		textFieldArray[32] = new JTextField();
		GridBagConstraints gbc_TAT_field = new GridBagConstraints();
		gbc_TAT_field.insets = new Insets(0, 0, 5, 5);
		gbc_TAT_field.gridx = 5;
		gbc_TAT_field.gridy = 0;
		add(textFieldArray[32] , gbc_TAT_field);
		textFieldArray[32].setColumns(7);
		
		lblTgt = new JLabel("TGT");
		GridBagConstraints gbc_lblTgt = new GridBagConstraints();
		gbc_lblTgt.anchor = GridBagConstraints.EAST;
		gbc_lblTgt.insets = new Insets(0, 10, 5, 5);
		gbc_lblTgt.gridx = 6;
		gbc_lblTgt.gridy = 0;
		add(lblTgt, gbc_lblTgt);
		
		textFieldArray[48] = new JTextField();
		GridBagConstraints gbc_TGT_field = new GridBagConstraints();
		gbc_TGT_field.insets = new Insets(0, 0, 5, 0);
		gbc_TGT_field.gridx = 7;
		gbc_TGT_field.gridy = 0;
		add(textFieldArray[48], gbc_TGT_field);
		textFieldArray[48].setColumns(7);
		
		JLabel lblTtc = new JLabel("TTC");
		GridBagConstraints gbc_lblTtc = new GridBagConstraints();
		gbc_lblTtc.anchor = GridBagConstraints.EAST;
		gbc_lblTtc.insets = new Insets(0, 0, 5, 5);
		gbc_lblTtc.gridx = 0;
		gbc_lblTtc.gridy = 1;
		add(lblTtc, gbc_lblTtc);
		
		textFieldArray[1] = new JTextField();
		GridBagConstraints gbc_TTC_2_field = new GridBagConstraints();
		gbc_TTC_2_field.insets = new Insets(0, 0, 5, 5);
		gbc_TTC_2_field.gridx = 1;
		gbc_TTC_2_field.gridy = 1;
		add(textFieldArray[1], gbc_TTC_2_field);
		textFieldArray[1].setColumns(7);
		
		JLabel lblTcc = new JLabel("TCC");
		GridBagConstraints gbc_lblTcc = new GridBagConstraints();
		gbc_lblTcc.anchor = GridBagConstraints.EAST;
		gbc_lblTcc.insets = new Insets(0, 10, 5, 5);
		gbc_lblTcc.gridx = 2;
		gbc_lblTcc.gridy = 1;
		add(lblTcc, gbc_lblTcc);
		
		textFieldArray[17] = new JTextField();
		GridBagConstraints gbc_TCC_field = new GridBagConstraints();
		gbc_TCC_field.insets = new Insets(0, 0, 5, 5);
		gbc_TCC_field.gridx = 3;
		gbc_TCC_field.gridy = 1;
		add(textFieldArray[17], gbc_TCC_field);
		textFieldArray[17].setColumns(7);
		
		JLabel lblTac = new JLabel("TAC");
		GridBagConstraints gbc_lblTac = new GridBagConstraints();
		gbc_lblTac.anchor = GridBagConstraints.EAST;
		gbc_lblTac.insets = new Insets(0, 10, 5, 5);
		gbc_lblTac.gridx = 4;
		gbc_lblTac.gridy = 1;
		add(lblTac, gbc_lblTac);
		
		textFieldArray[33] = new JTextField();
		GridBagConstraints gbc_TAC_field = new GridBagConstraints();
		gbc_TAC_field.insets = new Insets(0, 0, 5, 5);
		gbc_TAC_field.gridx = 5;
		gbc_TAC_field.gridy = 1;
		add(textFieldArray[33], gbc_TAC_field);
		textFieldArray[33].setColumns(7);
		
		lblTgc = new JLabel("TGC");
		GridBagConstraints gbc_lblTgc = new GridBagConstraints();
		gbc_lblTgc.anchor = GridBagConstraints.EAST;
		gbc_lblTgc.insets = new Insets(0, 10, 5, 5);
		gbc_lblTgc.gridx = 6;
		gbc_lblTgc.gridy = 1;
		add(lblTgc, gbc_lblTgc);
		
		textFieldArray[49] = new JTextField();
		GridBagConstraints gbc_TGC_field = new GridBagConstraints();
		gbc_TGC_field.insets = new Insets(0, 0, 5, 0);
		gbc_TGC_field.gridx = 7;
		gbc_TGC_field.gridy = 1;
		add(textFieldArray[49], gbc_TGC_field);
		textFieldArray[49].setColumns(7);
		
		JLabel lblTta = new JLabel("TTA");
		GridBagConstraints gbc_lblTta = new GridBagConstraints();
		gbc_lblTta.anchor = GridBagConstraints.EAST;
		gbc_lblTta.insets = new Insets(0, 0, 5, 5);
		gbc_lblTta.gridx = 0;
		gbc_lblTta.gridy = 2;
		add(lblTta, gbc_lblTta);
		
		textFieldArray[2] = new JTextField();
		GridBagConstraints gbc_TTA_3_field = new GridBagConstraints();
		gbc_TTA_3_field.insets = new Insets(0, 0, 5, 5);
		gbc_TTA_3_field.gridx = 1;
		gbc_TTA_3_field.gridy = 2;
		add(textFieldArray[2], gbc_TTA_3_field);
		textFieldArray[2].setColumns(7);
		
		JLabel lblTca = new JLabel("TCA");
		GridBagConstraints gbc_lblTca = new GridBagConstraints();
		gbc_lblTca.anchor = GridBagConstraints.EAST;
		gbc_lblTca.insets = new Insets(0, 10, 5, 5);
		gbc_lblTca.gridx = 2;
		gbc_lblTca.gridy = 2;
		add(lblTca, gbc_lblTca);
		
		textFieldArray[18] = new JTextField();
		GridBagConstraints gbc_TCA_field = new GridBagConstraints();
		gbc_TCA_field.insets = new Insets(0, 0, 5, 5);
		gbc_TCA_field.gridx = 3;
		gbc_TCA_field.gridy = 2;
		add(textFieldArray[18], gbc_TCA_field);
		textFieldArray[18].setColumns(7);
		
		JLabel lblTaa = new JLabel("TAA");
		GridBagConstraints gbc_lblTaa = new GridBagConstraints();
		gbc_lblTaa.anchor = GridBagConstraints.EAST;
		gbc_lblTaa.insets = new Insets(0, 10, 5, 5);
		gbc_lblTaa.gridx = 4;
		gbc_lblTaa.gridy = 2;
		add(lblTaa, gbc_lblTaa);
		
		textFieldArray[34] = new JTextField();
		GridBagConstraints gbc_TAA_field = new GridBagConstraints();
		gbc_TAA_field.insets = new Insets(0, 0, 5, 5);
		gbc_TAA_field.gridx = 5;
		gbc_TAA_field.gridy = 2;
		add(textFieldArray[34], gbc_TAA_field);
		textFieldArray[34].setColumns(7);
		
		lblTga = new JLabel("TGA");
		GridBagConstraints gbc_lblTga = new GridBagConstraints();
		gbc_lblTga.anchor = GridBagConstraints.EAST;
		gbc_lblTga.insets = new Insets(0, 10, 5, 5);
		gbc_lblTga.gridx = 6;
		gbc_lblTga.gridy = 2;
		add(lblTga, gbc_lblTga);
		
		textFieldArray[50] = new JTextField();
		GridBagConstraints gbc_TGA_field = new GridBagConstraints();
		gbc_TGA_field.insets = new Insets(0, 0, 5, 0);
		gbc_TGA_field.gridx = 7;
		gbc_TGA_field.gridy = 2;
		add(textFieldArray[50], gbc_TGA_field);
		textFieldArray[50].setColumns(7);
		
		JLabel lblTtg = new JLabel("TTG");
		GridBagConstraints gbc_lblTtg = new GridBagConstraints();
		gbc_lblTtg.anchor = GridBagConstraints.EAST;
		gbc_lblTtg.insets = new Insets(0, 0, 10, 5);
		gbc_lblTtg.gridx = 0;
		gbc_lblTtg.gridy = 3;
		add(lblTtg, gbc_lblTtg);
		
		textFieldArray[3] = new JTextField();
		GridBagConstraints gbc_TTG_4_field = new GridBagConstraints();
		gbc_TTG_4_field.insets = new Insets(0, 0, 10, 5);
		gbc_TTG_4_field.gridx = 1;
		gbc_TTG_4_field.gridy = 3;
		add(textFieldArray[3], gbc_TTG_4_field);
		textFieldArray[3].setColumns(7);
		
		JLabel lblTcg = new JLabel("TCG");
		GridBagConstraints gbc_lblTcg = new GridBagConstraints();
		gbc_lblTcg.anchor = GridBagConstraints.EAST;
		gbc_lblTcg.insets = new Insets(0, 10, 10, 5);
		gbc_lblTcg.gridx = 2;
		gbc_lblTcg.gridy = 3;
		add(lblTcg, gbc_lblTcg);
		
		textFieldArray[19] = new JTextField();
		GridBagConstraints gbc_TCG_field = new GridBagConstraints();
		gbc_TCG_field.insets = new Insets(0, 0, 10, 5);
		gbc_TCG_field.gridx = 3;
		gbc_TCG_field.gridy = 3;
		add(textFieldArray[19], gbc_TCG_field);
		textFieldArray[19].setColumns(7);
		
		JLabel lblTag = new JLabel("TAG");
		GridBagConstraints gbc_lblTag = new GridBagConstraints();
		gbc_lblTag.anchor = GridBagConstraints.EAST;
		gbc_lblTag.insets = new Insets(0, 10, 10, 5);
		gbc_lblTag.gridx = 4;
		gbc_lblTag.gridy = 3;
		add(lblTag, gbc_lblTag);
		
		textFieldArray[35] = new JTextField();
		GridBagConstraints gbc_TAG_field = new GridBagConstraints();
		gbc_TAG_field.insets = new Insets(0, 0, 10, 5);
		gbc_TAG_field.gridx = 5;
		gbc_TAG_field.gridy = 3;
		add(textFieldArray[35], gbc_TAG_field);
		textFieldArray[35].setColumns(7);
		
		lblTgg = new JLabel("TGG");
		GridBagConstraints gbc_lblTgg = new GridBagConstraints();
		gbc_lblTgg.insets = new Insets(0, 10, 10, 5);
		gbc_lblTgg.anchor = GridBagConstraints.EAST;
		gbc_lblTgg.gridx = 6;
		gbc_lblTgg.gridy = 3;
		add(lblTgg, gbc_lblTgg);
		
		textFieldArray[51] = new JTextField();
		textFieldArray[51].setColumns(7);
		GridBagConstraints gbc_TGG_field = new GridBagConstraints();
		gbc_TGG_field.insets = new Insets(0, 0, 10, 0);
		gbc_TGG_field.gridx = 7;
		gbc_TGG_field.gridy = 3;
		add(textFieldArray[51], gbc_TGG_field);
		
		JLabel lblCtt = new JLabel("CTT");
		GridBagConstraints gbc_lblCtt = new GridBagConstraints();
		gbc_lblCtt.anchor = GridBagConstraints.EAST;
		gbc_lblCtt.insets = new Insets(10, 0, 5, 5);
		gbc_lblCtt.gridx = 0;
		gbc_lblCtt.gridy = 4;
		add(lblCtt, gbc_lblCtt);
		
		textFieldArray[4] = new JTextField();
		GridBagConstraints gbc_CTT_field = new GridBagConstraints();
		gbc_CTT_field.insets = new Insets(10, 0, 5, 5);
		gbc_CTT_field.gridx = 1;
		gbc_CTT_field.gridy = 4;
		add(textFieldArray[4], gbc_CTT_field);
		textFieldArray[4].setColumns(7);
		
		JLabel lblCct = new JLabel("CCT");
		GridBagConstraints gbc_lblCct = new GridBagConstraints();
		gbc_lblCct.anchor = GridBagConstraints.EAST;
		gbc_lblCct.insets = new Insets(10, 10, 5, 5);
		gbc_lblCct.gridx = 2;
		gbc_lblCct.gridy = 4;
		add(lblCct, gbc_lblCct);
		
		textFieldArray[20] = new JTextField();
		GridBagConstraints gbc_CCT_field = new GridBagConstraints();
		gbc_CCT_field.insets = new Insets(10, 0, 5, 5);
		gbc_CCT_field.gridx = 3;
		gbc_CCT_field.gridy = 4;
		add(textFieldArray[20], gbc_CCT_field);
		textFieldArray[20].setColumns(7);
		
		JLabel lblCat = new JLabel("CAT");
		GridBagConstraints gbc_lblCat = new GridBagConstraints();
		gbc_lblCat.anchor = GridBagConstraints.EAST;
		gbc_lblCat.insets = new Insets(10, 10, 5, 5);
		gbc_lblCat.gridx = 4;
		gbc_lblCat.gridy = 4;
		add(lblCat, gbc_lblCat);
		
		textFieldArray[36] = new JTextField();
		GridBagConstraints gbc_CAT_field = new GridBagConstraints();
		gbc_CAT_field.insets = new Insets(10, 0, 5, 5);
		gbc_CAT_field.gridx = 5;
		gbc_CAT_field.gridy = 4;
		add(textFieldArray[36], gbc_CAT_field);
		textFieldArray[36].setColumns(7);
		
		lblCgt = new JLabel("CGT");
		GridBagConstraints gbc_lblCgt = new GridBagConstraints();
		gbc_lblCgt.anchor = GridBagConstraints.EAST;
		gbc_lblCgt.insets = new Insets(10, 10, 5, 5);
		gbc_lblCgt.gridx = 6;
		gbc_lblCgt.gridy = 4;
		add(lblCgt, gbc_lblCgt);
		
		textFieldArray[52] = new JTextField();
		GridBagConstraints gbc_CGT_field = new GridBagConstraints();
		gbc_CGT_field.insets = new Insets(10, 0, 5, 0);
		gbc_CGT_field.gridx = 7;
		gbc_CGT_field.gridy = 4;
		add(textFieldArray[52], gbc_CGT_field);
		textFieldArray[52].setColumns(7);
		
		JLabel lblCtc = new JLabel("CTC");
		GridBagConstraints gbc_lblCtc = new GridBagConstraints();
		gbc_lblCtc.anchor = GridBagConstraints.EAST;
		gbc_lblCtc.insets = new Insets(0, 0, 5, 5);
		gbc_lblCtc.gridx = 0;
		gbc_lblCtc.gridy = 5;
		add(lblCtc, gbc_lblCtc);
		
		textFieldArray[5] = new JTextField();
		GridBagConstraints gbc_CTC_field = new GridBagConstraints();
		gbc_CTC_field.insets = new Insets(0, 0, 5, 5);
		gbc_CTC_field.gridx = 1;
		gbc_CTC_field.gridy = 5;
		add(textFieldArray[5], gbc_CTC_field);
		textFieldArray[5].setColumns(7);
		
		JLabel lblCcc = new JLabel("CCC");
		GridBagConstraints gbc_lblCcc = new GridBagConstraints();
		gbc_lblCcc.anchor = GridBagConstraints.EAST;
		gbc_lblCcc.insets = new Insets(0, 10, 5, 5);
		gbc_lblCcc.gridx = 2;
		gbc_lblCcc.gridy = 5;
		add(lblCcc, gbc_lblCcc);
		
		textFieldArray[21] = new JTextField();
		GridBagConstraints gbc_CCC_field = new GridBagConstraints();
		gbc_CCC_field.insets = new Insets(0, 0, 5, 5);
		gbc_CCC_field.gridx = 3;
		gbc_CCC_field.gridy = 5;
		add(textFieldArray[21], gbc_CCC_field);
		textFieldArray[21].setColumns(7);
		
		JLabel lblCac = new JLabel("CAC");
		GridBagConstraints gbc_lblCac = new GridBagConstraints();
		gbc_lblCac.anchor = GridBagConstraints.EAST;
		gbc_lblCac.insets = new Insets(0, 10, 5, 5);
		gbc_lblCac.gridx = 4;
		gbc_lblCac.gridy = 5;
		add(lblCac, gbc_lblCac);
		
		textFieldArray[37] = new JTextField();
		GridBagConstraints gbc_CAC_field = new GridBagConstraints();
		gbc_CAC_field.insets = new Insets(0, 0, 5, 5);
		gbc_CAC_field.gridx = 5;
		gbc_CAC_field.gridy = 5;
		add(textFieldArray[37], gbc_CAC_field);
		textFieldArray[37].setColumns(7);
		
		lblCgc = new JLabel("CGC");
		GridBagConstraints gbc_lblCgc = new GridBagConstraints();
		gbc_lblCgc.anchor = GridBagConstraints.EAST;
		gbc_lblCgc.insets = new Insets(0, 10, 5, 5);
		gbc_lblCgc.gridx = 6;
		gbc_lblCgc.gridy = 5;
		add(lblCgc, gbc_lblCgc);
		
		textFieldArray[53] = new JTextField();
		GridBagConstraints gbc_CGC_field = new GridBagConstraints();
		gbc_CGC_field.insets = new Insets(0, 0, 5, 0);
		gbc_CGC_field.gridx = 7;
		gbc_CGC_field.gridy = 5;
		add(textFieldArray[53], gbc_CGC_field);
		textFieldArray[53].setColumns(7);
		
		JLabel lblCta = new JLabel("CTA");
		GridBagConstraints gbc_lblCta = new GridBagConstraints();
		gbc_lblCta.anchor = GridBagConstraints.EAST;
		gbc_lblCta.insets = new Insets(0, 0, 5, 5);
		gbc_lblCta.gridx = 0;
		gbc_lblCta.gridy = 6;
		add(lblCta, gbc_lblCta);
		
		textFieldArray[6] = new JTextField();
		GridBagConstraints gbc_CTA_field = new GridBagConstraints();
		gbc_CTA_field.insets = new Insets(0, 0, 5, 5);
		gbc_CTA_field.gridx = 1;
		gbc_CTA_field.gridy = 6;
		add(textFieldArray[6], gbc_CTA_field);
		textFieldArray[6].setColumns(7);
		
		JLabel lblCca = new JLabel("CCA");
		GridBagConstraints gbc_lblCca = new GridBagConstraints();
		gbc_lblCca.anchor = GridBagConstraints.EAST;
		gbc_lblCca.insets = new Insets(0, 10, 5, 5);
		gbc_lblCca.gridx = 2;
		gbc_lblCca.gridy = 6;
		add(lblCca, gbc_lblCca);
		
		textFieldArray[22] = new JTextField();
		GridBagConstraints gbc_CCA_field = new GridBagConstraints();
		gbc_CCA_field.insets = new Insets(0, 0, 5, 5);
		gbc_CCA_field.gridx = 3;
		gbc_CCA_field.gridy = 6;
		add(textFieldArray[22], gbc_CCA_field);
		textFieldArray[22].setColumns(7);
		
		JLabel lblCaa = new JLabel("CAA");
		GridBagConstraints gbc_lblCaa = new GridBagConstraints();
		gbc_lblCaa.anchor = GridBagConstraints.EAST;
		gbc_lblCaa.insets = new Insets(0, 10, 5, 5);
		gbc_lblCaa.gridx = 4;
		gbc_lblCaa.gridy = 6;
		add(lblCaa, gbc_lblCaa);
		
		textFieldArray[38] = new JTextField();
		GridBagConstraints gbc_CAA_field = new GridBagConstraints();
		gbc_CAA_field.insets = new Insets(0, 0, 5, 5);
		gbc_CAA_field.gridx = 5;
		gbc_CAA_field.gridy = 6;
		add(textFieldArray[38], gbc_CAA_field);
		textFieldArray[38].setColumns(7);
		
		lblCga = new JLabel("CGA");
		GridBagConstraints gbc_lblCga = new GridBagConstraints();
		gbc_lblCga.anchor = GridBagConstraints.EAST;
		gbc_lblCga.insets = new Insets(0, 10, 5, 5);
		gbc_lblCga.gridx = 6;
		gbc_lblCga.gridy = 6;
		add(lblCga, gbc_lblCga);
		
		textFieldArray[54] = new JTextField();
		GridBagConstraints gbc_CGA_field = new GridBagConstraints();
		gbc_CGA_field.insets = new Insets(0, 0, 5, 0);
		gbc_CGA_field.gridx = 7;
		gbc_CGA_field.gridy = 6;
		add(textFieldArray[54], gbc_CGA_field);
		textFieldArray[54].setColumns(7);
		
		JLabel lblCtg = new JLabel("CTG");
		GridBagConstraints gbc_lblCtg = new GridBagConstraints();
		gbc_lblCtg.anchor = GridBagConstraints.EAST;
		gbc_lblCtg.insets = new Insets(0, 0, 10, 5);
		gbc_lblCtg.gridx = 0;
		gbc_lblCtg.gridy = 7;
		add(lblCtg, gbc_lblCtg);
		
		textFieldArray[7] = new JTextField();
		GridBagConstraints gbc_CTG_field = new GridBagConstraints();
		gbc_CTG_field.insets = new Insets(0, 0, 10, 5);
		gbc_CTG_field.gridx = 1;
		gbc_CTG_field.gridy = 7;
		add(textFieldArray[7], gbc_CTG_field);
		textFieldArray[7].setColumns(7);
		
		JLabel lblCcg = new JLabel("CCG");
		GridBagConstraints gbc_lblCcg = new GridBagConstraints();
		gbc_lblCcg.anchor = GridBagConstraints.EAST;
		gbc_lblCcg.insets = new Insets(0, 10, 10, 5);
		gbc_lblCcg.gridx = 2;
		gbc_lblCcg.gridy = 7;
		add(lblCcg, gbc_lblCcg);
		
		textFieldArray[23] = new JTextField();
		GridBagConstraints gbc_CCG_field = new GridBagConstraints();
		gbc_CCG_field.insets = new Insets(0, 0, 10, 5);
		gbc_CCG_field.gridx = 3;
		gbc_CCG_field.gridy = 7;
		add(textFieldArray[23], gbc_CCG_field);
		textFieldArray[23].setColumns(7);
		
		JLabel lblCag = new JLabel("CAG");
		GridBagConstraints gbc_lblCag = new GridBagConstraints();
		gbc_lblCag.anchor = GridBagConstraints.EAST;
		gbc_lblCag.insets = new Insets(0, 10, 10, 5);
		gbc_lblCag.gridx = 4;
		gbc_lblCag.gridy = 7;
		add(lblCag, gbc_lblCag);
		
		textFieldArray[39] = new JTextField();
		GridBagConstraints gbc_CAG_field = new GridBagConstraints();
		gbc_CAG_field.insets = new Insets(0, 0, 10, 5);
		gbc_CAG_field.gridx = 5;
		gbc_CAG_field.gridy = 7;
		add(textFieldArray[39], gbc_CAG_field);
		textFieldArray[39].setColumns(7);
		
		lblCgg = new JLabel("CGG");
		GridBagConstraints gbc_lblCgg = new GridBagConstraints();
		gbc_lblCgg.anchor = GridBagConstraints.EAST;
		gbc_lblCgg.insets = new Insets(0, 10, 5, 5);
		gbc_lblCgg.gridx = 6;
		gbc_lblCgg.gridy = 7;
		add(lblCgg, gbc_lblCgg);
		
		textFieldArray[55] = new JTextField();
		GridBagConstraints gbc_CGG_field = new GridBagConstraints();
		gbc_CGG_field.insets = new Insets(0, 0, 10, 0);
		gbc_CGG_field.gridx = 7;
		gbc_CGG_field.gridy = 7;
		add(textFieldArray[55], gbc_CGG_field);
		textFieldArray[55].setColumns(7);
		
		JLabel lblAtt = new JLabel("ATT");
		GridBagConstraints gbc_lblAtt = new GridBagConstraints();
		gbc_lblAtt.anchor = GridBagConstraints.EAST;
		gbc_lblAtt.insets = new Insets(10, 0, 5, 5);
		gbc_lblAtt.gridx = 0;
		gbc_lblAtt.gridy = 8;
		add(lblAtt, gbc_lblAtt);
		
		textFieldArray[8] = new JTextField();
		GridBagConstraints gbc_ATT_field = new GridBagConstraints();
		gbc_ATT_field.insets = new Insets(10, 0, 5, 5);
		gbc_ATT_field.gridx = 1;
		gbc_ATT_field.gridy = 8;
		add(textFieldArray[8], gbc_ATT_field);
		textFieldArray[8].setColumns(7);
		
		JLabel lblAct = new JLabel("ACT");
		GridBagConstraints gbc_lblAct = new GridBagConstraints();
		gbc_lblAct.anchor = GridBagConstraints.EAST;
		gbc_lblAct.insets = new Insets(10, 10, 5, 5);
		gbc_lblAct.gridx = 2;
		gbc_lblAct.gridy = 8;
		add(lblAct, gbc_lblAct);
		
		textFieldArray[24] = new JTextField();
		GridBagConstraints gbc_ACT_field = new GridBagConstraints();
		gbc_ACT_field.insets = new Insets(10, 0, 5, 5);
		gbc_ACT_field.gridx = 3;
		gbc_ACT_field.gridy = 8;
		add(textFieldArray[24], gbc_ACT_field);
		textFieldArray[24].setColumns(7);
		
		JLabel lblAat = new JLabel("AAT");
		GridBagConstraints gbc_lblAat = new GridBagConstraints();
		gbc_lblAat.anchor = GridBagConstraints.EAST;
		gbc_lblAat.insets = new Insets(10, 10, 5, 5);
		gbc_lblAat.gridx = 4;
		gbc_lblAat.gridy = 8;
		add(lblAat, gbc_lblAat);
		
		textFieldArray[40] = new JTextField();
		GridBagConstraints gbc_AAT_field = new GridBagConstraints();
		gbc_AAT_field.insets = new Insets(10, 0, 5, 5);
		gbc_AAT_field.gridx = 5;
		gbc_AAT_field.gridy = 8;
		add(textFieldArray[40], gbc_AAT_field);
		textFieldArray[40].setColumns(7);
		
		lblAgt = new JLabel("AGT");
		GridBagConstraints gbc_lblAgt = new GridBagConstraints();
		gbc_lblAgt.anchor = GridBagConstraints.EAST;
		gbc_lblAgt.insets = new Insets(10, 10, 5, 5);
		gbc_lblAgt.gridx = 6;
		gbc_lblAgt.gridy = 8;
		add(lblAgt, gbc_lblAgt);
		
		textFieldArray[56] = new JTextField();
		GridBagConstraints gbc_AGT_field = new GridBagConstraints();
		gbc_AGT_field.insets = new Insets(10, 0, 5, 0);
		gbc_AGT_field.gridx = 7;
		gbc_AGT_field.gridy = 8;
		add(textFieldArray[56], gbc_AGT_field);
		textFieldArray[56].setColumns(7);
		
		JLabel lblAtc = new JLabel("ATC");
		GridBagConstraints gbc_lblAtc = new GridBagConstraints();
		gbc_lblAtc.anchor = GridBagConstraints.EAST;
		gbc_lblAtc.insets = new Insets(0, 0, 5, 5);
		gbc_lblAtc.gridx = 0;
		gbc_lblAtc.gridy = 9;
		add(lblAtc, gbc_lblAtc);
		
		textFieldArray[9] = new JTextField();
		GridBagConstraints gbc_ATC_field = new GridBagConstraints();
		gbc_ATC_field.insets = new Insets(0, 0, 5, 5);
		gbc_ATC_field.gridx = 1;
		gbc_ATC_field.gridy = 9;
		add(textFieldArray[9], gbc_ATC_field);
		textFieldArray[9].setColumns(7);
		
		JLabel lblAcc = new JLabel("ACC");
		GridBagConstraints gbc_lblAcc = new GridBagConstraints();
		gbc_lblAcc.anchor = GridBagConstraints.EAST;
		gbc_lblAcc.insets = new Insets(0, 10, 5, 5);
		gbc_lblAcc.gridx = 2;
		gbc_lblAcc.gridy = 9;
		add(lblAcc, gbc_lblAcc);
		
		textFieldArray[25] = new JTextField();
		GridBagConstraints gbc_ACC_field = new GridBagConstraints();
		gbc_ACC_field.insets = new Insets(0, 0, 5, 5);
		gbc_ACC_field.gridx = 3;
		gbc_ACC_field.gridy = 9;
		add(textFieldArray[25], gbc_ACC_field);
		textFieldArray[25].setColumns(7);
		
		JLabel lblAac = new JLabel("AAC");
		GridBagConstraints gbc_lblAac = new GridBagConstraints();
		gbc_lblAac.anchor = GridBagConstraints.EAST;
		gbc_lblAac.insets = new Insets(0, 10, 5, 5);
		gbc_lblAac.gridx = 4;
		gbc_lblAac.gridy = 9;
		add(lblAac, gbc_lblAac);
		
		textFieldArray[41] = new JTextField();
		GridBagConstraints gbc_AAC_field = new GridBagConstraints();
		gbc_AAC_field.insets = new Insets(0, 0, 5, 5);
		gbc_AAC_field.gridx = 5;
		gbc_AAC_field.gridy = 9;
		add(textFieldArray[41], gbc_AAC_field);
		textFieldArray[41].setColumns(7);
		
		lblAgc = new JLabel("AGC");
		GridBagConstraints gbc_lblAgc = new GridBagConstraints();
		gbc_lblAgc.anchor = GridBagConstraints.EAST;
		gbc_lblAgc.insets = new Insets(0, 10, 5, 5);
		gbc_lblAgc.gridx = 6;
		gbc_lblAgc.gridy = 9;
		add(lblAgc, gbc_lblAgc);
		
		textFieldArray[57] = new JTextField();
		GridBagConstraints gbc_AGC_field = new GridBagConstraints();
		gbc_AGC_field.insets = new Insets(0, 0, 5, 0);
		gbc_AGC_field.gridx = 7;
		gbc_AGC_field.gridy = 9;
		add(textFieldArray[57], gbc_AGC_field);
		textFieldArray[57].setColumns(7);
		
		JLabel lblAta = new JLabel("ATA");
		GridBagConstraints gbc_lblAta = new GridBagConstraints();
		gbc_lblAta.anchor = GridBagConstraints.EAST;
		gbc_lblAta.insets = new Insets(0, 0, 5, 5);
		gbc_lblAta.gridx = 0;
		gbc_lblAta.gridy = 10;
		add(lblAta, gbc_lblAta);
		
		textFieldArray[10] = new JTextField();
		GridBagConstraints gbc_ATA_field = new GridBagConstraints();
		gbc_ATA_field.insets = new Insets(0, 0, 5, 5);
		gbc_ATA_field.gridx = 1;
		gbc_ATA_field.gridy = 10;
		add(textFieldArray[10], gbc_ATA_field);
		textFieldArray[10].setColumns(7);
		
		JLabel lblAca = new JLabel("ACA");
		GridBagConstraints gbc_lblAca = new GridBagConstraints();
		gbc_lblAca.anchor = GridBagConstraints.EAST;
		gbc_lblAca.insets = new Insets(0, 10, 5, 5);
		gbc_lblAca.gridx = 2;
		gbc_lblAca.gridy = 10;
		add(lblAca, gbc_lblAca);
		
		textFieldArray[26] = new JTextField();
		GridBagConstraints gbc_ACA_field = new GridBagConstraints();
		gbc_ACA_field.insets = new Insets(0, 0, 5, 5);
		gbc_ACA_field.gridx = 3;
		gbc_ACA_field.gridy = 10;
		add(textFieldArray[26], gbc_ACA_field);
		textFieldArray[26].setColumns(7);
		
		JLabel lblAaa = new JLabel("AAA");
		GridBagConstraints gbc_lblAaa = new GridBagConstraints();
		gbc_lblAaa.anchor = GridBagConstraints.EAST;
		gbc_lblAaa.insets = new Insets(0, 10, 5, 5);
		gbc_lblAaa.gridx = 4;
		gbc_lblAaa.gridy = 10;
		add(lblAaa, gbc_lblAaa);
		
		textFieldArray[42] = new JTextField();
		GridBagConstraints gbc_AAA_field = new GridBagConstraints();
		gbc_AAA_field.insets = new Insets(0, 0, 5, 5);
		gbc_AAA_field.gridx = 5;
		gbc_AAA_field.gridy = 10;
		add(textFieldArray[42], gbc_AAA_field);
		textFieldArray[42].setColumns(7);
		
		lblAga = new JLabel("AGA");
		GridBagConstraints gbc_lblAga = new GridBagConstraints();
		gbc_lblAga.anchor = GridBagConstraints.EAST;
		gbc_lblAga.insets = new Insets(0, 10, 5, 5);
		gbc_lblAga.gridx = 6;
		gbc_lblAga.gridy = 10;
		add(lblAga, gbc_lblAga);
		
		textFieldArray[58] = new JTextField();
		GridBagConstraints gbc_AGA_field = new GridBagConstraints();
		gbc_AGA_field.insets = new Insets(0, 0, 5, 0);
		gbc_AGA_field.gridx = 7;
		gbc_AGA_field.gridy = 10;
		add(textFieldArray[58], gbc_AGA_field);
		textFieldArray[58].setColumns(7);
		
		JLabel lblAtg = new JLabel("ATG");
		GridBagConstraints gbc_lblAtg = new GridBagConstraints();
		gbc_lblAtg.anchor = GridBagConstraints.EAST;
		gbc_lblAtg.insets = new Insets(0, 0, 10, 5);
		gbc_lblAtg.gridx = 0;
		gbc_lblAtg.gridy = 11;
		add(lblAtg, gbc_lblAtg);
		
		textFieldArray[11] = new JTextField();
		GridBagConstraints gbc_ATG_field = new GridBagConstraints();
		gbc_ATG_field.insets = new Insets(0, 0, 10, 5);
		gbc_ATG_field.gridx = 1;
		gbc_ATG_field.gridy = 11;
		add(textFieldArray[11], gbc_ATG_field);
		textFieldArray[11].setColumns(7);
		
		JLabel lblAcg = new JLabel("ACG");
		GridBagConstraints gbc_lblAcg = new GridBagConstraints();
		gbc_lblAcg.anchor = GridBagConstraints.EAST;
		gbc_lblAcg.insets = new Insets(0, 10, 10, 5);
		gbc_lblAcg.gridx = 2;
		gbc_lblAcg.gridy = 11;
		add(lblAcg, gbc_lblAcg);
		
		textFieldArray[27] = new JTextField();
		GridBagConstraints gbc_ACG_field = new GridBagConstraints();
		gbc_ACG_field.insets = new Insets(0, 0, 10, 5);
		gbc_ACG_field.gridx = 3;
		gbc_ACG_field.gridy = 11;
		add(textFieldArray[27], gbc_ACG_field);
		textFieldArray[27].setColumns(7);
		
		JLabel lblAag = new JLabel("AAG");
		GridBagConstraints gbc_lblAag = new GridBagConstraints();
		gbc_lblAag.anchor = GridBagConstraints.EAST;
		gbc_lblAag.insets = new Insets(0, 10, 10, 5);
		gbc_lblAag.gridx = 4;
		gbc_lblAag.gridy = 11;
		add(lblAag, gbc_lblAag);
		
		textFieldArray[43] = new JTextField();
		GridBagConstraints gbc_AAG_field = new GridBagConstraints();
		gbc_AAG_field.insets = new Insets(0, 0, 10, 5);
		gbc_AAG_field.gridx = 5;
		gbc_AAG_field.gridy = 11;
		add(textFieldArray[43], gbc_AAG_field);
		textFieldArray[43].setColumns(7);
		
		lblAgg = new JLabel("AGG");
		GridBagConstraints gbc_lblAgg = new GridBagConstraints();
		gbc_lblAgg.anchor = GridBagConstraints.EAST;
		gbc_lblAgg.insets = new Insets(0, 10, 10, 5);
		gbc_lblAgg.gridx = 6;
		gbc_lblAgg.gridy = 11;
		add(lblAgg, gbc_lblAgg);
		
		textFieldArray[59] = new JTextField();
		GridBagConstraints gbc_AGG_field = new GridBagConstraints();
		gbc_AGG_field.insets = new Insets(0, 0, 10, 0);
		gbc_AGG_field.gridx = 7;
		gbc_AGG_field.gridy = 11;
		add(textFieldArray[59], gbc_AGG_field);
		textFieldArray[59].setColumns(7);
		
		JLabel lblGtt = new JLabel("GTT");
		GridBagConstraints gbc_lblGtt = new GridBagConstraints();
		gbc_lblGtt.anchor = GridBagConstraints.EAST;
		gbc_lblGtt.insets = new Insets(10, 0, 5, 5);
		gbc_lblGtt.gridx = 0;
		gbc_lblGtt.gridy = 12;
		add(lblGtt, gbc_lblGtt);
		
		textFieldArray[12] = new JTextField();
		GridBagConstraints gbc_GTT_field = new GridBagConstraints();
		gbc_GTT_field.insets = new Insets(10, 0, 5, 5);
		gbc_GTT_field.gridx = 1;
		gbc_GTT_field.gridy = 12;
		add(textFieldArray[12], gbc_GTT_field);
		textFieldArray[12].setColumns(7);
		
		JLabel lblGct = new JLabel("GCT");
		GridBagConstraints gbc_lblGct = new GridBagConstraints();
		gbc_lblGct.anchor = GridBagConstraints.EAST;
		gbc_lblGct.insets = new Insets(10, 10, 5, 5);
		gbc_lblGct.gridx = 2;
		gbc_lblGct.gridy = 12;
		add(lblGct, gbc_lblGct);
		
		textFieldArray[28] = new JTextField();
		GridBagConstraints gbc_GCT_field = new GridBagConstraints();
		gbc_GCT_field.insets = new Insets(10, 0, 5, 5);
		gbc_GCT_field.gridx = 3;
		gbc_GCT_field.gridy = 12;
		add(textFieldArray[28], gbc_GCT_field);
		textFieldArray[28].setColumns(7);
		
		JLabel lblGat = new JLabel("GAT");
		GridBagConstraints gbc_lblGat = new GridBagConstraints();
		gbc_lblGat.anchor = GridBagConstraints.EAST;
		gbc_lblGat.insets = new Insets(10, 10, 5, 5);
		gbc_lblGat.gridx = 4;
		gbc_lblGat.gridy = 12;
		add(lblGat, gbc_lblGat);
		
		textFieldArray[44] = new JTextField();
		GridBagConstraints gbc_GAT_field = new GridBagConstraints();
		gbc_GAT_field.insets = new Insets(10, 0, 5, 5);
		gbc_GAT_field.gridx = 5;
		gbc_GAT_field.gridy = 12;
		add(textFieldArray[44], gbc_GAT_field);
		textFieldArray[44].setColumns(7);
		
		lblGgt = new JLabel("GGT");
		GridBagConstraints gbc_lblGgt = new GridBagConstraints();
		gbc_lblGgt.anchor = GridBagConstraints.EAST;
		gbc_lblGgt.insets = new Insets(10, 10, 5, 5);
		gbc_lblGgt.gridx = 6;
		gbc_lblGgt.gridy = 12;
		add(lblGgt, gbc_lblGgt);
		
		textFieldArray[60] = new JTextField();
		GridBagConstraints gbc_GGT_field = new GridBagConstraints();
		gbc_GGT_field.insets = new Insets(10, 0, 5, 0);
		gbc_GGT_field.gridx = 7;
		gbc_GGT_field.gridy = 12;
		add(textFieldArray[60], gbc_GGT_field);
		textFieldArray[60].setColumns(7);
		
		JLabel lblGtc = new JLabel("GTC");
		GridBagConstraints gbc_lblGtc = new GridBagConstraints();
		gbc_lblGtc.anchor = GridBagConstraints.EAST;
		gbc_lblGtc.insets = new Insets(0, 0, 5, 5);
		gbc_lblGtc.gridx = 0;
		gbc_lblGtc.gridy = 13;
		add(lblGtc, gbc_lblGtc);
		
		textFieldArray[13] = new JTextField();
		GridBagConstraints gbc_GTC_field = new GridBagConstraints();
		gbc_GTC_field.insets = new Insets(0, 0, 5, 5);
		gbc_GTC_field.gridx = 1;
		gbc_GTC_field.gridy = 13;
		add(textFieldArray[13], gbc_GTC_field);
		textFieldArray[13].setColumns(7);
		
		JLabel lblGcc = new JLabel("GCC");
		GridBagConstraints gbc_lblGcc = new GridBagConstraints();
		gbc_lblGcc.anchor = GridBagConstraints.EAST;
		gbc_lblGcc.insets = new Insets(0, 10, 5, 5);
		gbc_lblGcc.gridx = 2;
		gbc_lblGcc.gridy = 13;
		add(lblGcc, gbc_lblGcc);
		
		textFieldArray[29] = new JTextField();
		GridBagConstraints gbc_GCC_field = new GridBagConstraints();
		gbc_GCC_field.insets = new Insets(0, 0, 5, 5);
		gbc_GCC_field.gridx = 3;
		gbc_GCC_field.gridy = 13;
		add(textFieldArray[29], gbc_GCC_field);
		textFieldArray[29].setColumns(7);
		
		JLabel lblGac = new JLabel("GAC");
		GridBagConstraints gbc_lblGac = new GridBagConstraints();
		gbc_lblGac.anchor = GridBagConstraints.EAST;
		gbc_lblGac.insets = new Insets(0, 10, 5, 5);
		gbc_lblGac.gridx = 4;
		gbc_lblGac.gridy = 13;
		add(lblGac, gbc_lblGac);
		
		textFieldArray[45] = new JTextField();
		GridBagConstraints gbc_GAC_field = new GridBagConstraints();
		gbc_GAC_field.insets = new Insets(0, 0, 5, 5);
		gbc_GAC_field.gridx = 5;
		gbc_GAC_field.gridy = 13;
		add(textFieldArray[45], gbc_GAC_field);
		textFieldArray[45].setColumns(7);
		
		lblGgc = new JLabel("GGC");
		GridBagConstraints gbc_lblGgc = new GridBagConstraints();
		gbc_lblGgc.anchor = GridBagConstraints.EAST;
		gbc_lblGgc.insets = new Insets(0, 10, 5, 5);
		gbc_lblGgc.gridx = 6;
		gbc_lblGgc.gridy = 13;
		add(lblGgc, gbc_lblGgc);
		
		textFieldArray[61] = new JTextField();
		GridBagConstraints gbc_GGC_field = new GridBagConstraints();
		gbc_GGC_field.insets = new Insets(0, 0, 5, 0);
		gbc_GGC_field.gridx = 7;
		gbc_GGC_field.gridy = 13;
		add(textFieldArray[61], gbc_GGC_field);
		textFieldArray[61].setColumns(7);
		
		JLabel lblGta = new JLabel("GTA");
		GridBagConstraints gbc_lblGta = new GridBagConstraints();
		gbc_lblGta.anchor = GridBagConstraints.EAST;
		gbc_lblGta.insets = new Insets(0, 0, 5, 5);
		gbc_lblGta.gridx = 0;
		gbc_lblGta.gridy = 14;
		add(lblGta, gbc_lblGta);
		
		textFieldArray[14] = new JTextField();
		GridBagConstraints gbc_GTA_field = new GridBagConstraints();
		gbc_GTA_field.insets = new Insets(0, 0, 5, 5);
		gbc_GTA_field.gridx = 1;
		gbc_GTA_field.gridy = 14;
		add(textFieldArray[14], gbc_GTA_field);
		textFieldArray[14].setColumns(7);
		
		JLabel lblGca = new JLabel("GCA");
		GridBagConstraints gbc_lblGca = new GridBagConstraints();
		gbc_lblGca.anchor = GridBagConstraints.EAST;
		gbc_lblGca.insets = new Insets(0, 10, 5, 5);
		gbc_lblGca.gridx = 2;
		gbc_lblGca.gridy = 14;
		add(lblGca, gbc_lblGca);
		
		textFieldArray[30] = new JTextField();
		GridBagConstraints gbc_GCA_field = new GridBagConstraints();
		gbc_GCA_field.insets = new Insets(0, 0, 5, 5);
		gbc_GCA_field.gridx = 3;
		gbc_GCA_field.gridy = 14;
		add(textFieldArray[30], gbc_GCA_field);
		textFieldArray[30].setColumns(7);
		
		JLabel lblGaa = new JLabel("GAA");
		GridBagConstraints gbc_lblGaa = new GridBagConstraints();
		gbc_lblGaa.anchor = GridBagConstraints.EAST;
		gbc_lblGaa.insets = new Insets(0, 10, 5, 5);
		gbc_lblGaa.gridx = 4;
		gbc_lblGaa.gridy = 14;
		add(lblGaa, gbc_lblGaa);
		
		textFieldArray[46] = new JTextField();
		GridBagConstraints gbc_GAA_field = new GridBagConstraints();
		gbc_GAA_field.insets = new Insets(0, 0, 5, 5);
		gbc_GAA_field.gridx = 5;
		gbc_GAA_field.gridy = 14;
		add(textFieldArray[46], gbc_GAA_field);
		textFieldArray[46].setColumns(7);
		
		lblGga = new JLabel("GGA");
		GridBagConstraints gbc_lblGga = new GridBagConstraints();
		gbc_lblGga.anchor = GridBagConstraints.EAST;
		gbc_lblGga.insets = new Insets(0, 10, 5, 5);
		gbc_lblGga.gridx = 6;
		gbc_lblGga.gridy = 14;
		add(lblGga, gbc_lblGga);
		
		textFieldArray[62] = new JTextField();
		GridBagConstraints gbc_GGA_field = new GridBagConstraints();
		gbc_GGA_field.insets = new Insets(0, 0, 5, 0);
		gbc_GGA_field.gridx = 7;
		gbc_GGA_field.gridy = 14;
		add(textFieldArray[62], gbc_GGA_field);
		textFieldArray[62].setColumns(7);
		
		JLabel lblGtg = new JLabel("GTG");
		GridBagConstraints gbc_lblGtg = new GridBagConstraints();
		gbc_lblGtg.anchor = GridBagConstraints.EAST;
		gbc_lblGtg.insets = new Insets(0, 0, 0, 5);
		gbc_lblGtg.gridx = 0;
		gbc_lblGtg.gridy = 15;
		add(lblGtg, gbc_lblGtg);
		
		textFieldArray[15] = new JTextField();
		GridBagConstraints gbc_GTG_field = new GridBagConstraints();
		gbc_GTG_field.insets = new Insets(0, 0, 0, 5);
		gbc_GTG_field.gridx = 1;
		gbc_GTG_field.gridy = 15;
		add(textFieldArray[15], gbc_GTG_field);
		textFieldArray[15].setColumns(7);
		
		JLabel lblGcg = new JLabel("GCG");
		GridBagConstraints gbc_lblGcg = new GridBagConstraints();
		gbc_lblGcg.anchor = GridBagConstraints.EAST;
		gbc_lblGcg.insets = new Insets(0, 10, 0, 5);
		gbc_lblGcg.gridx = 2;
		gbc_lblGcg.gridy = 15;
		add(lblGcg, gbc_lblGcg);
		
		textFieldArray[31] = new JTextField();
		GridBagConstraints gbc_GCG_field = new GridBagConstraints();
		gbc_GCG_field.insets = new Insets(0, 0, 0, 5);
		gbc_GCG_field.gridx = 3;
		gbc_GCG_field.gridy = 15;
		add(textFieldArray[31], gbc_GCG_field);
		textFieldArray[31].setColumns(7);
		
		JLabel lblGag = new JLabel("GAG");
		GridBagConstraints gbc_lblGag = new GridBagConstraints();
		gbc_lblGag.anchor = GridBagConstraints.EAST;
		gbc_lblGag.insets = new Insets(0, 10, 0, 5);
		gbc_lblGag.gridx = 4;
		gbc_lblGag.gridy = 15;
		add(lblGag, gbc_lblGag);
		
		textFieldArray[47] = new JTextField();
		GridBagConstraints gbc_GAG_field = new GridBagConstraints();
		gbc_GAG_field.insets = new Insets(0, 0, 0, 5);
		gbc_GAG_field.gridx = 5;
		gbc_GAG_field.gridy = 15;
		add(textFieldArray[47], gbc_GAG_field);
		textFieldArray[47].setColumns(7);
		
		lblGgg = new JLabel("GGG");
		GridBagConstraints gbc_lblGgg = new GridBagConstraints();
		gbc_lblGgg.anchor = GridBagConstraints.EAST;
		gbc_lblGgg.insets = new Insets(0, 10, 0, 5);
		gbc_lblGgg.gridx = 6;
		gbc_lblGgg.gridy = 15;
		add(lblGgg, gbc_lblGgg);
		
		textFieldArray[63] = new JTextField();
		GridBagConstraints gbc_GGG_field = new GridBagConstraints();
		gbc_GGG_field.gridx = 7;
		gbc_GGG_field.gridy = 15;
		add(textFieldArray[63], gbc_GGG_field);
		textFieldArray[63].setColumns(7);
		
		
	}
	
	public void displayCodonPanel(){
		
	}

}
