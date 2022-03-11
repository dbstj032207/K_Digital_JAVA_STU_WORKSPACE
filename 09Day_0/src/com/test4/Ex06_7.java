package com.test4;

public class Ex06_7 {

	public static void main(String[] args) {
		Employee emp = new Employee("홍길동", 2000);
		System.out.println(emp.getEmployee());
		
		emp = new Manager("이순신", 4000, "개발");
		System.out.println(emp.getEmployee());
		
		Manager emp_m = (Manager)emp;
		emp_m.print();
	

	}
	
	
}
