package com.javalec.funcion;

public class SumNum {
	
	
	public void Action01(int num){
		int hap = 0;
		
		for(int i=num;i>0;i/=10) {
			hap += (i%10);
		}
		System.out.println("Sum of digits = " + hap);
		
	}

}
