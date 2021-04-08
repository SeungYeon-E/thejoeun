package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
		//기본방법도 길다.
//		StoreHQ storeHQ = new StoreHQ();
//		StoreHQ StoreShop1 = new StoreShop1();//상속받은거라 저기 클래서 이름 쓸수있다
//		StoreHQ StoreShop2 = new StoreShop2();
//		StoreHQ StoreShop3 = new StoreShop3();
		
//		System.out.println("HQ--------------------");
//		storeHQ.orderKim();
//		storeHQ.orderBu();
//		storeHQ.orderBi();
//		storeHQ.orderSoon();
//		storeHQ.orderKong();
//		
//		System.out.println("Shop1--------------------");
//		StoreShop1.orderKim();
//		StoreShop1.orderBu();
//		StoreShop1.orderBi();
//		StoreShop1.orderSoon();
//		StoreShop1.orderKong();
//		
//		System.out.println("Shop2--------------------");
//		StoreShop2.orderKim();
//		StoreShop2.orderBu();
//		StoreShop2.orderBi();
//		StoreShop2.orderSoon();
//		StoreShop2.orderKong();
//		
//		System.out.println("Shop3--------------------");
//		StoreShop3.orderKim();
//		StoreShop3.orderBu();
//		StoreShop3.orderBi();
//		StoreShop3.orderSoon();
//		StoreShop3.orderKong();
//		System.out.println("--------------------");
		
		
		//배열 사용 방법
		StoreHQ[] store = {new StoreHQ(), new StoreShop1(), new StoreShop2(), new StoreShop3()};
		String[] name = {"HQ", "Shop1", "Shop2", "Sop3"};
		
		for(int i=0;i<store.length;i++) {
			System.out.println(name[i] + "===================");
			store[i].orderKim();
			store[i].orderBu();
			store[i].orderBi();
			store[i].orderSoon();
			store[i].orderKong();
		}
		System.out.println("===================");
		
	}

}
