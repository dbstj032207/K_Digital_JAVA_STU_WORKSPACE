//
//public class TestStudent_Backup {
//
//	public static void main(String[] args) {
//			
//		Student stu1 = new Student("홍길동", 10, "서울");	
//		
//		// 1. 이름 변경 및 출력
////		stu1.name = "김길동"	// 접근 제한으로 인해 변경 불가
//		
//		stu1.setName("김길동"); 	// 작성해놓은 setName 함수를 사용하여 변경
//				
////		System.out.println(stu1.name);	// 접근 제한으로 인해 출력 불가
//		
//		System.out.println(stu1.getName());	// 김길동, 작성해놓은 getName 함수를 사용하여 출력
//		
//		// 2. 나이 변경 및 출력
//		stu1.setAge(-10);	// 나이 값 조건 (age > 0)에 위배됨, 값이 변경되지 않음
//		System.out.println(stu1.getAge());	// 10
//		stu1.setAge(20);
//		System.out.println(stu1.getAge());	// 20
//		
//		// 3. 주소값 변경 및 출력
//		stu1.setAddress("제주"); 	// 작성해놓은 setAddress 함수를 사용하여 변경
//		
//		System.out.println(stu1.getAddress());	// 경기, 작성해놓은 getAddress 함수를 사용하여 출력
//		
//					
//	}// end main
//	
//	
//}
