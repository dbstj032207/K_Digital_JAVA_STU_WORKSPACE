import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cnt = 0;
		int result = 0;
		int a = 0;
		int b = 0;
		
		System.out.print("a의 값: ");
		a = scan.nextInt();
		
		do {
			System.out.print("b의 값: ");
			b = scan.nextInt();
			if(b >= a) {
				cnt ++;
				result = b - a;
			}else {
				System.out.println("a보다 큰 값을 입력하세요!");
			}
		} while (cnt < 1);
		System.out.println("b - a는 "+ result + "입니다.");

	}

}
