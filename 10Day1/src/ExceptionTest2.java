
public class ExceptionTest2 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		int num = 0;
		try {	
			
			num = 10;
			int result = num / 0;		// ArithmeticException 여기서 잡힙 
			System.out.println(result);
			
			String test = null;
			System.out.println(test.length()); // NullPointerException
			
		} catch (ArithmeticException e) {	
			e.printStackTrace();
			System.out.println("예외 발생: " + e.getMessage());	// 여기 실행하고 빠져나옴
		} catch (NullPointerException e) {	
			System.out.println("예외 발생: " + e.getMessage());
		}
		
		System.out.println("프로그램 종료");

	}

}
