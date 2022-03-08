
public class TestMain {

	static {	// static 초기화 블럭: 특정 작업의 초기화
		System.out.println("static 초기화 블럭");
	}
	
	{// 인스턴스 초기화 블럭: 객체 생성시 초기화
		System.out.println("인스턴스 초기화 블럭");
	}
	
	public TestMain() {
		System.out.println("TestMain 생성자");
	}

	public static void main(String[] args) {
		
		TestMain m = new TestMain();
		// static 초기화 블럭
		// 인스턴스 초기화 블럭
		// TestMain 생성자
		
		TestMain m2 = new TestMain();
		// 인스턴스 초기화 블럭
		// TestMain 생성자

	}

}
