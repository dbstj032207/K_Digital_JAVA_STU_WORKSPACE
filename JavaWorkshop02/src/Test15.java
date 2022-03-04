import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		
		int cnt = 0;
		while (cnt < 1) {
			System.out.print("몇 단 삼각형입니까? : ");
			n = scan.nextInt();
			if( n > 0 ) {
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				cnt ++;
				
			}
		
		}

	}

}
