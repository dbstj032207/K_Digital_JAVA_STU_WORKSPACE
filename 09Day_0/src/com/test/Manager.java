package com.test;

class Manager extends Employee{
	
	String depart;
	
	public String getManager() {
		return name + " " + salary + " " + depart;
	}
	
	public Manager() {}
	
	public Manager(String name, int salary, String depart) {
		System.out.println("Manager 생성자 호출 됨 ====================");
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	
	
}
