package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MorningClass mc = new MorningClass();
		mc.Exercise14();
		
	}

}
class MorningClass{
	void Exercise14() {
		Scanner scan = new Scanner(System.in);
		int Custormer[] = new int[5];
		int cusindex = 0;
		int money = 0;
		int num = 0;
		String st = "true";
		
		while (st=="true"){
			
			System.out.println("1.입급\n2.출급\n3.현황\n4.종료");
			
			System.out.print("번호를 선택하세요!");
			num = scan.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("고객번호 : ");
				cusindex = scan.nextInt();
				
				System.out.print("금액 : ");
				Custormer[cusindex-1] += scan.nextInt();
				
				System.out.println("입금 결과 : 고객번호 : " + cusindex + " 잔액 : " + Custormer[cusindex-1]);
				System.out.println("---------------------------------");
				break;
				
			case 2:
				System.out.print("고객번호 : ");
				cusindex = scan.nextInt();
				
				System.out.print("금액 : ");
				money = scan.nextInt();
				
					if (money <= Custormer[cusindex-1]) {
						Custormer[cusindex-1] -= money;
						System.out.println("출금 결과 : 고객번호 : " + cusindex + " 잔액 : " + Custormer[cusindex-1]);
					}else {
						System.out.println("잔액이 부족합니다!");
					}
					System.out.println("---------------------------------");
				break;
				
			case 3:
				System.out.println("\t고객명\t잔액");
				System.out.println("\t-----\t----");
				
				for(int i=0;i<Custormer.length;i++) {
					System.out.println("\t" + (i+1) + "\t" + Custormer[i]);
				}
				
				System.out.println("---------------------------------");
				break;
				
			case 4:
				System.out.print(">>>> Thank you <<<<");
				st = "X";
				break;
				
			default:
				st = "X";
				break;
			}
		}
		
	}
}