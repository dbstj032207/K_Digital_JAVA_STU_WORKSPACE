
public class Sample02_variable5 {

	public static void main(String[] args) {
		int num = 10;	//main 함수에 속한 지역변수
//		int num = 20;	//변수명 중복 사용불가
		System.out.println(num);

	}// main end
	
	public void test() {
		int num = 20;	// test 함수에 속한 지역변수
						// main에서 선언되었어도 다른 함수에서 선언 가능
		System.out.println(num);
	}// test end

}
