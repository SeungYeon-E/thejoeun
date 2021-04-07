package com.javalec.function;

public class SumEvenOdd2 {
	
	// Field, Property 선언자(초기값)
	int num = 0;//전역변수
	
	// Constructor 생성자
	public SumEvenOdd2() {
		
	}
	
	// Method 함수
	public void sumClac(int num1, int num2) {//void 리턴할게없다(보내줄값없어)
		int sum = 0;
		for(int i=num1;i<=num2;i++) {
			sum += i;
		}
		this.num = sum;//this라고 붙여준다!
		System.out.println(num1 + " ~ " + num2 + " 의 합은 " + sum + "입니다.");
		
	}
	public void evenOdd() {
		int remainder = num % 2;
		String chk;
		if(remainder==0) chk = "짝수";
		else chk = "홀수";
		
		System.out.println(chk + "입니다.");
		
	}
}
