package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.DmbCellPhone;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//DmbCellPhone 의 Instance를 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);	
		
		dmbCellPhone.myCellPhone();
		
		dmbCellPhone.powerOn();
		
		dmbCellPhone.bell();
		
//		String sendvoice = scanner.nextLine();
		dmbCellPhone.sendVoice("안녕하세요");
		
//		String receivevoice = scanner.nextLine();
		dmbCellPhone.receiveVoice("반갑습니다");
		
		dmbCellPhone.sendVoice("그럼이만");
		
		dmbCellPhone.hangUp();
		
		dmbCellPhone.trunOnDmb();
		
//		int changecanneldmb = scanner.nextInt();
		dmbCellPhone.changeCannelDmb(20);
		
		dmbCellPhone.turnOffDmb();
		

	}

}
