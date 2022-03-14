package com.test;

public class EX09_7_2 {

	public static void check(int num) {
		
		try {
			if(num < 100) {
				throw new Exception("num 값이 100 보다 작다");
			}
		} catch (Exception e) {
			System.out.println("예외발생: " + e.getMessage());	
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		check(70);
		System.out.println("프로그램 종료");
		
	}

}
