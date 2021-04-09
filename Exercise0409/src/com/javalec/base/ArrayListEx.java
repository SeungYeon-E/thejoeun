package com.javalec.base;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		int sum = 0;
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i = 1;i<=100;i++) {
			if(i%2==0) {
				arrayList.add(i);
				sum += arrayList.get((arrayList.size()-1));
			}
		}
		
		System.out.println("ArrayList 짝수의 합은 : " + sum);

	}

}
