package com.khankong.address;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.khankong.function.Bean;
import com.khankong.function.DbAction;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Address extends JFrame {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	@SuppressWarnings("rawtypes")
	private JComboBox cbSelection;
	private JTextField tfSelection;
	private JButton btnQuery;
	private JScrollPane scrollPane;
	private JTable Inner_Table;
	// --- Database & Table
	private final DefaultTableModel Outer_Table = new DefaultTableModel(); // ################
    // -----
    private JLabel lblSequenceNo;
    private JLabel label;
    private JLabel label_1;
    private JLabel label_2;
    private JLabel label_3;
    private JLabel label_4;
    private JTextField tfSeqno;
    private JTextField tfName;
    private JTextField tfTelno;
    private JTextField tfAddress;
    private JTextField tfEmail;
    private JTextField tfRelation;
    private JButton btnOK;
    private JRadioButton rbInsert;
    private JRadioButton rbUpdate;
    private JRadioButton rbDelete;
    private JRadioButton rbQuery;
    private final ButtonGroup buttonGroup = new ButtonGroup();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Address frame = new Address();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Address() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				TableInit();
				SearchAction();
				ScreenPartition();
			}
		});
		setTitle("주소록");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 477, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getCbSelection());
		contentPane.add(getTfSelection());
		contentPane.add(getBtnQuery());
		contentPane.add(getScrollPane());
		
		lblSequenceNo = new JLabel("Sequence No :");
		lblSequenceNo.setBounds(29, 229, 101, 16);
		contentPane.add(lblSequenceNo);
		
		label = new JLabel("이름 :");
		label.setBounds(29, 267, 61, 16);
		contentPane.add(label);
		
		label_1 = new JLabel("전화번호 :");
		label_1.setBounds(29, 306, 61, 16);
		contentPane.add(label_1);
		
		label_2 = new JLabel("주소 :");
		label_2.setBounds(29, 343, 61, 16);
		contentPane.add(label_2);
		
		label_3 = new JLabel("전자우편");
		label_3.setBounds(29, 381, 61, 16);
		contentPane.add(label_3);
		
		label_4 = new JLabel("관계 :");
		label_4.setBounds(29, 418, 61, 16);
		contentPane.add(label_4);
		
		tfSeqno = new JTextField();
		tfSeqno.setEditable(false);
		tfSeqno.setBounds(129, 224, 67, 26);
		contentPane.add(tfSeqno);
		tfSeqno.setColumns(10);
		
		tfName = new JTextField();
		tfName.setBounds(129, 262, 95, 26);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfTelno = new JTextField();
		tfTelno.setBounds(129, 301, 130, 26);
		contentPane.add(tfTelno);
		tfTelno.setColumns(10);
		
		tfAddress = new JTextField();
		tfAddress.setBounds(129, 338, 301, 26);
		contentPane.add(tfAddress);
		tfAddress.setColumns(10);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(129, 376, 207, 26);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);
		
		tfRelation = new JTextField();
		tfRelation.setBounds(129, 413, 301, 26);
		contentPane.add(tfRelation);
		tfRelation.setColumns(10);
		
		btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActionPartition();
			}
		});
		btnOK.setBounds(313, 451, 117, 29);
		contentPane.add(btnOK);
		
		rbInsert = new JRadioButton("입력");
		rbInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScreenPartition();
			}
		});
		buttonGroup.add(rbInsert);
		rbInsert.setBounds(22, 19, 61, 23);
		contentPane.add(rbInsert);
		
		rbUpdate = new JRadioButton("수정");
		rbUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScreenPartition();
			}
		});
		buttonGroup.add(rbUpdate);
		rbUpdate.setBounds(83, 19, 61, 23);
		contentPane.add(rbUpdate);
		
		rbDelete = new JRadioButton("삭제");
		rbDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScreenPartition();
			}
		});
		buttonGroup.add(rbDelete);
		rbDelete.setBounds(147, 19, 61, 23);
		contentPane.add(rbDelete);
		
		rbQuery = new JRadioButton("검색");
		buttonGroup.add(rbQuery);
		rbQuery.setSelected(true);
		rbQuery.setBounds(206, 18, 67, 23);
		contentPane.add(rbQuery);
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JComboBox getCbSelection() {
		if (cbSelection == null) {
			cbSelection = new JComboBox();
			cbSelection.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "관계"}));
			cbSelection.setBounds(29, 54, 88, 27);
		}
		return cbSelection;
	}
	private JTextField getTfSelection() {
		if (tfSelection == null) {
			tfSelection = new JTextField();
			tfSelection.setBounds(129, 53, 188, 26);
			tfSelection.setColumns(10);
		}
		return tfSelection;
	}
	private JButton getBtnQuery() {
		if (btnQuery == null) {
			btnQuery = new JButton("검색");
			btnQuery.setToolTipText("조건 검색 입니다");
			btnQuery.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ConditionQuery();
				}
			});
			btnQuery.setBounds(329, 53, 101, 29);
		}
		return btnQuery;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(29, 93, 401, 124);
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
					if (e.getButton() == 1){
						TableClick();
					}
				}
			});
			Inner_Table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			Inner_Table.setModel(Outer_Table); // <--***************************************************
		}
		return Inner_Table;
	}
	
