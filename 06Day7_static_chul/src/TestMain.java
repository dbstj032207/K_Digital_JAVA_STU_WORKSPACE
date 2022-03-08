
public class TestMain {

	public static void main(String[] args) {
		
		// static 변수: 객체 생성없이 [클래스 이름.변수명]으로 사용가능
		System.out.println(Person.age);	// 0
		
		System.out.println("=========================");
		
		Person p = new Person();
		p.name = "홍길동";
		System.out.println(p.name);	// 홍길동
		System.out.println(p.age);	// 0
		
		System.out.println("=========================");
		p.a();	// 홍길동
				// 0
		System.out.println("=========================");
		
		Person.age = 10;
		Person p2 = new Person();
		p2.name = "이순신";
		p2.a();	// 이순신
				// 10
		
		System.out.println("=========================");
		p.a(); 	// 홍길동
				// 10
	}

}
