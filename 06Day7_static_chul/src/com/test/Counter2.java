package com.test;

public class Counter2 {
	
	static int count;
	int num;
	public Counter2() {
		count++;
		num = count;
	}
	public int getNum() {
		return num;
	}
	public static int getCount() {
		return count;
	}
	
}
