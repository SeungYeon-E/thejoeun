package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI04EX01 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfUser;
	private JPasswordField tfPassword;
	private JButton btnOK;
	private JTextField tfMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI04EX01 window = new GUI04EX01();
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
	public GUI04EX01() {
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
		frame.getContentPane().add(getTfUser());
		frame.getContentPane().add(getTfPassword());
		frame.getContentPane().add(getBtnOK());
		frame.getContentPane().add(getTfMessage());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("User");
			lblNewLabel.setBounds(51, 55, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Password");
			lblNewLabel_1.setBounds(51, 114, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfUser() {
		if (tfUser == null) {
			tfUser = new JTextField();
			tfUser.setBounds(145, 52, 116, 21);
			tfUser.setColumns(10);
		}
		return tfUser;
	}
	private JPasswordField getTfPassword() {
		if (tfPassword == null) {
			tfPassword = new JPasswordField();
			tfPassword.setBounds(145, 111, 116, 21);
		}
		return tfPassword;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					userLogin();
					
				}
			});
			btnOK.setBounds(301, 110, 97, 23);
		}
		return btnOK;
	}
	private JTextField getTfMessage() {
		if (tfMessage == null) {
			tfMessage = new JTextField();
			tfMessage.setBounds(51, 193, 237, 21);
			tfMessage.setColumns(10);
		}
		return tfMessage;
	}
	private void userLogin() {
		
		String userInput = tfUser.getText();
		char[] passchar = tfPassword.getPassword();  
		String passInput = new String(passchar);
		
		
		if((userInput.equals("abc")) && (passInput.equals("1234"))){
			tfMessage.setText("로그인 되었습니다.");
			
		}else {
			tfMessage.setText("다시 입력해주시기 바랍니다.");
			
		}
	}
}
