package com.test5;

public class Ex06_8 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Manager man = new Manager();
		Engineer eng = new Engineer();
		
		emp.taxRate(emp);	// Employee 세금 구하기
		man.taxRate(man);	// Manager 세금 구하기
		eng.taxRate(eng);	// Engineer 세금 구하기
	}
}
