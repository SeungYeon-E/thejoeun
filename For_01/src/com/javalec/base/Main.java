package com.javalec.base;//main 메소드는 하나

import java.util.Scanner;

public class Main {//메인클래스 하나
	
	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("단을 입력하세요 : ");
//		int dan = scanner.nextInt();		
//		for(int i =1; i<=9; i++) {
//			//System.out.println(i);
//			System.out.println(dan + " X " + i + " = " + String.format("%2d",(dan*i)));
//			//두자리 사용
//			System.out.println(dan + " X " + i + " = " + String.format("%02d",(dan*i)));
//			//두자리 사용 0채우기
//			System.out.println(dan + " X " + i + " = " + String.format("%5d",(dan*i)));
//			//5자리 사용
//			System.out.println(dan + " X " + i + " = " + String.format("%05d",(dan*i)));
//			//5자리 사용 0채우기
//		}
		
		//Exercise============================================
//		<----2단 입니다.--->
//		2 X 1 =  2
//		2 X 2 =  4
//		2 X 3 =  6
//		2 X 4 =  8
//		2 X 5 = 10
//		2 X 6 = 12
//		2 X 7 = 14
//		2 X 8 = 16
//		2 X 9 = 18
//		----------------
//		for(int dan=2;dan<=9;dan++) {
//			System.out.println("<----" + dan + "단 입니다.--->");
//			for(int i=1; i<=9; i++) {
//				System.out.println(dan + " X " + i + " = " + String.format("%2d",(dan*i)));
//			}
//			System.out.println("----------------");
//		}
		
		//Exercise============================================
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("구구단 시작 범위 입력 : ");
//		int start = scanner.nextInt();
//		System.out.print("구구단 끝 범위 입력 : ");
//		int end = scanner.nextInt();
//		
//		if(start > end) {
//			System.out.println("입력 정보를 확인하세요");
//		}else {
//			for(int dan=start;dan<=end;dan++) {
//				System.out.println("<----" + dan + "단 입니다.--->");
//				for(int i=1; i<=9; i++) {
//					System.out.println(dan + " X " + i + " = " + String.format("%2d",(dan*i)));
//				}
//			}
//					
//		}
		
		//Exercise===========================================
		
//		int temp = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("구구단 시작 범위 입력 : ");
//		int start = scanner.nextInt();
//		System.out.print("구구단 끝 범위 입력 : ");
//		int end = scanner.nextInt();
//		
//		if(start > end) {
//			temp = start;
//			start = end;
//			end = temp;
//		}for(int dan=start;dan<=end;dan++) {
//			System.out.println("<----" + dan + "단 입니다.--->");
//				for(int i=1; i<=9; i++) {
//					System.out.println(dan + " X " + i + " = " + String.format("%2d",(dan*i)));
//				}
//		}
		
		//Exercise===========================================
		
		int temp = 0;
		String even = "";
		String odd = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구구단 시작 범위 입력 : ");
		int start = scanner.nextInt();
		
		System.out.print("구구단 끝 범위 입력 : ");
		int end = scanner.nextInt();
		
		if(start > end) {
			temp = start;
			start = end;
			end = temp;
		}
		
		for(int dan=start;dan<=end;dan++) {
			System.out.println("<----" + dan + "단 입니다.--->");
			if(dan % 2 == 0) {
				for(int i=2; i<=8; i+=2) {
					System.out.println(dan + " X " + i + " = " + String.format("%2d",(dan*i)));
				}
			}else if(dan % 2 != 0){
				for(int i=1; i<=9; i+=2) {
					System.out.println(dan + " X " + i + " = " + String.format("%2d",(dan*i)));
				}
			}else {
				
			}
		}
					
	}
}