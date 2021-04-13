package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI05 {

	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JSeparator separator;
	private JMenu mnNewMenu_2;
	private JMenuItem memuAdd;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResult;
	private JButton btnAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI05 window = new GUI05();
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
	public GUI05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(getMenuBar());
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getBtnAdd());
	}

	private JMenuBar getMenuBar() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_2());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("File");
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getSeparator());
			mnNewMenu.add(getMntmNewMenuItem_1());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Open");
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("Exit");
		}
		return mntmNewMenuItem_1;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
		}
		return separator;
	}
	private JMenu getMnNewMenu_2() {
		if (mnNewMenu_2 == null) {
			mnNewMenu_2 = new JMenu("Calc");
			mnNewMenu_2.add(getMemuAdd());
		}
		return mnNewMenu_2;
	}
	private JMenuItem getMemuAdd() {
		if (memuAdd == null) {
			memuAdd = new JMenuItem("Add");
			memuAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction();
				}
			});
		}
		return memuAdd;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum1.setBounds(24, 25, 116, 21);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum2.setBounds(24, 74, 116, 21);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setEditable(false);
			tfResult.setBounds(24, 126, 116, 21);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("Add");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					addAction();
					
				}
			});
			btnAdd.setBounds(173, 125, 97, 23);
		}
		return btnAdd;
	}
	private void addAction() {
		int num1 = Integer.parseInt(tfNum1.getText());
		int num2 = Integer.parseInt(tfNum2.getText());
		
	
		tfResult.setText(Integer.toString(num1 + num2));
		
		
	}
	
}
