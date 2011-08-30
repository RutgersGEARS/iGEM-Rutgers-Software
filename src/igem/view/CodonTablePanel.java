package igem.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;

public class CodonTablePanel extends JPanel{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
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
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	
	public CodonTablePanel(){
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 125, 0, 125, 0, 125, 0, 125, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblTtt = new JLabel("TTT");
		GridBagConstraints gbc_lblTtt = new GridBagConstraints();
		gbc_lblTtt.anchor = GridBagConstraints.EAST;
		gbc_lblTtt.insets = new Insets(0, 0, 5, 5);
		gbc_lblTtt.gridx = 0;
		gbc_lblTtt.gridy = 0;
		add(lblTtt, gbc_lblTtt);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		add(textField, gbc_textField);
		textField.setColumns(7);
		
		JLabel lblTct = new JLabel("TCT");
		GridBagConstraints gbc_lblTct = new GridBagConstraints();
		gbc_lblTct.anchor = GridBagConstraints.EAST;
		gbc_lblTct.insets = new Insets(0, 10, 5, 5);
		gbc_lblTct.gridx = 2;
		gbc_lblTct.gridy = 0;
		add(lblTct, gbc_lblTct);
		
		textField_16 = new JTextField();
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 3;
		gbc_textField_16.gridy = 0;
		add(textField_16, gbc_textField_16);
		textField_16.setColumns(10);
		
		JLabel lblTat = new JLabel("TAT");
		GridBagConstraints gbc_lblTat = new GridBagConstraints();
		gbc_lblTat.anchor = GridBagConstraints.EAST;
		gbc_lblTat.insets = new Insets(0, 10, 5, 5);
		gbc_lblTat.gridx = 4;
		gbc_lblTat.gridy = 0;
		add(lblTat, gbc_lblTat);
		
		textField_32 = new JTextField();
		GridBagConstraints gbc_textField_32 = new GridBagConstraints();
		gbc_textField_32.insets = new Insets(0, 0, 5, 5);
		gbc_textField_32.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_32.gridx = 5;
		gbc_textField_32.gridy = 0;
		add(textField_32, gbc_textField_32);
		textField_32.setColumns(10);
		
		lblTgt = new JLabel("TGT");
		GridBagConstraints gbc_lblTgt = new GridBagConstraints();
		gbc_lblTgt.anchor = GridBagConstraints.EAST;
		gbc_lblTgt.insets = new Insets(0, 10, 5, 5);
		gbc_lblTgt.gridx = 6;
		gbc_lblTgt.gridy = 0;
		add(lblTgt, gbc_lblTgt);
		
		textField_49 = new JTextField();
		GridBagConstraints gbc_textField_49 = new GridBagConstraints();
		gbc_textField_49.insets = new Insets(0, 0, 5, 0);
		gbc_textField_49.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_49.gridx = 7;
		gbc_textField_49.gridy = 0;
		add(textField_49, gbc_textField_49);
		textField_49.setColumns(10);
		
		JLabel lblTtc = new JLabel("TTC");
		GridBagConstraints gbc_lblTtc = new GridBagConstraints();
		gbc_lblTtc.anchor = GridBagConstraints.EAST;
		gbc_lblTtc.insets = new Insets(0, 0, 5, 5);
		gbc_lblTtc.gridx = 0;
		gbc_lblTtc.gridy = 1;
		add(lblTtc, gbc_lblTtc);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTcc = new JLabel("TCC");
		GridBagConstraints gbc_lblTcc = new GridBagConstraints();
		gbc_lblTcc.anchor = GridBagConstraints.EAST;
		gbc_lblTcc.insets = new Insets(0, 10, 5, 5);
		gbc_lblTcc.gridx = 2;
		gbc_lblTcc.gridy = 1;
		add(lblTcc, gbc_lblTcc);
		
		textField_17 = new JTextField();
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.insets = new Insets(0, 0, 5, 5);
		gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_17.gridx = 3;
		gbc_textField_17.gridy = 1;
		add(textField_17, gbc_textField_17);
		textField_17.setColumns(10);
		
		JLabel lblTac = new JLabel("TAC");
		GridBagConstraints gbc_lblTac = new GridBagConstraints();
		gbc_lblTac.anchor = GridBagConstraints.EAST;
		gbc_lblTac.insets = new Insets(0, 10, 5, 5);
		gbc_lblTac.gridx = 4;
		gbc_lblTac.gridy = 1;
		add(lblTac, gbc_lblTac);
		
		textField_33 = new JTextField();
		GridBagConstraints gbc_textField_33 = new GridBagConstraints();
		gbc_textField_33.insets = new Insets(0, 0, 5, 5);
		gbc_textField_33.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_33.gridx = 5;
		gbc_textField_33.gridy = 1;
		add(textField_33, gbc_textField_33);
		textField_33.setColumns(10);
		
		lblTgc = new JLabel("TGC");
		GridBagConstraints gbc_lblTgc = new GridBagConstraints();
		gbc_lblTgc.anchor = GridBagConstraints.EAST;
		gbc_lblTgc.insets = new Insets(0, 10, 5, 5);
		gbc_lblTgc.gridx = 6;
		gbc_lblTgc.gridy = 1;
		add(lblTgc, gbc_lblTgc);
		
		textField_50 = new JTextField();
		GridBagConstraints gbc_textField_50 = new GridBagConstraints();
		gbc_textField_50.insets = new Insets(0, 0, 5, 0);
		gbc_textField_50.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_50.gridx = 7;
		gbc_textField_50.gridy = 1;
		add(textField_50, gbc_textField_50);
		textField_50.setColumns(10);
		
		JLabel lblTta = new JLabel("TTA");
		GridBagConstraints gbc_lblTta = new GridBagConstraints();
		gbc_lblTta.anchor = GridBagConstraints.EAST;
		gbc_lblTta.insets = new Insets(0, 0, 5, 5);
		gbc_lblTta.gridx = 0;
		gbc_lblTta.gridy = 2;
		add(lblTta, gbc_lblTta);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTca = new JLabel("TCA");
		GridBagConstraints gbc_lblTca = new GridBagConstraints();
		gbc_lblTca.anchor = GridBagConstraints.EAST;
		gbc_lblTca.insets = new Insets(0, 10, 5, 5);
		gbc_lblTca.gridx = 2;
		gbc_lblTca.gridy = 2;
		add(lblTca, gbc_lblTca);
		
		textField_18 = new JTextField();
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.insets = new Insets(0, 0, 5, 5);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 3;
		gbc_textField_18.gridy = 2;
		add(textField_18, gbc_textField_18);
		textField_18.setColumns(10);
		
		JLabel lblTaa = new JLabel("TAA");
		GridBagConstraints gbc_lblTaa = new GridBagConstraints();
		gbc_lblTaa.anchor = GridBagConstraints.EAST;
		gbc_lblTaa.insets = new Insets(0, 10, 5, 5);
		gbc_lblTaa.gridx = 4;
		gbc_lblTaa.gridy = 2;
		add(lblTaa, gbc_lblTaa);
		
		textField_34 = new JTextField();
		GridBagConstraints gbc_textField_34 = new GridBagConstraints();
		gbc_textField_34.insets = new Insets(0, 0, 5, 5);
		gbc_textField_34.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_34.gridx = 5;
		gbc_textField_34.gridy = 2;
		add(textField_34, gbc_textField_34);
		textField_34.setColumns(10);
		
		lblTga = new JLabel("TGA");
		GridBagConstraints gbc_lblTga = new GridBagConstraints();
		gbc_lblTga.anchor = GridBagConstraints.EAST;
		gbc_lblTga.insets = new Insets(0, 10, 5, 5);
		gbc_lblTga.gridx = 6;
		gbc_lblTga.gridy = 2;
		add(lblTga, gbc_lblTga);
		
		textField_51 = new JTextField();
		GridBagConstraints gbc_textField_51 = new GridBagConstraints();
		gbc_textField_51.insets = new Insets(0, 0, 5, 0);
		gbc_textField_51.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_51.gridx = 7;
		gbc_textField_51.gridy = 2;
		add(textField_51, gbc_textField_51);
		textField_51.setColumns(10);
		
		JLabel lblTtg = new JLabel("TTG");
		GridBagConstraints gbc_lblTtg = new GridBagConstraints();
		gbc_lblTtg.anchor = GridBagConstraints.EAST;
		gbc_lblTtg.insets = new Insets(0, 0, 10, 5);
		gbc_lblTtg.gridx = 0;
		gbc_lblTtg.gridy = 3;
		add(lblTtg, gbc_lblTtg);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 10, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 3;
		add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTcg = new JLabel("TCG");
		GridBagConstraints gbc_lblTcg = new GridBagConstraints();
		gbc_lblTcg.anchor = GridBagConstraints.EAST;
		gbc_lblTcg.insets = new Insets(0, 10, 10, 5);
		gbc_lblTcg.gridx = 2;
		gbc_lblTcg.gridy = 3;
		add(lblTcg, gbc_lblTcg);
		
		textField_19 = new JTextField();
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.insets = new Insets(0, 0, 10, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 3;
		gbc_textField_19.gridy = 3;
		add(textField_19, gbc_textField_19);
		textField_19.setColumns(10);
		
		JLabel lblTag = new JLabel("TAG");
		GridBagConstraints gbc_lblTag = new GridBagConstraints();
		gbc_lblTag.anchor = GridBagConstraints.EAST;
		gbc_lblTag.insets = new Insets(0, 10, 10, 5);
		gbc_lblTag.gridx = 4;
		gbc_lblTag.gridy = 3;
		add(lblTag, gbc_lblTag);
		
		textField_35 = new JTextField();
		GridBagConstraints gbc_textField_35 = new GridBagConstraints();
		gbc_textField_35.insets = new Insets(0, 0, 10, 5);
		gbc_textField_35.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_35.gridx = 5;
		gbc_textField_35.gridy = 3;
		add(textField_35, gbc_textField_35);
		textField_35.setColumns(10);
		
		lblTgg = new JLabel("TGG");
		GridBagConstraints gbc_lblTgg = new GridBagConstraints();
		gbc_lblTgg.insets = new Insets(0, 10, 10, 5);
		gbc_lblTgg.anchor = GridBagConstraints.EAST;
		gbc_lblTgg.gridx = 6;
		gbc_lblTgg.gridy = 3;
		add(lblTgg, gbc_lblTgg);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		GridBagConstraints gbc_textField_48 = new GridBagConstraints();
		gbc_textField_48.insets = new Insets(0, 0, 10, 0);
		gbc_textField_48.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_48.gridx = 7;
		gbc_textField_48.gridy = 3;
		add(textField_48, gbc_textField_48);
		
		JLabel lblCtt = new JLabel("CTT");
		GridBagConstraints gbc_lblCtt = new GridBagConstraints();
		gbc_lblCtt.anchor = GridBagConstraints.EAST;
		gbc_lblCtt.insets = new Insets(10, 0, 5, 5);
		gbc_lblCtt.gridx = 0;
		gbc_lblCtt.gridy = 4;
		add(lblCtt, gbc_lblCtt);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(10, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 4;
		add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCct = new JLabel("CCT");
		GridBagConstraints gbc_lblCct = new GridBagConstraints();
		gbc_lblCct.anchor = GridBagConstraints.EAST;
		gbc_lblCct.insets = new Insets(10, 10, 5, 5);
		gbc_lblCct.gridx = 2;
		gbc_lblCct.gridy = 4;
		add(lblCct, gbc_lblCct);
		
		textField_20 = new JTextField();
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.insets = new Insets(10, 0, 5, 5);
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.gridx = 3;
		gbc_textField_20.gridy = 4;
		add(textField_20, gbc_textField_20);
		textField_20.setColumns(10);
		
		JLabel lblCat = new JLabel("CAT");
		GridBagConstraints gbc_lblCat = new GridBagConstraints();
		gbc_lblCat.anchor = GridBagConstraints.EAST;
		gbc_lblCat.insets = new Insets(10, 10, 5, 5);
		gbc_lblCat.gridx = 4;
		gbc_lblCat.gridy = 4;
		add(lblCat, gbc_lblCat);
		
		textField_36 = new JTextField();
		GridBagConstraints gbc_textField_36 = new GridBagConstraints();
		gbc_textField_36.insets = new Insets(10, 0, 5, 5);
		gbc_textField_36.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_36.gridx = 5;
		gbc_textField_36.gridy = 4;
		add(textField_36, gbc_textField_36);
		textField_36.setColumns(10);
		
		lblCgt = new JLabel("CGT");
		GridBagConstraints gbc_lblCgt = new GridBagConstraints();
		gbc_lblCgt.anchor = GridBagConstraints.EAST;
		gbc_lblCgt.insets = new Insets(10, 10, 5, 5);
		gbc_lblCgt.gridx = 6;
		gbc_lblCgt.gridy = 4;
		add(lblCgt, gbc_lblCgt);
		
		textField_52 = new JTextField();
		GridBagConstraints gbc_textField_52 = new GridBagConstraints();
		gbc_textField_52.insets = new Insets(10, 0, 5, 0);
		gbc_textField_52.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_52.gridx = 7;
		gbc_textField_52.gridy = 4;
		add(textField_52, gbc_textField_52);
		textField_52.setColumns(10);
		
		JLabel lblCtc = new JLabel("CTC");
		GridBagConstraints gbc_lblCtc = new GridBagConstraints();
		gbc_lblCtc.anchor = GridBagConstraints.EAST;
		gbc_lblCtc.insets = new Insets(0, 0, 5, 5);
		gbc_lblCtc.gridx = 0;
		gbc_lblCtc.gridy = 5;
		add(lblCtc, gbc_lblCtc);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 5;
		add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCcc = new JLabel("CCC");
		GridBagConstraints gbc_lblCcc = new GridBagConstraints();
		gbc_lblCcc.anchor = GridBagConstraints.EAST;
		gbc_lblCcc.insets = new Insets(0, 10, 5, 5);
		gbc_lblCcc.gridx = 2;
		gbc_lblCcc.gridy = 5;
		add(lblCcc, gbc_lblCcc);
		
		textField_21 = new JTextField();
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.insets = new Insets(0, 0, 5, 5);
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.gridx = 3;
		gbc_textField_21.gridy = 5;
		add(textField_21, gbc_textField_21);
		textField_21.setColumns(10);
		
		JLabel lblCac = new JLabel("CAC");
		GridBagConstraints gbc_lblCac = new GridBagConstraints();
		gbc_lblCac.anchor = GridBagConstraints.EAST;
		gbc_lblCac.insets = new Insets(0, 10, 5, 5);
		gbc_lblCac.gridx = 4;
		gbc_lblCac.gridy = 5;
		add(lblCac, gbc_lblCac);
		
		textField_37 = new JTextField();
		GridBagConstraints gbc_textField_37 = new GridBagConstraints();
		gbc_textField_37.insets = new Insets(0, 0, 5, 5);
		gbc_textField_37.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_37.gridx = 5;
		gbc_textField_37.gridy = 5;
		add(textField_37, gbc_textField_37);
		textField_37.setColumns(10);
		
		lblCgc = new JLabel("CGC");
		GridBagConstraints gbc_lblCgc = new GridBagConstraints();
		gbc_lblCgc.anchor = GridBagConstraints.EAST;
		gbc_lblCgc.insets = new Insets(0, 10, 5, 5);
		gbc_lblCgc.gridx = 6;
		gbc_lblCgc.gridy = 5;
		add(lblCgc, gbc_lblCgc);
		
		textField_53 = new JTextField();
		GridBagConstraints gbc_textField_53 = new GridBagConstraints();
		gbc_textField_53.insets = new Insets(0, 0, 5, 0);
		gbc_textField_53.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_53.gridx = 7;
		gbc_textField_53.gridy = 5;
		add(textField_53, gbc_textField_53);
		textField_53.setColumns(10);
		
		JLabel lblCta = new JLabel("CTA");
		GridBagConstraints gbc_lblCta = new GridBagConstraints();
		gbc_lblCta.anchor = GridBagConstraints.EAST;
		gbc_lblCta.insets = new Insets(0, 0, 5, 5);
		gbc_lblCta.gridx = 0;
		gbc_lblCta.gridy = 6;
		add(lblCta, gbc_lblCta);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 6;
		add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblCca = new JLabel("CCA");
		GridBagConstraints gbc_lblCca = new GridBagConstraints();
		gbc_lblCca.anchor = GridBagConstraints.EAST;
		gbc_lblCca.insets = new Insets(0, 10, 5, 5);
		gbc_lblCca.gridx = 2;
		gbc_lblCca.gridy = 6;
		add(lblCca, gbc_lblCca);
		
		textField_22 = new JTextField();
		GridBagConstraints gbc_textField_22 = new GridBagConstraints();
		gbc_textField_22.insets = new Insets(0, 0, 5, 5);
		gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_22.gridx = 3;
		gbc_textField_22.gridy = 6;
		add(textField_22, gbc_textField_22);
		textField_22.setColumns(10);
		
		JLabel lblCaa = new JLabel("CAA");
		GridBagConstraints gbc_lblCaa = new GridBagConstraints();
		gbc_lblCaa.anchor = GridBagConstraints.EAST;
		gbc_lblCaa.insets = new Insets(0, 10, 5, 5);
		gbc_lblCaa.gridx = 4;
		gbc_lblCaa.gridy = 6;
		add(lblCaa, gbc_lblCaa);
		
		textField_38 = new JTextField();
		GridBagConstraints gbc_textField_38 = new GridBagConstraints();
		gbc_textField_38.insets = new Insets(0, 0, 5, 5);
		gbc_textField_38.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_38.gridx = 5;
		gbc_textField_38.gridy = 6;
		add(textField_38, gbc_textField_38);
		textField_38.setColumns(10);
		
		lblCga = new JLabel("CGA");
		GridBagConstraints gbc_lblCga = new GridBagConstraints();
		gbc_lblCga.anchor = GridBagConstraints.EAST;
		gbc_lblCga.insets = new Insets(0, 10, 5, 5);
		gbc_lblCga.gridx = 6;
		gbc_lblCga.gridy = 6;
		add(lblCga, gbc_lblCga);
		
		textField_54 = new JTextField();
		GridBagConstraints gbc_textField_54 = new GridBagConstraints();
		gbc_textField_54.insets = new Insets(0, 0, 5, 0);
		gbc_textField_54.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_54.gridx = 7;
		gbc_textField_54.gridy = 6;
		add(textField_54, gbc_textField_54);
		textField_54.setColumns(10);
		
		JLabel lblCtg = new JLabel("CTG");
		GridBagConstraints gbc_lblCtg = new GridBagConstraints();
		gbc_lblCtg.anchor = GridBagConstraints.EAST;
		gbc_lblCtg.insets = new Insets(0, 0, 10, 5);
		gbc_lblCtg.gridx = 0;
		gbc_lblCtg.gridy = 7;
		add(lblCtg, gbc_lblCtg);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 10, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 7;
		add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JLabel lblCcg = new JLabel("CCG");
		GridBagConstraints gbc_lblCcg = new GridBagConstraints();
		gbc_lblCcg.anchor = GridBagConstraints.EAST;
		gbc_lblCcg.insets = new Insets(0, 10, 10, 5);
		gbc_lblCcg.gridx = 2;
		gbc_lblCcg.gridy = 7;
		add(lblCcg, gbc_lblCcg);
		
		textField_23 = new JTextField();
		GridBagConstraints gbc_textField_23 = new GridBagConstraints();
		gbc_textField_23.insets = new Insets(0, 0, 10, 5);
		gbc_textField_23.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_23.gridx = 3;
		gbc_textField_23.gridy = 7;
		add(textField_23, gbc_textField_23);
		textField_23.setColumns(10);
		
		JLabel lblCag = new JLabel("CAG");
		GridBagConstraints gbc_lblCag = new GridBagConstraints();
		gbc_lblCag.anchor = GridBagConstraints.EAST;
		gbc_lblCag.insets = new Insets(0, 10, 10, 5);
		gbc_lblCag.gridx = 4;
		gbc_lblCag.gridy = 7;
		add(lblCag, gbc_lblCag);
		
		textField_39 = new JTextField();
		GridBagConstraints gbc_textField_39 = new GridBagConstraints();
		gbc_textField_39.insets = new Insets(0, 0, 10, 5);
		gbc_textField_39.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_39.gridx = 5;
		gbc_textField_39.gridy = 7;
		add(textField_39, gbc_textField_39);
		textField_39.setColumns(10);
		
		lblCgg = new JLabel("CGG");
		GridBagConstraints gbc_lblCgg = new GridBagConstraints();
		gbc_lblCgg.anchor = GridBagConstraints.EAST;
		gbc_lblCgg.insets = new Insets(0, 10, 5, 5);
		gbc_lblCgg.gridx = 6;
		gbc_lblCgg.gridy = 7;
		add(lblCgg, gbc_lblCgg);
		
		textField_55 = new JTextField();
		GridBagConstraints gbc_textField_55 = new GridBagConstraints();
		gbc_textField_55.insets = new Insets(0, 0, 10, 0);
		gbc_textField_55.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_55.gridx = 7;
		gbc_textField_55.gridy = 7;
		add(textField_55, gbc_textField_55);
		textField_55.setColumns(10);
		
		JLabel lblAtt = new JLabel("ATT");
		GridBagConstraints gbc_lblAtt = new GridBagConstraints();
		gbc_lblAtt.anchor = GridBagConstraints.EAST;
		gbc_lblAtt.insets = new Insets(10, 0, 5, 5);
		gbc_lblAtt.gridx = 0;
		gbc_lblAtt.gridy = 8;
		add(lblAtt, gbc_lblAtt);
		
		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(10, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 8;
		add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		JLabel lblAct = new JLabel("ACT");
		GridBagConstraints gbc_lblAct = new GridBagConstraints();
		gbc_lblAct.anchor = GridBagConstraints.EAST;
		gbc_lblAct.insets = new Insets(10, 10, 5, 5);
		gbc_lblAct.gridx = 2;
		gbc_lblAct.gridy = 8;
		add(lblAct, gbc_lblAct);
		
		textField_24 = new JTextField();
		GridBagConstraints gbc_textField_24 = new GridBagConstraints();
		gbc_textField_24.insets = new Insets(10, 0, 5, 5);
		gbc_textField_24.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_24.gridx = 3;
		gbc_textField_24.gridy = 8;
		add(textField_24, gbc_textField_24);
		textField_24.setColumns(10);
		
		JLabel lblAat = new JLabel("AAT");
		GridBagConstraints gbc_lblAat = new GridBagConstraints();
		gbc_lblAat.anchor = GridBagConstraints.EAST;
		gbc_lblAat.insets = new Insets(10, 10, 5, 5);
		gbc_lblAat.gridx = 4;
		gbc_lblAat.gridy = 8;
		add(lblAat, gbc_lblAat);
		
		textField_40 = new JTextField();
		GridBagConstraints gbc_textField_40 = new GridBagConstraints();
		gbc_textField_40.insets = new Insets(10, 0, 5, 5);
		gbc_textField_40.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_40.gridx = 5;
		gbc_textField_40.gridy = 8;
		add(textField_40, gbc_textField_40);
		textField_40.setColumns(10);
		
		lblAgt = new JLabel("AGT");
		GridBagConstraints gbc_lblAgt = new GridBagConstraints();
		gbc_lblAgt.anchor = GridBagConstraints.EAST;
		gbc_lblAgt.insets = new Insets(10, 10, 5, 5);
		gbc_lblAgt.gridx = 6;
		gbc_lblAgt.gridy = 8;
		add(lblAgt, gbc_lblAgt);
		
		textField_56 = new JTextField();
		GridBagConstraints gbc_textField_56 = new GridBagConstraints();
		gbc_textField_56.insets = new Insets(10, 0, 5, 0);
		gbc_textField_56.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_56.gridx = 7;
		gbc_textField_56.gridy = 8;
		add(textField_56, gbc_textField_56);
		textField_56.setColumns(10);
		
		JLabel lblAtc = new JLabel("ATC");
		GridBagConstraints gbc_lblAtc = new GridBagConstraints();
		gbc_lblAtc.anchor = GridBagConstraints.EAST;
		gbc_lblAtc.insets = new Insets(0, 0, 5, 5);
		gbc_lblAtc.gridx = 0;
		gbc_lblAtc.gridy = 9;
		add(lblAtc, gbc_lblAtc);
		
		textField_9 = new JTextField();
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 1;
		gbc_textField_9.gridy = 9;
		add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		
		JLabel lblAcc = new JLabel("ACC");
		GridBagConstraints gbc_lblAcc = new GridBagConstraints();
		gbc_lblAcc.anchor = GridBagConstraints.EAST;
		gbc_lblAcc.insets = new Insets(0, 10, 5, 5);
		gbc_lblAcc.gridx = 2;
		gbc_lblAcc.gridy = 9;
		add(lblAcc, gbc_lblAcc);
		
		textField_25 = new JTextField();
		GridBagConstraints gbc_textField_25 = new GridBagConstraints();
		gbc_textField_25.insets = new Insets(0, 0, 5, 5);
		gbc_textField_25.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_25.gridx = 3;
		gbc_textField_25.gridy = 9;
		add(textField_25, gbc_textField_25);
		textField_25.setColumns(10);
		
		JLabel lblAac = new JLabel("AAC");
		GridBagConstraints gbc_lblAac = new GridBagConstraints();
		gbc_lblAac.anchor = GridBagConstraints.EAST;
		gbc_lblAac.insets = new Insets(0, 10, 5, 5);
		gbc_lblAac.gridx = 4;
		gbc_lblAac.gridy = 9;
		add(lblAac, gbc_lblAac);
		
		textField_41 = new JTextField();
		GridBagConstraints gbc_textField_41 = new GridBagConstraints();
		gbc_textField_41.insets = new Insets(0, 0, 5, 5);
		gbc_textField_41.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_41.gridx = 5;
		gbc_textField_41.gridy = 9;
		add(textField_41, gbc_textField_41);
		textField_41.setColumns(10);
		
		lblAgc = new JLabel("AGC");
		GridBagConstraints gbc_lblAgc = new GridBagConstraints();
		gbc_lblAgc.anchor = GridBagConstraints.EAST;
		gbc_lblAgc.insets = new Insets(0, 10, 5, 5);
		gbc_lblAgc.gridx = 6;
		gbc_lblAgc.gridy = 9;
		add(lblAgc, gbc_lblAgc);
		
		textField_57 = new JTextField();
		GridBagConstraints gbc_textField_57 = new GridBagConstraints();
		gbc_textField_57.insets = new Insets(0, 0, 5, 0);
		gbc_textField_57.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_57.gridx = 7;
		gbc_textField_57.gridy = 9;
		add(textField_57, gbc_textField_57);
		textField_57.setColumns(10);
		
		JLabel lblAta = new JLabel("ATA");
		GridBagConstraints gbc_lblAta = new GridBagConstraints();
		gbc_lblAta.anchor = GridBagConstraints.EAST;
		gbc_lblAta.insets = new Insets(0, 0, 5, 5);
		gbc_lblAta.gridx = 0;
		gbc_lblAta.gridy = 10;
		add(lblAta, gbc_lblAta);
		
		textField_10 = new JTextField();
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 1;
		gbc_textField_10.gridy = 10;
		add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);
		
		JLabel lblAca = new JLabel("ACA");
		GridBagConstraints gbc_lblAca = new GridBagConstraints();
		gbc_lblAca.anchor = GridBagConstraints.EAST;
		gbc_lblAca.insets = new Insets(0, 10, 5, 5);
		gbc_lblAca.gridx = 2;
		gbc_lblAca.gridy = 10;
		add(lblAca, gbc_lblAca);
		
		textField_26 = new JTextField();
		GridBagConstraints gbc_textField_26 = new GridBagConstraints();
		gbc_textField_26.insets = new Insets(0, 0, 5, 5);
		gbc_textField_26.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_26.gridx = 3;
		gbc_textField_26.gridy = 10;
		add(textField_26, gbc_textField_26);
		textField_26.setColumns(10);
		
		JLabel lblAaa = new JLabel("AAA");
		GridBagConstraints gbc_lblAaa = new GridBagConstraints();
		gbc_lblAaa.anchor = GridBagConstraints.EAST;
		gbc_lblAaa.insets = new Insets(0, 10, 5, 5);
		gbc_lblAaa.gridx = 4;
		gbc_lblAaa.gridy = 10;
		add(lblAaa, gbc_lblAaa);
		
		textField_42 = new JTextField();
		GridBagConstraints gbc_textField_42 = new GridBagConstraints();
		gbc_textField_42.insets = new Insets(0, 0, 5, 5);
		gbc_textField_42.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_42.gridx = 5;
		gbc_textField_42.gridy = 10;
		add(textField_42, gbc_textField_42);
		textField_42.setColumns(10);
		
		lblAga = new JLabel("AGA");
		GridBagConstraints gbc_lblAga = new GridBagConstraints();
		gbc_lblAga.anchor = GridBagConstraints.EAST;
		gbc_lblAga.insets = new Insets(0, 10, 5, 5);
		gbc_lblAga.gridx = 6;
		gbc_lblAga.gridy = 10;
		add(lblAga, gbc_lblAga);
		
		textField_58 = new JTextField();
		GridBagConstraints gbc_textField_58 = new GridBagConstraints();
		gbc_textField_58.insets = new Insets(0, 0, 5, 0);
		gbc_textField_58.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_58.gridx = 7;
		gbc_textField_58.gridy = 10;
		add(textField_58, gbc_textField_58);
		textField_58.setColumns(10);
		
		JLabel lblAtg = new JLabel("ATG");
		GridBagConstraints gbc_lblAtg = new GridBagConstraints();
		gbc_lblAtg.anchor = GridBagConstraints.EAST;
		gbc_lblAtg.insets = new Insets(0, 0, 10, 5);
		gbc_lblAtg.gridx = 0;
		gbc_lblAtg.gridy = 11;
		add(lblAtg, gbc_lblAtg);
		
		textField_11 = new JTextField();
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 10, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 1;
		gbc_textField_11.gridy = 11;
		add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);
		
		JLabel lblAcg = new JLabel("ACG");
		GridBagConstraints gbc_lblAcg = new GridBagConstraints();
		gbc_lblAcg.anchor = GridBagConstraints.EAST;
		gbc_lblAcg.insets = new Insets(0, 10, 10, 5);
		gbc_lblAcg.gridx = 2;
		gbc_lblAcg.gridy = 11;
		add(lblAcg, gbc_lblAcg);
		
		textField_27 = new JTextField();
		GridBagConstraints gbc_textField_27 = new GridBagConstraints();
		gbc_textField_27.insets = new Insets(0, 0, 10, 5);
		gbc_textField_27.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_27.gridx = 3;
		gbc_textField_27.gridy = 11;
		add(textField_27, gbc_textField_27);
		textField_27.setColumns(10);
		
		JLabel lblAag = new JLabel("AAG");
		GridBagConstraints gbc_lblAag = new GridBagConstraints();
		gbc_lblAag.anchor = GridBagConstraints.EAST;
		gbc_lblAag.insets = new Insets(0, 10, 10, 5);
		gbc_lblAag.gridx = 4;
		gbc_lblAag.gridy = 11;
		add(lblAag, gbc_lblAag);
		
		textField_43 = new JTextField();
		GridBagConstraints gbc_textField_43 = new GridBagConstraints();
		gbc_textField_43.insets = new Insets(0, 0, 10, 5);
		gbc_textField_43.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_43.gridx = 5;
		gbc_textField_43.gridy = 11;
		add(textField_43, gbc_textField_43);
		textField_43.setColumns(10);
		
		lblAgg = new JLabel("AGG");
		GridBagConstraints gbc_lblAgg = new GridBagConstraints();
		gbc_lblAgg.anchor = GridBagConstraints.EAST;
		gbc_lblAgg.insets = new Insets(0, 10, 10, 5);
		gbc_lblAgg.gridx = 6;
		gbc_lblAgg.gridy = 11;
		add(lblAgg, gbc_lblAgg);
		
		textField_59 = new JTextField();
		GridBagConstraints gbc_textField_59 = new GridBagConstraints();
		gbc_textField_59.insets = new Insets(0, 0, 10, 0);
		gbc_textField_59.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_59.gridx = 7;
		gbc_textField_59.gridy = 11;
		add(textField_59, gbc_textField_59);
		textField_59.setColumns(10);
		
		JLabel lblGtt = new JLabel("GTT");
		GridBagConstraints gbc_lblGtt = new GridBagConstraints();
		gbc_lblGtt.anchor = GridBagConstraints.EAST;
		gbc_lblGtt.insets = new Insets(10, 0, 5, 5);
		gbc_lblGtt.gridx = 0;
		gbc_lblGtt.gridy = 12;
		add(lblGtt, gbc_lblGtt);
		
		textField_12 = new JTextField();
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(10, 0, 5, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 1;
		gbc_textField_12.gridy = 12;
		add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);
		
		JLabel lblGct = new JLabel("GCT");
		GridBagConstraints gbc_lblGct = new GridBagConstraints();
		gbc_lblGct.anchor = GridBagConstraints.EAST;
		gbc_lblGct.insets = new Insets(10, 10, 5, 5);
		gbc_lblGct.gridx = 2;
		gbc_lblGct.gridy = 12;
		add(lblGct, gbc_lblGct);
		
		textField_28 = new JTextField();
		GridBagConstraints gbc_textField_28 = new GridBagConstraints();
		gbc_textField_28.insets = new Insets(10, 0, 5, 5);
		gbc_textField_28.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_28.gridx = 3;
		gbc_textField_28.gridy = 12;
		add(textField_28, gbc_textField_28);
		textField_28.setColumns(10);
		
		JLabel lblGat = new JLabel("GAT");
		GridBagConstraints gbc_lblGat = new GridBagConstraints();
		gbc_lblGat.anchor = GridBagConstraints.EAST;
		gbc_lblGat.insets = new Insets(10, 10, 5, 5);
		gbc_lblGat.gridx = 4;
		gbc_lblGat.gridy = 12;
		add(lblGat, gbc_lblGat);
		
		textField_44 = new JTextField();
		GridBagConstraints gbc_textField_44 = new GridBagConstraints();
		gbc_textField_44.insets = new Insets(10, 0, 5, 5);
		gbc_textField_44.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_44.gridx = 5;
		gbc_textField_44.gridy = 12;
		add(textField_44, gbc_textField_44);
		textField_44.setColumns(10);
		
		lblGgt = new JLabel("GGT");
		GridBagConstraints gbc_lblGgt = new GridBagConstraints();
		gbc_lblGgt.anchor = GridBagConstraints.EAST;
		gbc_lblGgt.insets = new Insets(10, 10, 5, 5);
		gbc_lblGgt.gridx = 6;
		gbc_lblGgt.gridy = 12;
		add(lblGgt, gbc_lblGgt);
		
		textField_60 = new JTextField();
		GridBagConstraints gbc_textField_60 = new GridBagConstraints();
		gbc_textField_60.insets = new Insets(10, 0, 5, 0);
		gbc_textField_60.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_60.gridx = 7;
		gbc_textField_60.gridy = 12;
		add(textField_60, gbc_textField_60);
		textField_60.setColumns(10);
		
		JLabel lblGtc = new JLabel("GTC");
		GridBagConstraints gbc_lblGtc = new GridBagConstraints();
		gbc_lblGtc.anchor = GridBagConstraints.EAST;
		gbc_lblGtc.insets = new Insets(0, 0, 5, 5);
		gbc_lblGtc.gridx = 0;
		gbc_lblGtc.gridy = 13;
		add(lblGtc, gbc_lblGtc);
		
		textField_13 = new JTextField();
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 1;
		gbc_textField_13.gridy = 13;
		add(textField_13, gbc_textField_13);
		textField_13.setColumns(10);
		
		JLabel lblGcc = new JLabel("GCC");
		GridBagConstraints gbc_lblGcc = new GridBagConstraints();
		gbc_lblGcc.anchor = GridBagConstraints.EAST;
		gbc_lblGcc.insets = new Insets(0, 10, 5, 5);
		gbc_lblGcc.gridx = 2;
		gbc_lblGcc.gridy = 13;
		add(lblGcc, gbc_lblGcc);
		
		textField_29 = new JTextField();
		GridBagConstraints gbc_textField_29 = new GridBagConstraints();
		gbc_textField_29.insets = new Insets(0, 0, 5, 5);
		gbc_textField_29.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_29.gridx = 3;
		gbc_textField_29.gridy = 13;
		add(textField_29, gbc_textField_29);
		textField_29.setColumns(10);
		
		JLabel lblGac = new JLabel("GAC");
		GridBagConstraints gbc_lblGac = new GridBagConstraints();
		gbc_lblGac.anchor = GridBagConstraints.EAST;
		gbc_lblGac.insets = new Insets(0, 10, 5, 5);
		gbc_lblGac.gridx = 4;
		gbc_lblGac.gridy = 13;
		add(lblGac, gbc_lblGac);
		
		textField_45 = new JTextField();
		GridBagConstraints gbc_textField_45 = new GridBagConstraints();
		gbc_textField_45.insets = new Insets(0, 0, 5, 5);
		gbc_textField_45.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_45.gridx = 5;
		gbc_textField_45.gridy = 13;
		add(textField_45, gbc_textField_45);
		textField_45.setColumns(10);
		
		lblGgc = new JLabel("GGC");
		GridBagConstraints gbc_lblGgc = new GridBagConstraints();
		gbc_lblGgc.anchor = GridBagConstraints.EAST;
		gbc_lblGgc.insets = new Insets(0, 10, 5, 5);
		gbc_lblGgc.gridx = 6;
		gbc_lblGgc.gridy = 13;
		add(lblGgc, gbc_lblGgc);
		
		textField_61 = new JTextField();
		GridBagConstraints gbc_textField_61 = new GridBagConstraints();
		gbc_textField_61.insets = new Insets(0, 0, 5, 0);
		gbc_textField_61.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_61.gridx = 7;
		gbc_textField_61.gridy = 13;
		add(textField_61, gbc_textField_61);
		textField_61.setColumns(10);
		
		JLabel lblGta = new JLabel("GTA");
		GridBagConstraints gbc_lblGta = new GridBagConstraints();
		gbc_lblGta.anchor = GridBagConstraints.EAST;
		gbc_lblGta.insets = new Insets(0, 0, 5, 5);
		gbc_lblGta.gridx = 0;
		gbc_lblGta.gridy = 14;
		add(lblGta, gbc_lblGta);
		
		textField_14 = new JTextField();
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 1;
		gbc_textField_14.gridy = 14;
		add(textField_14, gbc_textField_14);
		textField_14.setColumns(10);
		
		JLabel lblGca = new JLabel("GCA");
		GridBagConstraints gbc_lblGca = new GridBagConstraints();
		gbc_lblGca.anchor = GridBagConstraints.EAST;
		gbc_lblGca.insets = new Insets(0, 10, 5, 5);
		gbc_lblGca.gridx = 2;
		gbc_lblGca.gridy = 14;
		add(lblGca, gbc_lblGca);
		
		textField_30 = new JTextField();
		GridBagConstraints gbc_textField_30 = new GridBagConstraints();
		gbc_textField_30.insets = new Insets(0, 0, 5, 5);
		gbc_textField_30.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_30.gridx = 3;
		gbc_textField_30.gridy = 14;
		add(textField_30, gbc_textField_30);
		textField_30.setColumns(10);
		
		JLabel lblGaa = new JLabel("GAA");
		GridBagConstraints gbc_lblGaa = new GridBagConstraints();
		gbc_lblGaa.anchor = GridBagConstraints.EAST;
		gbc_lblGaa.insets = new Insets(0, 10, 5, 5);
		gbc_lblGaa.gridx = 4;
		gbc_lblGaa.gridy = 14;
		add(lblGaa, gbc_lblGaa);
		
		textField_46 = new JTextField();
		GridBagConstraints gbc_textField_46 = new GridBagConstraints();
		gbc_textField_46.insets = new Insets(0, 0, 5, 5);
		gbc_textField_46.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_46.gridx = 5;
		gbc_textField_46.gridy = 14;
		add(textField_46, gbc_textField_46);
		textField_46.setColumns(10);
		
		lblGga = new JLabel("GGA");
		GridBagConstraints gbc_lblGga = new GridBagConstraints();
		gbc_lblGga.anchor = GridBagConstraints.EAST;
		gbc_lblGga.insets = new Insets(0, 10, 5, 5);
		gbc_lblGga.gridx = 6;
		gbc_lblGga.gridy = 14;
		add(lblGga, gbc_lblGga);
		
		textField_62 = new JTextField();
		GridBagConstraints gbc_textField_62 = new GridBagConstraints();
		gbc_textField_62.insets = new Insets(0, 0, 5, 0);
		gbc_textField_62.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_62.gridx = 7;
		gbc_textField_62.gridy = 14;
		add(textField_62, gbc_textField_62);
		textField_62.setColumns(10);
		
		JLabel lblGtg = new JLabel("GTG");
		GridBagConstraints gbc_lblGtg = new GridBagConstraints();
		gbc_lblGtg.anchor = GridBagConstraints.EAST;
		gbc_lblGtg.insets = new Insets(0, 0, 0, 5);
		gbc_lblGtg.gridx = 0;
		gbc_lblGtg.gridy = 15;
		add(lblGtg, gbc_lblGtg);
		
		textField_15 = new JTextField();
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.insets = new Insets(0, 0, 0, 5);
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 1;
		gbc_textField_15.gridy = 15;
		add(textField_15, gbc_textField_15);
		textField_15.setColumns(10);
		
		JLabel lblGcg = new JLabel("GCG");
		GridBagConstraints gbc_lblGcg = new GridBagConstraints();
		gbc_lblGcg.anchor = GridBagConstraints.EAST;
		gbc_lblGcg.insets = new Insets(0, 10, 0, 5);
		gbc_lblGcg.gridx = 2;
		gbc_lblGcg.gridy = 15;
		add(lblGcg, gbc_lblGcg);
		
		textField_31 = new JTextField();
		GridBagConstraints gbc_textField_31 = new GridBagConstraints();
		gbc_textField_31.insets = new Insets(0, 0, 0, 5);
		gbc_textField_31.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_31.gridx = 3;
		gbc_textField_31.gridy = 15;
		add(textField_31, gbc_textField_31);
		textField_31.setColumns(10);
		
		JLabel lblGag = new JLabel("GAG");
		GridBagConstraints gbc_lblGag = new GridBagConstraints();
		gbc_lblGag.anchor = GridBagConstraints.EAST;
		gbc_lblGag.insets = new Insets(0, 10, 0, 5);
		gbc_lblGag.gridx = 4;
		gbc_lblGag.gridy = 15;
		add(lblGag, gbc_lblGag);
		
		textField_47 = new JTextField();
		GridBagConstraints gbc_textField_47 = new GridBagConstraints();
		gbc_textField_47.insets = new Insets(0, 0, 0, 5);
		gbc_textField_47.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_47.gridx = 5;
		gbc_textField_47.gridy = 15;
		add(textField_47, gbc_textField_47);
		textField_47.setColumns(10);
		
		lblGgg = new JLabel("GGG");
		GridBagConstraints gbc_lblGgg = new GridBagConstraints();
		gbc_lblGgg.anchor = GridBagConstraints.EAST;
		gbc_lblGgg.insets = new Insets(0, 10, 0, 5);
		gbc_lblGgg.gridx = 6;
		gbc_lblGgg.gridy = 15;
		add(lblGgg, gbc_lblGgg);
		
		textField_63 = new JTextField();
		GridBagConstraints gbc_textField_63 = new GridBagConstraints();
		gbc_textField_63.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_63.gridx = 7;
		gbc_textField_63.gridy = 15;
		add(textField_63, gbc_textField_63);
		textField_63.setColumns(10);
		
		
	}

}
