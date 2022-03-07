
public class ArrayTest9 {

	public static void main(String[] args) {
		
		// 2차원배열
		// 2. 비정방형(모든행의 열크기 다름)
		
		int[][] num = new int[2][];	//2행
		
		num[0] = new int[3];
		num[1] = new int[2];
		
		// 초기화
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		num[1][0] = 40;
		num[1][1] = 50;
		
		// 이중 for 사용 전체 출력
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		
		// 이중 for each
		for (int[] k : num) {
			for (int n : k) {
				System.out.print(n+ " ");
			}
			System.out.println();
		}
		
		System.out.println("행의 갯수: " + num.length);
		System.out.println("1행의 열갯수: " + num[0].length);
		System.out.println("2행의 열갯수: " + num[1].length);
		
	}

}
