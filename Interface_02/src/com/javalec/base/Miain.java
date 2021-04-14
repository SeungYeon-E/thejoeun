package com.javalec.base;

class Miain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffe aCoffe = new ACoffe();
		Coffe bCoffe = new BCoffe();
		
		Coffe[] smartPhone = {aCoffe, bCoffe};
		
		for(int i=0;i<smartPhone.length;i++) {
			smartPhone[i].americano();
			smartPhone[i].cafelatte();
			smartPhone[i].cappuccino();
			System.out.println("--------------------------------");
		
		}
		

	}

}
