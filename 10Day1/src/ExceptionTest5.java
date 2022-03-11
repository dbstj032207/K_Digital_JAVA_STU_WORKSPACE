
public class ExceptionTest5 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		int num = 0;
		try {	
			
			num = 10;
			int result = num / 0;		// ArithmeticException 
			System.out.println(result);
			
		} catch (ArithmeticException e) {	
			System.out.println("예외 발생1: " + e.getMessage());	
		} 
		
		try {	
			String test = null;
			System.out.println(test.length()); // NullPointerException

		}catch (NullPointerException e) {	
			System.out.println("예외 발생2: " + e.getMessage());
		}
		
		try {	
			int [] num2 = {10, 20};
			System.out.println(num2[3]);
		}catch (Exception e) {	// Exception e에 모든 에러가 다 잡힘
			System.out.println("예외 발생3: " + e.getMessage());
		}
		
		System.out.println("프로그램 종료");

	}

}
