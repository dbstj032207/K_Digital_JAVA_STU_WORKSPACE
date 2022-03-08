
public class Person {
	// 멤버변수
	String name;	
	// 인스턴스 변수, new할때 생성~객체 소멸
	// 사용: (new를 이용하여 생성 후)변수명.name
	
	static int age;	
	// static 변수(클래스 변수), 프로그램 실행 시 main실행전 미리 생성 ~ 프로그램 종료, 객체간의 공유변수로 사용
	// 사용: 클래스명.age
	
	public void a() {
		System.out.println(this.name);
		System.out.println(age);
	}
	
	public static void b() {
		System.out.println(age);
	}
	
	
	
	
}
