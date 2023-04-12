package com.javalab.api.pkg05;
/**
 * 문자열 공백 자르기
 */
public class StringTrimExample { // class s

	public static void main(String[] args) { // main s

		String tel1 = "  02";
		String tel2 = "123  ";
		String tel3 = "   1234   ";
		
		String tel = tel1.trim() + "|" + tel2.trim() + "|" + tel3.trim();
		System.out.println(tel);
	} // main e

} // class e
