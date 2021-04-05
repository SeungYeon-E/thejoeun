package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		WhileExercise we = new WhileExercise();
		
//		we.Exercise01();
		we.Exercise02();

	}

}

class WhileExercise {
	void Exercise01(){
		Scanner scanner = new Scanner(System.in);
		int remainder = 0;
		int sum = 0;
		
		System.out.println("Enter an integer ");
		int inputValue = scanner.nextInt();
		
		while(inputValue != 0) {
			remainder = inputValue % 10;
			sum += remainder;
			inputValue = inputValue / 10;
			
		}
		System.out.println(sum);
		
	}
	
	void Exercise02() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("몇개의 숫자를 더할까요 ? : ");
		int num = scanner.nextInt();
		
		System.out.println(num + "개의 숫자를 입력하세요.");
		
		while(num>0) {
			int input = scanner.nextInt();
			sum += input;
			num--;
		}
		
		System.out.println("입력한 숫자의 합은 " + sum + "입니다.");
		
	}
	
}
