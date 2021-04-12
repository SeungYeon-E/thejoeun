package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI03Ex {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JRadioButton rbAdd;
	private JRadioButton rbSub;
	private JRadioButton rbMul;
	private JRadioButton rbDiv;
	private JLabel lbResult;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03Ex window = new GUI03Ex();
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
	public GUI03Ex() {
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
		frame.getContentPane().add(getRbAdd());
		frame.getContentPane().add(getRbSub());
		frame.getContentPane().add(getRbMul());
		frame.getContentPane().add(getRbDiv());
		frame.getContentPane().add(getLbResult());
	}

	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(12, 22, 116, 21);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(12, 64, 116, 21);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JRadioButton getRbAdd() {
		if (rbAdd == null) {
			rbAdd = new JRadioButton("Add");
			rbAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcResult();
				}
			});
			buttonGroup.add(rbAdd);
			rbAdd.setBounds(183, 21, 121, 23);
		}
		return rbAdd;
	}
	private JRadioButton getRbSub() {
		if (rbSub == null) {
			rbSub = new JRadioButton("Sub");
			rbSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcResult();
				}
			});
			buttonGroup.add(rbSub);
			rbSub.setBounds(183, 63, 121, 23);
		}
		return rbSub;
	}
	private JRadioButton getRbMul() {
		if (rbMul == null) {
			rbMul = new JRadioButton("Mul");
			rbMul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcResult();
				}
			});
			buttonGroup.add(rbMul);
			rbMul.setBounds(183, 101, 121, 23);
		}
		return rbMul;
	}
	private JRadioButton getRbDiv() {
		if (rbDiv == null) {
			rbDiv = new JRadioButton("Div");
			rbDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calcResult();
				}
			});
			buttonGroup.add(rbDiv);
			rbDiv.setBounds(183, 142, 121, 23);
		}
		return rbDiv;
	}
	private JLabel getLbResult() {
		if (lbResult == null) {
			lbResult = new JLabel("?");
			lbResult.setBounds(31, 198, 223, 21);
		}
		return lbResult;
	}
	private void calcResult() {
		
		int Num1 = Integer.parseInt(tfNum1.getText());
		int Num2 = Integer.parseInt(tfNum2.getText());
		
		if (rbAdd.isSelected()==true) {
			int result = Num1 + Num2;
			lbResult.setText(Num1 + " + " + Num2 + " = " + result);
			
		}else if (rbSub.isSelected()==true) {
			int result = Num1 - Num2;
			lbResult.setText(Num1 + " - " + Num2 + " = " + result);
			
		}else if (rbMul.isSelected()==true) {
			int result = Num1 * Num2;
			lbResult.setText(Num1 + " * " + Num2 + " = " + result);
			
		}else if (rbDiv.isSelected()==true) {
			if ((Num1==0 && Num2==0) || (Num2==0)) {// 0/2는 나눌수 있는값이지만 2/0은 나눌수없다.
				lbResult.setText("나눌 수 없는 값입니다.");
				
			}else {
				double result = (double) Num1 / Num2;
				lbResult.setText(Num1 + " / " + Num2 + " = " + String.format("%.2f", result));
			}
		}
		
	}
	
}
