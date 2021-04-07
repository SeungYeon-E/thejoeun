package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Afternoon an = new Afternoon();
		
//		an.Example01();
//		an.Example02();
//		an.Example03();
//		an.Example04();
		an.Exercise10();
		
	}

}
	
class Afternoon{
	
	void Example01(){
		
		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		int[] height = new int[name.length];
		int tot = 0;
		int maxindex = 0;
		int lowindex = 0;
		
		//사용자로 부터 정보 입력 받아서 배열에 넣기
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i] + "의 신장을 입력하세요!");
			height[i] = scan.nextInt();
			tot += height[i]; //입력한 정보의 합계 구하기
			
			//for문 하나로 합치기
			if(height[i] > height[maxindex]) {
				maxindex = i;
			}else if(height[i] < height[lowindex]){
				lowindex = i;
			}
			
		}
		
		//입력한 정보의 평균 구하기
		double avg =  (double)tot / height.length;
		
		//비교문
//		for(int i=0;i<height.length;i++) {
//			if(height[maxindex] < height[i]) {
//				maxindex = i;
//			}else if(height[lowindex] > height[i]){
//				lowindex = i;
//			}
//		}
		
		//출력
		System.out.println("평균신장은 : " + String.format("%.2f", avg));
		System.out.println("가장 큰 학생은 " + name[maxindex] + "이고 그 학생의 키는 " + height[maxindex]);
		System.out.println("가장 작은 학생은 " + name[lowindex] +  "이고 그 학생의 키는 " + height[lowindex]);
	}
	
	void Example02() {
		//어렵다
		for(int i=0; i<=10; i++) {
				System.out.println("10^ " + String.format("%2d", i) + " = " 
						+ String.format("%11.0f", Math.pow(10,i)));
			
		}
		//배열
		long[] num = new long[11];
		long result = 1;
		for(int i = 0; i<num.length; i++) {
			num[i] = result;
			System.out.println("10^" + String.format("%2d", i) + " = " + String.format("%11d", num[i]));
			result *= 10;
		}
		//배열없이 다르게
		int num1 = 10;
		long result1 = 1;
		for(int i=0; i<=10; i++) {
			System.out.println("10 ^ " + String.format("%2d", i) + " = " + String.format("%11d", result));
			result1 *= num1;
		}
		
	}
	
	void Example03() {
		int max = 0;
		int maxindex = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");
		int num = scan.nextInt( );
		int[] array = new int[num];
		
		
		System.out.println(num + "개의 숫자를 입력하세요!");
		for(int i=0;i<num;i++) {
			array[i] = scan.nextInt( );
			if(array[i]>array[maxindex]) {
				max = array[i];
				maxindex = i;
			}
		}
		
		System.out.println("입력한 숫자 중 최대값은 " + max + "이고 " + (maxindex+1) + "번째 값 입니다.");

	}
	void Example04() {

		Scanner scan = new Scanner(System.in);
		String subject[] = {"Korean", "English", "Math", "Total", "Average"};
		int sum = 0;
		int avg = 0;
		int student[][] = new int[4][5];
		int count = 0;
		
		for(int i = 0; i<3; i++) {
			System.out.println(subject[i] + "의 성적을 입력:");
			for(int j = 0;j<4; j++){
				System.out.print("No" + (j+1) + "의 성적은:");
				int record = scan.nextInt();
				student[j][i] = record;
			}
		}
		for(int i = 0; i<4; i++) {
			for(int j = 0;j<3; j++){
				sum += student[i][j];
			}System.out.println(sum);
			avg = (sum/3);
			student[i][count+3] = sum;
			student[i][count+4] = avg;
			sum = 0;
		}
		for(int i = 0; i<subject.length; i++) {
			System.out.print("\t" +subject[i]);
		}
		for(int i = 0; i<4; i++) {
			System.out.print("\nNo" + (i+1) + "\t");
			for(int z = 0; z<5; z++){
				System.out.print(student[i][z] + "\t ");
			}
		}
	}
	void Exercise10(){
		int Array[] = new int[10];
		int Arrayback[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input score : ");
		
		for(int i=0;i<10;i++) {
			System.out.print( (i+1) + "의 score :");
			Array[i] = scanner.nextInt();
			Arrayback[Array[i]/10]+=1;
		}
		System.out.println("-------Histogram-------");
		
		for(int j=9;j>=0;j--) {
			System.out.print(j*10 + " : ");
			for(int i=0;i<Arrayback[j];i++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
	}
	void Exe(){//강사님
		int Array[] = new int[10];
		int Arrayback[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		//초기값지정(8점대는 오류걸려)
		for(int i=0;i<Array.length;i++) {
			Array[i] = 0;
		}
		
		
		System.out.println("Input score : ");
		
		//점수를 입력 받으면서 배열의 갯수를 정한다.
		for(int i=0;i<Array.length;i++) {
			System.out.print( (i+1) + "의 score :");
			Array[i] = scanner.nextInt();
			Arrayback[Array[i]/10]++;
		}
		
		scanner.close();//스캐너 종료시켜줘야 정리가 된다.
		
		//출력
		System.out.println("-------Histogram-------");
		
		for(int i=(Arrayback.length-1);i>=0;i--) {
			System.out.print(String.format("%3d : ", i*10));
			for(int j=1; j<=Arrayback[i];j++) {
				System.out.println("#");
			}
			System.out.println();
		}
		
	}
	
}
