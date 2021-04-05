package com.javalec.base;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("체중을 입력해주세요.");
		double kg = scanner1.nextInt();
		System.out.println("신장을 입력해주세요.");
		double cm = scanner1.nextInt();
		
		double bmi = (kg / (cm*cm)*10000);
		
		System.out.println("당신의 BMI 수치는 :" + bmi);
		
		if(bmi>30) {
		System.out.println("당신은 초고도비만입니다.");
		}else if(bmi>25) {
			System.out.println("당신은 비만입니다.");
		}else if(bmi>23) {
			System.out.println("당신은 과체중입니다.");
		}else if(bmi>18.5) {
			System.out.println("당신은 정상입니다.");
		}else 
			System.out.println("당신은 저체중입니다.");
	}

}
