package com.javalec.funcion;

public class TotalNum {
	
	public int num1, num2;
	String[] str = new String[4];
	String[] name = {"덧셈","뺄셈", "나눗셈","곱셈"};
	
	public TotalNum() {
	}
	
	
	public TotalNum(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}


	public void Total(){
		SumAction();
		SubAction();
		DivAction();
		MulAction();
		
		for(int i = 0; i<str.length; i++) {
			System.out.println(name[1] + " : " + str[i]);
		}
		
	}

	void SumAction() {
		str[0] = Integer.toString(num1 + num2);
	}
	
	void SubAction() {
		str[1] = Integer.toString(num1 - num2);
	}
	
	void DivAction() {
		String div = "";
		if (num1 == 0 || num2 == 0) {//나눌수 없는 값 구별
			div = "나눌 수 없는 갑입니다.";
		}else {
			div = Double.toString((num1*1.0) / num2);
		}
		str[2] = div;
	}
	
	void MulAction() {
		str[3] = Integer.toString(num1 * num2);
	}
	
}
