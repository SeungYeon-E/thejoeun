package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//student라는 java bean 을 만들어서 쓰기
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		arrayList.add(new Student("James", 100));
		arrayList.add(new Student("Roberts", 90));
		arrayList.add(new Student("Cathy", 95));
		
		for(int i = 0;i<arrayList.size();i++) {
			System.out.print(arrayList.get(i).getName() + "\t\t");
			System.out.println(arrayList.get(i).getScore());
			
		}
		
	}

}
