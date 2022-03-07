
public class Student {

	
	String name;
	int age;
	String address;
	
	public Student() {	// 기본생성자를 명시적으로 작성
		System.out.println("기본(default) 생성자 호출됨 ===========================");
	}
	
	// 오버로딩: 생성자의 이름은 동일하지만, 매개변수가 다른 것으로 구분 지어서 사용함.
	public Student(String n) {	// 매개변수 1개를 받는 생성자를 명시적으로 작성 
								// 이는 JDK가 기본생성자를 만들어주지 않음
		System.out.println("매개변수 1개짜리 생성자 호출됨 ===========================");
		name = n;	// 멤버변수 name을 매개변수 n 값으로 초기화
	}
	
}
