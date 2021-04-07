package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		//String의 문제점을 해결하기 위해 나온 문자열 선언자들
		String string = new String("abcdef");
		
		StringBuilder stringBuilder = new StringBuilder("abcdef");
		stringBuilder.append("hijklmn");//붙이기
		System.out.println(stringBuilder);
		
		stringBuilder.insert(3, "zzz");//삽입
		System.out.println(stringBuilder);
		
		stringBuilder.delete(3, 6);
		System.out.println(stringBuilder);//삭제
		
		//-------
		StringBuffer stringBuffer = new StringBuffer("abcdef");
		stringBuffer.append("hijklmn");//붙이기
		System.out.println(stringBuffer);
		
		stringBuffer.insert(3, "zzz");//삽입
		System.out.println(stringBuffer);
		
		stringBuffer.delete(3, 6);
		System.out.println(stringBuffer);//삭제
		
		
	}

}
