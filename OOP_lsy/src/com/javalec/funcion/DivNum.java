package com.javalec.funcion;

public class DivNum {
	
	public DivNum() {
		// TODO Auto-generated constructor stub
	}
	
	//(1)구별 받은 값에서 정상적으로 계산 출력
	public double divAction1(double num1, double num2) {
		double div = num1 / num2;
		
		return div;
	}
	
	//구별해서 정상적인 값만 보내주기
	public String divAction(int num1,int  num2) {
		String div = "";
		if (num1 == 0 || num2 == 0) {//나눌수 없는 값 구별
			div = "나눌 수 없는 갑입니다.";
		}else {
			div = Double.toString((num1*1.0) / num2);
		}
		return div;
	}
	
}
