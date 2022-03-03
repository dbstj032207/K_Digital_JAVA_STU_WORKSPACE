import java.util.*;

public class ScannerTest3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 입력 ");
		
		String str = scan.next();
		
		System.out.println("두번째 입력 ");
		
		String str2 = scan.next();
		
		// 입력한 이름이 서로 같은지 판단
		String message = (str.equals(str2))? "이름이 같음" : "이름이 다름";
		System.out.println(message);
		scan.close();

	}

}
