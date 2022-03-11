
public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
//		int num = 10;
//		int result = num / 0;	// ArithmeticException: / by zero 발생
//	
//		String test = null;
//		System.out.println(test.length());	// NullPointerException
		
		/* 예외처리 필요 */
		// try ~ catch문 사용
		try {	// ex 발생 코드
			int num = 10;
			int result = num / 1;	
			String test = null;
			System.out.println(test.length());	// 예외 발생 -> catch문으로 이동
												// catch문 조건에 있는 예외임
												// catch문 실행
		} catch (NullPointerException e) {	// ex 발생 시 처리 코드
			System.out.println("예외 발생하여 catch블럭 실행됨");
		}
		
		
		System.out.println("프로그램 종료");

	}

}
