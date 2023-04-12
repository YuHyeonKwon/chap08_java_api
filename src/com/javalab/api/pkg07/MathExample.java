package com.javalab.api.pkg07;
/**
 * Math 클래스: 수학 계산용 라이브러리(함수)
 *  - 메소드는 모두 static 메소드이다. 객체 생성없이 클래스 이름으로 접근 가능
 */
public class MathExample { // class s

	public static void main(String[] args) { // main s

		// 큰 정수 또는 작은 정수 얻기
		double v1 = Math.ceil(5.1);		// 소수점이 있으면 무조건 올림
		double v2 = Math.floor(5.3);	// 소수점을 무조건 내림(버림)
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
		
		// 쿤갑 또는 작은값 얻기
		long v3 = Math.max(3, 7);
		long v4 = Math.min(3, 7);
		System.out.println("v3=" + v3);	// v3=7
		System.out.println("v4=" + v4);	// v4=3
		
		// 소수 이하 두 자리 얻기
		double value = 12.3456;
		double temp1 = value * 100;		// 100을 곱하고
		System.out.println("temp1 : " + temp1);
		long temp2 = Math.round(temp1);	// 소수점 첫째자리에서 반올림된 정수 반환
		System.out.println("temp2 : " + temp2);
		double v5 = temp2 / 100.0;		// 100.0으로 나누고
		System.out.println("v5=" + v5);	// v5=12.35
	} // main e

} // class e
