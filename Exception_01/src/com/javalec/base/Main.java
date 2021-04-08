package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		int j = 0;
		
		System.out.println("Add :" + (i+j));
		System.out.println("Sub :" + (i-j));
		System.out.println("Mul :" + (i*j));
		
		try {//예외처리 정수0이 들어가게되면 오류
			System.out.println("Div :" + (i/j));
		}catch(Exception e) {
//			System.out.println(e.getMessage());//개발자용 메세지
			System.out.println("숫자를 확인하세요!");
		}
	}

}
