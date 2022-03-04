import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.println("임의의수 입력: ");
			int num = scan.nextInt();
			int sum = 0;
			int i = num;
			
			while ( 1 <= i) {
				System.out.println("임의의수 입력: ");
				i = scan.nextInt();
				sum += i;
				
			}
			
			System.out.println("입력하신 숫자의 총합:" + sum);

	}

}
