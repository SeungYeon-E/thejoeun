package com.javale.base;

public class Variable_01 {

	public static void main(String[] args) {
		//변수(Variable)
		//문자열 변수 선언
		String str = "Hello, world!";
		
		System.out.println(str);
		System.out.println(str);
		
		str = "abc";
		System.out.println(str);
		
		//정수 변수 선언
		int num1 = 10;
		int num2 = 20;
		int plusResult; //camel 기법
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println((double)num1 / (double)num2);
		System.out.println((double)(num1 / num2)); //변환 의미 없음
		plusResult = num1 + num2;
		System.out.println(plusResult);
		
		// ---- Exercise
		int startNum = 30, endNum = 40;
		/*
		 * 30과 40의 덧셈 결과는 70입니다.
		 * 30과 40의 뺄셈 결과는 -10입니다.
		 * 30과 40의 곱셈 결과는 1200입니다.
		 * 30과 40의 나눗셈 중 몫은 0입니다.
		 * 30과 40의 나눗셈 결과는 __ 입니다.
		 * 30과 40의 덧셈결과와 뺄셈 결과의 곱은 __입니다.
		 */
		System.out.println(startNum + "과 " + endNum + "의 덧셈 결과는 " + (startNum + endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 뺄셈 결과는 " + (startNum - endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 곱셈 결과는 " + (startNum * endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 나눗셈 중 몫는 " + (startNum / endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 나눗셈 결과는 " + ((double)startNum / (double)endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 덧셈 결과와 뺄셈 결과의 곱은 " + ((startNum + endNum)*(startNum - endNum)) + " 입니다.");
		
	}
}
