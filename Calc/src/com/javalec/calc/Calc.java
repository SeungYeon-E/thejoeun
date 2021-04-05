package com.javalec.calc;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		//	사용자의 입력 데이터 받기
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num =  scanner.nextInt(); //메소드(방법) 기능을 쓰겠다.
		//입력받고 싶으면 scanner 써야함. 변수선언 해주기

		System.out.println("사용자 입력 숫자는 " + num + "입니다.");
		
		/*
		*Exercise
		*
		*숫자를 입력해 주세요 : 12
		*
		*입력하신 숫자는 3의 배수 입니다.
		*
		*숫자를 입력해 주세요 : 10
		*
		*입력하신 숫자는 3의 배수가 아닙니다.
		*
		*/
		
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요 : ");
		int num2 = scanner2.nextInt();
		
		System.out.println(num2 % 3 == 0 ? "입력하신 숫자는 3의 배수입니다." : "입력하신 숫자는 3의 배수가 아닙니다.");
		System.out.println(num2 % 3 != 0 ? "입력하신 숫자는 3의 배수가 아닙니다." : "입력하신 숫자는 3의 배수입니다.");
		
		//System.out.println("입력하신 숫자는 3의 배수");
		//System.out.println(num2 % 3 != 0 ? "가 아닙니다." : "입니다.");
		//System.out.println(num2 % 3 == 0 ? "입니다." : "가 아닙니다.");
		
		
		//System.out.println(num % 2 == 0 ? "2의 배수" : num % 3 == 0 ? "3의 배수" : "모름");
		
		
	}

}
