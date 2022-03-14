package com.test;

public class Ex10_1 {

	public static void main(String[] args) {
		
		Object [] arr = {"홍길동", "이순신", "유관순", 100};
		for (Object obj : arr) {
			if(obj instanceof String) {
				String name = (String)obj;
				System.out.println("이름: " + name);
			}
		}
	}
}
