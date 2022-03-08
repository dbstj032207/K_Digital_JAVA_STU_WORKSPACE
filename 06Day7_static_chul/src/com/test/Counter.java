package com.test;

public class Counter {
	
	static int count;
	int num;
	public Counter() {
		count++;
		num = count;
	}
	public int getNum() {
		return num;
	}
	
}
