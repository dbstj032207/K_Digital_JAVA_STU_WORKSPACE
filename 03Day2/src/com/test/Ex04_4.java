package com.test;

public class Ex04_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 90;
		char grade;
		
		switch( score / 88 ) {
		
		case 10: grade = 'A'; break;
		case 9: grade = 'A'; //break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default: grade = 'F';
		}
		System.out.println("학점은 " + grade);
	}

}
