package com.javalec.base;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = 10;
		
		//비교문 #1
//		if(i > j) {
//			System.out.println("i가 j보다 큽니다.");
//		}
//		System.out.println(">>> End <<<");

		//비교문 #2 : 비교문으로 입력한 숫자 크기의 차이 구하기.
		
//		if(i > j) {
//			System.out.println("i는 j보다 " + (i-j) + "만큼 큽니다.");
//		}else {
//			System.out.println("j는 i보다 " + (j-i) + "만큼 큽니다.");
//		}
//		System.out.println(">>> End <<<");
//		
		
		//비교문 #3 : 비교문으로 크다, 작다, 같다의 3종류 이상의 비교문
		
//		if(i > j) {
//			System.out.println("i가 j보다 큽니다.");
//		}else if(i == j) {
//			System.out.println("i와 j가 같습니다.");
//		}else {
//			System.out.println("i는 j보다 작습니다.");
//			
//		}
//		System.out.println(">>> End <<<");
//		
		
		
		
//		int price = 5000;
//		
//		if(price > 8000) {
//			System.out.println("너무 비쌉니다.");
//		}else if(price > 5000) {
//			System.out.println("조금 비쌉니다.");
//		}else if(price > 3000) {
//			System.out.println("적당한 금액입니다.");
//		}else {
//			System.out.println("싼편 입니다.");
//		}
//		System.out.println("구매 하실래요?");
//		
		
//		Scanner scanner = new Scanner(System.in);
//		while (true) {
//			System.out.println("성적을 입력하세요 : ");
//			int num = scanner.nextInt();
//			if(num > 100) {
//				System.out.println("성적을 다시 입력해주세요.");
//			}else if(num >= 90) {
//				System.out.println("귀하의 학점은 A학점 입니다.");
//			}else if(num >= 80) {
//				System.out.println("귀하의 학점은 B학점 입니다.");
//			}else if(num >= 70) {
//				System.out.println("귀하의 학점은 C학점 입니다.");
//			}else if(num > 40) {
//				System.out.println("귀하의 학점은 D학점 입니다.");
//			}else if(num <= 40){
//				System.out.println("귀하의 학점은 F학점 입니다.");
//			}
//		}
		
		
		
		
//		교수님 1
//		Scanner scanner = new Scanner(System.in);
//		while (true) {
//			System.out.println("성적을 입력하세요 : ");
//			int num = scanner.nextInt();
//			if(num > 100) {
//				System.out.println("성적을 다시 입력해주세요.");
//			}else if(num >= 90) {
//				System.out.println("귀하의 학점은 A학점 입니다.");
//			}else if(num >= 80) {
//				System.out.println("귀하의 학점은 B학점 입니다.");
//			}else if(num >= 70) {
//				System.out.println("귀하의 학점은 C학점 입니다.");
//			}else if(num >= 60) {
//				System.out.println("귀하의 학점은 D학점 입니다.");
//			}else if(num >= 0){
//				System.out.println("귀하의 학점은 F학점 입니다.");
//			}else {
//				System.out.println("성적을 다시 입력해주세요.");
//		}
//		
		
//		교수님 2
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("성적을 입력하세요 : ");
//		
//		int num = scanner.nextInt();
//		String grade = "";
//		
//		if(num > 100) {
//			grade = "error";
//		}else if(num >= 90) {
//			grade = "A";
//		}else if(num >= 80) {
//			grade = "B";
//		}else if(num >= 70) {
//			grade = "C";
//		}else if(num >= 60) {
//			grade = "D";
//		}else if(num >= 0){
//			grade = "F";
//		}else{
//			grade = "error";
//		}
//		
//		if(grade == "error"){
//		System.out.println("성적을 다시 입력해주세요.");
//		}else {
//		System.out.println("귀하의 학점은 " + grade + "입니다.");
//		}
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요!");
		double ko = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요!");
		double eng = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요!");
		double mat = scanner.nextInt();
		double grade = (ko + eng + mat)/3;
		
		System.out.println("평균점수 : " + grade );
		
		
		if(grade < ko) {
			System.out.println("국어 성적이 평균보다 높습니다.");
		}else if(grade == ko) {
			System.out.println("국어 성적이 평균입니다.");
		}else if(grade > ko) {
			System.out.println("국어 성적이 평균보다 낮습니다.");
		}
		
		if(grade < eng) {
			System.out.println("영어 성적이 평균보다 높습니다.");
		}else if(grade == eng) {
			System.out.println("영어 성적이 평균입니다.");
		}else if(grade > eng) {
			System.out.println("영어 성적이 평균보다 낮습니다.");
		}
		
		if(grade < mat) {
			System.out.println("수학 성적이 평균보다 높습니다.");
		}else if(grade == mat) {
			System.out.println("수학 성적이 평균입니다.");
		}else if(grade > mat) {
			System.out.println("수학 성적이 평균보다 낮습니다.");
		}
		
	}

}
