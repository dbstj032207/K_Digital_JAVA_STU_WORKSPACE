package com.test;

public class Ex05_19 {

	public static void main(String[] args) {
		System.out.println("객체 생성횟수 : " + Counter2.getCount());	// 객체 생성횟수 : 0
		Counter2 c = new Counter2();
		System.out.println("객체 생성횟수 : " + c.getNum());		// 객체 생성횟수 : 1
		
		Counter2 c2 = new Counter2();

		System.out.println("객체 생성횟수 : " + Counter2.getCount());	// 객체 생성횟수 : 2

	}

}
