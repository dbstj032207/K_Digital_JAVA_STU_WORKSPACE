package com.test3;

class Manager extends Employee{
	
	String depart;
	
	@Override
	public String getEmployee() {
		System.out.println("Manager getEmployee()  ====================");
		return super.getEmployee() + " " + depart;
	}
	
	public Manager() {}
	
	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	
	public void print() {
		System.out.println("Manager print() ================ ");
	}
	
	
	
}
