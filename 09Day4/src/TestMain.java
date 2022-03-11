
public class TestMain {

	public static void main(String[] args) {

//		A a = new A();	// err: 인터페이스 객체 생성 불가
		System.out.println(A.NUM);
//		A.NUM = 10;		// err: 인터페이스내 변수 수정 불가
		
		ConcreteClass t = new ConcreteClass();
//		System.out.println(t.NUM);
		
		t.a();
		t.b();
		t.c();
		A.d();
		
		// 다형성 가능
		A tt = new ConcreteClass();
	}

}
