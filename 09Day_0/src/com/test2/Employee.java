package com.test2;

class Employee /*extends Object*/ {	// 묵시적 extends Object 추가
	String name;
	int salary;
	
	public Employee() { // 필수 -> 자식 클래스 생성 시 기본 생성자 꼭 필요함
		super(); // 부모늬 기본생성자 호출, 부모 먼저 생성 후 자신을 생성함
		
		System.out.println("emp 기본생성자 호출 됨  ====================");
	}	
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getEmployee() {
		return name + " " + salary;
	}

}
