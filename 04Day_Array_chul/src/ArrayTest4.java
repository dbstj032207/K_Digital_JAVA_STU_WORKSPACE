
public class ArrayTest4 {


	public static void main(String[] args) {
		
		// 1. new이용
		int [] num;
		num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		// 2. 리터럴 이용
		int [] num2 = {10, 20, 30};
		System.out.println(num2.length);
		System.out.println(num2[0]);
		System.out.println(num2[1]);
		System.out.println(num2[2]);
		
		// 3. new + 리터럴
		int [] num3;
		num3 = new int[] {10, 20, 30};
		num3 = new int[] {1, 2, 3, 4};	// 새로운 배열이 됨(덮어쓰기아님)

		for (int i : num3) {
			System.out.println(i);
		}
		
		num = num3;	// 배열의 크기가 달라도 가능하다
		System.out.println(">>>>>>>>>" + num.length);
		for (int i : num3) {
			System.out.println(i);
		}
		

	}
	

	

}
