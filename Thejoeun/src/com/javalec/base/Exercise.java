package com.javalec.base;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
			
			Afternoon an = new Afternoon();

//			an.Exercise07();
//			an.Exercise11();
			an.Exercise13();
	
	}

}
class Afternoon{
	void Exercise07() {
		Scanner scan = new Scanner(System.in);

		System.out.print("몇 단계의 피라미드로 구성할까 ? :");
		int Num = scan.nextInt();
		int Out = 0;
		
		for(int i=1;i<=Num;i++){
			for(int j=0;j<i;j++) {
				Out++;
				System.out.print(String.format("%2d", Out) + " ");
			}
			System.out.println();
		}
		
	}
	void Exercise11() {
		Scanner scan = new Scanner(System.in);

		System.out.print("입력할 숫자의 갯수? :");
		int input = scan.nextInt();
		
		System.out.println(input + "개의 숫자를 입력하세요!:");		
		int Array[] = new int[input];
		
		for(int i=1;i<=input;i++){
			System.out.print(i + "의 숫자 :");
			Array[i-1] = scan.nextInt(); 
			
		}
		System.out.print("검색할 숫자는? :");
		int output = scan.nextInt();
		
		for(int i=0;i<input;i++){
			if(output==Array[i]) {
				System.out.print(output + "의 위치는 " + (i+1) + "번째 입니다.");
				return;
			}
		}
		System.out.print(output + "는 존재하지 않습니다.");
		
	}
	
	void Exercise10() {//강사님
		Scanner scan = new Scanner(System.in);
		int data = 0;
		

		System.out.print("입력할 숫자의 갯수? :");
		int input = scan.nextInt();
		
		System.out.println("4개의 숫자를 입력하세요!:");		
		int Array[] = new int[input];
		
		for(int i=1;i<=input;i++){
			System.out.print(i + "의 숫자 :");
			Array[i-1] = scan.nextInt(); 
			
		}
		System.out.print("검색할 숫자는? :");
		int output = scan.nextInt();
		
		for(data=0;data<input;data++){
			if(output==Array[data]) {
				System.out.print(output + "의 위치는 " + (data+1) + "번째 입니다.");
				break;
			}
		}
		if(data==output) {
			System.out.print(output + "는 존재하지 않습니다.");
		}
	}
	void Exercise12() {
		Scanner scan = new Scanner(System.in);
		int input = 0, inputindex = 0, data = 0;
		

		System.out.print("입력할 숫자의 갯수? :");
		input = scan.nextInt();
		int Array[] = new int[input+1];
		
		System.out.println(input + "개의 숫자를 입력하세요!:");		
		
		for(int i=1;i<=input;i++){
			System.out.print(i + "의 숫자 :");
			Array[i-1] = scan.nextInt(); 
		}
		
		System.out.print("숫자를 삽입하고자 하는 위치는? :");
		inputindex = scan.nextInt();
		
		System.out.print("삽입하고자 하는 숫자는? :");
		data = scan.nextInt();
		
		System.out.println("------ 결과 -------");
		
		for(int i=(Array.length-2);(inputindex-1)<=i;i--) {
				Array[i+1] = Array[i];
		}
		
		Array[inputindex-1] = data;
		
		for(int i=0;i<Array.length;i++) {
			System.out.println(Array[i]);
		}
	}
	void Exercise13() {
		Scanner scan = new Scanner(System.in);
		int input = 0, outputindex = 0, data = 0;
		

		System.out.print("입력할 숫자의 갯수? :");
		input = scan.nextInt();
		int Array[] = new int[input];
		
		System.out.println(input + "개의 숫자를 입력하세요!:");		
		
		for(int i=1;i<=input;i++){
			System.out.print(i + "의 숫자 :");
			Array[i-1] = scan.nextInt(); 
		}
		
		System.out.print("몇번째 숫자를 삭제 하시겠습니까? :");
		outputindex = scan.nextInt();
		
		System.out.println("------ 결과 -------");
		
		for(int i=(outputindex-1);i<(Array.length-1);i++) {
				Array[i] = Array[i+1];
		}
		
		for(int i=0;i<(Array.length-1);i++) {
			System.out.println(Array[i]);
		}
	}
	
}
