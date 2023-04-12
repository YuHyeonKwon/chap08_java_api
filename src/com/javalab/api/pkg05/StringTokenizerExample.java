package com.javalab.api.pkg05;

import java.util.StringTokenizer;

public class StringTokenizerExample { // class s

	public static void main(String[] args) { // main s

		String data1 = "홍길동&이수홍,박연수;채리나";

		// 여러개의 구분자로 분리(자름), 구분자는 "|" 로 분리

		String[] arr = data1.split("&|,|;");	// 잘린다음에 여러개로 나눠져서 배열로 받아야됨
		for (String token : arr) {
			System.out.println(token);
		}
		System.out.println();

		// StringTokenizer 클래스로 문자열 분리(자름)
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");	// StringTokenizer 자르면 객체(st) 안에 내용이 들어간다.

		// 더이상 가져올 값이 없으면 예외 발생하기 때문에 hasMoreTokens로 확인
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	} // main e

} // class e
