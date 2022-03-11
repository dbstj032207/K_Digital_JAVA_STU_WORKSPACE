package com.test7;

public class Ex06_9 {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 44);
		Person p2 = new Person("홍길동", 44);
		
		System.out.println(p == p2); 	// 주소값 비교기 때문에 false
		if(p.equals(p2)) {
			System.out.println("p와 p2가 같다");	// Person에서 equals를 지정해줬을 경우
		}else {
			System.out.println("p와 p2는 다르다");	// Object의 equals를 사용할경우
		}
		
	}

}
