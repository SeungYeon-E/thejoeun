package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI01Exercise01 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JButton btnAdd;
	private JButton btnSub;
	private JButton btnMul;
	private JButton btnDiv;
	private JTextField tfInput1;
	private JTextField tfInput2;
	private JTextField tfResult;
	private JLabel lbLabel1;
	private JLabel lbLabel2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI01Exercise01 window = new GUI01Exercise01();
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
	public GUI01Exercise01() {
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
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getBtnAdd());
		frame.getContentPane().add(getBtnSub());
		frame.getContentPane().add(getBtnMul());
		frame.getContentPane().add(getBtnDiv());
		frame.getContentPane().add(getTfInput1());
		frame.getContentPane().add(getTfInput2());
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getLbLabel1());
		frame.getContentPane().add(getLbLabel2());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("1 :");
			lblNewLabel.setBounds(12, 24, 20, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("2 :");
			lblNewLabel_1.setBounds(12, 63, 20, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(34, 21, 116, 21);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(34, 60, 116, 21);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("+");
			btnAdd.addActionListener(new Action());
			btnAdd.setBounds(189, 32, 50, 23);
		}
		return btnAdd;
	}
	private JButton getBtnSub() {
		if (btnSub == null) {
			btnSub = new JButton("-");
			btnSub.addActionListener(new Action());
			btnSub.setBounds(240, 32, 50, 23);
		}
		return btnSub;
	}
	private JButton getBtnMul() {
		if (btnMul == null) {
			btnMul = new JButton("*");
			btnMul.addActionListener (new Action());
			btnMul.setBounds(291, 32, 50, 23);
		}
		return btnMul;
	}
	private JButton getBtnDiv() {
		if (btnDiv == null) {
			btnDiv = new JButton("/");
			btnDiv.addActionListener(new Action());
			btnDiv.setBounds(342, 32, 50, 23);
		}
		return btnDiv;
	}
	private JTextField getTfInput1() {
		if (tfInput1 == null) {
			tfInput1 = new JTextField();
			tfInput1.setEditable(false);
			tfInput1.setBounds(21, 196, 116, 21);
			tfInput1.setColumns(10);
		}
		return tfInput1;
	}
	private JTextField getTfInput2() {
		if (tfInput2 == null) {
			tfInput2 = new JTextField();
			tfInput2.setEditable(false);
			tfInput2.setColumns(10);
			tfInput2.setBounds(158, 196, 116, 21);
		}
		return tfInput2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setColumns(10);
			tfResult.setBounds(295, 196, 116, 21);
		}
		return tfResult;
	}
	private JLabel getLbLabel1() {
		if (lbLabel1 == null) {
			lbLabel1 = new JLabel("");
			lbLabel1.setBounds(143, 196, 20, 20);
		}
		return lbLabel1;
	}
	private JLabel getLbLabel2() {
		if (lbLabel2 == null) {
			lbLabel2 = new JLabel("=");
			lbLabel2.setBounds(281, 196, 20, 20);
		}
		return lbLabel2;
	}
	
	class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(tfNum1.getText().equals("")) {
				tfNum1.setText("0");
			}
				
			int wkNum1 = Integer.parseInt(tfNum1.getText());
			int wkNum2 = Integer.parseInt(tfNum2.getText());
			int wkNumResult = 0;
				
			if (e.getSource()==btnAdd) {
				wkNumResult = wkNum1 + wkNum2;
				lbLabel1.setText("+");
				tfInput1.setText(Integer.toString(wkNum1));
				tfInput2.setText(Integer.toString(wkNum2));
				tfResult.setText(Integer.toString(wkNumResult));
				
			}else if(e.getSource()==btnSub) {
				wkNumResult = wkNum1 - wkNum2;
				lbLabel1.setText("-");
				tfInput1.setText(Integer.toString(wkNum1));
				tfInput2.setText(Integer.toString(wkNum2));
				tfResult.setText(Integer.toString(wkNumResult));
				
			}else if(e.getSource()==btnMul) {
				wkNumResult = wkNum1 * wkNum2;
				lbLabel1.setText("*");
				tfInput1.setText(Integer.toString(wkNum1));
				tfInput2.setText(Integer.toString(wkNum2));
				tfResult.setText(Integer.toString(wkNumResult));
				
			}else {
				if(wkNum1==0 || wkNum2==0) {
					JOptionPane.showMessageDialog(null, "나눌수없는 값입니다.");
				}else {
					wkNumResult = wkNum1 / wkNum2;
					lbLabel1.setText("/");
					tfInput1.setText(Integer.toString(wkNum1));
					tfInput2.setText(Integer.toString(wkNum2));
					tfResult.setText(Integer.toString(wkNumResult));
				}
			}
		}
		
	}
	
}

