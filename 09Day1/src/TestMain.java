
public class TestMain {

	public static void main(String[] args) {
		
//		AbstractClass x = new AbstractClass();	// 추상화 클래스의 객체 생성 불가
		
		ConcreteClass y = new ConcreteClass(100);
		System.out.println(y.getNum());
		
		AbstractClass y2 = new ConcreteClass(200);	// 다형성 성립
		System.out.println(y2.getNum());
	}

}
