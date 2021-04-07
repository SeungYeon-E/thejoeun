package com.javalec.base;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		
		System.out.println(year + ":" + month + ":" + day);
		System.out.println(hour + ":" + minute + ":" + second);
		
		
	}

}
