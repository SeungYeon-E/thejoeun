package com.javalec.base;

public class StoreShop3 extends StoreHQ {
	
	public StoreShop3() {
	}
	
	@Override
	public void orderKim() {
		System.out.println("김치찌개 : 6,000원");
	}
	@Override
	public void orderBu() {
		System.out.println("부대찌개 : 7,000원");
	}
	@Override
	public void orderBi() {
		System.out.println("비빔밥 : 7,000원");
	}
	@Override
	public void orderSoon() {
		System.out.println("순대국 : 6,000원");
	}

}
