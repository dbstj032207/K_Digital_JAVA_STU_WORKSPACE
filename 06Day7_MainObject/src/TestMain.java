
public class TestMain {

	int num;	// 멤버변수
	
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}

	private static void test() {
		System.out.println("test 함수 호출됨 =====================");
	}
	
	public static void main(String[] args) {
		
		test();	// static때문에 가능함
//		System.out.println(this.num);	//err
		TestMain tm = new TestMain();
		System.out.println(tm.num);
		tm.setNum(10);
		System.out.println(tm.getNum());

	}


	

}
