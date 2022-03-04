
public class ArrayTest8 {

	public static void main(String[] args) {
		
		// 2차원 배열
		// 1. 정방향(모든행의 열크기동일)
		
		// 가. 배열선언
		int [][]num;
		// 나. 배열생성
		num = new int[2][3];
		
		// 다. 배열초기화
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		
		num[1][0] = 40;
		num[1][1] = 50;
		num[1][2] = 60;
		
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {	// num.length = 2, 0 ~ 1
			for (int j = 0; j < num[i].length; j++) {	// num[i].length = 3, 0 ~ 2
				System.out.print(num[i][j] + " ");
				sum += num[i][j];
			}
			System.out.println();
		}
		System.out.println("배열의 총 합계는: " + sum);
		
		System.out.println("==========================");
		int sum2 = 0;
		for (int[] i : num) {
			for (int j : i) {
				System.out.print(j+ " ");
				sum2 += j;
			}
			System.out.println();
		}
		
		System.out.println("배열의 총 합계는: " + sum2);
	}

}
