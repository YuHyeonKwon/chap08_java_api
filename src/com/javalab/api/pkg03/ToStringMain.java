package com.javalab.api.pkg03;

public class ToStringMain { // class s

	public static void main(String[] args) { // main s

		SmartPhone myPhone = new SmartPhone("삼서전자", "안드로이드");
		
		String strObj = myPhone.toString();		// toString()메소드 호출
		System.out.println(strObj);
		
		// 해당 클래스가 toString() 메소드 오버리딩 하지 않으면
		// 객체의 주소값이 나옴
		System.out.println(myPhone);		// toString() 메소드 호출
	} // main e

} // class e
