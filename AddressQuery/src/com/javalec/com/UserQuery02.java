package com.javalec.com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class UserQuery02 {

	private JFrame frame;
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnQuery;
	private JScrollPane scrollPane;
	private JTable Inner_Table;
	private JLabel lblNewLabel;
	private JTextField tfSeqno;
	private JLabel lblNewLabel_1;
	private JTextField tfName;
	private JLabel lblNewLabel_2;
	private JTextField tfTelno;
	private JLabel lblNewLabel_3;
	private JTextField tfAddress;
	private JLabel lblNewLabel_4;
	private JTextField tfEmail;
	private JLabel lblNewLabel_5;
	private JTextField tfRelation;
	private JTextField tfCount;
	private JLabel lblNewLabel_6;
	private JButton btnOK;
	private JRadioButton rdbtnInsert;
	private JRadioButton rdbtnUpdate;
	private JRadioButton rdbtnDelete;
	private JRadioButton rdbtnSearch;
	
	//Database 환경 정의
	private final String url_mysql = "jdbc:mysql://192.168.2.2/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";
		
	//Table 환경 정의
	private final DefaultTableModel Outer_Table = new DefaultTableModel(); // 
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserQuery02 window = new UserQuery02();
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
	public UserQuery02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				tableInit();
				searchAction();
			}
		});
		frame.setTitle("주소록 검색");
		frame.setBounds(100, 100, 453, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbSelection());
		frame.getContentPane().add(getTfSelection());
		frame.getContentPane().add(getBtnQuery());
		frame.getContentPane().add(getScrollPane());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfSeqno());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getTfTelno());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLblNewLabel_5());
		frame.getContentPane().add(getTfRelation());
		frame.getContentPane().add(getTfCount());
		frame.getContentPane().add(getLblNewLabel_6());
		frame.getContentPane().add(getBtnOK());
		frame.getContentPane().add(getRdbtnInsert());
		frame.getContentPane().add(getRdbtnUpdate());
		frame.getContentPane().add(getRdbtnDelete());
		frame.getContentPane().add(getRdbtnSearch());
	}
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "관계"}));
			cbSelection.setBounds(22, 45, 78, 23);
		}
		return cbSelection;
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(112, 46, 212, 21);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}
	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					conditionQuery();
				}
			});
			btnQuery.setBounds(336, 45, 78, 23);
		}
		return btnQuery;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 78, 392, 166);
			scrollPane.setViewportView(getInner_Table());
		}
		return scrollPane;
	}
	private JTable getInner_Table() {
		if (Inner_Table == null) {
			Inner_Table = new JTable();
			Inner_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tableClick();
				}
			});
			Inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			Inner_Table.setModel(Outer_Table); // 같이 연결 시켜주기
			
			
		}
		return Inner_Table;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Seq No :");
			lblNewLabel.setBounds(22, 277, 57, 15);
		}
		return lblNewLabel;
	}
	private JTextField getTfSeqno() {
		if (tfSeqno == null) {
			tfSeqno = new JTextField();
			tfSeqno.setEditable(false);
			tfSeqno.setBounds(91, 271, 57, 21);
			tfSeqno.setColumns(10);
		}
		return tfSeqno;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("이름 :");
			lblNewLabel_1.setBounds(22, 307, 57, 15);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setEditable(false);
			tfName.setColumns(10);
			tfName.setBounds(91, 304, 116, 21);
		}
		return tfName;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("전화번호 :");
			lblNewLabel_2.setBounds(22, 340, 57, 15);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setEditable(false);
			tfTelno.setColumns(10);
			tfTelno.setBounds(91, 338, 116, 21);
		}
		return tfTelno;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("주소 :");
			lblNewLabel_3.setBounds(22, 376, 57, 15);
		}
		return lblNewLabel_3;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setEditable(false);
			tfAddress.setColumns(10);
			tfAddress.setBounds(91, 372, 323, 21);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("전자우편 :");
			lblNewLabel_4.setBounds(22, 413, 57, 15);
		}
		return lblNewLabel_4;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setEditable(false);
			tfEmail.setColumns(10);
			tfEmail.setBounds(91, 406, 197, 21);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("관계 :");
			lblNewLabel_5.setBounds(22, 444, 57, 15);
		}
		return lblNewLabel_5;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setEditable(false);
			tfRelation.setColumns(10);
			tfRelation.setBounds(91, 440, 197, 21);
		}
		return tfRelation;
	}
	
	
	private JTextField getTfCount() {
		if (tfCount == null) {
			tfCount = new JTextField();
			tfCount.setEditable(false);
			tfCount.setBounds(355, 254, 35, 21);
			tfCount.setColumns(10);
		}
		return tfCount;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("명");
			lblNewLabel_6.setBounds(392, 257, 22, 15);
		}
		return lblNewLabel_6;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonAction();
				}
			});
			btnOK.setBounds(317, 472, 97, 23);
		}
		return btnOK;
	}
	
	private JRadioButton getRdbtnInsert() {
		if (rdbtnInsert == null) {
			rdbtnInsert = new JRadioButton("입력");
			rdbtnInsert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbclickAction();
				}
			});
			buttonGroup_1.add(rdbtnInsert);
			rdbtnInsert.setBounds(22, 16, 57, 23);
		}
		return rdbtnInsert;
	}
	private JRadioButton getRdbtnUpdate() {
		if (rdbtnUpdate == null) {
			rdbtnUpdate = new JRadioButton("수정");
			rdbtnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbclickAction();
				}
			});
			buttonGroup_1.add(rdbtnUpdate);
			rdbtnUpdate.setBounds(83, 16, 57, 23);
		}
		return rdbtnUpdate;
	}
	private JRadioButton getRdbtnDelete() {
		if (rdbtnDelete == null) {
			rdbtnDelete = new JRadioButton("삭제");
			rdbtnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbclickAction();
				}
			});
			buttonGroup_1.add(rdbtnDelete);
			rdbtnDelete.setBounds(144, 16, 49, 23);
		}
		return rdbtnDelete;
	}
	private JRadioButton getRdbtnSearch() {
		if (rdbtnSearch == null) {
			rdbtnSearch = new JRadioButton("검색");
			rdbtnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbclickAction();
				}
			});
			rdbtnSearch.setSelected(true);
			buttonGroup_1.add(rdbtnSearch);
			rdbtnSearch.setBounds(197, 16, 57, 23);
		}
		return rdbtnSearch;
	}
	
	//화면 Table 초기화
	private void tableInit() {
		
		Outer_Table.addColumn("순서");
		Outer_Table.addColumn("이름");
		Outer_Table.addColumn("전화번호");
		Outer_Table.addColumn("관계");
		Outer_Table.setColumnCount(4);
		
		//data지워주는 작업
		int i = Outer_Table.getRowCount();
		for(int j=0;j<i;j++) { //데이타가 땡겨지는 for문
			Outer_Table.removeRow(0); //0번을 지운다
		}
		
		Inner_Table.setAutoResizeMode(Inner_Table.AUTO_RESIZE_OFF); //table 사이즈 못줄임
		
		//순서정의
		int vColIndex = 0; 
		TableColumn col = Inner_Table.getColumnModel().getColumn(vColIndex);
		int width = 30;
		col.setPreferredWidth(width);
		
		vColIndex = 1; 
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);
		
		vColIndex = 2; 
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);
		
		
		vColIndex = 3; 
		col = Inner_Table.getColumnModel().getColumn(vColIndex);
		width = 200;
		col.setPreferredWidth(width);
		
		
	}
	
	//첫 메인화면 출력
	private void searchAction() {
		
		
		int datacount = 0;
		String query = "select seqno, name, telno, relation from userinfo ";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query); //반환값이 필요한 Read의 경우는 resultset
			
			while(rs.next()) { //가져올게 있다 rs.next(false) 가져올거없다
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
				Outer_Table.addRow(qTxt);
				datacount++;
			}
			
			conn_mysql.close();// 사용후 데이터베이스 연결 끊음
			tfCount.setText(Integer.toString(datacount));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Table Clicked
	private void tableClick() {
		
		if(rdbtnInsert.isSelected()==true) {
			return;
		}
		
		
		int i = Inner_Table.getSelectedRow(); //클릭된 로우값 가져와
		String wkSeq = (String) Inner_Table.getValueAt(i, 0); //그 로우값의 0번의 값을 가져와
		
		String query = "select seqno, name, telno, address, email, relation from userinfo where seqno = ";
		JTextField[] tf = {tfSeqno, tfName, tfTelno, tfAddress, tfEmail, tfRelation};
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query + wkSeq); //반환값이 필요한 Read의 경우는 resultset 가져올거야
			
			if(rs.next()) { //쿼리에서 자바로 가져올게 있다 rs.next(false) 가져올거없다 while 문 안쓰고 if 문 써도된다. while문은 한번 더 비교하기 때문
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)};
				for(int j = 0;j<qTxt.length;j++) {
					tf[j].setText(qTxt[j]);
				}
				
			}
			
			conn_mysql.close();// 사용후 데이터베이스 연결 끊음
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//조건 검색
	private void conditionQuery() {
		int i = cbSelection.getSelectedIndex();
		String conditionQueryColumn = "";
		
		switch(i) {
		case 0:
			conditionQueryColumn = "name";
			break;
		case 1:
			conditionQueryColumn = "address";
			break;
		case 2:
			conditionQueryColumn = "relation";
			break;
		default:
			break;
		}
		
//		System.out.println(conditionQueryColumn);
		
		tableInit();
		clearColumn();
		conditionQueryAction(conditionQueryColumn);
		
	}
	
	// 검색한 데이터 출력
	private void conditionQueryAction(String columnName) {
		
		int datacount = 0;
		
		String query = "select seqno, name, telno, relation from userinfo where " + columnName ;
		String query1 = " like '%" + tfSelection.getText() + "%'" ;
		
//		System.out.println(query + query1);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query + query1); //반환값이 필요한 Read의 경우는 resultset
			
			while(rs.next()) { //가져올게 있다 rs.next(false) 가져올거없다
				String[] qTxt = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
				Outer_Table.addRow(qTxt);
				datacount++;
			}
			
			conn_mysql.close();// 사용후 데이터베이스 연결 끊음
			tfCount.setText(Integer.toString(datacount));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//모든 tf 클리어
	private void clearColumn() {
		
		tfSeqno.setText("");
		tfName.setText("");
		tfTelno.setText("");
		tfAddress.setText("");
		tfEmail.setText("");
		tfRelation.setText("");
		tfCount.setText("");
		
	}
	
	//db 삭제
	private void deleteAction()	{
		
		int i = Inner_Table.getSelectedRow(); //클릭된 로우값 가져와
		if(i==-1) {
			JOptionPane.showMessageDialog(null, "선택해주세요");
			return;
		}
		
		String wkSeq = (String) Inner_Table.getValueAt(i, 0); //그 로우값의 0번의 값을 가져와
		
		PreparedStatement ps = null;//select 이런거 모른다 , 연결된 db에 sql문 실행시키도록 하는거임,  //Create Read Update Delete 반환값 없이 입력만 하는거는 preparedStatemen
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			//	여기만 변경될거야
			String query = "delete from userinfo where seqno = " + wkSeq; //? 쓰기위해 프리페어 선언 ?에 입력창에 들어갈것
			ps = conn_mysql.prepareStatement(query); //컴파일전에 자바로 바꿔줘
			
			ps.executeUpdate();
			
			conn_mysql.close();// 사용후 데이터베이스 연결 끊음
			
			JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 삭제되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		tableInit();
		clearColumn();
		searchAction();
		

	}
	
	//db 수정
	private void updateAction()	{ //사용자 정보 입력 버튼
		
		JTextField[] tf = {tfName, tfTelno, tfAddress, tfEmail, tfRelation};
		JLabel[] lb = {lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4};
		String[] starray = new String[5] ;
		
		//라벨값 불러와서 출력
		for(int i =0;i<tf.length;i++) {
			if(tf[i].getText().trim().equals("")) {
				String labelTest = lb[i].getText().toString();// 스트링값으로 받아와야해
				JOptionPane.showMessageDialog(null, labelTest.substring(0, labelTest.length()-1) + "를 입력하시기 바랍니다.");
				tf[i].requestFocus();
				return;
			}
		}
		
		int i = Inner_Table.getSelectedRow(); //클릭된 로우값 가져와
		String wkSeq = (String) Inner_Table.getValueAt(i, 0); //그 로우값의 0번의 값을 가져와
		
		for(int j =0;j<tf.length;j++) {
			starray[j] = tf[j].getText().trim();
		}
		
		PreparedStatement ps = null;//select 이런거 모른다 , 연결된 db에 sql문 실행시키도록 하는거임,  //Create Read Update Delete 반환값 없이 입력만 하는거는 preparedStatemen
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			String query = "update userinfo set name = '" + starray[0] + "', telno = '" + starray[1] + "', address = '" + starray[2] + "', email = '" + starray[3] + "', relation = '" + starray[4] + "'where seqno = " + wkSeq;
			ps = conn_mysql.prepareStatement(query); //컴파일전에 자바로 바꿔줘
			
			ps.executeUpdate();//입력되면 업데이트된다
			conn_mysql.close();// 사용후 데이터베이스 연결 끊음
			
			JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 수정되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		tableInit();
		clearColumn();
		searchAction();

		
	}
	
	// db 입력
	private void insertAction() {
		
		JTextField[] tf = {tfName, tfTelno, tfAddress, tfEmail, tfRelation};
		JLabel[] lb = {lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4};
		
		//라벨값 불러와서 출력
		for(int i =0;i<tf.length;i++) {
			if(tf[i].getText().trim().equals("")) {
				String labelTest = lb[i].getText().toString();// 스트링값으로 받아와야해
				JOptionPane.showMessageDialog(null, labelTest.substring(0, labelTest.length()-1) + "를 입력하시기 바랍니다.");
				tf[i].requestFocus();
				return;
			}
		}
		
		PreparedStatement ps = null;//select 이런거 모른다 , 연결된 db에 sql문 실행시키도록 하는거임,  //Create Read Update Delete 반환값 없이 입력만 하는거는 preparedStatemen
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			//여기만 변경될거야
			String query = "insert into userinfo (name, telno, address, email, relation) values (?, ?, ?, ?, ?)"; //? 쓰기위해 프리페어 선언 ?에 입력창에 들어갈것
			ps = conn_mysql.prepareStatement(query); //컴파일전에 자바로 바꿔줘
			
			ps.setString(1, tfName.getText().trim());
			ps.setString(2, tfTelno .getText().trim());
			ps.setString(3, tfAddress.getText().trim());
			ps.setString(4, tfEmail.getText().trim());
			ps.setString(5, tfRelation.getText().trim());
			ps.executeUpdate();//입력되면 업데이트된다
			
			conn_mysql.close();// 사용후 데이터베이스 연결 끊음
			
			JOptionPane.showMessageDialog(null, tfName.getText() + "님의 정보가 입력되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		tableInit();
		clearColumn();
		searchAction();
		
	}

	private void rdbclickAction() {
		
		tfSelection.setText("");
		
		if (rdbtnInsert.isSelected()==true) {
			tfName.setEditable(true);
			tfTelno.setEditable(true);
			tfAddress.setEditable(true);
			tfEmail.setEditable(true);
			tfRelation.setEditable(true);
			btnQuery.setEnabled(false);
			
		}else if (rdbtnUpdate.isSelected()==true) {
			tfName.setEditable(true);
			tfTelno.setEditable(true);
			tfAddress.setEditable(true);
			tfEmail.setEditable(true);
			tfRelation.setEditable(true);
			btnQuery.setEnabled(true);
			
		}else if (rdbtnDelete.isSelected()==true) {
			tfName.setEditable(false);
			tfTelno.setEditable(false);
			tfAddress.setEditable(false);
			tfEmail.setEditable(false);
			tfRelation.setEditable(false);
			btnQuery.setEnabled(true);
			
		}else if (rdbtnSearch.isSelected()==true) {
			tfName.setEditable(false);
			tfTelno.setEditable(false);
			tfAddress.setEditable(false);
			tfEmail.setEditable(false);
			tfRelation.setEditable(false);
			btnQuery.setEnabled(true);
		}
		
		tableInit();
		clearColumn();
		searchAction();
		
	}
	
	private void buttonAction() {
		
		if (rdbtnInsert.isSelected()==true) {
			insertAction();
		}else if (rdbtnUpdate.isSelected()==true) {
			updateAction();
		}else if (rdbtnDelete.isSelected()==true) {
			deleteAction();
		}
		
		tableInit();
		clearColumn();
		searchAction();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}//--------------
