package com.test;

public class Ex05_18 {

	public static void main(String[] args) {
		System.out.println("객체 생성횟수 : " + Counter.count);	// 객체 생성횟수 : 0
		Counter c = new Counter();
		System.out.println("객체 생성횟수 : " + c.getNum());		// 객체 생성횟수 : 1
		
		Counter c2 = new Counter();
		
		System.out.println("객체 생성횟수 : " + c2.getNum());	// 객체 생성횟수 : 2
		System.out.println("객체 생성횟수 : " + Counter.count);	// 객체 생성횟수 : 2

	}

}
