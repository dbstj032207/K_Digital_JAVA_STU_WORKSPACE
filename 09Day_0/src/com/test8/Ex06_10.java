package com.test8;

import java.util.Date;

public class Ex06_10 {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);	// Object의 toSting 사용: Thu Mar 10 17:37:49 KST 2022
		System.out.println(d.toString()); // Object의 toSting 사용:Thu Mar 10 17:37:49 KST 2022
		
		Person p = new Person("홍길동", 44);
		System.out.println(p);	// Object의 toSting 사용: com.test8.Person@70dea4e
								// Person에 선언된 toString함수 사용: 
								// Person [name=홍길동, age=44]
		System.out.println(p.toString()); 	// Object의 toSting 사용: com.test8.Person@70dea4e
											// Person에 선언된 toString함수 사용: 
											// Person [name=홍길동, age=44]
	}

}