// -------------------
	// Table 초기화
	@SuppressWarnings("static-access")
	private void TableInit(){
        int i = Outer_Table.getRowCount();
        
        Outer_Table.addColumn("Seq.");
        Outer_Table.addColumn("이름");
        Outer_Table.addColumn("전화번호");
        Outer_Table.addColumn("관계");
        Outer_Table.setColumnCount(4);

        for(int j = 0 ; j < i ; j++){
            Outer_Table.removeRow(0);
        }

        Inner_Table.setAutoResizeMode(Inner_Table.AUTO_RESIZE_OFF);
        

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
	
	//DB to Table
	private void SearchAction(){
		
		DbAction dbAction = new DbAction();
		ArrayList<Bean> beanList =  dbAction.selectList();
		
		int listCount = beanList.size();
		
		for(int i=0; i<listCount; i++) {
			String temp = Integer.toString(beanList.get(i).getSeqno());// 스트링으로 보내줘야해
			String[] qTxt = {temp, beanList.get(i).getName(), beanList.get(i).getTelno(), beanList.get(i).getRelation()};
			Outer_Table.addRow(qTxt);
		}
		
	}
	
	// Click the Table
	private void TableClick() {
        
		int i = Inner_Table.getSelectedRow();
        String tmpSequence = (String)Inner_Table.getValueAt(i, 0);
        int wkSequence = Integer.parseInt(tmpSequence);
        
        DbAction dbAction = new DbAction(wkSequence);
        Bean bean = dbAction.TableClick();
        
        tfSeqno.setText(Integer.toString(bean.getSeqno()));
        tfName.setText(bean.getName());
        tfTelno.setText(bean.getTelno());
        tfAddress.setText(bean.getAddress());
        tfEmail.setText(bean.getEmail());
        tfRelation.setText(bean.getRelation());

	}
	
	// Condition Query
	private void ConditionQuery() {
		int i = cbSelection.getSelectedIndex();
		String ConditionQueryColumn = "";
		switch (i) {
		case 0:
			ConditionQueryColumn = "name";
			break;
		case 1:
			ConditionQueryColumn = "address";
			break;
		case 2:
			ConditionQueryColumn = "relation";
			break;
		default:
			break;
		}
		
		TableInit();
		ClearColumn();
		ConditionQueryAction(ConditionQueryColumn);

	}
	
	// DataField 정리
	private void ClearColumn() {
		tfSeqno.setText("");
		tfName.setText("");
		tfTelno.setText("");
		tfAddress.setText("");
		tfEmail.setText("");
		tfRelation.setText("");
	}
	
	// 조건검색 실행 
	private void ConditionQueryAction(String ConditionQueryColumn) {
		
		String selecttion = tfSelection.getText().trim();
		DbAction dbAction = new DbAction(selecttion, ConditionQueryColumn);
		ArrayList<Bean> beanList = dbAction.SearchAction();
		
		int listCount = beanList.size();
		
		for(int i=0; i<listCount; i++) {
			String temp = Integer.toString(beanList.get(i).getSeqno());// 스트링으로 보내줘야해
			String[] qTxt = {temp, beanList.get(i).getName(), beanList.get(i).getTelno(), beanList.get(i).getRelation()};
			Outer_Table.addRow(qTxt);
		}
		
	}
			
	
	// Data 수정
	private void UpdateAction() {
		
		String name = tfName.getText().trim();
		String telno = tfTelno.getText().trim();
		String address = tfAddress.getText().trim();
		String email = tfEmail.getText().trim();
		String relation = tfRelation.getText().trim();
		
		int i = Inner_Table.getSelectedRow();
        String tmpSequence = (String)Inner_Table.getValueAt(i, 0);
        int wkSequence = Integer.parseInt(tmpSequence);

		DbAction dbAction = new DbAction(wkSequence, name, telno, address, email, relation); //인스턴스 객체 생성
		boolean msg = dbAction.updateAction();
		
		if(msg == true) {
			//null은 아무데나 띄워라 this는 내 판넬 위에 뜨게 하는거
			JOptionPane.showMessageDialog(this, tfName.getText()+" 님의 정보가 수정 되었습니다.!",
           "입력 완료!", 
           JOptionPane.INFORMATION_MESSAGE);  
			
		}else {
			JOptionPane.showMessageDialog(this, "DB에 자료 입력중 에러가 발생했습니다! \n 시스템관리자에 문의하세요!",
            "Critical Error!", 
            JOptionPane.ERROR_MESSAGE);      
		}
		
	}
	
	// Data 삭제
	private void DeleteAction() {
		
		int i = Inner_Table.getSelectedRow();
        String tmpSequence = (String)Inner_Table.getValueAt(i, 0);
        int wkSequence = Integer.parseInt(tmpSequence);

        
		DbAction dbAction = new DbAction(wkSequence); //인스턴스 객체 생성
		boolean msg = dbAction.deleteAction();
		
		if(msg == true) {
			//null은 아무데나 띄워라 this는 내 판넬 위에 뜨게 하는거
			JOptionPane.showMessageDialog(this, tfName.getText()+" 님의 정보가 삭제 되었습니다.!",
           "입력 완료!", 
           JOptionPane.INFORMATION_MESSAGE);  
			
		}else {
			JOptionPane.showMessageDialog(this, "DB에 자료 입력중 에러가 발생했습니다! \n 시스템관리자에 문의하세요!",
            "Critical Error!", 
            JOptionPane.ERROR_MESSAGE);      
		}
	}
	
	// 화면 정리 
	private void ScreenPartition() {
		// 검색일 경우 
		if(rbQuery.isSelected() == true) {
			btnOK.setVisible(false);
			tfName.setEditable(false);
			tfTelno.setEditable(false);
			tfAddress.setEditable(false);
			tfEmail.setEditable(false);
			tfRelation.setEditable(false);
		}
		
		// 입력일 경우
		if(rbInsert.isSelected() == true) {
			btnOK.setVisible(true);
			tfName.setEditable(true);
			tfTelno.setEditable(true);
			tfAddress.setEditable(true);
			tfEmail.setEditable(true);
			tfRelation.setEditable(true);			
		}
		
		// 수정일 경우
		if(rbUpdate.isSelected() == true) {
			btnOK.setVisible(true);
			tfName.setEditable(true);
			tfTelno.setEditable(true);
			tfAddress.setEditable(true);
			tfEmail.setEditable(true);
			tfRelation.setEditable(true);						
		}
		
		// 삭제일 경우 
		if(rbDelete.isSelected() == true) {
			btnOK.setVisible(true);
			tfName.setEditable(false);
			tfTelno.setEditable(false);
			tfAddress.setEditable(false);
			tfEmail.setEditable(false);
			tfRelation.setEditable(false);
		}
	}
	
	// Action 구분 
	private void ActionPartition() {
		// 검색인 경우
		if(rbQuery.isSelected() == true) {
			ScreenPartition();			
		}
		
		// 입력일 경우 
		if(rbInsert.isSelected() == true) {
			int i_chk = insertFieldCheck();
			if(i_chk == 0){
				insertAction();
				TableInit();
				SearchAction();
				ClearColumn();
			}else {
				JOptionPane.showMessageDialog(this, "주소록 정보 입력! " + "\n" + 
						"Data를 입력하세요 하세요!",
						"주소록 정보", 
						JOptionPane.INFORMATION_MESSAGE);        			
				
			}			
			ScreenPartition();
		}
		
		// 수정일 경우
		if(rbUpdate.isSelected() == true) {
			int i_chk = insertFieldCheck();
			if(i_chk == 0){
				UpdateAction();
				TableInit();
				SearchAction();
				ClearColumn();
			}else {
				JOptionPane.showMessageDialog(this, "주소록 정보 수정 ! " + "\n" + 
						"Data를 입력하세요 하세요!",
						"주소록 정보", 
						JOptionPane.INFORMATION_MESSAGE);        			
				
			}			
			ScreenPartition();
		}
		
		// 삭제일 경우
		if(rbDelete.isSelected() == true) {
			DeleteAction();
			TableInit();
			SearchAction();
			ClearColumn();			
			ScreenPartition();
		}
	}
	
	
	private int insertFieldCheck(){
		int i = 0;
		if(tfName.getText().length() == 0){
			i++;
			tfName.requestFocus();
		}
		if(tfTelno.getText().length() == 0){
			i++;
			tfTelno.requestFocus();
		}
		if(tfAddress.getText().length() == 0){
			i++;
			tfAddress.requestFocus();
		}
		if(tfEmail.getText().length() == 0){
			i++;
			tfEmail.requestFocus();
		}
		if(tfRelation.getText().length() == 0){
			i++;
			tfRelation.requestFocus();
		}
				
		return i;
	}
	
	private void insertAction(){
		
		String name = tfName.getText().trim();
		String telno = tfTelno.getText().trim();
		String address = tfAddress.getText().trim();
		String email = tfEmail.getText().trim();
		String relation = tfRelation.getText().trim();
		
		DbAction dbAction = new DbAction(name, telno, address, email, relation); //인스턴스 객체 생성
		boolean msg = dbAction.insertAction();
		
		if(msg == true) {
			//null은 아무데나 띄워라 this는 내 판넬 위에 뜨게 하는거
			JOptionPane.showMessageDialog(this, tfName.getText()+" 님의 정보가 입력 되었습니다.!",
           "입력 완료!", 
           JOptionPane.INFORMATION_MESSAGE);  
			
		}else {
			JOptionPane.showMessageDialog(this, "DB에 자료 입력중 에러가 발생했습니다! \n 시스템관리자에 문의하세요!",
            "Critical Error!", 
            JOptionPane.ERROR_MESSAGE);      
		}
		
		
	}

	
	
	
	
	
} // -------------------
