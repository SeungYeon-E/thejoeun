package com.javalec.base;

public class ThrowsClass {
	//filed
	
	//constructor
	public ThrowsClass() {
		doC();
	}
	
	
	//method
	private void doA() {
		System.out.println("doA");
		int[] arr = {1,2,3,4};
		System.out.println(arr[4]);//여기서 오류가 났다
		System.out.println("endA");
	}
	
	private void doB() {
		System.out.println("doB");
		try {
			doA();
		}catch(Exception  e) {//그래서 예외처리가 된거야
			System.out.println("Exception은 여기서");
			System.out.println(e.getMessage());
		}
		System.out.println("endB");
		
	}
	
	private void doC() {
		System.out.println("doC");
		doB();
		System.out.println("endC");
		
	}

}
