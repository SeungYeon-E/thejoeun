package com.javalec.funcion;

public class AddNum {
	//Field
	public int num1, num2;
	
	
	//Constructor 생성자
	public AddNum() {//AddNum 똑같은 이름 쓸수있다 오버로딩
		
	}
	
	
	public AddNum(int num1, int num2) {
		super();
		this.num1 = num1;//AddNum 클래스를 불러오기위한 this. 메소드에서 사용하기위함!!
		this.num2 = num2;
	}


	//Method
	public int addAction (int i, int j) {
		int addResult = i + j;
		
		return addResult;
		
	}
	
	public void addPrint(int i, int j) {
		System.out.println(i+j);
	}
	
	public int addAction2() {
		return num1 + num2;
	}
	
}
