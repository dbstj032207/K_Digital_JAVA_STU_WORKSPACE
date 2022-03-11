package com.test;

public class Ex08_1 {

	public static void main(String[] args) {
		
		String str = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = "Hello";
		
		// 위치(주소)값 비교
		System.out.println(str == str2);	// false
		System.out.println(str3 == str4);	// true
		
		// 실제값 비교
		if (str.equals(str2)) {	// true
			System.out.println("str과 str2는 같다");
		}
		if (str3.equals(str4)) {	// true
			System.out.println("str3과 str4는 같다");
		}
	}

}
