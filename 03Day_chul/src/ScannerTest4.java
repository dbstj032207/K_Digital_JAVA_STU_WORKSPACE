import java.util.*;

public class ScannerTest4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자");
		
		String num_str = scan.next();
		
		int num = Integer.parseInt(num_str);
		
		
		// 홀수인지 짝수인지 확인
		String message = (num % 2 == 1)? "홀수" : "짝수";
		System.out.println(message);
		scan.close();

	}

}
