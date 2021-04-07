package com.javalec.base;

public class Main {
	public static void main(String[] args) {
		
		int num1 = 123;
		String str1 = "12345";
		String str2 = "abcde";
		
		String str3 = Integer.toString(num1);//문자로 변경
		System.out.println(str3 + str1);
		
		int num2 = Integer.parseInt(str1);//int로 변경
		System.out.println(num1 + num2);
		
	}
}
