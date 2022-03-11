package com.test3;

public class Ex06_6 {

	public static void main(String[] args) {
		Employee emp = new Employee("홍길동", 2000);
		System.out.println(emp.getEmployee());
		
		System.out.println("=============================");
		
		Manager man = new Manager("이순신", 4000, "개발");
		System.out.println(man.getEmployee());
	
		System.err.println();
		
		// 다형성
		// 서로 타입이 맞지 않지만 상속 관계이기때문에 가능하다
		// 부모 타입의 변수에 자식 객체 저장이 가능함
		Employee t = new Manager("aaa", 100, "bb");
		
//		System.out.println(t.depart);	
					// err: 다형성으로 저장 가능하지만 t의 타입이 Employee이기 때문에 
					//		부모인 Employee의 함수, 변수만 사용가능 
		
//		t.print();	// err: 자식(Manager)에만 있는 함수이기때문에 형변환을 해야 사용가능
		
		System.out.println(t.getEmployee());
					// getEmployee 함수는 부모(Employee)에도 있고 
					// 자식(Manager)에도 있는 함수임
					// 따라서 사용 가능 => Manager의 getEmployee 호출
		// 다양성 객체의 오버라이딩 함수는 실체의 객체의 함수가 호출됨
		
		
		// Manager클래스에 있는 depart 변수를 사용하기 위해 형변환
		Manager m = (Manager)t;
		System.out.println(m.depart);	// 사용 가능
		m.print();	// 사용 가능
		System.out.println(m.getEmployee());	// Employee의 getEmployee 호출
	}
	
	
}
