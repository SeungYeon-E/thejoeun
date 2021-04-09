package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI01 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResult;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JButton btnAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI01 window = new GUI01();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("더하기");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_1_1());
		frame.getContentPane().add(getBtnAdd());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("더하기");
			lblNewLabel.setBounds(25, 27, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(21, 62, 77, 21);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setBounds(119, 62, 77, 21);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setBounds(217, 62, 77, 21);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("+");
			lblNewLabel_1.setBounds(104, 65, 13, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("=");
			lblNewLabel_1_1.setBounds(204, 65, 13, 15);
		}
		return lblNewLabel_1_1;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("더하기");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//1st
//					String stNum1 = tfNum1.getText();
//					String stNum2 = tfNum2.getText();
//					
//					int wkNum1 = Integer.parseInt(stNum1);					
//					int wkNum2 = Integer.parseInt(stNum2);				
//					int wkResult = wkNum1 + wkNum2;
//					
//					String stResult = Integer.toString(wkResult);
//					tfResult.setText(stResult);
					
					//2st
//					int wkNum1 = Integer.parseInt(tfNum1.getText());
//					int wkNum2 = Integer.parseInt(tfNum2.getText());
//					int wkResult = wkNum1 + wkNum2;
//					
//					tfResult.setText(Integer.toString(wkResult));
					addSum();
					
					
				}
			});
			btnAdd.setBounds(315, 61, 97, 23);
		}
		return btnAdd;
	}
	private void addSum() {
		
		int wkNum1 = Integer.parseInt(tfNum1.getText());
		int wkNum2 = Integer.parseInt(tfNum2.getText());
		int wkResult = wkNum1 + wkNum2;
		
		tfResult.setText(Integer.toString(wkResult));
		JOptionPane.showMessageDialog(frame, Integer.toString(wkResult));
		
		
	}
} //----
