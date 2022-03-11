
public class ConcreteClass2 extends AbstractClass{

	@Override
	public void a() {
		System.out.println("a() ======================== ");
		
	}

	@Override
	public int b() {
		System.out.println("b() ======================== ");
		return 0;
	}

	@Override
	public void c(int x) {
		System.out.println("c() ======================== " + x);
		
	}

	
	
}
