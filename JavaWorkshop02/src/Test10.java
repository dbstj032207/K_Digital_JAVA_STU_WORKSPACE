import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 n까지의 총합 구하기 [ do while문 이용 ]");
		int cnt = 0;
		int sum = 0;
		int n = 0;
		do {
			System.out.print("n 값: ");
			n = scan.nextInt();
			if(n > 0) {
				cnt ++;
				for (int i = 0; i <= n; i++) {
					sum += i;
				}
			}else {
				System.out.println("양수값을 입력해 주세요");
			}
		} while (cnt < 1);
		
		System.out.println("1부터 " + n + " 까지의 총합: " + sum );
		
		System.out.println("======================================");
		
		System.out.println("1부터 n까지의 총합 구하기 [ while문 이용 ]");
		cnt = 0;
		sum = 0;
		while (cnt < 1) {
			System.out.print("n 값: ");
			n = scan.nextInt();
			if(n > 0) {
				cnt ++;
				for (int i = 0; i <= n; i++) {
					sum += i;
				}
			}else {
				System.out.println("양수값을 입력해 주세요");
			}
		};
		
		System.out.println("1부터 " + n + " 까지의 총합: " + sum );

	}

}
