package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class GUI05EX01 {

	private JFrame frame;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn0;
	private JButton btnResult;
	private JButton btnAdd;
	private JTextField tfCalc;
	
	String numView = "";
	int numResult = 0;
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	private JButton btnSub;
	private JButton btnMul;
	private JButton btnDiv;
	private JButton btnAc;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI05EX01 window = new GUI05EX01();
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
	public GUI05EX01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 346, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getBtn7());
		frame.getContentPane().add(getBtn8());
		frame.getContentPane().add(getBtn9());
		frame.getContentPane().add(getBtn4());
		frame.getContentPane().add(getBtn5());
		frame.getContentPane().add(getBtn6());
		frame.getContentPane().add(getBtn1());
		frame.getContentPane().add(getBtn2());
		frame.getContentPane().add(getBtn3());
		frame.getContentPane().add(getBtn0());
		frame.getContentPane().add(getBtnResult());
		frame.getContentPane().add(getBtnAdd());
		frame.getContentPane().add(getTfCalc());
		frame.getContentPane().add(getBtnSub());
		frame.getContentPane().add(getBtnMul());
		frame.getContentPane().add(getBtnDiv());
		frame.getContentPane().add(getBtnAc());
	}

	private JButton getBtn7() {
		if (btn7 == null) {
			btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					numView += btn7.getText();
					tfCalc.setText(numView);
				}
			});
			btn7.setFont(new Font("굴림", Font.BOLD, 20));
			btn7.setBounds(12, 117, 68, 65);
		}
		return btn7;
	}
	private JButton getBtn8() {
		if (btn8 == null) {
			btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					numView += btn8.getText();
					tfCalc.setText(numView);
				}
			});
			btn8.setFont(new Font("굴림", Font.BOLD, 20));
			btn8.setBounds(92, 117, 68, 65);
		}
		return btn8;
	}
	private JButton getBtn9() {
		if (btn9 == null) {
			btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					numView += btn9.getText();
					tfCalc.setText(numView);
				}
			});
			btn9.setFont(new Font("굴림", Font.BOLD, 20));
			btn9.setBounds(172, 117, 68, 65);
		}
		return btn9;
	}
	private JButton getBtn4() {
		if (btn4 == null) {
			btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					numView += btn4.getText();
					tfCalc.setText(numView);
				}
			});
			btn4.setFont(new Font("굴림", Font.BOLD, 20));
			btn4.setBounds(12, 194, 68, 65);
		}
		return btn4;
	}
	private JButton getBtn5() {
		if (btn5 == null) {
			btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					numView += btn5.getText();
					tfCalc.setText(numView);
				}
			});
			btn5.setFont(new Font("굴림", Font.BOLD, 20));
			btn5.setBounds(92, 194, 68, 65);
		}
		return btn5;
	}
	private JButton getBtn6() {
		if (btn6 == null) {
			btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					numView += btn6.getText();
					tfCalc.setText(numView);
				}
			});
			btn6.setFont(new Font("굴림", Font.BOLD, 20));
			btn6.setBounds(172, 194, 68, 65);
		}
		return btn6;
	}
	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					numView += btn1.getText();
					tfCalc.setText(numView);
				}
			});
			btn1.setFont(new Font("굴림", Font.BOLD, 20));
			btn1.setBounds(12, 271, 68, 65);
		}
		return btn1;
	}
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					numView += btn2.getText();
					tfCalc.setText(numView);
				}
			});
			btn2.setFont(new Font("굴림", Font.BOLD, 20));
			btn2.setBounds(92, 271, 68, 65);
		}
		return btn2;
	}
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					numView += btn3.getText();
					tfCalc.setText(numView);
				}
			});
			btn3.setFont(new Font("굴림", Font.BOLD, 20));
			btn3.setBounds(172, 271, 68, 65);
		}
		return btn3;
	}
	private JButton getBtn0() {
		if (btn0 == null) {
			btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (tfCalc.getText().equals("")) {
						
					}else {
						numView += btn0.getText();
						tfCalc.setText(numView);
					}
				}
			});
			btn0.setFont(new Font("굴림", Font.BOLD, 20));
			btn0.setBounds(12, 348, 68, 65);
		}
		return btn0;
	}
	private JButton getBtnResult() {
		if (btnResult == null) {
			btnResult = new JButton("=");
			btnResult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					numResult = Integer.parseInt(tfCalc.getText());
					for(int i = 0;i<arrayList.size();i++) {
						numResult += arrayList.get(i);
						
					}
					tfCalc.setText(Integer.toString(numResult));
					arrayList.clear();
					
				}
			});
			btnResult.setFont(new Font("굴림", Font.BOLD, 20));
			btnResult.setBounds(172, 348, 68, 65);
		}
		return btnResult;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("+");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					arrayList.add(Integer.parseInt(numView));
					tfCalc.setText(null);
					numView = "";
					
				}
			});
			btnAdd.setFont(new Font("굴림", Font.BOLD, 20));
			btnAdd.setBounds(252, 117, 68, 65);
		}
		return btnAdd;
	}
	private JTextField getTfCalc() {
		if (tfCalc == null) {
			tfCalc = new JTextField();
			tfCalc.setHorizontalAlignment(SwingConstants.RIGHT);
			tfCalc.setFont(new Font("굴림", Font.PLAIN, 20));
			tfCalc.setBounds(12, 36, 305, 71);
			tfCalc.setColumns(10);
		}
		return tfCalc;
	}
//	private void numAction() {
//			
//			tfCalc.setText(numView);
//		
//	}
	private JButton getBtnSub() {
		if (btnSub == null) {
			btnSub = new JButton("-");
			btnSub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnSub.setFont(new Font("굴림", Font.BOLD, 20));
			btnSub.setBounds(252, 194, 68, 65);
		}
		return btnSub;
	}
	private JButton getBtnMul() {
		if (btnMul == null) {
			btnMul = new JButton("*");
			btnMul.setFont(new Font("굴림", Font.BOLD, 20));
			btnMul.setBounds(252, 271, 68, 65);
		}
		return btnMul;
	}
	private JButton getBtnDiv() {
		if (btnDiv == null) {
			btnDiv = new JButton("/");
			btnDiv.setFont(new Font("굴림", Font.BOLD, 20));
			btnDiv.setBounds(252, 348, 68, 65);
		}
		return btnDiv;
	}
	private JButton getBtnAc() {
		if (btnAc == null) {
			btnAc = new JButton("AC");
			btnAc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tfCalc.setText("");
					arrayList.clear();
					numView = "";
				}
			});
			btnAc.setFont(new Font("굴림", Font.BOLD, 20));
			btnAc.setBounds(92, 348, 68, 65);
		}
		return btnAc;
	}
}
