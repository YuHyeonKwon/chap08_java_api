package com.javalab.api.pkg02;

public class Member extends Object { // class s

	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// 최고조상인 Object가 갖고 있는 equals메소드 재정의함.
	// 동등비교: 객체가 달라도 내용이 같은지 비교함.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {		// instanceof 왼쪽에 obj 객체가 Member 객체가 맞는지 찾아주는 기능
			Member mem = (Member)obj;
			if(id.equals(mem.id)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
} // class e
