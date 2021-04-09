package com.javalec.base;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		//Set collection 집합 개념이라 중복 안들어가
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("c");
		
		System.out.println(hashSet);

	}

}
