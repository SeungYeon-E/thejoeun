package com.javalec.base;

public class StringBufferEx {

	public static void main(String[] args) {
		
		//String의 문제점을 해결하기 위해 나온 문자열 선언자들
		
		String string = new String("abcdef");
		
		System.out.println(string);
		
		string += "a";
		string += "1";
		
		System.out.println(string);
		
		//----------------
		StringBuffer stringBuffer = new StringBuffer("abcdef");
		
		stringBuffer.append("hijklmn");
		System.out.println(stringBuffer);
		
		stringBuffer.insert(6, "zzz");
		System.out.println(stringBuffer);
		
		stringBuffer.delete(6, 9);
		System.out.println(stringBuffer);
		

	}

}
