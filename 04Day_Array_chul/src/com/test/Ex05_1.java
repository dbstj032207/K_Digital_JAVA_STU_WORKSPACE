package com.test;

public class Ex05_1 {

	public static void main(String[] args) {
		int [] num;
		num = new int[4];
		
		for (int i = 0; i < num.length - 1; i++) {
			num[i] = i+1;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(" 배열 값 : " + num[i]);
		}
	}

}
