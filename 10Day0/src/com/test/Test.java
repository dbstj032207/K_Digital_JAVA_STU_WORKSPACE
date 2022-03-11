package com.test;

public class Test {

	public static void main(String[] args) {

		String test = "1";
		System.out.println(test + 2); 		// "12"
		System.out.println(test + "2"); 	// "12"
		
		System.out.println(test); 	// "1"
		
		String test2 = test + "2";
		System.out.println(test2); 	// "12"

	}

}
