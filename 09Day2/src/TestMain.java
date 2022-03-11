
public class TestMain {

	public static void main(String[] args) {
		
//		AbstractClass x = new AbstractClass();	// 추상화 클래스의 객체 생성 불가
		
		ConcreteClass y = new ConcreteClass(100);
		System.out.println(y.getNum());
		y.a();
		int n = y.b();
		y.c(200);
		
		AbstractClass y2 = new ConcreteClass2();	// 다형성 성립
		System.out.println(y2.getNum());
		y2.a();
		int n2 = y.b();
		y2.c(100);
	}

}
