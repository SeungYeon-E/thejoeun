package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI07Ex {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfUser;
	private JPasswordField pfPassword;
	private JButton btnOK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI07Ex window = new GUI07Ex();
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
	public GUI07Ex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 418, 177);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfUser());
		frame.getContentPane().add(getPfPassword());
		frame.getContentPane().add(getBtnOK());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("User");
			lblNewLabel.setBounds(34, 37, 57, 15);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Password");
			lblNewLabel_1.setBounds(34, 81, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfUser() {
		if (tfUser == null) {
			tfUser = new JTextField();
			tfUser.setBounds(118, 34, 116, 21);
			tfUser.setColumns(10);
		}
		return tfUser;
	}
	private JPasswordField getPfPassword() {
		if (pfPassword == null) {
			pfPassword = new JPasswordField();
			pfPassword.setBounds(118, 78, 116, 21);
		}
		return pfPassword;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					loginJD();
				}
			});
			btnOK.setBounds(267, 77, 97, 23);
		}
		return btnOK;
	}
	private void loginJD() {
		
		LoginJDialog jDialog = new LoginJDialog();
		
		String userid = tfUser.getText();
		char[] passchar = pfPassword.getPassword();
		String passstr = new String(passchar);
		
		
		
		if((userid.equals("abc")) && (passstr.equals("1234"))){
			jDialog.setVisible(true);
			
		}else {
			JOptionPane.showMessageDialog(null, "로그인 실패하였습니다.");
			
		}
		
	}
	
	
}
