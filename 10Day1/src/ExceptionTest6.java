
public class ExceptionTest6 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		int num = 0;
		try {	
			num = 10;
		} finally {	// catch가 없어도 실행됨
			System.out.println("finally 반드시 수행되는 문장");
		}
		
		System.out.println("프로그램 종료");

	}

}
