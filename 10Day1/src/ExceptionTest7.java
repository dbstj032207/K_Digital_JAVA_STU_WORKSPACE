
public class ExceptionTest7 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		int num = 0;
		try {	
			
			num = 10;
//			int result = num / 0;		// ArithmeticException 
//			System.out.println(result);
			
//			String test = null;
//			System.out.println(test.length()); // NullPointerException
			
			int [] num2 = {10, 20};
			System.out.println(num2[3]);
			
		} catch (ArithmeticException e) {	
			e.printStackTrace();
			System.out.println("예외 발생1: " + e.getMessage());	
		} catch (NullPointerException e) {	
			System.out.println("예외 발생2: " + e.getMessage());
		} catch (Exception e) {	// Exception e에 모든 에러가 다 잡힘
			System.out.println("예외 발생3: " + e.getMessage());
		} finally {
			System.out.println("finally 반드시 수행되는 문장");
		}
		
		System.out.println("프로그램 종료");

	}

}
