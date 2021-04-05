package com.javalec.variable_03;

public class MainClass {

	public static void main(String[] args) {
		// 연산자 종류별 출력
		int i = 10;
		int j = 2, k = 5;
		
		System.out.println("<-- 산술 연산자 -->");
		System.out.println("덧셈 : " + i + " + " + j + " = " + (i+j));
		System.out.println("뺄셈 : " + i + " - " + j + " = " + (i-j));
		System.out.println("곱셈 : " + i + " * " + j + " = " + (i*j));
		System.out.println("나눈 몫 : " + i + " / " + j + " = " + (i/j));
		System.out.println("나눈 나머지 : " + i + " % " + j + " = " + (i%j));
		
		System.out.println("<-- 자동 증강 연산자 -->");
		i = i + 1;
		i += 1;
		i++;
		// System.out.println(i=i+1);
		System.out.println(i);

		j = j - 1;
		j -= 1;
		j--;
		System.out.println(j);
		
		System.out.println("<-- 동등 비교 단계 연산자 -->");
		System.out.println("i == j : " + (i == j));
		System.out.println("i != j : " + (i != j));
		System.out.println("i > j : " + (i > j));
		System.out.println("i < j : " + (i < j));
		System.out.println("i >= j : " + (i >= j));
		System.out.println("i <= j : " + (i <= j));
		
		System.out.println("<-- 논리 연산자 -->");
		System.out.println((i > j) && (j > k));// AND연산자(교집합) 둘다  ture 이어야 ture
		System.out.println((i > j) || (j > k));// OR연산자(합집합) 둘 중 하나만  ture 면 ture
		
		System.out.println("<-- 삼항 연산자 -->");
		System.out.println((k==5 ? "k는5" : "k는 5아님")); //true : false
		
		//Exercise : i 가 홀수 인지 짝수 인지 출력하시오
		System.out.println(i%2!=0 ? "i는 홀수" : "i는 짝수");
		System.out.println(i%2==0 ? "i는 짝수" : "i는 홀수");
		System.out.println(i);
		
		
		
	}

}
