import java.util.Random;


public class ExceptionTest13 {

	public static void myRandom() throws UserException {
		Random r = new Random();
		int num = r.nextInt(3); // 0, 1, 2
		if(num == 0) {
			throw new UserException("랜덤값 0이 나와 예외발생");
		}
	}
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			myRandom();
		} catch (UserException e) {
			System.out.println("예외발생: " + e.getMessage());	
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	}

}
