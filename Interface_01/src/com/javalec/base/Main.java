package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		SmartPhone aPhone = new APhone();
		SmartPhone bPhone = new BPhone();
		SmartPhone cPhone = new CPhone();
		
		SmartPhone[] smartPhone = {aPhone, bPhone, cPhone};
		
		for(int i=0;i<smartPhone.length;i++) {
			smartPhone[i].callSenderReceiver();
			smartPhone[i].telMethod();
			smartPhone[i].tvRemoteController();
			System.out.println("--------------------------------");
		
		}
		
	} 

}
