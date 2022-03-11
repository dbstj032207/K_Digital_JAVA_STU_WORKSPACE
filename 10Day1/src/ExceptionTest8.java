
public class ExceptionTest8 {

	
	private static void a() throws Exception{
		
		b();
		
		System.out.println("a()함수 종료됨");
		
	}
	
	
	private static void b() throws Exception{
		
		try {
			int num = 10;
			int result = num / 0;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("b()함수 catch문" + e.getMessage());
		}
		
		System.out.println("b()함수 종료됨");
	}


	public static void main(String[] args) {
		
		System.out.println("main 프로그램 시작");
		
		try {
			a();
			
		}catch (Exception e) {
			System.out.println("main에서 처리함" + e.getMessage());
		}
		
		System.out.println("main 프로그램 종료");

	}

	

}
