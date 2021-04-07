package com.javalec.base;
import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {
		//선언문
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0; //사용자 입력
		String score = ""; //처리 결과 저장소
		while(true){ //반복
			//처리
			System.out.println("성적을 입력하세요!");
			inputNumber = scanner.nextInt();
			if (inputNumber > 100 || inputNumber < 0) {
				score = "error";
			}else {
				// switch문
				switch(inputNumber / 10) {
				case 10:
					score = "A";
					break;
				case 9:
					score = "B";
					break;
				case 8:
					score = "C";
					break;
				case 7:
					score = "D";
					break;
				default:
					score = "F";
					break;
				}
			}
			//출력
			if (score.equals("error")) {
				System.out.println("점수를 다시 입력해주세요.");
			}else {
				System.out.println("귀하의 성적은 " + score + "입니다.");
			}
		}
	}

			
}