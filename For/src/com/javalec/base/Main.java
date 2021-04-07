package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		MorningClass mc = new MorningClass();
		
		mc.Ex01();
	}

}
class MorningClass{
	void  Ex01(){
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
	}
	
	void Ex02() {
		//for 반복문=============================================
		for(int i=1;i<=10;i++) {
			
			System.out.println(i);
			
		}
		
	}
	
	void Ex03() {
		//for 반복문 1부터 10까지의 합===============================		
		int total = 0;
		for(int i=1;i<=10;i++) {
			total=total+i;
		}
		System.out.println("1부터 10까지의 합의 " + total + "입니다.");
	}
	
	void Ex04() {
		//Exercise==============================================
		//1부터 100까지의 수준 짝수의 합을 구하시오 (단, if문 사용)
		int total = 0;
		int total2 = 0;
		for(int i=1;i<=100;i++) {
			if(i % 2 == 0){
				//total=total+i;
				total += i;
			}else {
				//total2=total2+i;
				total2 += i;
			}
		}
		System.out.println("1부터 100까지의 수중 짝수의 합은 " + total + "입니다.");
		System.out.println("1부터 100까지의 수중 홀수의 합은 " + total2 + "입니다.");
		
	}
	void Ex05() {
		//Exercise==============================================
		//1부터 100까지의 수준 짝수의 합을 구하시오 (단, if문 사용X)
		int totalEven = 0;
		for(int i=2;i<=100;i+=2) {
			totalEven +=i;
		}
		System.out.println("1부터 100까지의 수중 짝수의 합은 " + totalEven + "입니다.");
		
	}
	void Ex06() {
		//Exercise================================================
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input your decimal no. :");
		
		int fac = scanner.nextInt();
		double total = 1;
		
		for (int i=1;i<=fac;i++) {
			total *= i;
		}
		System.out.println(fac + "'s facrorial value = " + total);
		
	}
	
}