package com.javalec.base;

public class Student {
	
	//filed
	String name;
	int score;
	
	//constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	//method
	
	//java bean? filed 정해 주고 constructor 생성하고 source->get&set
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
