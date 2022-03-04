
public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1. 0부터 9까지 출력");
		for (int i3 = 0; i3 < 10; i3++) {
			System.out.println("hello " + i3);
		}
		System.out.println(" =====================================");
		
		System.out.println("2. 10부터 1까지 출력");
		for (int i2 = 10; i2 > 0; i2--) {
			System.out.println("hello " + i2);
		}
		
		System.out.println(" =====================================");
		
		System.out.println("3. 짝수만 출력");
		for (int i = 0; i < 11; i += 2) {
			System.out.println("hello " + i);
		}
		
		System.out.println(" =====================================");
		
		System.out.println("4. 초기값을 여러개 사용");
		int i = 0;
		int j = 0;	// 초기값을 여러개 사용하는 경우 반드시 for문 밖에서 선언
		for (i = 0, j = 0; i < 5 && j < 3; i++, j++) {
			System.out.println("happy " + i + ":" + j);
			
		}
		
		System.out.println(" =====================================");
		
		System.out.println("5. 이중(중첩)for문");
		for (int j2 = 0; j2 < 5; j2++) {
			for (int k = 0; k < 4; k++) {
				System.out.println(j2 + "\t" + k);
			}
		}
		
		System.out.println(" =====================================");
		
		System.out.println("5-1. 이중(중첩)for문 활용, 구구단");
		for (int j2 = 2; j2 < 10; j2++) {
			for (int k = 1; k < 10; k++) {
				System.out.println(j2 + " * " + k + " = " + (j2 * k));
			}
		}
		
		System.out.println(" =====================================");
		
		System.out.println("6. 누적합계 (1 ~ 100 까지의 총합)");
		int sum = 0;
		for (int j2 = 1; j2 < 101; j2++) {
			sum += j2;
			System.out.println("누적되는 합계: " + j2 + "\t" + sum);
		}
		System.out.println("총합은 : " + sum);
		
		System.out.println(" =====================================");
		
		System.out.println("7. 이중 for문 2");
		for (int k = 0; k < 6; k++) { // 0~5
			for (int n = 0; n <= k; n++) { // 0~0, 0~1, 0~2, 0~3, 0~4, 0~5
				System.out.println(k + "\t" + n);
			}
			System.out.println(" ---------------------------------- ");
		}
		
		System.out.println(" =====================================");
		
		System.out.println("7- 1. 이중 for문 2 활용(계단식으로 * 찍기)");
		for (int k = 0; k < 6; k++) { // 0~5
			for (int n = 0; n <= k; n++) { // 0~0, 0~1, 0~2, 0~3, 0~4, 0~5
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println(" ========= main 마지막 부분 ==============");
	}

}
