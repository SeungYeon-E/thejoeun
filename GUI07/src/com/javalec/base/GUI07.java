package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI07 {

	private JFrame frmMain;
	private JButton btnHelp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI07 window = new GUI07();
					window.frmMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMain = new JFrame();
		frmMain.setTitle("Main");
		frmMain.setBounds(100, 100, 450, 300);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.getContentPane().setLayout(null);
		frmMain.getContentPane().add(getBtnHelp());
	}

	private JButton getBtnHelp() {
		if (btnHelp == null) {
			btnHelp = new JButton("Help");
			btnHelp.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Help help = new Help();
					help.setVisible(true);
				}
			});
			btnHelp.setBounds(325, 20, 97, 23);
		}
		return btnHelp;
	}
}
