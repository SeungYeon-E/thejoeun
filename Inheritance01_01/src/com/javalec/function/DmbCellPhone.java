package com.javalec.function;

public class DmbCellPhone extends CellPhone {
	//field
	public int channel;
	
	//constructor
	public DmbCellPhone() {
		// TODO Auto-generated constructor stub
	}

	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//method
	
	public void myCellPhone() {
		System.out.println("모델 : " + model + "\n색상 : " + color + "\n채널 : " + channel);
	}
	
	public void trunOnDmb() {
		System.out.println("재널 " + channel + "번 DMB방송 수신을 시작 합니다.");
	}
	
	public void changeCannelDmb(int channel) {
		this.channel = channel;//this는 나의 필드값 구별
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
}
