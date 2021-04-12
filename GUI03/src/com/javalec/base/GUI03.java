package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;

public class GUI03 {

	private JFrame frmCheckboxRadiobutton;
	private JCheckBox chApple;
	private JCheckBox chBanana;
	private JButton btnFruit;
	private JTextField tfFruit;
	private JRadioButton rbKBS;
	private JRadioButton rbMBC;
	private JButton btnBroad;
	private JTextField tfBroad;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03 window = new GUI03();
					window.frmCheckboxRadiobutton.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckboxRadiobutton = new JFrame();
		frmCheckboxRadiobutton.setTitle("CheckBox / RadioButton");
		frmCheckboxRadiobutton.setBounds(100, 100, 450, 300);
		frmCheckboxRadiobutton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckboxRadiobutton.getContentPane().setLayout(null);
		frmCheckboxRadiobutton.getContentPane().add(getChApple());
		frmCheckboxRadiobutton.getContentPane().add(getChBanana());
		frmCheckboxRadiobutton.getContentPane().add(getBtnFruit());
		frmCheckboxRadiobutton.getContentPane().add(getTfFruit());
		frmCheckboxRadiobutton.getContentPane().add(getRbKBS());
		frmCheckboxRadiobutton.getContentPane().add(getRbMBC());
		frmCheckboxRadiobutton.getContentPane().add(getBtnBroad());
		frmCheckboxRadiobutton.getContentPane().add(getTfBroad());
	}
	private JCheckBox getChApple() {
		if (chApple == null) {
			chApple = new JCheckBox("Apple");
			chApple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();//버튼 없어도 체크하면 출력된다.
				}
			});
			chApple.setBounds(13, 23, 115, 23);
		}
		return chApple;
	}
	private JCheckBox getChBanana() {
		if (chBanana == null) {
			chBanana = new JCheckBox("Banana");
			chBanana.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();//버튼 없어도 체크하면 출력된다.
				}
			});
			chBanana.setBounds(13, 75, 115, 23);
		}
		return chBanana;
	}
	private JButton getBtnFruit() {
		if (btnFruit == null) {
			btnFruit = new JButton("OK");
			btnFruit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitCheck();//버튼 누르면 출력된다.
				}
			});
			btnFruit.setBounds(13, 134, 97, 23);
		}
		return btnFruit;
	}
	private JTextField getTfFruit() {
		if (tfFruit == null) {
			tfFruit = new JTextField();
			tfFruit.setBounds(12, 193, 195, 21);
			tfFruit.setColumns(10);
		}
		return tfFruit;
	}
	private void fruitCheck() {
		tfFruit.setText("");// 초기값 출력
		
		if(chApple.isSelected()==true) {
			tfFruit.setText("Apple이 선택 되었습니다.");
		}
		if(chBanana.isSelected()==true){
			tfFruit.setText("Banana가 선택 되었습니다.");
		}
		if((chBanana.isSelected()==true)&&(chApple.isSelected()==true)){
			tfFruit.setText("Apple과 Banana가 선택 되었습니다.");
		}
		
	}
	private JRadioButton getRbKBS() {
		if (rbKBS == null) {
			rbKBS = new JRadioButton("KBS");
			buttonGroup.add(rbKBS);
			rbKBS.setBounds(219, 23, 115, 23);
		}
		return rbKBS;
	}
	private JRadioButton getRbMBC() {
		if (rbMBC == null) {
			rbMBC = new JRadioButton("MBC");
			buttonGroup.add(rbMBC);
			rbMBC.setBounds(219, 75, 121, 23);
		}
		return rbMBC;
	}
	private JButton getBtnBroad() {
		if (btnBroad == null) {
			btnBroad = new JButton("OK");
			btnBroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadCheck();
				}
			});
			btnBroad.setBounds(219, 134, 97, 23);
		}
		return btnBroad;
	}
	private JTextField getTfBroad() {
		if (tfBroad == null) {
			tfBroad = new JTextField();
			tfBroad.setBounds(219, 193, 195, 21);
			tfBroad.setColumns(10);
		}
		return tfBroad;
	}
	private void broadCheck() {
		tfBroad.setText("");
		
		if(rbKBS.isSelected()==true) {
			tfBroad.setText("KBS가 선택 되었습니다.");
		}
		if(rbMBC.isSelected()==true) {
			tfBroad.setText("MBC가 선택 되었습니다.");
		}
		
	}
}
