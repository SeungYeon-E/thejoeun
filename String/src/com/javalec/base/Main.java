package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String str1 = "abcdefg";
		String str2 = "HIJKLMN";
		String str3 = "opqrstu";
		String str4 = " abc def ghi ";

		System.out.println(str1.concat(str2));//문자열 연결
		System.out.println(str1.substring(3));//3번째 뒤부터 출력
		System.out.println(str1.substring(3, 5));//3번째부터 5번째까지 출력
		System.out.println(str1.length());//글자수 확인 가능
		System.out.println(str1.toUpperCase());//대문자로 변경 출력해준다
		System.out.println(str2.toLowerCase());//소문자로 변경 출력해준다
		System.out.println(str1.charAt(3));
		
		
		//str1을 알파벡 하나씩 출력하기
		for(int i=0;i<str1.length();i++) {
			System.out.println(str1.charAt(i));
		}
		
		System.out.println(str1.indexOf('c'));//몇번째 있냐
		System.out.println(str1.equals(str3));//같지 않다 false
		System.out.println(str4.trim());//앞 뒤 공백 삭제
		System.out.println(str1.replace('a', 'Z'));//문자단위로 변경 해서 출력
		System.out.println(str1);//위에꺼 대입된거 아님
		System.out.println(str1.replaceAll("abc", "ZZZZZZZ"));//문자열로 바꿔서 출력
		System.out.println(str1.toCharArray());
		
	}

}
