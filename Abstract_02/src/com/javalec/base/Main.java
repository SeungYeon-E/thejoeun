package com.javalec.base;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LunchMenu child1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		
		
		System.out.println("Child1의 식대 : " + child1.calc());
	}

}
