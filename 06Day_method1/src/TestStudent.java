
public class TestStudent {

	public static void main(String[] args) {
		
		Student stu1 = new Student("홍길동", 20, "서울");
		System.out.println(stu1.getName());
		
		String name = stu1.getName();
		int age = stu1.getAge();
		String address = stu1.getAddress();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		
		// err code
//		stu1.setAge();	// 매개변수가 없기때문에 err
//		stu1.setAge("이순신", 50);	// 매개변수가 2개이기 때문에 err
//		int aaa = stu1.setAge(50); 	// setAge함수는 리턴값이 없기때문에 err
		stu1.getName();	// 리턴 값을 활용하지 않지만 에러는 아님
		
		
		// toString함수
		System.out.println(stu1); 	// 객체의 주소
		// 묵시적 참조변수.toString(); 로 변환 사용 => toString이 구현 안된경우 객체의 주소
		// 구현된 경우 toString호출 사용
		System.out.println(stu1); 	// Student [name=홍길동, age=20, address=서울]
		
		
	}

}
