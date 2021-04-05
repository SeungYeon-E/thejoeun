package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		AfternoonClass ac = new AfternoonClass();
		
//		ac.Exercise01();
//		ac.Exercise02();
//		ac.Exercise03();
//		ac.Exercise04();
		ac.Exercise05();
//		ac.Oyj();
	}

}

class AfternoonClass{
	
	void Print(int i,int j) {
		System.out.println(i +"*"+ (j) +"="+ i*j + "\t"+i +"*"+ (j+1) +"="+ i*(j+1) + "\t"+i +"*"+ (j+2) +"="+ i*(j+2) );
	}
	
	void Exercise01() {
		System.out.println("apple\nBanana\nGrape");
		System.out.println("apple\tBanana\tGrape");
		System.out.println("apple\"Banana\"Grape");
	}
	
	void Exercise02() {
		for(int y=2;y<=9;y++) {
		System.out.print("==" + y + "단 입니다.==\t");
		}System.out.println();
	
		for(int i=1;i<=9;i++){
			for(int j=2;j<=9;j++) {
				if((i*j)%5==0) {
					System.out.print(j + " X " + i + " = " + (i*j)  + "*" + "\t");
				}else {
					System.out.print(j + " X " + i + " = " + (i*j) + "\t");
				}
			}
			System.out.println();
		}	
	}
	
	void Exercise03() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input your number : ");
		int num = scanner.nextInt();
		
		for(int i=1;i<=9;i++){
			System.out.print(num + " X " + i + " = " + (i*num) + "\t" + 
							(num+1) + " X " + i + " = " + (i*(num+1)) + "\t" +
							(num+2) + " X " + i + " = " + (i*(num+2)) + "\t" +
							(num+3) + " X " + i + " = " + (i*(num+3)) + "\n" );
		}
		System.out.println();
	}
	
	void Exercise04() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단을 입력하세요 : ");
		int num = scanner.nextInt();
		
		for(int i=1;i<=9;i+=3){
			System.out.print(num + " X " + i + " = " + (i*num) + "\t" +
							num + " X " + (i+1) + " = " + ((i+1)*num) + "\t" + 
							num + " X " + (i+2) + " = " + ((i+1)*num) + "\n");

		}
		
	}
	
	void Exercise05() {
		int i = 1;
			for(int j=2;j<=9;j++) {
				System.out.println(j + "X" + i + "=" + (i*j) + "\t" +
									j + "X" + (i+1) + "=" + ((i+1)*j) + "\t" + 
									j + "X" + (i+2) + "=" + ((i+2)*j) + "\t");
		}	
	}
	
	void Oyj(){
		for(int i = 2 ; i <= 9 ; i ++) {Print(i , 1);
		}
	}
	
}