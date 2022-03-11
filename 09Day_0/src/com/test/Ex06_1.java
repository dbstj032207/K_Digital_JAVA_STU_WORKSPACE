package com.test;

public class Ex06_1 {

	public static void main(String[] args) {
		Employee emp = new Employee("홍길동", 2000);
		System.out.println(emp.getEmployee());
		
		System.out.println("=============================");
		
		Manager man = new Manager("이순신", 4000, "개발");
		System.out.println(man.getManager());
	
		System.err.println();
	}
	
	
}
