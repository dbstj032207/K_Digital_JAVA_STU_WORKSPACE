package com.test2;

public class Ex07_7 {

	public static void main(String[] args) {
		Flyer f = new Flyer() {
			
			@Override
			public void takeOff() {
				System.out.println("takeOff");
			}
			
			@Override
			public void land() {
				System.out.println("land");
			}
			
			@Override
			public void fly() {
				System.out.println("fly");
			}
		};
		
		f.fly(); 	// "fly"
		f.takeOff();
		f.land();
	}

}
