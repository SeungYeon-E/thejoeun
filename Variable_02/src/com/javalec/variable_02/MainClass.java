package com.javalec.variable_02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수와 상수
		// 변수선언
		String str = "James";
		int num = 10;
		double numDouble = 20.2;
		char chr = 'a';
		boolean bool = true; //false
		
		System.out.println(str + ":" + num);
		System.out.println(num + num);
		System.out.println((double)num + numDouble); // 실수출력
		System.out.println(num + (int)numDouble); // 정수출력
		System.out.println(chr);
		System.out.println(bool);
		
	}

}
