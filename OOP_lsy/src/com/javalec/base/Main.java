package com.javalec.base;

import java.util.Scanner;

import com.javalec.funcion.AddNum;
import com.javalec.funcion.DivNum;
import com.javalec.funcion.Gugudan;
import com.javalec.funcion.MulNum;
import com.javalec.funcion.SubNum;
import com.javalec.funcion.SumNum;
import com.javalec.funcion.TotalNum;

public class Main {

	public static void main(String[] args) {
		Exercise ex = new Exercise();
//		ex.Exercise01();
//		ex.Exercise02();
//		ex.Exercise03();
//		ex.Exercise04();
		ex.Exercise05();
		
	}

}
class Exercise {
	void Exercise01() {
		Scanner scanner = new Scanner(System.in);
		
		AddNum addNum = new AddNum();//클래스생성 instance = new 생성자생성
		SubNum subNum = new SubNum();
		DivNum divNum = new DivNum();
		MulNum mulNum = new MulNum();
		
		//정수 입력값 받아서 넣기
		System.out.println("정수 2개를 입력 하세요.");
		int intputnum1 = scanner.nextInt();
		int intputnum2 = scanner.nextInt();
		
		//정수값 덧셈클래스에 입력값 보내서 넘겨받고 출력
		String resultNum1 = addNum.addAction(intputnum1, intputnum2);
		System.out.println("2개의 수의 덧셈 값은 : " + resultNum1);
		
		String resultNum2 = subNum.subAction(intputnum1, intputnum2);
		System.out.println("2개의 수의 뺄셈 값은 : " + resultNum2);
		
		//(1)main클래스에서 구별하기
		if (intputnum1 == 0 || intputnum2 == 0) {//나눌수 없는 값 구별
			System.out.println("나눌 수 없는 갑입니다.");
		}else {
			double resultNum3 = divNum.divAction1(intputnum1, intputnum2);
			System.out.println("2개의 수의 나눗셈 값은 : " + String.format("%.2f", resultNum3) );
		}
		
		
		String resultNum4 = mulNum.mulAction(intputnum1, intputnum2);
		System.out.println("2개의 수의 곱셈 값은 : " + resultNum4);
		
	}
	void Exercise02() {
		
		Scanner scanner = new Scanner(System.in);
		
		AddNum addNum = new AddNum();//클래스생성 instance = new 생성자생성
		SubNum subNum = new SubNum();
		DivNum divNum = new DivNum();
		MulNum mulNum = new MulNum();
		//정수 입력값 받아서 넣기
		System.out.println("정수 2개를 입력 하세요.");
		int intputnum1 = scanner.nextInt();
		int intputnum2 = scanner.nextInt();
		
		//정수값 덧셈클래스에 입력값 보내서 넘겨받고 출력
		String resultNum1 = addNum.addAction(intputnum1, intputnum2);
		System.out.println("2개의 수의 덧셈 값은 : " + resultNum1);
		
		String resultNum2 = subNum.subAction(intputnum1, intputnum2);
		System.out.println("2개의 수의 뺄셈 값은 : " + resultNum2);
		
		String resultNum3 = divNum.divAction(intputnum1, intputnum2);
		System.out.println("2개의 수의 나눗셈 값은 : " + resultNum3);
		
		String resultNum4 = mulNum.mulAction(intputnum1, intputnum2);
		System.out.println("2개의 수의 곱셈 값은 : " + resultNum4);

	}
	void Exercise03() {
		//입력받은 숫자로 구구단을 출력하는 프로그램을 Class를 분리해서 객체기향 형식으로 작성
		//instance 구성시에 몇단을 출력할 것인지 정할것
	
		Scanner scanner = new Scanner(System.in);
		
		Gugudan gugudan = new Gugudan();//클래스생성 instance = new 생성자생성
		
		//정수 입력값 받아서 넣기
		System.out.print("구구단을 출력할 숫자를 입력하세요 :");
		int intputnum = scanner.nextInt();
		
		//정수값 덧셈클래스에 입력값 보내서 넘겨받고 출력
		gugudan.Action01(intputnum);
	
	}
	void Exercise04() {
		//입력한 한자릿수 정수의 합을 출력하는 프로그램을 객체지향 형식으로 작성
	
		Scanner scanner = new Scanner(System.in);
		
		SumNum sumNum = new SumNum();//클래스생성 instance = new 생성자생성
		
		//정수 입력값 받아서 넣기
		System.out.print("Enter an interger(0 ~ 9) : ");
		int intputnum = scanner.nextInt();
		
		//정수값 덧셈클래스에 입력값 보내서 넘겨받고 출력
		sumNum.Action01(intputnum);
	
	}
	void Exercise05() {
		//입력한 두 정수의 합을 출력하는 프로그램을 객체지향 형식으로 작성
	
		Scanner scanner = new Scanner(System.in);
		
		TotalNum totalNum = new TotalNum();//클래스생성 instance = new 생성자생성
		
		//정수 입력값 받아서 넣기
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int intputnum1 = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int intputnum2 = scanner.nextInt();

		System.out.println(">>>>>>결과<<<<<<");
		
		//Filed 값으로 호출
		totalNum.num1 = intputnum1;
		totalNum.num2 = intputnum2;
		
		totalNum.Total();
		
	
	}
	
}