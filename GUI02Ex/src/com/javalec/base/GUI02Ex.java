package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI02Ex {

	private JFrame frame;
	private JComboBox cbNum1;
	private JComboBox cbMath;
	private JComboBox cbNum2;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI02Ex window = new GUI02Ex();
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
	public GUI02Ex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbNum1());
		frame.getContentPane().add(getCbMath());
		frame.getContentPane().add(getCbNum2());
		frame.getContentPane().add(getTfResult());
		tfresult();
	}

	private JComboBox getCbNum1() {
		if (cbNum1 == null) {
			cbNum1 = new JComboBox();
			cbNum1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfresult();
				}
			});
			cbNum1.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5", "6", "7", "8", "9"}));
			cbNum1.setBounds(25, 23, 69, 23);
		}
		return cbNum1;
	}
	private JComboBox getCbMath() {
		if (cbMath == null) {
			cbMath = new JComboBox();
			cbMath.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfresult();
				}
			});
			cbMath.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/"}));
			cbMath.setBounds(106, 23, 69, 23);
		}
		return cbMath;
	}
	private JComboBox getCbNum2() {
		if (cbNum2 == null) {
			cbNum2 = new JComboBox();
			cbNum2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfresult();
				}
			});
			cbNum2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
			cbNum2.setBounds(187, 23, 69, 23);
		}
		return cbNum2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			tfResult.setBounds(268, 24, 69, 21);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	void tfresult() {
		
		int Num1 = Integer.parseInt(cbNum1.getSelectedItem().toString());
		int Num2 = Integer.parseInt(cbNum2.getSelectedItem().toString());
		
//		String Calc = cbMath.getSelectedItem().toString();
		
		if(cbMath.getSelectedItem() == "+") {
			tfResult.setText(Integer.toString(Num1 + Num2));
			
		}else if(cbMath.getSelectedItem() == "-") {
			tfResult.setText(Integer.toString(Num1 - Num2));
			
		}else if(cbMath.getSelectedItem() == "*") {
			tfResult.setText(String.format("%d", Num1 * Num2));
			
		}else {
			tfResult.setText(String.format("%.2f", (double) Num1 / Num2));
			
		}
		
	}
}
