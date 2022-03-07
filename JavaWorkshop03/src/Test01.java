
public class Test01 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		
		int avg = sum / arr.length;
		
		System.out.println("정수값 합계: " + sum);
		System.out.println("정수값 평균: " + avg);
		

	}

}
