package com.javalec.base;

import com.javalec.function.SumEvenOdd;
import com.javalec.function.SumEvenOdd2;

public class Main {

	public static void main(String[] args) {
		
		int i=1, j=10;
		
		//SumEvenOdd 생성
//		SumEvenOdd sumEvenOdd = new SumEvenOdd();
//		int sum = sumEvenOdd.sumClac(i, j);
//		
//		String chk = sumEvenOdd.evenOdd(sum);
//		
//		System.out.println(i + " ~ " + j + " 의 합은 " + sum + "입니다.");
//		System.out.println(chk + "입니다.");
		
		SumEvenOdd2 sumEvenOdd2 = new SumEvenOdd2();
		sumEvenOdd2.sumClac(i, j);
		sumEvenOdd2.evenOdd();
		
	}

}
