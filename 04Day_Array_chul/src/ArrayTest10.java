
public class ArrayTest10 {

	public static void main(String[] args) {
		
		// 2차원배열
		// 2. 비정방형
		// 2 - 2 리터럴사용
		
		int[][] num = {{10, 20, 30}, {40}, {50, 60}};
		
		
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
