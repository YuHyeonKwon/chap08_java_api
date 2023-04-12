package com.javalab.api.pkg05;
/**
 * 영문 (대소문자) 변환
 */
public class StringToLowerUpperCaseExample { // class s

	public static void main(String[] args) { // main s

		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();		// 소문자로 만들어줌		
		String lowerStr2 = str1.toLowerCase();
		
		System.out.println(lowerStr1.equals(lowerStr2));
		
		// equalsIgnoreCase 대소문자 구분 없이 비교
		System.out.println(str1.equalsIgnoreCase(str2));
	      /*
	       * equalsIgnoreCase : 대소문자 구분안함.
	       * equals : 대소문자 구분함.
	       * 문자열이 같은경우 true 리턴
	       * 문자열이 다른경우 false 리턴
	       * 
	       * toUpperCase : 문자열을 대문자로 변경
	       * toLowerCase : 문자열을 소문자로 변경
	       */
	} // main e

} // class e
