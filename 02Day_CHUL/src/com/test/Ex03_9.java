package com.test;

public class Ex03_9 {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 4;
		int c = 19;
		
		// 3항 연산자를 두번 사용해서 a, b, c의 최대값 구하기
		int max = (a > b)? a : b;
		max = (max > c)? max : c;
		System.out.println("최대값은 " + max);
		
		// 3항 연산자의 중첩을 이용해서 한번에 구하기
		int max2 = (a > b)? ((c > a)? c : a) : b;
		System.out.println("최대값은 " + max2);
	}

}
