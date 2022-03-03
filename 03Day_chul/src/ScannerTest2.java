import java.util.*;

public class ScannerTest2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력 ");
		
		String str = scan.next();
		
		// 입력한 이름이 "홍길동"인지 판단
		boolean result = str.equals("홍길동");
		String message = (result)? "이름이 같음" : "이름이 다름";
		System.out.println(message);
		
		String message2 = (str.equals("홍길동"))? "이름이 같음" : "이름이 다름";
		System.out.println(message2);
		scan.close();

	}

}
