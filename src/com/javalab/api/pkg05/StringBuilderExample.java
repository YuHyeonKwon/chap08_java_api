package com.javalab.api.pkg05;

public class StringBuilderExample { // class s

	public static void main(String[] args) { // main s

		StringBuilder sb = new StringBuilder("Hello");
		// StringBuilder
		
		sb.append(" World");		// StringBuilder append는 내부 객체추가 없이 문자열 수정 ( 한 객체로 수정 )
		sb.append(" Ha Ha");
		System.out.println(sb);		// print "Hello World Ha Ha"
		System.out.println();
		
		String data = "ABC";
		data += "def";
		System.out.println(data);	// ABCdef
	} // main e

} // class e
