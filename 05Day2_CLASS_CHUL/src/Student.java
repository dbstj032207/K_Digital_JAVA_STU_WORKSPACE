
public class Student {
	
	// 멤버변수 영역
	String name;
	int age;
	String address;
	
	// 생성자 영역 : 클래스 이름과 동일하게 사용, 객체 생성 시 호출
	public Student(){	// [접근제한자] [클래스이름]()
						// 매개변수가 없는 경우 => 기본 생성자 - 명시적 작성 
						//                           - 묵시적 작성(자동 작성): public Student(){}
		System.out.println("생성자 호출됨 ====================");
		name = "test";
		age = 20;
		address = "경기";
	}
	
}
