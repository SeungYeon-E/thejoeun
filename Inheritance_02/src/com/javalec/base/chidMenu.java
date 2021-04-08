package com.javalec.base;

public class chidMenu extends ParentsMenu {
	public chidMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mmakeBeefChung() {
		System.out.println("소고기 청국장");
	}
	
	public void makeHotDoen() {
		System.out.println("얼큰 된장");
	}
	
	@Override//오버라이딩 : 상속받은 클래스 메스드 이름을 같이 쓸수있다
	public void makeChung() {
		// TODO Auto-generated method stub
		super.makeChung();//상속받을 클래스 메소드 실행
		System.out.println("냄새 없는 청국장");//내 메소드 실행
	}

}
