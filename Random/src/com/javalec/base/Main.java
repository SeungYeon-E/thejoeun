package com.javalec.base;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Afternoon an = new Afternoon();
		an.Exercise();
		//Random
		
//		for(int i=1;i<=6;i++) {
//			double d = Math.random();
//			int a = (int)(d*3) + 1;
//			System.out.println(a);
//		}
		
//		Random random = new Random();
//		int i = random.nextInt(3);
//		System.out.println(i+1);
		
	}

}
class Afternoon{
	void Exercise() {
		Scanner sc = new Scanner(System.in);
		int player=0; //플레이어 패
		int com=0; //컴퓨터 패
		int sw=0; //프로그램 재시작/종료 스위치

		//가위바위보 프로그램 시작
		while(true) {
			com = (int)(Math.random()*(3-1+1)+1); //컴퓨터 패 선택
			
			//플레이어 패 입력 시작
			while(true) {
				try {//플레이어 패 입력
					System.out.println("=====가위 바위 보 게임=====");
					System.out.print("숫자를 선택하세요 (1.가위 / 2.바위 / 3.보) : ");
					player=Integer.parseInt(sc.nextLine()); //플레이어 패 입력
					if(player==1 || player==2 || player==3) { //선택지의 입력이 들어오면
						//컴퓨터의 패 표기
						if(com==1) {
							System.out.println("PC는 가위를 냈습니다.");
						}else if(com==2) {
							System.out.println("PC는 바위를 냈습니다.");
						}else if(com==3) {
							System.out.println("PC는 보를 냈습니다.");
						}

						//플레이어의 패 표기
						if(player==1) {
							System.out.println("당신은 가위를 냈습니다.");
						}else if(player==2) {
							System.out.println("당신은 바위를 냈습니다.");
						}else if(player==3) {
							System.out.println("당신은 보를 냈습니다.");
						}

						//가위바위보 승패판정
						if((player==1&&com==3)||(player==2&&com==1) ||(player==3&&com==2)) {
							System.out.println("당신이 이겼습니다.");
						}else if((player==3&&com==1)||(player==1&&com==2) ||(player==2&&com==3)) {
							System.out.println("컴퓨터가 이겼습니다.");
						}else if(player==com){
							System.out.println("비겼습니다");
						}

						break;
					}else {//선택지 외 숫자 입력
						System.out.println("선택지의 숫자를 입력해주세요.");
						continue;
					}

				}catch(Exception e) {//문자입력시 예외처리
					System.out.println("숫자를 입력해주세요.");
				}
			}
			//플레이어 패 입력  끝


			//프로그램 재시작/종료 스위치 시작
			while(true) { 
				try { //재시작종료유무 입력
					System.out.print("계속하시겠습니까? (1.Y / 2.N)  : ");
					sw=Integer.parseInt(sc.nextLine());

					if(sw==1) {//계속진행
						break;
					}else if(sw==2) {//게임종료
						System.out.println("=============");
						System.out.println("가위바위보게임 종료");
						System.exit(0);
					}else { //선택지 외 숫자 입력
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					}
				}catch(Exception e){ //재시작종료유무-문자입력시 예외처리
					System.out.println("숫자를 입력해주세요.");
				}
			}
			//프로그램 재시작/종료 스위치 끝		
		}
		//가위바위보 프로그램 끝
	
	}
}