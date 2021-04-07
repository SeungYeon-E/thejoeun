package com.javalec.base;

import java.util.Scanner;

public class Int {

	public static void main(String[] args) {
		
		System.out.print("Enter an integer(0~9) : ");
		Scanner scanner = new Scanner(System.in);
		int Num = scanner.nextInt();
		int total = 0;
		
		for(int i=Num;i>0;i/=10) {
			total += i % 10 ;
		}
		System.out.println("Sum of digits = " + total);
		
	}

}
