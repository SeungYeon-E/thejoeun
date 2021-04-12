package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class GUI02 {

	private JFrame frmCombobox;
	private JComboBox cdFruits;
	private JTextField tfFruits;
	private JTextField tfAdd;
	private JButton btnAdd;
	private JComboBox cdAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI02 window = new GUI02();
					window.frmCombobox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCombobox = new JFrame();
		frmCombobox.setTitle("ComboBox");
		frmCombobox.setBounds(100, 100, 450, 300);
		frmCombobox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCombobox.getContentPane().setLayout(null);
		frmCombobox.getContentPane().add(getCdFruits());
		frmCombobox.getContentPane().add(getTfFruits());
		frmCombobox.getContentPane().add(getTfAdd());
		frmCombobox.getContentPane().add(getBtnAdd());
		frmCombobox.getContentPane().add(getCdAdd());
	}
	private JComboBox getCdFruits() {
		if (cdFruits == null) {
			cdFruits = new JComboBox();
			cdFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String stFruits = cdFruits.getSelectedItem().toString();
					tfFruits.setText(stFruits);
				}
			});
			cdFruits.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Grape", "Mango", "Melon"}));
			cdFruits.setBounds(24, 20, 120, 23);
		}
		return cdFruits;
	}
	private JTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JTextField();
			tfFruits.setBounds(180, 21, 116, 21);
			tfFruits.setColumns(10);
		}
		return tfFruits;
	}
	private JTextField getTfAdd() {
		if (tfAdd == null) {
			tfAdd = new JTextField();
			tfAdd.setBounds(24, 80, 116, 21);
			tfAdd.setColumns(10);
		}
		return tfAdd;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addCombo();
				}
			});
			btnAdd.setBounds(30, 125, 97, 23);
		}
		return btnAdd;
	}
	private JComboBox getCdAdd() {
		if (cdAdd == null) {
			cdAdd = new JComboBox();
			cdAdd.setBounds(180, 79, 116, 23);
		}
		return cdAdd;
	}
	
	private void addCombo() {
		String stTemp = tfAdd.getText();
		cdAdd.addItem(stTemp);
	}
}
