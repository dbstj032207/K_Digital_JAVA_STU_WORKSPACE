
public class Ex08_9 {

	public static void main(String[] args) {
		
		// 오토 박싱
		int num = 10;
		int num2 = num;
		
		// 비교연산자 가능
		System.out.println( num == num2 ); 	// true
		
		// 언박싱
		Integer num3 = new Integer(200);
		int num4 = num3;
		
		System.out.println( num3 > 100 ); 	// true
		
		
	}

}