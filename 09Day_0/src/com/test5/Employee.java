package com.test5;

class Employee /*extends Object*/ {	// 묵시적 extends Object 추가
	
	// instance of 사용시 자식 => 부모 순으로 비교
	public void taxRate(Employee e) {
		if(e instanceof Manager) {
			Manager m = (Manager)e;
			System.out.println("Manager 세금 구하기");
		}else if(e instanceof Engineer) {
			Engineer en = (Engineer)e;
			System.out.println("Engineer 세금 구하기");
		}else if(e instanceof Employee) {
			System.out.println("Employee 세금 구하기");
		}	
	}
	
	public Employee test() {
//		return new Employee();
//		return new Manager();
		return new Engineer();
	}
}
