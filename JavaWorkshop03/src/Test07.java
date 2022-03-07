import java.util.Random;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = scan.nextInt();
		
		int[] height = new int[num];
		
		int max = 0;
		for (int i = 0; i < height.length; i++) {
			height[i] = 100 + ran.nextInt(90);
			System.out.println("사람 " + (i+1) + ": " + height[i]);
			
			if (max < height[i]) {
				max = height[i];
			}
		}
		
		System.out.println("최댓값은 " + max + "입니다.");
		
		
		

		

	}

}
