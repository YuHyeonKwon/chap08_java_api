package com.javalab.api.pkg02;
/**
 * Member 클래스의 객체의 값을 비교하는 실행클래스
 */
public class EqualsExample { // class s

	public static void main(String[] args) { // main s

		Member obj1 = new Member("blue");		// onj1, obj2 는 다른객체 값이 같은거임
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}

		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}

	} // main e

} // class e
