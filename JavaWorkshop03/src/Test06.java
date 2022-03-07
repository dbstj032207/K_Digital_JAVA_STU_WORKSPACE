import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = scan.nextInt();
		
		int[] height = new int[num];
		
		int max = 0;
		for (int i = 0; i < height.length; i++) {
			System.out.print("사람 " + (i+1) + ": ");
			num = scan.nextInt();
			height[i] = num;
			if (max < num) {
				max = num;
			}
		}
		
		System.out.println("최댓값은 " + max + "입니다.");
		
		
		

		

	}

}
