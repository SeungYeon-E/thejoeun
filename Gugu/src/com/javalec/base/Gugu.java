package com.javalec.base;

import java.util.Scanner;

public class Gugu {

	public static void main(String[] args) {
		//for문으로====================================
//		int dan = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("원하시는 단을 입력하세요 : ");
//		dan = scanner.nextInt();
//		
//		for(int i=2; i<=8; i+=2) {
//			System.out.println(dan +  " X " + i + " = " + (dan*i));
		
		
		//if문으로====================================
//		int dan = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("원하시는 단을 입력하세요 : ");
//		dan = scanner.nextInt();
//		
//		for(int i=1; i<=9; i++) {
//			if(i%2 == 0) {
//				System.out.println(dan +  " X " + i + " = " + (dan*i));
//			}				
//		}
		
		//Exercise====================================
//		int dan = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("원하시는 단을 입력하세요 : ");
//		dan = scanner.nextInt();
//		
//		for(int i=1; i<=9; i++) {
//			if(i%2 == 0) {
//				System.out.println(dan +  " X " + i + " = " + (dan*i));
//			}else {
//				System.out.println(dan +  " X " + "_" + " = " + (dan*i));
//			}				
//		}
		
		
		int dan = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("원하시는 단을 입력하세요 : ");
		dan = scanner.nextInt();
		
		for(int i=1; i<=9; i++) {
				System.out.println(dan +  " X " + (i%2 == 0 ? i : "_")  + " = " + (dan*i));
					
		}
	}

}
