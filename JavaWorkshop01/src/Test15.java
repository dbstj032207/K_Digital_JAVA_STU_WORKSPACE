import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		System.out.println("1.정수 입력하세요.");
		Scanner scan = new Scanner(System.in);
		
		
		int num = scan.nextInt();
		
		System.out.println("2.정수 입력하세요.");
		
		int num2 = scan.nextInt();
		
		System.out.println("3.정수 입력하세요.");
		
		int num3 = scan.nextInt();
		
		int max = (num > num2)? ((num3 > num)? num3 : num) : ((num2 > num3)? num2 : num3);
		System.out.println("정수 " + num + "과 정수 " + num2 + ", 정수 " + num3 + " 중에서  최대값: " + max  );
		

	}

}
