package com.test2;

class Manager extends Employee{
	
	String depart;
	
	public String getManager() {
		return super.getEmployee() + " " + depart;
	}
	
	public Manager() {}
	
	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	
	
}
