package com.test3;

import java.util.Comparator;

public class PersonComp implements Comparator<Person>{
	
	@Override
	public int compare(Person o1, Person o2) {
		int result = 1;
		if(o1.age >= o2.age) {
			result = -1;	// 내림차순	
		}
		
//		int result = -1;
//		if(o1.age >= o2.age) {
//			result = 1;	// 오름차순	
//		}
		
		return result;		
	}
	
}
