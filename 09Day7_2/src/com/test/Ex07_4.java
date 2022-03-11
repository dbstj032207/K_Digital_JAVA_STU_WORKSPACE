package com.test;

import com.test.Outer.Inner;

public class Ex07_4 {

	public static void main(String[] args) {
		Outer outer = new Outer();
//		outer.info();
		
		Outer.Inner inner = outer.new Inner();
		inner.print();
	}

}
