package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI00 {

	private JFrame frmButtonTest; 
	private JButton btnNewButton;
	private JLabel lblTest;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI00 window = new GUI00();
					window.frmButtonTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI00() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmButtonTest = new JFrame();
		frmButtonTest.setTitle("Button Test");
		frmButtonTest.setBounds(100, 100, 450, 300);
		frmButtonTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmButtonTest.getContentPane().setLayout(null);
		frmButtonTest.getContentPane().add(getBtnNewButton());
		frmButtonTest.getContentPane().add(getLblTest());
		frmButtonTest.getContentPane().add(getBtnNewButton_1());
		frmButtonTest.getContentPane().add(getBtnNewButton_2());
		frmButtonTest.getContentPane().add(getBtnNewButton_3());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Clear");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					JOptionPane.showMessageDialog(null, "Message");
					lblTest.setText(null);
					
				}
			});
			btnNewButton.setBounds(166, 109, 97, 23);
		}
		return btnNewButton;
	}
	private JLabel getLblTest() {
		if (lblTest == null) {
			lblTest = new JLabel("");
			lblTest.setBounds(32, 27, 216, 23);
		}
		return lblTest;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("1");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblTest.setText("1을 클릭하였습니다.");
					
				}
			});
			btnNewButton_1.setBounds(12, 167, 97, 23);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("2");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblTest.setText("2를 클릭하였습니다.");
				}
			});
			btnNewButton_2.setBounds(166, 167, 97, 23);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("3");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lblTest.setText("3을 클릭하였습니다.");
				}
			});
			btnNewButton_3.setBounds(325, 167, 97, 23);
		}
		return btnNewButton_3;
	}
}
