package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI04 {

	private JFrame frmPasswordfield;
	private JTextField tfMessage;
	private JLabel lblNewLabel;
	private JButton btnOK;
	private JPasswordField pfInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI04 window = new GUI04();
					window.frmPasswordfield.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPasswordfield = new JFrame();
		frmPasswordfield.setTitle("PasswordField");
		frmPasswordfield.setBounds(100, 100, 450, 300);
		frmPasswordfield.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPasswordfield.getContentPane().setLayout(null);
		frmPasswordfield.getContentPane().add(getTfMessage());
		frmPasswordfield.getContentPane().add(getLblNewLabel());
		frmPasswordfield.getContentPane().add(getBtnOK());
		frmPasswordfield.getContentPane().add(getPfInput());
	}
	private JTextField getTfMessage() {
		if (tfMessage == null) {
			tfMessage = new JTextField();
			tfMessage.setBounds(94, 95, 116, 21);
			tfMessage.setColumns(10);
		}
		return tfMessage;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password");
			lblNewLabel.setBounds(12, 34, 70, 15);
		}
		return lblNewLabel;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checkPassword();
				}
			});
			btnOK.setBounds(241, 30, 97, 23);
		}
		return btnOK;
	}
	private JPasswordField getPfInput() {
		if (pfInput == null) {
			pfInput = new JPasswordField();
			pfInput.setBounds(94, 31, 116, 21);
		}
		return pfInput;
	}
	
	private void checkPassword() {
		char[] str = pfInput.getPassword();
		String passString = new String(str);
		tfMessage.setText(passString);
	}
}
