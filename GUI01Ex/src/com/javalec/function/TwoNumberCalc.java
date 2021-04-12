package com.javalec.function;

public class TwoNumberCalc {

	// Field
	
	// Construct
	public TwoNumberCalc() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
//	JavaSwing : 2개의 숫자 가감승제
//	시작시에 JOptionPane으로 숫자만 입력하라는 경고를 띄운뒤에 main화면 띄우기
//	화면 중앙배치
//	TextField에 숫자만 입력
//	계산만 하는 Class 생성
	// 덧셈 
	public String addition(String str1, String str2) {
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		return Integer.toString(num1 + num2);
	}
	
	// 뺄셈
	public String subtraction(String str1, String str2) {
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		return Integer.toString(num1 - num2);		
	}
	
	// 곱셈
	public String multiplication(String str1, String str2) {
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		return Integer.toString(num1 * num2);

	}
	
	// 나눗셈
	public String division(String str1, String str2) {
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		String result;
		
		// 나눗셈의 Division by Zero Check
		if((num1 == 0 && num2 == 0) || (num2 == 0)) {
			result = "불가능";			
		}else {
			result = String.format("%.3f", (double)num1/ num2);			
		}
		
		return result;
	}
	

	
}
