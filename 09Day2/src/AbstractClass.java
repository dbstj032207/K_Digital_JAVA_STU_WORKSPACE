
public abstract class AbstractClass {	// 추상 클래스 선언
	private int num;
	
	// 추상 메서드
	public abstract void a();	// 추상함수 : {} 없고, abstract 키워드가 있어야함
	public abstract int b();
	public abstract void c(int x);

	public AbstractClass(int num) {
		super();
		this.num = num;
	}

	public AbstractClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	

}
