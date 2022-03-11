package com.test;

public class Outer {
	int a = 10;
	private int b = 20;
	static int c = 30;
	
	class Inner {
		int d = 40;
		
		//static int e = 50;	// static 변수 사용 불가
		public void print() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}
		
		public void info() {
			Inner inner = new Inner();
			inner.print();
		}
	}
}
