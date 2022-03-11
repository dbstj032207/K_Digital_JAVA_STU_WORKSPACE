package com.test6;

public class Pet {
	String name;
	int age;
	String gender;
	
	public Pet(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getPet() {
		return name + "\t" + age + "\t" + gender;	
	}

}

