package com.bank;

public class Bank {
	
	
	private String name;
	
	// Step 1. 생성자를 private으로 생성 못하게 제한
	private Bank() {}	 
	
	// Step 2. 클래스의 static변수 선언 후 자체적으로 객체를 생성하고 저장
	private static Bank b = new Bank();	
	
	// Step 3. 다른 클래스에서 받아 가도록 static get함수 작성
	//   - 필요한 곳에서 bank를 받아서 사용함
	public static Bank getBank() {
		return b;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
