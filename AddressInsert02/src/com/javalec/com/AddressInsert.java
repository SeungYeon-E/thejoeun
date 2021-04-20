package com.javalec.com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class AddressInsert {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField tfName;
	private JButton btnOK;
	
	//Database 환경 정의
	private final String url_mysql = "jdbc:mysql://192.168.0.4/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";
	
	
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField tfTellNo;
	private JTextField tfAddress;
	private JTextField tfEmail;
	private JTextField tfRelation;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressInsert window = new AddressInsert();
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
	public AddressInsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("주소록 등록");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getBtnOK());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getTfTellNo());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getTfRelation());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("성명:");
			lblNewLabel.setBounds(24, 25, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setBounds(87, 21, 116, 21);
			tfName.setColumns(10);
		}
		return tfName;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("입력");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i_chk = insertFieldCheck();
					if(i_chk == 0) {
						insertAction();
					}
				}
			});
			btnOK.setBounds(313, 228, 97, 23);
		}
		return btnOK;
	}
	
	private int insertFieldCheck() {
		
		int i = 0;
		String message = "";
		
		if (tfName.getText().trim().length() == 0) {
			i++;
			message = "이름을 ";
			tfName.requestFocus();//커서 이동
		}
		if (tfTellNo.getText().trim().length() == 0) {
			i++;
			message = "전화번호을 ";
			tfTellNo.requestFocus();//커서 이동
		}
		if (tfAddress.getText().trim().length() == 0) {
			i++;
			message = "주소를 ";
			tfAddress.requestFocus();//커서 이동
		}
		if (tfEmail.getText().trim().length() == 0) {
			i++;
			message = "전자우편을 ";
			tfEmail.requestFocus();//커서 이동
		}
		if (tfRelation.getText().trim().length() == 0) {
			i++;
			message = "관계를 ";
			tfRelation.requestFocus();//커서 이동
		}
		
		if(i>0) {
			JOptionPane.showMessageDialog(null, message + "입력하시기 바랍니다.");
		}
		
		return i;
		
	}
	
	private void insertAction()	{ //사용자 정보 입력 버튼

		
		PreparedStatement ps = null;//select 이런거 모른다
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			//여기만 변경될거야
//			String query = "insert into userinfo (name, telno, address, email, relation) values (?, ?, ?, ?, ?)"; //? 쓰기위해 프리페어 선언 ?에 입력창에 들어갈것
//			ps = conn_mysql.prepareStatement(query); //컴파일전에 자바로 바꿔줘
			
			
//			강사님
			String query = "insert into userinfo (name, telno, address, email, relation)";
			String query1 = "values (?, ?, ?, ?, ?)";
			ps = conn_mysql.prepareStatement(query + query1); //컴파일전에 자바로 바꿔줘
			
			
			ps.setString(1, tfName.getText().trim());
			ps.setString(2, tfTellNo .getText().trim());
			ps.setString(3, tfAddress.getText().trim());
			ps.setString(4, tfEmail.getText().trim());
			ps.setString(5, tfRelation.getText().trim());
			ps.executeUpdate();//입력되면 업데이트된다
			
			conn_mysql.close();// 사용후 데이터베이스 연결 끊음
			
			JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 입력되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		
	}
	
	
	
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("전화번호:");
			lblNewLabel_1.setBounds(24, 67, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("주소:");
			lblNewLabel_2.setBounds(24, 112, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("전자우편:");
			lblNewLabel_3.setBounds(24, 154, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("관계:");
			lblNewLabel_4.setBounds(24, 198, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getTfTellNo() {
		if (tfTellNo == null) {
			tfTellNo = new JTextField();
			tfTellNo.setBounds(87, 64, 218, 21);
			tfTellNo.setColumns(10);
		}
		return tfTellNo;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setBounds(87, 109, 323, 21);
			tfAddress.setColumns(10);
		}
		return tfAddress;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setBounds(87, 151, 218, 21);
			tfEmail.setColumns(10);
		}
		return tfEmail;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setBounds(87, 195, 323, 21);
			tfRelation.setColumns(10);
		}
		return tfRelation;
	}
} //-----
