import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		System.out.println("1.정수 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("2.정수 입력하세요.");
		String num2_str = scan.next();
		int num2 = Integer.parseInt(num2_str);
		
		System.out.println("정수 " + num + " 과 정수 " + num2 + " 의 합계: " + (num + num2));
		

	}

}
