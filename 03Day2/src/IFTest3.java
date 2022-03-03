import java.util.Scanner;

public class IFTest3 {

	public static void main(String[] args) {
		
		// 2. 다중 if-else문
		System.out.println("점수 입력하시오");
		Scanner scan = new Scanner(System.in);
		
		//int num = scan.nextInt();
		String num_str = scan.next();
		int num = Integer.parseInt(num_str);
		
		if (num >= 90) {
			System.out.println("A");
		}else if (num >= 80) {
			System.out.println("B");
		}else if (num >= 70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		// 역순으로 비교
		if (num < 70) {
			System.out.println("F");
		}else if (num < 80) {
			System.out.println("C");
		}else if (num < 90) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}

		System.out.println(num);
		System.out.println("문장3");
		
	}

}
