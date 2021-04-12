package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI03EX01 {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JCheckBox chAdd;
	private JCheckBox chSub;
	private JCheckBox chMul;
	private JCheckBox chDiv;
	private JLabel lbResult1;
	private JLabel lbResult2;
	private JLabel lbResult3;
	private JLabel lbResult4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03EX01 window = new GUI03EX01();
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
	public GUI03EX01() {
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
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getChAdd());
		frame.getContentPane().add(getChSub());
		frame.getContentPane().add(getChMul());
		frame.getContentPane().add(getChDiv());
		frame.getContentPane().add(getLbResult1());
		frame.getContentPane().add(getLbResult2());
		frame.getContentPane().add(getLbResult3());
		frame.getContentPane().add(getLbResult4());
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(12, 10, 116, 21);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(12, 52, 116, 21);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JCheckBox getChAdd() {
		if (chAdd == null) {
			chAdd = new JCheckBox("+");
			chAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					chCheck();
				}
			});
			chAdd.setBounds(222, 9, 115, 23);
		}
		return chAdd;
		
	}
	private JCheckBox getChSub() {
		if (chSub == null) {
			chSub = new JCheckBox("-");
			chSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					chCheck();
				}
			});
			chSub.setBounds(222, 34, 115, 23);
		}
		return chSub;
	}
	private JCheckBox getChMul() {
		if (chMul == null) {
			chMul = new JCheckBox("*");
			chMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					chCheck();
				}
			});
			chMul.setBounds(222, 59, 115, 23);
		}
		return chMul;
	}
	private JCheckBox getChDiv() {
		if (chDiv == null) {
			chDiv = new JCheckBox("/");
			chDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					chCheck();
				}
			});
			chDiv.setBounds(222, 84, 115, 23);
		}
		return chDiv;
	}
	private JLabel getLbResult1() {
		if (lbResult1 == null) {
			lbResult1 = new JLabel("");
			lbResult1.setBounds(71, 126, 187, 21);
		}
		return lbResult1;
	}
	private JLabel getLbResult2() {
		if (lbResult2 == null) {
			lbResult2 = new JLabel("");
			lbResult2.setBounds(71, 158, 187, 21);
		}
		return lbResult2;
	}
	private JLabel getLbResult3() {
		if (lbResult3 == null) {
			lbResult3 = new JLabel("");
			lbResult3.setBounds(71, 189, 187, 21);
		}
		return lbResult3;
	}
	private JLabel getLbResult4() {
		if (lbResult4 == null) {
			lbResult4 = new JLabel("");
			lbResult4.setBounds(71, 220, 187, 21);
		}
		return lbResult4;
	}
	private void chCheck() {
		
		int Num1 = Integer.parseInt(tfNum1.getText());
		int Num2 = Integer.parseInt(tfNum2.getText());
		int result = 0;
		double doubleresult = 0;
		String calc = "";
		int[] Array = new int[4];
		
		if (chAdd.isSelected()==true) {
			calc = "+";
			result = Num1 + Num2;
//			lbResult1.setText(Num1 + calc + Num2 + " = " + result);
			
		}else if (chSub.isSelected()==true) {
			calc = "-";
			result = Num1 - Num2;
//			lbResult2.setText(Num1 + calc + Num2 + " = " + result);
			
		}else if (chMul.isSelected()==true) {
			calc = "*";
			result = Num1 * Num2;
//			lbResult3.setText(Num1 + calc + Num2 + " = " + result);
			
		}else if (chDiv.isSelected()==true) {
			if ((Num1==0 && Num2==0) || (Num2==0)) {// 0/2는 나눌수 있는값이지만 2/0은 나눌수없다.
				calc = "나눌 수 없는 값입니다.";
				
			}else {
				calc = "/";
				doubleresult = (double) Num1 / Num2;
//				lbResult4.setText(Num1 + calc + Num2 + " = " + result);
			}
		}
		
		
		if(lbResult1.getText().equals("")) {
			lbResult1.setText(Num1 + calc + Num2 + " = " + result);
			
		}else if(lbResult2.getText().equals("")) {
			lbResult2.setText(Num1 + calc + Num2 + " = " + result);
			
		}else if(lbResult3.getText().equals("")) {
			lbResult3.setText(Num1 + calc + Num2 + " = " + result);
			
		}else if(lbResult4.getText().equals("")) {
			lbResult4.setText(Num1 + calc + Num2 + " = " + String.format("%.2f", doubleresult));
		}
	}
}
